package nl.test.jsonstuff.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * Class is used for generation of the Tree part of productTree json file,
 * Tree is a child of ProductTreeRooot
 */
public class CanonicalDenormalizedProductTreeTree {


    List<CanonicalDenormalizedProductTreeDivision> division = new ArrayList<CanonicalDenormalizedProductTreeDivision>();

    @JsonProperty("divisions")
    public List<CanonicalDenormalizedProductTreeDivision> getDivision() {
        return division;
    }

    public void setDivision(List<CanonicalDenormalizedProductTreeDivision> division) {
        this.division = division;
    }
}
