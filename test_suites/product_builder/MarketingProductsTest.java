package com.example.test_suites.product_builder;

import org.testng.annotations.*;
import com.example.Actionwords;

public class MarketingProductsTest {

    public Actionwords actionwords;

    @BeforeMethod
    public void setUp() {
        actionwords = new Actionwords();
    }

    @Test
    public void announcementCards() {
        actionwords.selectProductToBuild("Announcement Cards", "4.25\" X 5.5\" 14PT Pearl Metallic Announcement Cards, FLAT - No Scoring");
        actionwords.selectPrimaryAttributes("25", "4:0", "2-4 Business Days");
        actionwords.selectBaseJobOptionsBlankEnvelopes("No Blank Envelopes");
        actionwords.setPrintSetDetailsDefaultShipping("Default Option", "Glendale, CA");
        actionwords.clickAddToCart();
        actionwords.validateShoppingCart("Ground Shipping", "$7.55", "Glendale, CA", "21", "$20.57", "$0.00", "$0.00");
        actionwords.clickClearCart();
    }

    @Test
    public void booklets() {
        actionwords.selectProductToBuild("Booklets", "6\" X 9\" - 12 Page Booklet on 100LB GLOSS BOOK w/ No AQ");
        actionwords.selectPrimaryAttributes("25", "4:4", "2-4 Business Days");
        actionwords.selectBaseJobOptionsBindingEdge("Long Edge");
        actionwords.setPrintSetDetailsDefaultShipping("Default Option", "Glendale, CA");
        actionwords.clickAddToCart();
        actionwords.validateShoppingCart("Ground Shipping", "$7.55", "Glendale, CA", "55", "$55.24", "$0.00", "$0.00");
        actionwords.clickClearCart();
    }

    @Test
    public void bookmarks() {
        actionwords.selectProductToBuild("Bookmarks", "1.5\" X 7\" 14PT Postcards UV on color side(s)");
        actionwords.selectPrimaryAttributes("250", "4:0", "2-4 Business Days");
        actionwords.selectBaseJobOptionsDrillHole("No Drill Hole");
        actionwords.setPrintSetDetailsDefaultShipping("Default Option", "Glendale, CA");
        actionwords.clickAddToCart();
        actionwords.validateShoppingCart("Ground Shipping", "$8.55", "Glendale, CA", "15", "$15.16", "$0.00", "$0.00");
        actionwords.clickClearCart();
    }

    @Test
    public void businessCards() {
        actionwords.selectProductToBuild("Business Cards", "ALL INCLUSIVE PRICING 2\" X 3.5\" 14PT Business Cards UV on 4-color side(s)");
        actionwords.selectPrimaryAttributes("25", "4:0", "Next Business Day");
        actionwords.setPrintSetDetailsDefaultShipping("Default Option", "Glendale, CA");
        actionwords.clickAddToCart();
        actionwords.validateShoppingCart("FREE Ground Shipping", "$0.00", "Glendale, CA", "14", "$13.54", "$0.00", "$0.00");
        actionwords.clickClearCart();
    }

    @Test
    public void cDAndDVD() {
        actionwords.selectProductToBuild("CD and DVD", "4.75\" X 4.75\" Single Panel CD Cover On 100LB GLOSS BOOK w/ AQ");
        actionwords.selectPrimaryAttributes("1000", "4:0", "2-4 Business Days");
        actionwords.setPrintSetDetailsDefaultShipping("Default Option", "Glendale, CA");
        actionwords.clickAddToCart();
        actionwords.validateShoppingCart("Ground Shipping", "$10.55", "Glendale, CA", "67", "$67.15", "$0.00", "$0.00");
        actionwords.clickClearCart();
    }

