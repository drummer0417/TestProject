package nl.test.jsonstuff.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * Class is used for generation of the mainArticleGroup part of productTree json file,
 * mainAarticleGroup is a child of businessUnits
 */
public class CanonicalDenormalizedProductTreeMainArticleGroup {

    private String name;
    private String code;
    private List<CanonicalDenormalizedProductTreeArticleGroup> articleGroups;


    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("article_groups")
    public List<CanonicalDenormalizedProductTreeArticleGroup> getArticleGroups() {
        return articleGroups;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setArticleGroups(List<CanonicalDenormalizedProductTreeArticleGroup> articleGroups) {
        this.articleGroups = articleGroups;
    }
}
