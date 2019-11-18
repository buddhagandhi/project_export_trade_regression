package com.example.test_suites;

import org.testng.annotations.*;
import com.example.Actionwords;

public class ShippingTest {

    public Actionwords actionwords;

    @BeforeMethod
    public void setUp() {
        actionwords = new Actionwords();
    }
    public void groupShipping(String linkText, String turnAround, int rewards, String subtotal, String orderDiscount, String quantityDiscount) {
        // Tags: Smoke
        actionwords.selectProductToBuild("Business Cards", String.format("%s", link_text));
        actionwords.selectPrimaryAttributes("500", "4:4", String.format("%s", turn_around));
        actionwords.provideHowManySets("4");
        actionwords.setPrintSetDetailsDefaultShippingGroupShipping("Ground Shipping", "Glendale, CA");
        actionwords.clickAddToCart();
        actionwords.validateShoppingCart("Ground Shipping", "$10.55", "Glendale, CA", String.format("%s", rewards), String.format("%s", subtotal), String.format("%s", quantity_discount), String.format("%s", order_discount));
        actionwords.clickClearCart();
    }

    @Test
    public void groupShipping100GLCBCUC2X35() {
        groupShipping("2\" x 3.5\" 100LB GLOSS COVER WITH NO AQ", "2-4 Business Days", 64, "$62.80", "$0.00", "$0.00");
    }

    @Test
    public void groupShipping100LBBCLIN2X35() {
        groupShipping("2\" X 3.5\" 100LB Cover Uncoated Linen Business Cards", "2-4 Business Days", 78, "$78.00", "$0.00", "$0.00");
    }

    @Test
    public void groupShipping14PTBCMATT2X35() {
        groupShipping("2\" X 3.5\" 14PT Matte/Dull Finish Business Cards", "2-4 Business Days", 37, "$36.84", "$0.00", "$0.00");
    }

    @Test
    public void groupShipping14PTBCUV2X35() {
        groupShipping("2\" X 3.5\" 14PT Business Cards UV on 4-color side(s)", "2-4 Business Days", 37, "$36.84", "$0.00", "$0.00");
    }

    @Test
    public void groupShipping14PTBCUVFR2X35() {
        groupShipping("2\" X 3.5\" 14PT Business Cards w/ Full UV on the front only, No UV coating on the bac...", "2-4 Business Days", 37, "$36.84", "$0.00", "$0.00");
    }

    @Test
    public void groupShipping16PTBCMATT2X35() {
        groupShipping("2\" X 3.5\" 16PT Matte/Dull Finish Business Cards", "Next Day + 1", 37, "$36.84", "$0.00", "$0.00");
    }

    @Test
    public void groupShipping16PTBCUV2X35() {
        groupShipping("2\" x 3.5\" 16PT Business Cards UV on 4-color side(s)", "Next Day + 1", 37, "$36.84", "$0.00", "$0.00");
    }

    @Test
    public void groupShipping16PTBCUVFR2X35() {
        groupShipping("2\" X 3.5\" 16PT Business Cards w/ Full UV on the front only, No UV coating on the bac...", "Next Day + 1", 37, "$36.84", "$0.00", "$0.00");
    }


    //
    // Tags: Smoke
    @Test
    public void purolator() {
        actionwords.selectProductToBuild("Postcards", "4\" X 6\" 16PT Postcards w/ Full UV on the front only, No UV Coating on the back");
        actionwords.selectPrimaryAttributes("1000", "4:4", "Next Day + 1");
        actionwords.selectBaseJobOptionsBundlingMailingShrink("No Bundling Services", "No Direct Mailing Service", "No Shrink Wrapping");
        actionwords.provideHowManySets("1");
        actionwords.setPrintSetDetailsDropship("Toronto", "Default Option", "Toronto, ON");
        actionwords.clickAddToCart();
        actionwords.validateShoppingCart("Purolator Ground", "$6.", "Toronto, ON", "28", "$28.16", "$0.00", "$0.00");
        actionwords.clickClearCart();
    }
    //
    // Tags: Smoke
    @Test
    public void pickUp() {
        actionwords.selectProductToBuild(" Door Hangers", "4\" X 7\" Die Cut Door Hangers on 14PT w/ UV");
        actionwords.selectPrimaryAttributes("5000", "4:4", "2-4 Business Days");
        actionwords.selectBaseJobOptionsDieCutOptions("Standard Die Cut");
        actionwords.setPrintSetDetailsPickUp("Glendale, CA");
        actionwords.clickAddToCart();
        actionwords.validateShoppingCart("Pickup", "$0.00", "Glendale, CA", "239", "$239.36", "$0.00", "$0.00");
        actionwords.clickClearCart();
    }
    //
    // Tags: Smoke
    @Test
    public void freeDelivery() {
        actionwords.selectProductToBuild(" Door Hangers", "4\" X 7\" Die Cut Door Hangers on 14PT w/ UV");
        actionwords.selectPrimaryAttributes("5000", "4:4", "2-4 Business Days");
        actionwords.selectBaseJobOptionsDieCutOptions("Standard Die Cut");
        actionwords.setPrintSetDetailsFreeDelivery("Glendale, CA");
        actionwords.clickAddToCart();
        actionwords.validateShoppingCart("Free Local Delivery", "$0.00", "Glendale, CA", "239", "$239.36", "$0.00", "$0.00");
        actionwords.clickClearCart();
    }
    public void flatRate500(String linkText, String turnAround, int rewards, String subtotal, String orderDiscount, String quantityDiscount) {
        // Tags: Smoke
        actionwords.selectProductToBuild("Business Cards", String.format("%s", link_text));
        actionwords.selectPrimaryAttributes("250", "4:4", String.format("%s", turn_around));
        actionwords.provideHowManySets("1");
        actionwords.setPrintSetDetailsDefaultShipping("Default Option", "Glendale, CA");
        actionwords.clickAddToCart();
        actionwords.validateShoppingCart("Ground Shipping", "$5.00", "Glendale, CA", String.format("%s", rewards), String.format("%s", subtotal), String.format("%s", quantity_discount), String.format("%s", order_discount));
        actionwords.clickClearCart();
    }