    @Test
    public void calendars() {
        actionwords.selectProductToBuild("Calendars", "11\" X 8.5\" - 24 Page Saddle Stitch Calendar On 100LB GLOSS BOOK w/ AQ on both sides");
        actionwords.selectPrimaryAttributes("100", "4:4", "2-4 Business Days");
        actionwords.selectBaseJobOptionsDrillHole("No Drill Hole");
        actionwords.setPrintSetDetailsDefaultShipping("Default Option", "Glendale, CA");
        actionwords.clickAddToCart();
        actionwords.validateShoppingCart("Ground Shipping", "$9.56", "Glendale, CA", "889", "$888.77", "$0.00", "$0.00");
        actionwords.clickClearCart();
    }

    @Test
    public void catalogs() {
        actionwords.selectProductToBuild("Catalogs", "8.5\" X 11\" -28 Page Perfect Bound (24 Inside pages 4:4 plus 4 page cover 4:0) w/No AQ");
        actionwords.selectPrimaryAttributes("25", "4:4", "2-4 Business Days");
        actionwords.selectBaseJobOptionsBindingEdge("Long Edge");
        actionwords.setPrintSetDetailsDefaultShipping("Default Option", "Glendale, CA");
        actionwords.clickAddToCart();
        actionwords.validateShoppingCart("Ground Shipping", "$7.55", "Glendale, CA", "227", "$227.44", "$0.00", "$0.00");
        actionwords.clickClearCart();
    }

    @Test
    public void counterCards() {
        actionwords.selectProductToBuild("Counter Cards", "5.5\" x 8.5\" - 3/16\" Foam Core Counter Cards w/ Easel Backs");
        actionwords.selectPrimaryAttributes("1", "4:0", "5-7 Business Days");
        actionwords.selectBaseJobOptionsEasel();
        actionwords.setPrintSetDetailsDefaultShipping("Default Option", "Glendale, CA");
        actionwords.clickAddToCart();
        actionwords.validateShoppingCart("Ground Shipping", "$10.55", "Glendale, CA", "11", "$10.56", "$0.00", "$0.00");
        actionwords.clickClearCart();
    }

    @Test
    public void doorHangers() {
        actionwords.selectProductToBuild("Door Hangers", "4\" X 7\" Die Cut Door Hangers on 14PT w/ UV");
        actionwords.selectPrimaryAttributes("250", "4:0", "2-4 Business Days");
        actionwords.selectBaseJobOptionsDieCutOptions("Arch Die Cut");
        actionwords.setPrintSetDetailsDefaultShipping("Default Option", "Glendale, CA");
        actionwords.clickAddToCart();
        actionwords.validateShoppingCart("Ground Shipping", "$8.55", "Glendale, CA", "76", "$75.81", "$0.00", "$0.00");
        actionwords.clickClearCart();
    }

    @Test
    public void endurACE() {
        actionwords.selectProductToBuild("EndurACE", "2\" x 3.5\" 10PT EndurACE Full Color Business Cards");
        actionwords.selectPrimaryAttributes("50", "4:0", "5-7 Business Days");
        actionwords.setPrintSetDetailsDefaultShipping("Default Option", "Glendale, CA");
        actionwords.clickAddToCart();
        actionwords.validateShoppingCart("Ground Shipping", "$5.00", "Glendale, CA", "13", "$12.99", "$0.00", "$0.00");
        actionwords.clickClearCart();
    }

    @Test
    public void envelope() {
        actionwords.selectProductToBuild("Envelope", "8.875\" X 3.875\" #9 ENVELOPE on 70lb Premium Uncoated Text");
        actionwords.selectPrimaryAttributes("250", "4:0", "5-7 Business Days");
        actionwords.selectBaseJobOptionsWindow("No Window");
        actionwords.setPrintSetDetailsDefaultShipping("Default Option", "Glendale, CA");
        actionwords.clickAddToCart();
        actionwords.validateShoppingCart("Ground Shipping", "$8.55", "Glendale, CA", "67", "$66.88", "$0.00", "$0.00");
        actionwords.clickClearCart();
    }

