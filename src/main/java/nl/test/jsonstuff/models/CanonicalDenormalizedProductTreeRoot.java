package nl.test.jsonstuff.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Class is used for generation of the Root of the productTree json file,
 * s
 */
public class CanonicalDenormalizedProductTreeRoot {

    String objectID;
    String context;
    String name;
    CanonicalDenormalizedProductTreeMetadata metaData;
    CanonicalDenormalizedProductTreeTree tree;

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
    public CanonicalDenormalizedProductTreeMetadata getMetaData() {
        return metaData;
    }

    @JsonProperty("tree")
    public CanonicalDenormalizedProductTreeTree getTree() {
        return tree;
    }

    public void setObjectID(String objectID) {
        this.objectID = objectID;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMetaData(CanonicalDenormalizedProductTreeMetadata metaData) {
        this.metaData = metaData;
    }

    public void setTree(CanonicalDenormalizedProductTreeTree tree) {
        this.tree = tree;
    }
}