    @Test
    public void flatRate500100GLCBCUC2X35() {
        flatRate500("2\" x 3.5\" 100LB GLOSS COVER WITH NO AQ", "2-4 Business Days", 14, "$13.54", "$0.00", "$0.00");
    }

    @Test
    public void flatRate500100LBBCLIN2X35() {
        flatRate500("2\" X 3.5\" 100LB Cover Uncoated Linen Business Cards", "2-4 Business Days", 17, "$17.33", "$0.00", "$0.00");
    }

    @Test
    public void flatRate50014PTBCMATT2X35() {
        flatRate500("2\" X 3.5\" 14PT Matte/Dull Finish Business Cards", "2-4 Business Days", 8, "$7.58", "$0.00", "$0.00");
    }

    @Test
    public void flatRate50014PTBCUV2X35() {
        flatRate500("2\" X 3.5\" 14PT Business Cards UV on 4-color side(s)", "2-4 Business Days", 8, "$7.58", "$0.00", "$0.00");
    }

    @Test
    public void flatRate50014PTBCUVFR2X35() {
        flatRate500("2\" X 3.5\" 14PT Business Cards w/ Full UV on the front only, No UV coating on the bac...", "2-4 Business Days", 8, "$7.58", "$0.00", "$0.00");
    }

    @Test
    public void flatRate50016PTBCMATT2X35() {
        flatRate500("2\" X 3.5\" 16PT Matte/Dull Finish Business Cards", "Next Day + 1", 8, "$7.58", "$0.00", "$0.00");
    }

    @Test
    public void flatRate50016PTBCUV2X35() {
        flatRate500("2\" x 3.5\" 16PT Business Cards UV on 4-color side(s)", "Next Day + 1", 8, "$7.58", "$0.00", "$0.00");
    }

    @Test
    public void flatRate50016PTBCUVFR2X35() {
        flatRate500("2\" X 3.5\" 16PT Business Cards w/ Full UV on the front only, No UV coating on the bac...", "Next Day + 1", 8, "$7.58", "$0.00", "$0.00");
    }


    public void flatRate650(String linkText, String turnAround, int rewards, String subtotal, String orderDiscount, String quantityDiscount) {
        // Tags: Smoke
        actionwords.selectProductToBuild("Business Cards", String.format("%s", link_text));
        actionwords.selectPrimaryAttributes("500", "4:4", String.format("%s", turn_around));
        actionwords.provideHowManySets("1");
        actionwords.setPrintSetDetailsDefaultShipping("Ground Shipping", "Glendale, CA");
        actionwords.clickAddToCart();
        actionwords.validateShoppingCart("Ground Shipping", "$6.50", "Glendale, CA", String.format("%s", rewards), String.format("%s", subtotal), String.format("%s", quantity_discount), String.format("%s", order_discount));
        actionwords.clickClearCart();
    }

    @Test
    public void flatRate650100GLCBCUC2X35() {
        flatRate650("2\" x 3.5\" 100LB GLOSS COVER WITH NO AQ", "2-4 Business Days", 16, "$15.70", "$0.00", "$0.00");
    }

    @Test
    public void flatRate650100LBBCLIN2X35() {
        flatRate650("2\" X 3.5\" 100LB Cover Uncoated Linen Business Cards", "2-4 Business Days", 20, "$19.50", "$0.00", "$0.00");
    }

    @Test
    public void flatRate65014PTBCMATT2X35() {
        flatRate650("2\" X 3.5\" 14PT Matte/Dull Finish Business Cards", "2-4 Business Days", 9, "$9.21", "$0.00", "$0.00");
    }