    @Test
    public void eventTickets() {
        actionwords.selectProductToBuild("Event Tickets", "8.5X3.5 18PTC1S Tickets w/ Full UV on the front only, No UV Coating on the back w/ Va...");
        actionwords.selectPrimaryAttributes("100", "4:0", "5-7 Business Days");
        actionwords.selectBaseJobOptionsNumberingPerforation("No Numbering", "No Perforation");
        actionwords.setPrintSetDetailsDefaultShipping("Default Option", "Glendale, CA");
        actionwords.clickAddToCart();
        actionwords.validateShoppingCart("Ground Shipping", "$8.55", "Glendale, CA", "30", "$30.33", "$0.00", "$0.00");
        actionwords.clickClearCart();
    }

    @Test
    public void flyersAndBrochures() {
        actionwords.selectProductToBuild("Flyers and Brochures", "ALL INCLUSIVE PRICING 11\" x 17\" 100LB Gloss Book With No AQ");
        actionwords.selectPrimaryAttributes("25", "4:0", "Next Business Day");
        actionwords.selectBaseJobOptionsFolding("Half-Fold");
        actionwords.setPrintSetDetailsDefaultShipping("Default Option", "Glendale, CA");
        actionwords.clickAddToCart();
        actionwords.validateShoppingCart("FREE Ground Shipping", "$0.00", "Glendale, CA", "40", "$40.45", "$0.00", "$0.00");
        actionwords.clickClearCart();
    }

    @Test
    public void greetingCards() {
        actionwords.selectProductToBuild("Greeting Cards", "10\" X 7\" 14PT Matte/Dull Finish Greeting Cards w/ Spot UV on back only, No UV on the ...");
        actionwords.selectPrimaryAttributes("1000", "4:1", "2-4 Business Days");
        actionwords.selectBaseJobOptionsBlankEnvelopes("No Blank Envelopes");
        actionwords.setPrintSetDetailsDefaultShipping("Default Option", "Glendale, CA");
        actionwords.clickAddToCart();
        actionwords.validateShoppingCart("Ground Shipping", "$17.60", "Glendale, CA", "201", "$201.45", "$0.00", "$0.00");
        actionwords.clickClearCart();
    }

    @Test
    public void hangTags() {
        actionwords.selectProductToBuild(" Hang Tags", "1.75\" X 3.5\" 14PT Natural Uncoated Hang Tags");
        actionwords.selectPrimaryAttributes("100", "4:0", "2-4 Business Days");
        actionwords.setPrintSetDetailsDefaultShipping("Default Option", "Glendale, CA");
        actionwords.clickAddToCart();
        actionwords.validateShoppingCart("Ground Shipping", "$8.55", "Glendale, CA", "27", "$27.08", "$0.00", "$0.00");
        actionwords.clickClearCart();
    }

    @Test
    public void letterheads() {
        actionwords.selectProductToBuild("Letterheads", "5.5\" X 8.5\" LETTERHEAD on 70lb LINEN");
        actionwords.selectPrimaryAttributes("250", "4:0", "2-4 Business Days");
        actionwords.setPrintSetDetailsDefaultShipping("Default Option", "Glendale, CA");
        actionwords.clickAddToCart();
        actionwords.validateShoppingCart("Ground Shipping", "$8.55", "Glendale, CA", "51", "$51.02", "$0.00", "$0.00");
        actionwords.clickClearCart();
    }

    @Test
    public void linenUncoated() {
        actionwords.selectProductToBuild("Linen Uncoated", "9.5\" X 4.125\" #10 ENVELOPE on 70lb Linen Uncoated Text");
        actionwords.selectPrimaryAttributes("250", "4:0", "2-4 Business Days");
        actionwords.selectBaseJobOptionsWindow("No Window");
        actionwords.setPrintSetDetailsDefaultShipping("Default Option", "Glendale, CA");
        actionwords.clickAddToCart();
        actionwords.validateShoppingCart("Ground Shipping", "$8.55", "Glendale, CA", "74", "$73.73", "$0.00", "$0.00");
        actionwords.clickClearCart();
    }

