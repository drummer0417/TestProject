package nl.test.jsonstuff.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * Class is used for generation of the BusinessGroup part of productTree json file,
 * BusinessGroup is a child of Division
 */

public class CanonicalDenormalizedProductTreeBusinessGroup {

    private String name;
    private String code;
    private List<CanonicalDenormalizedProductTreeBusinessUnit> businessUnits = new ArrayList<CanonicalDenormalizedProductTreeBusinessUnit>();

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("business_units")
    public List<CanonicalDenormalizedProductTreeBusinessUnit> getBusinessUnits() {
        return businessUnits;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setBusinessUnits(List<CanonicalDenormalizedProductTreeBusinessUnit> businessUnits) {
        this.businessUnits = businessUnits;
    }
}