    @Test
    public void flatRate65014PTBCUV2X35() {
        flatRate650("2\" X 3.5\" 14PT Business Cards UV on 4-color side(s)", "2-4 Business Days", 9, "$9.21", "$0.00", "$0.00");
    }

    @Test
    public void flatRate65014PTBCUVFR2X35() {
        flatRate650("2\" X 3.5\" 14PT Business Cards w/ Full UV on the front only, No UV coating on the bac...", "2-4 Business Days", 9, "$9.21", "$0.00", "$0.00");
    }

    @Test
    public void flatRate65016PTBCMATT2X35() {
        flatRate650("2\" X 3.5\" 16PT Matte/Dull Finish Business Cards", "Next Day + 1", 9, "$9.21", "$0.00", "$0.00");
    }

    @Test
    public void flatRate65016PTBCUV2X35() {
        flatRate650("2\" x 3.5\" 16PT Business Cards UV on 4-color side(s)", "Next Day + 1", 9, "$9.21", "$0.00", "$0.00");
    }

    @Test
    public void flatRate65016PTBCUVFR2X35() {
        flatRate650("2\" X 3.5\" 16PT Business Cards w/ Full UV on the front only, No UV coating on the bac...", "Next Day + 1", 9, "$9.21", "$0.00", "$0.00");
    }


    public void freeGroundShipping(String linkText, int runSize, String turnAround, int rewards, String subtotal, String orderDiscount, String quantityDiscount) {
        // Tags: Smoke
        actionwords.selectProductToBuild("Business Cards", String.format("%s", link_text));
        actionwords.selectPrimaryAttributes(String.format("%s", run_size), "4:4", String.format("%s", turn_around));
        actionwords.provideHowManySets("1");
        actionwords.setPrintSetDetailsDefaultShipping("FREE Ground Shipping", "Glendale, CA");
        actionwords.clickAddToCart();
        actionwords.validateShoppingCart("FREE Ground Shipping", "$0.00", "Glendale, CA", String.format("%s", rewards), String.format("%s", subtotal), String.format("%s", quantity_discount), String.format("%s", order_discount));
        actionwords.clickClearCart();
    }

    @Test
    public void freeGroundShipping100014PTBCMATT2X35() {
        freeGroundShipping("2\" X 3.5\" 14PT Matte/Dull Finish Business Cards", 1000, "2-4 Business Days", 18, 18.41, "$0.00", "$0.00");
    }

    @Test
    public void freeGroundShipping100014PTBCUV2X35() {
        freeGroundShipping("2\" X 3.5\" 14PT Business Cards UV on 4-color side(s)", 1000, "2-4 Business Days", 18, 18.41, "$0.00", "$0.00");
    }

    @Test
    public void freeGroundShipping100014PTBCUVFR2X35() {
        freeGroundShipping("2\" X 3.5\" 14PT Business Cards w/ Full UV on the front only, No UV coating on the bac...", 1000, "2-4 Business Days", 18, 18.41, "$0.00", "$0.00");
    }

    @Test
    public void freeGroundShipping100016PTBCMATT2X35() {
        freeGroundShipping("2\" X 3.5\" 16PT Matte/Dull Finish Business Cards", 1000, "Next Day + 1", 18, 18.41, "$0.00", "$0.00");
    }

    @Test
    public void freeGroundShipping100016PTBCUV2X35() {
        freeGroundShipping("2\" x 3.5\" 16PT Business Cards UV on 4-color side(s)", 1000, "Next Day + 1", 18, 18.41, "$0.00", "$0.00");
    }

    @Test
    public void freeGroundShipping100016PTBCUVFR2X35() {
        freeGroundShipping("2\" X 3.5\" 16PT Business Cards w/ Full UV on the front only, No UV coating on the bac...", 1000, "Next Day + 1", 18, 18.41, "$0.00", "$0.00");
    }

    @Test
    public void freeGroundShipping250014PTBCMATT2X35() {
        freeGroundShipping("2\" X 3.5\" 14PT Matte/Dull Finish Business Cards", 2500, "2-4 Business Days", 29, "$29.24", "$0.00", "$0.00");
    }

    @Test
    public void freeGroundShipping250014PTBCUV2X35() {
        freeGroundShipping("2\" X 3.5\" 14PT Business Cards UV on 4-color side(s)", 2500, "2-4 Business Days", 29, "$29.24", "$0.00", "$0.00");
    }

    @Test
    public void freeGroundShipping250014PTBCUVFR2X35() {
        freeGroundShipping("2\" X 3.5\" 14PT Business Cards w/ Full UV on the front only, No UV coating on the bac...", 2500, "2-4 Business Days", 29, "$29.24", "$0.00", "$0.00");
    }

