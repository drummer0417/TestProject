package nl.test.jsonstuff.service;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import nl.test.jsonstuff.models.*;
import org.junit.Before;
import org.junit.Test;

import java.util.*;

public class TestProductSrivice {

    ProductService productService = new ProductService();
    CanonicalDenormalizedProductTreeRoot productTree = null;
    int i = 0;

    @Before
    public void setup() {

        productTree = generateProductTree();

        i = 0;
    }

    @Test
    public void parseToJsonTest() {

        String treeAsJson = productService.parseToJson(productTree);

        assertEquals("{\"object_id\":\"2312455\",\"context\":\"de_AT\",\"name\":\"Product tree\",\"metadata\":{\"publisher_system\":\"PCP\",\"source_system\":\"STEP\",\"country\":\"de\",\"language\":null,\"date_created\":\"2018-04-30T13:51:33+0200\",\"date_Modified\":\"2018-04-30T13:51:33+0200\"},\"tree\":{\"divisions\":[{\"name\":\"div1Name\",\"code\":\"div1Code\",\"business_groups\":[{\"name\":\"bg11Name\",\"code\":\"bg11Code\",\"business_units\":[{\"name\":\"bu11Name\",\"code\":\"bu11Code\",\"main_article_groups\":[{\"name\":\"mag111Name\",\"code\":\"mag111Code\",\"article_groups\":[{\"name\":\"ag1name\",\"code\":\"ag1code\"},{\"name\":\"ag2name\",\"code\":\"ag2code\"}]},{\"name\":\"mag112Name\",\"code\":\"mag112code\",\"article_groups\":[{\"name\":\"ag1name\",\"code\":\"ag1code\"},{\"name\":\"ag2name\",\"code\":\"ag2code\"}]},{\"name\":\"mag113Name\",\"code\":\"mag113code\",\"article_groups\":[{\"name\":\"ag1name\",\"code\":\"ag1code\"},{\"name\":\"ag2name\",\"code\":\"ag2code\"}]}]},{\"name\":\"bu12Name\",\"code\":\"bu12Code\",\"main_article_groups\":[{\"name\":\"mag121Name\",\"code\":\"mag121code\",\"article_groups\":[{\"name\":\"ag1name\",\"code\":\"ag1code\"},{\"name\":\"ag2name\",\"code\":\"ag2code\"}]},{\"name\":\"mag122Name\",\"code\":\"mag122code\",\"article_groups\":[{\"name\":\"ag1name\",\"code\":\"ag1code\"},{\"name\":\"ag2name\",\"code\":\"ag2code\"}]}]}]},{\"name\":\"bg12Name\",\"code\":\"bg12Code\",\"business_units\":[{\"name\":\"bu21Name\",\"code\":\"bu21Code\",\"main_article_groups\":[{\"name\":\"mag111Name\",\"code\":\"mag111Code\",\"article_groups\":[{\"name\":\"ag1name\",\"code\":\"ag1code\"},{\"name\":\"ag2name\",\"code\":\"ag2code\"}]},{\"name\":\"mag112Name\",\"code\":\"mag112code\",\"article_groups\":[{\"name\":\"ag1name\",\"code\":\"ag1code\"},{\"name\":\"ag2name\",\"code\":\"ag2code\"}]},{\"name\":\"mag113Name\",\"code\":\"mag113code\",\"article_groups\":[{\"name\":\"ag1name\",\"code\":\"ag1code\"},{\"name\":\"ag2name\",\"code\":\"ag2code\"}]}]},{\"name\":\"bu22Name\",\"code\":\"bu22Code\",\"main_article_groups\":[{\"name\":\"mag121Name\",\"code\":\"mag121code\",\"article_groups\":[{\"name\":\"ag1name\",\"code\":\"ag1code\"},{\"name\":\"ag2name\",\"code\":\"ag2code\"}]},{\"name\":\"mag122Name\",\"code\":\"mag122code\",\"article_groups\":[{\"name\":\"ag1name\",\"code\":\"ag1code\"},{\"name\":\"ag2name\",\"code\":\"ag2code\"}]}]}]}]},{\"name\":\"div2Name\",\"code\":\"div2Code\",\"business_groups\":[{\"name\":\"bg21Name\",\"code\":\"bg21Code\",\"business_units\":[{\"name\":\"bu32Name\",\"code\":\"bu32Code\",\"main_article_groups\":[{\"name\":\"mag111Name\",\"code\":\"mag111Code\",\"article_groups\":[{\"name\":\"ag1name\",\"code\":\"ag1code\"},{\"name\":\"ag2name\",\"code\":\"ag2code\"}]},{\"name\":\"mag112Name\",\"code\":\"mag112code\",\"article_groups\":[{\"name\":\"ag1name\",\"code\":\"ag1code\"},{\"name\":\"ag2name\",\"code\":\"ag2code\"}]},{\"name\":\"mag113Name\",\"code\":\"mag113code\",\"article_groups\":[{\"name\":\"ag1name\",\"code\":\"ag1code\"},{\"name\":\"ag2name\",\"code\":\"ag2code\"}]}]},{\"name\":\"bu32Name\",\"code\":\"bu32Code\",\"main_article_groups\":[{\"name\":\"mag121Name\",\"code\":\"mag121code\",\"article_groups\":[{\"name\":\"ag1name\",\"code\":\"ag1code\"},{\"name\":\"ag2name\",\"code\":\"ag2code\"}]},{\"name\":\"mag122Name\",\"code\":\"mag122code\",\"article_groups\":[{\"name\":\"ag1name\",\"code\":\"ag1code\"},{\"name\":\"ag2name\",\"code\":\"ag2code\"}]}]}]},{\"name\":\"bg22Name\",\"code\":\"bg22Code\",\"business_units\":[{\"name\":\"bu41Name\",\"code\":\"bu41Code\",\"main_article_groups\":[{\"name\":\"mag111Name\",\"code\":\"mag111Code\",\"article_groups\":[{\"name\":\"ag1name\",\"code\":\"ag1code\"},{\"name\":\"ag2name\",\"code\":\"ag2code\"}]},{\"name\":\"mag112Name\",\"code\":\"mag112code\",\"article_groups\":[{\"name\":\"ag1name\",\"code\":\"ag1code\"},{\"name\":\"ag2name\",\"code\":\"ag2code\"}]},{\"name\":\"mag113Name\",\"code\":\"mag113code\",\"article_groups\":[{\"name\":\"ag1name\",\"code\":\"ag1code\"},{\"name\":\"ag2name\",\"code\":\"ag2code\"}]}]},{\"name\":\"bu42Name\",\"code\":\"bu42Code\",\"main_article_groups\":[{\"name\":\"mag121Name\",\"code\":\"mag121code\",\"article_groups\":[{\"name\":\"ag1name\",\"code\":\"ag1code\"},{\"name\":\"ag2name\",\"code\":\"ag2code\"}]},{\"name\":\"mag122Name\",\"code\":\"mag122code\",\"article_groups\":[{\"name\":\"ag1name\",\"code\":\"ag1code\"},{\"name\":\"ag2name\",\"code\":\"ag2code\"}]}]}]}]}]}}", treeAsJson);
    }

