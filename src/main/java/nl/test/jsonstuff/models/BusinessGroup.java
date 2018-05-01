package nl.test.jsonstuff.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class BusinessGroup extends OrganizationType {

    @JsonProperty("businessUnits")
    List<BusinessUnit> businessUnits = new ArrayList<BusinessUnit>();

    public BusinessGroup(String name, String code, List<BusinessUnit> businessUnits) {
        super(name, code);
        this.businessUnits = businessUnits;
    }

//    public List<BusinessUnit> getBusinessUnits() {
//        return businessUnits;
//    }
}
