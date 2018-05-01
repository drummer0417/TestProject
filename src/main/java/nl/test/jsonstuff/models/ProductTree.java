package nl.test.jsonstuff.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProductTree {

    String objectID;
    String context;
    String name;
    Metadata metaData;
    Tree tree;

    public ProductTree(String objectID, String context, String name, Metadata metaData, Tree tree) {
        this.objectID = objectID;
        this.context = context;
        this.name = name;
        this.metaData = metaData;
        this.tree = tree;
    }

    @JsonProperty("object_id")
    public String getObjectID() {
        return objectID;
    }

    @JsonProperty("context")
    public String getContext() {
        return context;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("metadata")
    public Metadata getMetaData() {
        return metaData;
    }

    @JsonProperty("tree")
    public Tree getTree() {
        return tree;
    }
}
