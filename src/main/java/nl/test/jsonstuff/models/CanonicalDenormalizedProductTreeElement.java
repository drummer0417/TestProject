package nl.test.jsonstuff.models;

public interface CanonicalDenormalizedProductTreeElement {

    public String getName();

    public String getCode();

    public void setName(String name);

    public void setCode(String code);

    public void addChild(CanonicalDenormalizedProductTreeElement child);

}
