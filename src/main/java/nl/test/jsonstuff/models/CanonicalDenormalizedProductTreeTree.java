package nl.test.jsonstuff.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * Class is used for generation of the Tree part of productTree json file,
 * Tree is a child of ProductTreeRooot
 */
public class CanonicalDenormalizedProductTreeTree {


    List<CanonicalDenormalizedProductTreeDivision> divisions = new ArrayList<CanonicalDenormalizedProductTreeDivision>();

    @JsonProperty("divisions")
    public List<CanonicalDenormalizedProductTreeDivision> getDivisions() {
        return divisions;
    }

    public void setDivisions(List<CanonicalDenormalizedProductTreeDivision> divisions) {
        this.divisions = divisions;
    }
}
