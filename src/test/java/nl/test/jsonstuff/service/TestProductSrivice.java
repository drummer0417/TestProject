package nl.test.jsonstuff.service;

import nl.test.jsonstuff.models.*;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.assertNotNull;

public class TestProductSrivice {

    ProductService productService = new ProductService();
    ProductTree productTree = null;

    @Before
    public void setup() {

        productTree = generateProductTree();

    }

    @Test
    public void parseToJsonTest() {

        assertNotNull(productService.parseToJson(productTree));


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
        Date date = new Date();

        Metadata metaData = new Metadata("PCP", "STEP", "NL", "nl", date, date);
        ProductTree productTree = new ProductTree("2131231345", "nl_NL", "Product tree", metaData, tree);

        return productTree;
    }

}
