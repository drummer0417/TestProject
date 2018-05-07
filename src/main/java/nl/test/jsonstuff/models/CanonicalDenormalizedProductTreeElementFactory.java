package nl.test.jsonstuff.models;

public class CanonicalDenormalizedProductTreeElementFactory {


    public static final String DIVISION = "SEC";
    public static final String BUSINESSG_GROUP = "BGS";
    public static final String BUSINESS_UNIT = "BUS";
    public static final String MAIN_ARTICLE_GROUP = "MAG";
    public static final String ARTICLE_GROUP = "AG";


    public final static CanonicalDenormalizedProductTreeElement getCanonicalDenormalizedProductTreeElemen(String type) {

        switch (type) {
            case DIVISION:
                return new CanonicalDenormalizedProductTreeDivision();
            case BUSINESSG_GROUP:
                return new CanonicalDenormalizedProductTreeBusinessGroup();
            case BUSINESS_UNIT:
                return new CanonicalDenormalizedProductTreeBusinessUnit();
            case MAIN_ARTICLE_GROUP:
                return new CanonicalDenormalizedProductTreeMainArticleGroup();
            case ARTICLE_GROUP:
                return new CanonicalDenormalizedProductTreeArticleGroup();
            default:
                return null;

        }
    }
}
