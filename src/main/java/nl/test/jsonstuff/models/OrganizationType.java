package nl.test.jsonstuff.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class OrganizationType {

    @JsonProperty("name")
    String name;

    @JsonProperty("code")
    String code;

    public OrganizationType(String name, String code) {
        this.name = name;
        this.code = code;
    }


//    public String getName() {
//        return name;
//    }
//
//    public String getCode() {
//        return code;
//    }
}