    @Test
    public void magnets() {
        actionwords.selectProductToBuild("Magnets", "2\" X 3.5\" Indoor Magnet w/ UV Coating on 17PT");
        actionwords.selectPrimaryAttributes("250", "4:0", "2-4 Business Days");
        actionwords.setPrintSetDetailsDefaultShipping("Default Option", "Glendale, CA");
        actionwords.clickAddToCart();
        actionwords.validateShoppingCart("Ground Shipping", "$5.00", "Glendale, CA", "30", "$30.33", "$0.00", "$0.00");
        actionwords.clickClearCart();
    }

    @Test
    public void marketplace() {
        actionwords.selectProductToBuild("Marketplace", "4.375\" X 5.75\" A2 Blank Envelope on 70lb Pearl Metallic");
        actionwords.selectPrimaryAttributes("100", "Non Print", "Next Business Day");
        actionwords.setPrintSetDetailsDefaultShipping("Default Option", "Glendale, CA");
        actionwords.clickAddToCart();
        actionwords.validateShoppingCart("Ground Shipping", "$8.55", "Glendale, CA", "23", "$22.75", "$0.00", "$0.00");
        actionwords.clickClearCart();
    }

    @Test
    public void nCRForms() {
        actionwords.selectProductToBuild("NCR Forms", "8.5\" x 11\" 2 Part NCR Forms w/ Wraparound Cover - Qty 50 per book");
        actionwords.selectPrimaryAttributes("2", "1:0", "2-4 Business Days");
        actionwords.setPrintSetDetailsDefaultShipping("Default Option", "Glendale, CA");
        actionwords.clickAddToCart();
        actionwords.validateShoppingCart("Ground Shipping", "$10.55", "Glendale, CA", "26", "$25.62", "$0.00", "$0.00");
        actionwords.clickClearCart();
    }

    @Test
    public void notepads() {
        actionwords.selectProductToBuild("Notepads", "4.25\" X 5.5\" 25 Sheet Notepad on 70LB Premium Uncoated Text w/ Chipboard Backer");
        actionwords.selectPrimaryAttributes("50", "4:0", "2-4 Business Days");
        actionwords.setPrintSetDetailsDefaultShipping("Default Option", "Glendale, CA");
        actionwords.clickAddToCart();
        actionwords.validateShoppingCart("Ground Shipping", "$7.55", "Glendale, CA", "78", "$77.57", "$0.00", "$0.00");
        actionwords.clickClearCart();
    }

    @Test
    public void plasticCards() {
        actionwords.selectProductToBuild("Plastic Cards", "2\" x 3.5\" 20PT White Plastic Business Cards w/ Round Corners");
        actionwords.selectPrimaryAttributes("100", "4:0", "5-7 Business Days");
        actionwords.selectBaseJobOptionsRadiusOfCorners("Rounded 1/4\"");
        actionwords.setPrintSetDetailsDefaultShipping("Default Option", "Glendale, CA");
        actionwords.clickAddToCart();
        actionwords.validateShoppingCart("Ground Shipping", "$10.55", "Glendale, CA", "36", "$35.74", "$0.00", "$0.00");
        actionwords.clickClearCart();
    }

    @Test
    public void postcards() {
        actionwords.selectProductToBuild("Postcards", "ALL INCLUSIVE PRICING 4\" X 6\" 14PT Matte/Dull Finish Postcards");
        actionwords.selectPrimaryAttributes("100", "4:0", "Next Business Day");
        actionwords.setPrintSetDetailsDefaultShipping("Default Option", "Glendale, CA");
        actionwords.clickAddToCart();
        actionwords.validateShoppingCart("FREE Ground Shipping", "$0.00", "Glendale, CA", "28", "$27.80", "$0.00", "$0.00");
        actionwords.clickClearCart();
    }

    @Test
    public void posters() {
        actionwords.selectProductToBuild("Posters", "11.5\" X 17.5\" Posters on 100LB Dull Book w/ Satin AQ");
        actionwords.selectPrimaryAttributes("500", "4:0", "5-7 Business Days");
        actionwords.setPrintSetDetailsDefaultShipping("Default Option", "Phoenix, AZ");
        actionwords.clickAddToCart();
        actionwords.validateShoppingCart("Ground Shipping", "$10.60", "Phoenix, AZ", "276", "$276.18", "$0.00", "$0.00");
        actionwords.clickClearCart();
    }