    @Test
    public void isValidJsonTest() {


        String jsonData = productService.parseToJson(productTree);

        assertTrue(productService.isValidJson("/productTreeSchema.json", jsonData));
    }

    private CanonicalDenormalizedProductTreeRoot generateProductTree() {
        CanonicalDenormalizedProductTreeArticleGroup ag1 = new CanonicalDenormalizedProductTreeArticleGroup();
        ag1.setCode("ag1code");
        ag1.setName("ag1name");
        CanonicalDenormalizedProductTreeArticleGroup ag2 = new CanonicalDenormalizedProductTreeArticleGroup();
        ag2.setCode("ag2code");
        ag2.setName("ag2name");
        List<CanonicalDenormalizedProductTreeArticleGroup> ags = new ArrayList<>();
        ags.add(ag1);
        ags.add(ag2);

        CanonicalDenormalizedProductTreeMainArticleGroup mag111 = new CanonicalDenormalizedProductTreeMainArticleGroup();
        mag111.setName("mag111Name");
        mag111.setCode("mag111Code");
        mag111.setArticleGroups(ags);
        CanonicalDenormalizedProductTreeMainArticleGroup mag112 = new CanonicalDenormalizedProductTreeMainArticleGroup();
        mag112.setName("mag112Name");
        mag112.setCode("mag112code");
        mag112.setArticleGroups(ags);
        CanonicalDenormalizedProductTreeMainArticleGroup mag113 = new CanonicalDenormalizedProductTreeMainArticleGroup();
        mag113.setName("mag113Name");
        mag113.setCode("mag113code");
        mag113.setArticleGroups(ags);
        CanonicalDenormalizedProductTreeMainArticleGroup mag121 = new CanonicalDenormalizedProductTreeMainArticleGroup();
        mag121.setName("mag121Name");
        mag121.setCode("mag121code");
        mag121.setArticleGroups(ags);
        CanonicalDenormalizedProductTreeMainArticleGroup mag122 = new CanonicalDenormalizedProductTreeMainArticleGroup();
        mag122.setName("mag122Name");
        mag122.setCode("mag122code");
        mag122.setArticleGroups(ags);
        List<CanonicalDenormalizedProductTreeMainArticleGroup> mags11 = new ArrayList<CanonicalDenormalizedProductTreeMainArticleGroup>();
        mags11.add(mag111);
        mags11.add(mag112);
        mags11.add(mag113);

        List<CanonicalDenormalizedProductTreeMainArticleGroup> mags12 = new ArrayList<CanonicalDenormalizedProductTreeMainArticleGroup>();
        mags12.add(mag121);
        mags12.add(mag122);

        CanonicalDenormalizedProductTreeBusinessUnit bu11 = new CanonicalDenormalizedProductTreeBusinessUnit();
        bu11.setCode("bu11Code");
        bu11.setName("bu11Name");
        bu11.setMainArticleGroups(mags11);

        CanonicalDenormalizedProductTreeBusinessUnit bu12 = new CanonicalDenormalizedProductTreeBusinessUnit();
        //"bu12Name", "bu12Code", mags12
        bu12.setName("bu12Name");
        bu12.setCode("bu12Code");
        bu12.setMainArticleGroups(mags12);
        CanonicalDenormalizedProductTreeBusinessUnit bu21 = new CanonicalDenormalizedProductTreeBusinessUnit();
        //"bu21Name", "bu21Code"
        bu21.setName("bu21Name");
        bu21.setCode("bu21Code");
        bu21.setMainArticleGroups(mags11);
        CanonicalDenormalizedProductTreeBusinessUnit bu22 = new CanonicalDenormalizedProductTreeBusinessUnit();
        //"bu22Name", "bu22Code"
        bu22.setName("bu22Name");
        bu22.setCode("bu22Code");
        bu22.setMainArticleGroups(mags12);
        CanonicalDenormalizedProductTreeBusinessUnit bu31 = new CanonicalDenormalizedProductTreeBusinessUnit();
        //"bu12Name", "bu12Code", mags12
        bu31.setName("bu32Name");
        bu31.setCode("bu32Code");
        bu31.setMainArticleGroups(mags11);
        CanonicalDenormalizedProductTreeBusinessUnit bu32 = new CanonicalDenormalizedProductTreeBusinessUnit();
        //"bu12Name", "bu12Code", mags12
        bu32.setName("bu32Name");
        bu32.setCode("bu32Code");
        bu32.setMainArticleGroups(mags12);
        CanonicalDenormalizedProductTreeBusinessUnit bu41 = new CanonicalDenormalizedProductTreeBusinessUnit();
        //"bu12Name", "bu12Code", mags12
        bu41.setName("bu41Name");
        bu41.setCode("bu41Code");
        bu41.setMainArticleGroups(mags11);
        CanonicalDenormalizedProductTreeBusinessUnit bu42 = new CanonicalDenormalizedProductTreeBusinessUnit();
        bu42.setName("bu42Name");
        bu42.setCode("bu42Code");
        bu42.setMainArticleGroups(mags12);

        List<CanonicalDenormalizedProductTreeBusinessUnit> bus1 = new ArrayList<CanonicalDenormalizedProductTreeBusinessUnit>();
        List<CanonicalDenormalizedProductTreeBusinessUnit> bus2 = new ArrayList<CanonicalDenormalizedProductTreeBusinessUnit>();
        List<CanonicalDenormalizedProductTreeBusinessUnit> bus3 = new ArrayList<CanonicalDenormalizedProductTreeBusinessUnit>();
        List<CanonicalDenormalizedProductTreeBusinessUnit> bus4 = new ArrayList<CanonicalDenormalizedProductTreeBusinessUnit>();

        bus1.add(bu11);
        bus1.add(bu12);
        bus2.add(bu21);
        bus2.add(bu22);
        bus3.add(bu31);
        bus3.add(bu32);
        bus4.add(bu41);
        bus4.add(bu42);

        CanonicalDenormalizedProductTreeBusinessGroup bg11 = new CanonicalDenormalizedProductTreeBusinessGroup();
        bg11.setCode("bg11Code");
        bg11.setName("bg11Name");
        bg11.setBusinessUnits(bus1);
        CanonicalDenormalizedProductTreeBusinessGroup bg12 = new CanonicalDenormalizedProductTreeBusinessGroup();
        bg12.setCode("bg12Code");
        bg12.setName("bg12Name");
        bg12.setBusinessUnits(bus2);
        CanonicalDenormalizedProductTreeBusinessGroup bg21 = new CanonicalDenormalizedProductTreeBusinessGroup();
        bg21.setCode("bg21Code");
        bg21.setName("bg21Name");
        bg21.setBusinessUnits(bus3);
        CanonicalDenormalizedProductTreeBusinessGroup bg22 = new CanonicalDenormalizedProductTreeBusinessGroup();
        //"bg22Name", "bg22Code", bus4
        bg22.setCode("bg22Code");
        bg22.setName("bg22Name");
        bg22.setBusinessUnits(bus4);

        List<CanonicalDenormalizedProductTreeBusinessGroup> bgs1 = new ArrayList<CanonicalDenormalizedProductTreeBusinessGroup>();
        List<CanonicalDenormalizedProductTreeBusinessGroup> bgs2 = new ArrayList<CanonicalDenormalizedProductTreeBusinessGroup>();

        bgs1.add(bg11);
        bgs1.add(bg12);
        bgs2.add(bg21);
        bgs2.add(bg22);


        CanonicalDenormalizedProductTreeDivision di1 = new CanonicalDenormalizedProductTreeDivision();
        di1.setCode("div1Code");
        di1.setName("div1Name");
        di1.setBusinessGroups(bgs1);
        CanonicalDenormalizedProductTreeDivision di2 = new CanonicalDenormalizedProductTreeDivision();
        di2.setCode("div2Code");
        di2.setName("div2Name");
        di2.setBusinessGroups(bgs2);

        List<CanonicalDenormalizedProductTreeDivision> divs = new ArrayList<CanonicalDenormalizedProductTreeDivision>();

        divs.add(di1);
        divs.add(di2);

        CanonicalDenormalizedProductTreeTree tree = new CanonicalDenormalizedProductTreeTree();
        tree.setDivisions(divs);

        Calendar c = new GregorianCalendar();
        c.set(2018, 3, 30, 13, 51, 33);

        Date date = c.getTime();

        CanonicalDenormalizedProductTreeMetadata metaData = new CanonicalDenormalizedProductTreeMetadata();
        metaData.setPublisherSystem("PCP");
        metaData.setSourceSystem("STEP");
        metaData.setCountry("DE");
        metaData.setLanguage("de");
        metaData.setDateCreated(date);
        metaData.setDateModified(date);

        CanonicalDenormalizedProductTreeRoot productTree = new CanonicalDenormalizedProductTreeRoot();
        productTree.setObjectID("2312455");
        productTree.setContext("de_AT");
        productTree.setName("Product tree");
        productTree.setMetaData(metaData);
        productTree.setTree(tree);

        return productTree;
    }

