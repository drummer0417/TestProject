package nl.test.jsonstuff.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Class is used for generation of the ArticleGroup part of productTree json file,
 * ArticleGroup is a child of MainArticleGroup
 */
public class CanonicalDenormalizedProductTreeArticleGroup {

    private String name;
    private String code;

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