    @Test
    public void presentationFolders() {
        actionwords.selectProductToBuild("Presentation Folders", "6\" X 9\" Presentation Folder on 100LB Gloss Cover With AQ");
        actionwords.selectPrimaryAttributes("500", "4:0", "2-4 Business Days");
        actionwords.selectBaseJobOptionsPocketsBCSlits("1 Pocket on the Left (Front) Side", "No Business Card Slits");
        actionwords.setPrintSetDetailsDefaultShipping("Default Option", "Glendale, CA");
        actionwords.clickAddToCart();
        actionwords.validateShoppingCart("Ground Shipping", "$9.55", "Glendale, CA", "348", "$347.66", "$0.00", "$0.00");
        actionwords.clickClearCart();
    }

    @Test
    public void proofs() {
        actionwords.selectProductToBuild("Proofs", "Epson Proofs Up to 8.5\" x 11\"");
        actionwords.selectPrimaryAttributes("1", "4:0", "2-4 Business Days");
        actionwords.setPrintSetDetailsDefaultShipping("Default Option", "Glendale, CA");
        actionwords.clickAddToCart();
        actionwords.validateShoppingCart("Ground Shipping", "$10.55", "Glendale, CA", "27", "$27.08", "$0.00", "$0.00");
        actionwords.clickClearCart();
    }

    @Test
    public void rollLabels() {
        actionwords.selectProductToBuild(" Roll Labels", "1\" x 1\" Semi-Gloss Paper Roll Label");
        actionwords.selectPrimaryAttributes("250", "4:0", "2-4 Business Days");
        actionwords.selectBaseJobOptionsLaminationShapeUnwind("No Lamination", "Circle", "Not Important");
        actionwords.setPrintSetDetailsDefaultShipping("Default Option", "Glendale, CA");
        actionwords.clickAddToCart();
        actionwords.validateShoppingCart("Ground Shipping", "$8.55", "Glendale, CA", "79", "$79.06", "$0.00", "$0.00");
        actionwords.clickClearCart();
    }

    @Test
    public void sampleRequest() {
        actionwords.selectProductToBuild(" Sample Request", "Sample packs for Grand4mat products");
        actionwords.selectPrimaryAttributes("1", "Non Print", "5-7 Business Days");
        actionwords.setPrintSetDetailsDefaultShipping("Default Option", "Glendale, CA");
        actionwords.clickAddToCart();
        actionwords.validateShoppingCart("Ground Shipping", "$0.00", "Glendale, CA", "7", "$7.04", "$0.00", "$0.00");
        actionwords.clickClearCart();
    }

    @Test
    public void sellSheets() {
        actionwords.selectProductToBuild("Sell Sheets", "11\" X 17\" 14PT Sell Sheets UV on 4-color side(s)");
        actionwords.selectPrimaryAttributes("100", "4:0", "2-4 Business Days");
        actionwords.selectBaseJobOptionsScoring("No Scoring");
        actionwords.setPrintSetDetailsDefaultShipping("Default Option", "Glendale, CA");
        actionwords.clickAddToCart();
        actionwords.validateShoppingCart("Ground Shipping", "$8.55", "Glendale, CA", "354", "$354.15", "$0.00", "$0.00");
    }

    @Test
    public void stickers() {
        actionwords.selectProductToBuild("Stickers", "1.5\" X 2.5\" OVAL Stickers w/ UV");
        actionwords.selectPrimaryAttributes("500", "4:0", "2-4 Business Days");
        actionwords.selectBaseJobOptionsShape("Oval");
        actionwords.setPrintSetDetailsDefaultShipping("Default Option", "Glendale, CA");
        actionwords.clickAddToCart();
        actionwords.validateShoppingCart("Ground Shipping", "$9.55", "Glendale, CA", "27", "$27.08", "$0.00", "$0.00");
        actionwords.clickClearCart();
    }

