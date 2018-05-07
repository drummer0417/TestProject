package nl.test.jsonstuff.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * Class is used for generation of the mainArticleGroup part of productTree json file,
 * mainAarticleGroup is a child of businessUnits
 */
public class CanonicalDenormalizedProductTreeMainArticleGroup implements CanonicalDenormalizedProductTreeElement {

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

    /**
     * add a businessUnit to the businessGroup
     * @param child
     */
    @Override
    public void addChild(CanonicalDenormalizedProductTreeElement child) {
        if (articleGroups == null) {
            articleGroups = new ArrayList<CanonicalDenormalizedProductTreeArticleGroup>();
        }
        articleGroups.add((CanonicalDenormalizedProductTreeArticleGroup) child);
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
