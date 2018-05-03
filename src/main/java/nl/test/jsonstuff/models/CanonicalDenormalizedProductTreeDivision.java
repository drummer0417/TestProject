package nl.test.jsonstuff.models;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * Class is used for generation of the Division part of productTree json file,
 * Division is a child of Tree
 */

public class CanonicalDenormalizedProductTreeDivision {

    private String name;
    private String code;
    private List<CanonicalDenormalizedProductTreeBusinessGroup> businessGroups;

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("business_groups")
    public List<CanonicalDenormalizedProductTreeBusinessGroup> getBusinessGroups() {
        return businessGroups;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setBusinessGroups(List<CanonicalDenormalizedProductTreeBusinessGroup> businessGroups) {
        this.businessGroups = businessGroups;
    }
}
