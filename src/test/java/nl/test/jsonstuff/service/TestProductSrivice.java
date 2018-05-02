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
    ProductTree productTree = null;

    @Before
    public void setup() {

        productTree = generateProductTree();

    }

    @Test
    public void parseToJsonTest() {

        String treeAsJson = productService.parseToJson(productTree);

        assertEquals("{\"object_id\":\"2131231345\",\"context\":\"nl_NL\",\"name\":\"Product tree\",\"metadata\":{\"publisherSystem\":\"PCP\",\"sourceSystem\":\"STEP\",\"country\":\"NL\",\"language\":\"nl\",\"dateCreated\":\"2018-04-30T13:51:33+0200\",\"dateModified\":\"2018-04-30T13:51:33+0200\"},\"tree\":{\"divisions\":[{\"name\":\"div1Name\",\"code\":\"div1Code\",\"businessGroups\":[{\"name\":\"bg11Name\",\"code\":\"bg11Code\",\"businessUnits\":[{\"name\":\"bu11Name\",\"code\":\"bu11Code\",\"mainArticleGroups\":[{\"name\":\"mag111Name\",\"code\":\"mag111Code\"},{\"name\":\"mag112Name\",\"code\":\"mag112Code\"},{\"name\":\"mag113Name\",\"code\":\"mag113Code\"}]},{\"name\":\"bu12Name\",\"code\":\"bu12Code\",\"mainArticleGroups\":[{\"name\":\"mag121Name\",\"code\":\"mag121Code\"},{\"name\":\"mag122Name\",\"code\":\"mag122Code\"}]}]},{\"name\":\"bg12Name\",\"code\":\"bg12Code\",\"businessUnits\":[{\"name\":\"bu21Name\",\"code\":\"bu21Code\"},{\"name\":\"bu22Name\",\"code\":\"bu22Code\"}]}]},{\"name\":\"div2Name\",\"code\":\"div2Code\",\"businessGroups\":[{\"name\":\"bg21Name\",\"code\":\"bg21Code\",\"businessUnits\":[{\"name\":\"bu31Name\",\"code\":\"bu31Code\"},{\"name\":\"bu32Name\",\"code\":\"bu32Code\"}]},{\"name\":\"bg22Name\",\"code\":\"bg22Code\",\"businessUnits\":[{\"name\":\"bu41Name\",\"code\":\"bu41Code\"},{\"name\":\"bu42Name\",\"code\":\"bu42Code\"}]}]}]}}", treeAsJson);
    }

    @Test
    public void isValidJsonTest() {


        String jsonData = productService.parseToJson(productTree);

        assertTrue(productService.isValidJson("/productTreeSchema.json", jsonData));
    }

    private ProductTree generateProductTree() {

        MainArticleGroup mag111 = new MainArticleGroup("mag111Name", "mag111Code");
        MainArticleGroup mag112 = new MainArticleGroup("mag112Name", "mag112Code");
        MainArticleGroup mag113 = new MainArticleGroup("mag113Name", "mag113Code");
        MainArticleGroup mag121 = new MainArticleGroup("mag121Name", "mag121Code");
        MainArticleGroup mag122 = new MainArticleGroup("mag122Name", "mag122Code");

        List<MainArticleGroup> mags11 = new ArrayList<MainArticleGroup>();
        mags11.add(mag111);
        mags11.add(mag112);
        mags11.add(mag113);

        List<MainArticleGroup> mags12 = new ArrayList<MainArticleGroup>();
        mags12.add(mag121);
        mags12.add(mag122);

        BusinessUnit bu11 = new BusinessUnit("bu11Name", "bu11Code", mags11);
        BusinessUnit bu12 = new BusinessUnit("bu12Name", "bu12Code", mags12);
        BusinessUnit bu21 = new BusinessUnit("bu21Name", "bu21Code");
        BusinessUnit bu22 = new BusinessUnit("bu22Name", "bu22Code");
        BusinessUnit bu31 = new BusinessUnit("bu31Name", "bu31Code");
        BusinessUnit bu32 = new BusinessUnit("bu32Name", "bu32Code");
        BusinessUnit bu41 = new BusinessUnit("bu41Name", "bu41Code");
        BusinessUnit bu42 = new BusinessUnit("bu42Name", "bu42Code");

        List<BusinessUnit> bus1 = new ArrayList<BusinessUnit>();
        List<BusinessUnit> bus2 = new ArrayList<BusinessUnit>();
        List<BusinessUnit> bus3 = new ArrayList<BusinessUnit>();
        List<BusinessUnit> bus4 = new ArrayList<BusinessUnit>();

        bus1.add(bu11);
        bus1.add(bu12);
        bus2.add(bu21);
        bus2.add(bu22);
        bus3.add(bu31);
        bus3.add(bu32);
        bus4.add(bu41);
        bus4.add(bu42);

        BusinessGroup bg11 = new BusinessGroup("bg11Name", "bg11Code", bus1);
        BusinessGroup bg12 = new BusinessGroup("bg12Name", "bg12Code", bus2);
        BusinessGroup bg21 = new BusinessGroup("bg21Name", "bg21Code", bus3);
        BusinessGroup bg22 = new BusinessGroup("bg22Name", "bg22Code", bus4);

        List<BusinessGroup> bgs1 = new ArrayList<BusinessGroup>();
        List<BusinessGroup> bgs2 = new ArrayList<BusinessGroup>();

        bgs1.add(bg11);
        bgs1.add(bg12);
        bgs2.add(bg21);
        bgs2.add(bg22);


        Division di1 = new Division("div1Name", "div1Code", bgs1);
        Division di2 = new Division("div2Name", "div2Code", bgs2);

        List<Division> divs = new ArrayList<Division>();

        divs.add(di1);
        divs.add(di2);

        Tree tree = new Tree(divs);
        Calendar c = new GregorianCalendar();
        c.set(2018, 3, 30, 13, 51, 33);

        Date date = c.getTime();

        Metadata metaData = new Metadata("PCP", "STEP", "NL", "nl", date, date);
        ProductTree productTree = new ProductTree("2131231345", "nl_NL", "Product tree", metaData, tree);

        return productTree;
    }

}
