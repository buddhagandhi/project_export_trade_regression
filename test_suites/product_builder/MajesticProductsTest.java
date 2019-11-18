package com.example.test_suites.product_builder;

import org.testng.annotations.*;
import com.example.Actionwords;

public class MajesticProductsTest {

    public Actionwords actionwords;

    @BeforeMethod
    public void setUp() {
        actionwords = new Actionwords();
    }

    @Test
    public void akuafoil() {
        actionwords.selectProductToBuild("Akuafoil", "4.25\" X 5.5\" 16PT Announcement Cards With Akuafoil UV on 4-color side(s), FLAT - No S...");
        actionwords.selectPrimaryAttributes("500", "4/5 (4/4 with Foil on Back)", "2-4 Business Days");
        actionwords.selectBaseJobOptionsBlankEnvelopes("No Blank Envelopes");
        actionwords.setPrintSetDetailsDefaultShipping("Default Option", "Glendale, CA");
        actionwords.clickAddToCart();
        actionwords.validateShoppingCart("Ground Shipping", "$9.55", "Glendale, CA", "174", "$174.37", "$0.00", "$0.00");
        actionwords.clickClearCart();
    }

    @Test
    public void brownKraftCards() {
        actionwords.selectProductToBuild("Brown Kraft Cards", "4.25\" X 5.5\" 18PT Uncoated Brown Kraft Announcement Cards, FLAT - No Scoring");
        actionwords.selectPrimaryAttributes("100", "4:0", "2-4 Business Days");
        actionwords.selectBaseJobOptionsBlankEnvelopes("No Blank Envelopes");
        actionwords.setPrintSetDetailsDefaultShipping("Default Option", "Glendale, CA");
        actionwords.clickAddToCart();
        actionwords.validateShoppingCart("Ground Shipping", "$8.55", "Glendale, CA", "17", "$17.33", "$0.00", "$0.00");
        actionwords.clickClearCart();
    }

    @Test
    public void eDGECards() {
        actionwords.selectProductToBuild("EDGE Cards", "4.25\" X 5.5\" 32PT Uncoated Black EDGE Announcement Cards, FLAT - No Scoring");
        actionwords.selectPrimaryAttributes("500", "4:0", "2-4 Business Days");
        actionwords.selectBaseJobOptionsBlankEnvelopes("No Blank Envelopes");
        actionwords.setPrintSetDetailsDefaultShipping("Default Option", "Glendale, CA");
        actionwords.clickAddToCart();
        actionwords.validateShoppingCart("Ground Shipping", "$9.55", "Glendale, CA", "116", "116.20", "$0.00", "$0.00");
        actionwords.clickClearCart();
    }

    @Test
    public void foilWorx() {
        actionwords.selectProductToBuild("Foil Worx", "1.5\" X 3.5\" 14PT Uncoated Foiled Business Cards");
        actionwords.selectPrimaryAttributes("500", "5/0 (4/0 with Foil on Front)", "5-7 Business Days");
        actionwords.selectBaseJobOptionsFoilColor("Black Foil");
        actionwords.setPrintSetDetailsDefaultShipping("Default Option", "Glendale, CA");
        actionwords.clickAddToCart();
        actionwords.validateShoppingCart("Ground Shipping", "$6.50", "Glendale, CA", "53", "$53.06", "$0.00", "$0.00");
        actionwords.clickClearCart();
    }

    @Test
    public void lusterCards() {
        actionwords.selectProductToBuild("Luster Cards", "4.25\" X 5.5\" 16PT Gloss Laminated Announcement Cards");
        actionwords.selectPrimaryAttributes("25", "4:0", "2-4 Business Days");
        actionwords.selectBaseJobOptionsBlankEnvelopes("No Blank Envelopes");
        actionwords.setPrintSetDetailsDefaultShipping("Default Option", "Glendale, CA");
        actionwords.clickAddToCart();
        actionwords.validateShoppingCart("Ground Shipping", "$7.55", "Glendale, CA", "73", "$72.56", "$0.00", "$0.00");
        actionwords.clickClearCart();
    }

    @Test
    public void naturalCards() {
        actionwords.selectProductToBuild("Natural Cards", "5.5\" X 17\" 14PT Natural Uncoated Menus");
        actionwords.selectPrimaryAttributes("25", "4:0", "2-4 Business Days");
        actionwords.selectBaseJobOptionsScoring("No Scoring");
        actionwords.setPrintSetDetailsDefaultShipping("Default Option", "Glendale, CA");
        actionwords.clickAddToCart();
        actionwords.validateShoppingCart("Ground Shipping", "$7.55", "Glendale, CA", "60", "$59.57", "$0.00", "$0.00");
        actionwords.clickClearCart();
    }

