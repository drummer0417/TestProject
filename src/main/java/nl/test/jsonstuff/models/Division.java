package nl.test.jsonstuff.models;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Division extends OrganizationType {

    @JsonProperty("businessGroups")
    List<BusinessGroup> businessGroups;

    public Division(String name, String code, List<BusinessGroup> businessGroups) {
        super(name, code);
        this.businessGroups = businessGroups;
    }


//    public List<BusinessGroup> getBusinessGroups() {
//        return businessGroups;
//    }
}
