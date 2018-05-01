# Configure the AWS Provider
provider "aws" {
  access_key = "${var.aws_access_key}"
  secret_key = "${var.aws_secret_key}"
  region     = "eu-west-2"
}

data "aws_security_group" "sec_group" {

  id="${var.security_group_id}"
}

output "vpc_id" {

  value = "${data.aws_security_group.sec_group.vpc_id}"
}

resource "aws_instance" "example" {
  ami = "${var.ami}"

  instance_type = "t2.micro"
  key_name = "MyEC2KeyPair"
  security_groups = ["MyWebDMZ"]
  tags {
    Name = "Hans first terraform EC2 instance"
    Created = "20180323"
    By = "Hans"
  }
}

module "settings" {
  source = "thisIsTheSourceForSettings"
}

module "another-module" {
  source = "another-module"
}

module "test-module" {
  source = "test-module"
  firstvar = "${module.another-module.a-real-good-value-for-first-var}"
  secondvar = "${module.another-module.anothervalue}"
  thethirdone = "${var.amaintfvariable}"
  database = "${module.settings.database-id}"
  counter = "${module.settings.counter}"
}