    @Test
    public void paintedEdgeCards() {
        actionwords.selectProductToBuild("Painted Edge Cards", "2\" X 3.5\" 32PT Uncoated Painted EDGE Business Cards");
        actionwords.selectPrimaryAttributes("250", "4:0", "2-4 Business Days");
        actionwords.selectBaseJobOptionsClearCaseEdgeColor("Ship with a Brown Box", "Black");
        actionwords.setPrintSetDetailsDefaultShipping("Default Option", "Glendale, CA");
        actionwords.clickAddToCart();
        actionwords.validateShoppingCart("Ground Shipping", "$5.00", "Glendale, CA", "37", "$37.49", "$0.00", "$0.00");
        actionwords.clickClearCart();
    }

    @Test
    public void pearlCards() {
        actionwords.selectProductToBuild("Pearl Cards", "4.25\" X 5.5\" 14PT Pearl Metallic Announcement Cards, FLAT - No Scoring");
        actionwords.selectPrimaryAttributes("25", "4:0", "2-4 Business Days");
        actionwords.selectBaseJobOptionsBlankEnvelopes("No Blank Envelopes");
        actionwords.setPrintSetDetailsDefaultShipping("Default Option", "Glendale, CA");
        actionwords.clickAddToCart();
        actionwords.validateShoppingCart("Ground Shipping", "$7.55", "Glendale, CA", "21", "$20.57", "$0.00", "$0.00");
        actionwords.clickClearCart();
    }

    @Test
    public void raisedFoil() {
        actionwords.selectProductToBuild("Raised Foil", "2\" X 3.5\" 16PT Suede Business Cards w/ Raised Foil on Both Sides");
        actionwords.selectPrimaryAttributes("100", "5/1 (4/1 with Foil on Both Sides)", "2-4 Business Days");
        actionwords.selectBaseJobOptionsFoilColor("Gold Foil");
        actionwords.setPrintSetDetailsDefaultShipping("Default Option", "Glendale, CA");
        actionwords.clickAddToCart();
        actionwords.validateShoppingCart("Ground Shipping", "$5.00", "Glendale, CA", "46", "$46.49", "$0.00", "$0.00");
        actionwords.clickClearCart();
    }

    @Test
    public void raisedSpotUV() {
        actionwords.selectProductToBuild("Raised Spot UV", "2\" X 3.5\" 16PT Suede Hang Tags w/ Raised Spot UV on Front only");
        actionwords.acceptDisclamer();
        actionwords.selectPrimaryAttributes("100", "4:0", "2-4 Business Days");
        actionwords.selectBaseJobOptionsRaisedSpotUV("50 Microns", "Raised Spot UV Front");
        actionwords.setPrintSetDetailsDefaultShipping("Default Option", "Glendale, CA");
        actionwords.clickAddToCart();
        actionwords.validateShoppingCart("Ground Shipping", "$8.55", "Glendale, CA", "40", "$39.70", "$0.00", "$0.00");
        actionwords.clickClearCart();
    }

    @Test
    public void silkCards() {
        actionwords.selectProductToBuild("Silk Cards", "1.5\" X 3.5\" 16PT Silk Laminated Business Cards");
        actionwords.selectPrimaryAttributes("25", "4:0", "2-4 Business Days");
        actionwords.setPrintSetDetailsDefaultShipping("Default Option", "Glendale, CA");
        actionwords.clickAddToCart();
        actionwords.validateShoppingCart("Ground Shipping", "$5.00", "Glendale, CA", "15", "$15.16", "$0.00", "$0.00");
        actionwords.clickClearCart();
    }

    @Test
    public void suedeCards() {
        actionwords.selectProductToBuild("Suede Cards", "1.5\" X 3.5\" 16PT Suede Hang Tags w/ Soft Velvet Lamination");
        actionwords.selectPrimaryAttributes("100", "4:0", "2-4 Business Days");
        actionwords.setPrintSetDetailsDefaultShipping("Default Option", "Glendale, CA");
        actionwords.clickAddToCart();
        actionwords.validateShoppingCart("Ground Shipping", "$8.55", "Glendale, CA", "37", "$36.82", "$0.00", "$0.00");
        actionwords.clickClearCart();
    }
}