    @Test
    public void testNewOranizationStuff() {

        Calendar c = new GregorianCalendar();
        c.set(2018, 3, 30, 13, 51, 33);

        Date date = c.getTime();
        CanonicalDenormalizedProductTreeMetadata metaData = new CanonicalDenormalizedProductTreeMetadata();
        metaData.setPublisherSystem("PCP");
        metaData.setSourceSystem("STEP");
        metaData.setCountry("DE");
        metaData.setLanguage("de");
        metaData.setDateCreated(date);
        metaData.setDateModified(date);

        CanonicalDenormalizedProductTreeRoot productTree = new CanonicalDenormalizedProductTreeRoot();
        productTree.setObjectID("2312455");
        productTree.setContext("de_AT");
        productTree.setName("Product tree");
        productTree.setMetaData(metaData);

        String[] names = {"div1Name", "bu1Name"};
        String[] codes = {"div1Code", "bu1Name"};
        String[] type = {CanonicalDenormalizedProductTreeElementFactory.DIVISION, CanonicalDenormalizedProductTreeElementFactory.BUSINESSG_GROUP};

        TestData treeRoot = new TestData("Tree", null, null, null);

        TestData ag1 = new TestData("AG", "ag1Name", "ag1Code", null);
        TestData ag2 = new TestData("AG", "ag2Name", "ag2Code", null);
        TestData ag3 = new TestData("AG", "ag3Name", "ag3Code", null);
        List<TestData> ag1List = new ArrayList<>();
        ag1List.add(ag1);
        ag1List.add(ag2);
        ag1List.add(ag3);

        TestData mag1 = new TestData("MAG", "mag1Name", "mag1Code", ag1List);
        List<TestData> mag1List = new ArrayList<>();
        mag1List.add(mag1);


        TestData bu11 = new TestData("BUS", "bu1Name", "bu1Code", mag1List);
        TestData bu12 = new TestData("BUS", "bu2Name", "bu2Code", mag1List);
        TestData bu31 = new TestData("BUS", "bu3Name", "bu3Code", mag1List);
        TestData bu32 = new TestData("BUS", "bu4Name", "bu4Code", mag1List);

        List<TestData> bu1List = new ArrayList<>();
        bu1List.add(bu11);
        bu1List.add(bu12);

        List<TestData> bu3List = new ArrayList<>();
        bu3List.add(bu31);
        bu3List.add(bu32);

        TestData bg1 = new TestData("BGS", "bg1Name", "bg1Code", bu1List);
        List<TestData> bg11List = new ArrayList<>();
        bg11List.add(bg1);
        TestData bg2 = new TestData("BGS", "bg2Name", "bg2Code", bu1List);
        List<TestData> bg21List = new ArrayList<>();
        bg11List.add(bg2);

        TestData bg3 = new TestData("BGS", "bg3Name", "bg3Code", bu3List);
        List<TestData> bg31List = new ArrayList<>();
        bg21List.add(bg3);
        TestData bg4 = new TestData("BGS", "bg4Name", "bg4Code", bu3List);
        List<TestData> bg41List = new ArrayList<>();
        bg21List.add(bg4);


        TestData div1 = new TestData("SEC", "div1Name", "div1Code", bg11List);
        TestData div2 = new TestData("SEC", "div2Name", "div2Code", bg21List);

        List<TestData> divs = new ArrayList<>();
        divs.add(div1);
        divs.add(div2);


        CanonicalDenormalizedProductTreeTree tree = new CanonicalDenormalizedProductTreeTree();

        CanonicalDenormalizedProductTreeElement division = null;


        for (TestData div : divs) {
            division =
                    CanonicalDenormalizedProductTreeElementFactory.getCanonicalDenormalizedProductTreeElemen(CanonicalDenormalizedProductTreeElementFactory.DIVISION);

            tree.getDivisions().add((CanonicalDenormalizedProductTreeDivision) addChild(division, div));
        }

        productTree.setTree(tree);

        String treeAsJson = productService.parseToJson(productTree);

        System.out.println("JSON\n" + treeAsJson);

    }

    private CanonicalDenormalizedProductTreeElement addChild(CanonicalDenormalizedProductTreeElement parent, TestData newChild) {

        parent.setCode(newChild.getCode());
        parent.setName(newChild.getName());

        if (newChild.getChild() != null) {

            for (TestData nextElement : newChild.getChild()) {

                CanonicalDenormalizedProductTreeElement nextChild =
                        CanonicalDenormalizedProductTreeElementFactory.
                                getCanonicalDenormalizedProductTreeElemen(nextElement.getType());

                parent.addChild(nextChild);

                this.addChild(nextChild, nextElement);
            }
        }
        return parent;
    }
}

class TestData {


    String type;
    String name;
    String code;
    List<TestData> child;

    public TestData(String type, String name, String code, List<TestData> child) {
        this.type = type;
        this.name = name;
        this.code = code;
        this.child = child;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<TestData> getChild() {
        return child;
    }

    public void setChild(List<TestData> child) {
        this.child = child;
    }
}