    @Test
    public void tableTentCards() {
        actionwords.selectProductToBuild("Table Tent Cards", "4\" X 6\" (Flat Size: 4 X 16.25) 14PT MATTE Table Tent, Die Cut and Scoring Included");
        actionwords.selectPrimaryAttributes("250", "4:0", "2-4 Business Days");
        actionwords.setPrintSetDetailsDefaultShipping("Default Option", "Glendale, CA");
        actionwords.clickAddToCart();
        actionwords.validateShoppingCart("Ground Shipping", "$8.55", "Glendale, CA", "101", "$101.35", "$0.00", "$0.00");
        actionwords.clickClearCart();
    }

    @Test
    public void tearOffCards() {
        actionwords.selectProductToBuild("Tear Off Cards", "4.25\" X 11\" Door Hangers w/ tear-off perforation on 16PT w/ UV");
        actionwords.selectPrimaryAttributes("1000", "4:0", "2-4 Business Days");
        actionwords.selectBaseJobOptionsDieCutPerforation("Arch Die Cut", "Perforation 2\" from Bottom");
        actionwords.setPrintSetDetailsDefaultShipping("Default Option", "Glendale, CA");
        actionwords.clickAddToCart();
        actionwords.validateShoppingCart("Ground Shipping", "$11.23", "Glendale, CA", "144", "$144.05", "$0.00", "$0.00");
        actionwords.clickClearCart();
    }

    @Test
    public void tradingCards() {
        actionwords.selectProductToBuild("Trading Cards", "2.5\" X 3.5\" 14PT Trading Cards UV on 4-color side(s)");
        actionwords.selectPrimaryAttributes("25", "4:0", "2-4 Business Days");
        actionwords.setPrintSetDetailsDefaultShipping("Default Option", "Glendale, CA");
        actionwords.clickAddToCart();
        actionwords.validateShoppingCart("Ground Shipping", "$7.55", "Glendale, CA", "7", "$7.27", "$0.00", "$0.00");
        actionwords.clickClearCart();
    }

    @Test
    public void variableData() {
        actionwords.selectProductToBuild("Variable Data", "5.25\" X 7.25\" A7 ENVELOPE on 70lb Premium Uncoated Text w/ Variable Addressing");
        actionwords.acceptDisclamer();
        actionwords.selectPrimaryAttributes("100", "4:0", "2-4 Business Days");
        actionwords.setPrintSetDetailsDefaultShipping("Default Option", "Glendale, CA");
        actionwords.clickAddToCart();
        actionwords.validateShoppingCart("Ground Shipping", "$8.55", "Glendale, CA", "57", "$57.40", "$0.00", "$0.00");
        actionwords.clickClearCart();
    }

    @Test
    public void menus() {
        actionwords.selectProductToBuild("Menus", "11\" X 17\" 14PT Natural Uncoated Sell Sheets");
        actionwords.selectPrimaryAttributes("25", "4:0", "2-4 Business Days");
        actionwords.selectBaseJobOptionsScoring("No Scoring");
        actionwords.setPrintSetDetailsDefaultShipping("Default Option", "Glendale, CA");
        actionwords.clickAddToCart();
        actionwords.validateShoppingCart("Ground Shipping", "$7.55", "Glendale, CA", "260", "$259.93", "$0.00", "$0.00");
        actionwords.clickClearCart();
    }

    @Test
    public void windowClings() {
        actionwords.selectProductToBuild("Window Clings", "11\" x 17\" 8 mil Clear Window Cling");
        actionwords.selectPrimaryAttributes("25", "5:0", "2-4 Business Days");
        actionwords.setPrintSetDetailsDefaultShipping("Default Option", "Glendale, CA");
        actionwords.clickAddToCart();
        actionwords.validateShoppingCart("Ground Shipping", "$7.55", "Glendale, CA", "63", "$63.34", "$0.00", "$0.00");
        actionwords.clickClearCart();
    }
}