    @Test
    public void freeGroundShipping250016PTBCMATT2X35() {
        freeGroundShipping("2\" X 3.5\" 16PT Matte/Dull Finish Business Cards", 2500, "Next Day + 1", 29, "$29.24", "$0.00", "$0.00");
    }

    @Test
    public void freeGroundShipping250016PTBCUV2X35() {
        freeGroundShipping("2\" x 3.5\" 16PT Business Cards UV on 4-color side(s)", 2500, "Next Day + 1", 29, "$29.24", "$0.00", "$0.00");
    }

    @Test
    public void freeGroundShipping250016PTBCUVFR2X35() {
        freeGroundShipping("2\" X 3.5\" 16PT Business Cards w/ Full UV on the front only, No UV coating on the bac...", 2500, "Next Day + 1", 29, "$29.24", "$0.00", "$0.00");
    }

    @Test
    public void freeGroundShipping500014PTBCMATT2X35() {
        freeGroundShipping("2\" X 3.5\" 14PT Matte/Dull Finish Business Cards", 5000, "2-4 Business Days", 49, "$48.74", "$0.00", "$0.00");
    }

    @Test
    public void freeGroundShipping500014PTBCUV2X35() {
        freeGroundShipping("2\" X 3.5\" 14PT Business Cards UV on 4-color side(s)", 5000, "2-4 Business Days", 49, "$48.74", "$0.00", "$0.00");
    }

    @Test
    public void freeGroundShipping500014PTBCUVFR2X35() {
        freeGroundShipping("2\" X 3.5\" 14PT Business Cards w/ Full UV on the front only, No UV coating on the bac...", 5000, "2-4 Business Days", 49, "$48.74", "$0.00", "$0.00");
    }

    @Test
    public void freeGroundShipping500016PTBCMATT2X35() {
        freeGroundShipping("2\" X 3.5\" 16PT Matte/Dull Finish Business Cards", 5000, "Next Day + 1", 49, "$48.74", "$0.00", "$0.00");
    }

    @Test
    public void freeGroundShipping500016PTBCUV2X35() {
        freeGroundShipping("2\" x 3.5\" 16PT Business Cards UV on 4-color side(s)", 5000, "Next Day + 1", 49, "$48.74", "$0.00", "$0.00");
    }

    @Test
    public void freeGroundShipping500016PTBCUVFR2X35() {
        freeGroundShipping("2\" X 3.5\" 16PT Business Cards w/ Full UV on the front only, No UV coating on the bac...", 5000, "Next Day + 1", 49, "$48.74", "$0.00", "$0.00");
    }


    public void facilities(String address, String printLocation, String shipping, String shippingCost) {
        // Tags: Smoke
        actionwords.selectProductToBuild("Postcards", " 4\" X 6\" 16PT Postcards w/ Full UV on the front only, No UV Coating on the back");
        actionwords.selectPrimaryAttributes("1000", "4:4", "Next Day + 1");
        actionwords.selectBaseJobOptionsBundlingMailingShrink("No Bundling Services", "No Direct Mailing Service", "No Shrink Wrapping");
        actionwords.provideHowManySets("1");
        actionwords.setPrintSetDetailsDropship(String.format("%s", address), "Default Option", String.format("%s", print_location));
        actionwords.clickAddToCart();
        actionwords.validateShoppingCart(String.format("%s", shipping), String.format("%s", shipping_cost), String.format("%s", print_location), "28", "$28.16", "$0.00", "$0.00");
        actionwords.clickClearCart();
    }

    @Test
    public void facilitiesTOR() {
        facilities("Toronto", "Toronto, ON", "Purolator Ground", "$6.46");
    }

    @Test
    public void facilitiesEWR() {
        facilities("Moonachie", "Moonachie, NJ", "Ground Shipping", "$10.55");
    }

    @Test
    public void facilitiesDAY() {
        facilities("Dayton", "Dayton, OH", "Ground Shipping", "$10.55");
    }

    @Test
    public void facilitiesMIA() {
        facilities("Orlando", "Miami, FL", "Ground Shipping", "$14.38");
    }

    @Test
    public void facilitiesARL() {
        facilities("Arlington", "Arlington, TX", "Ground Shipping", "$10.55");
    }

    @Test
    public void facilitiesPHX() {
        facilities("Pheonix", "Phoenix, AZ", "Ground Shipping", "$10.55");
    }

    @Test
    public void facilitiesSEA() {
        facilities("Seattle", "Seattle, WA", "Ground Shipping", "$10.55");
    }

    @Test
    public void facilitiesSLC() {
        facilities("Salt Lake City", "Salt Lake City, UT", "Ground Shipping", "$10.55");
    }

    @Test
    public void facilitiesGLN() {
        facilities("Los Angeles", "Glendale, CA", "Ground Shipping", "$10.55");
    }
}