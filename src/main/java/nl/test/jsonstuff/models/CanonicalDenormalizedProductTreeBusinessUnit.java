package nl.test.jsonstuff.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * Class is used for generation of the BusinessUnit part of productTree json file,
 * BusinessUnit is a child of BusinessGroup
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CanonicalDenormalizedProductTreeBusinessUnit implements CanonicalDenormalizedProductTreeElement {

    private String name;
    private String code;
    private List<CanonicalDenormalizedProductTreeMainArticleGroup> mainArticleGroups;

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("main_article_groups")
    public List<CanonicalDenormalizedProductTreeMainArticleGroup> getMainArticleGroups() {
        return mainArticleGroups;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    /**
     * add a mainArticleGroup to the businessUnit
     */
    @Override
    public void addChild(CanonicalDenormalizedProductTreeElement child) {
        if (mainArticleGroups == null) {
            mainArticleGroups = new ArrayList<CanonicalDenormalizedProductTreeMainArticleGroup>();
        }
        mainArticleGroups.add((CanonicalDenormalizedProductTreeMainArticleGroup) child);
    }


    public void setMainArticleGroups(List<CanonicalDenormalizedProductTreeMainArticleGroup> mainArticleGroups) {
        this.mainArticleGroups = mainArticleGroups;
    }

}
