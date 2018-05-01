package nl.test.jsonstuff.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class BusinessUnit extends OrganizationType {

    @JsonProperty("mainArticleGroup")
    List<MainArticleGroup> mainArticleGroups;

    public List<MainArticleGroup> getMainArticleGroups() {
        return mainArticleGroups;
    }

    public BusinessUnit(String name, String code) {
        super(name, code);
    }

    public BusinessUnit(String name, String code, List<MainArticleGroup> mainArticleGroups) {
        super(name, code);
        this.mainArticleGroups = mainArticleGroups;
    }
}
