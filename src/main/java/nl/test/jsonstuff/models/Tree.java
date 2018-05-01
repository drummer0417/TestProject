package nl.test.jsonstuff.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class Tree {

    @JsonProperty("divisions")
    List<Division> division = new ArrayList<Division>();

    public Tree(List<Division> division) {

        this.division = division;
    }

}
