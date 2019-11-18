package com.example.test_suites;

import org.testng.annotations.*;
import com.example.Actionwords;

public class PaymentTest {

    public Actionwords actionwords;

    @BeforeMethod
    public void setUp() {
        actionwords = new Actionwords();
    }
    //
    // Tags: Smoke
    @Test
    public void checkoutWithPayByCheck() {
        actionwords.selectProductToBuild("Foil Worx", "2\" x 3.5\" 16PT Silk Laminated Foiled Business Cards");
        actionwords.selectPrimaryAttributes("500", "5/5 (4/4 with Foil on Both Sides)", "5-7 Business Days");
        actionwords.selectBaseJobOptionsFoilColor("Black Foil");
        actionwords.setPrintSetDetailsPickUp("Glendale, CA");
        actionwords.clickAddToCart();
        actionwords.checkoutWithPayByCheck();
        actionwords.clickOnUPLOADARTWORK();
        actionwords.uploadFilesThroughClassicUploader();
        actionwords.cancelOrder();
    }

    @Test
    public void couponCode() {
        actionwords.selectProductToBuild("Business Cards", "ALL INCLUSIVE PRICING 2\" X 3.5\" 14PT Business Cards UV on 4-color side(s)");
        actionwords.selectPrimaryAttributes("25", "4:0", "Next Business Day");
        actionwords.setPrintSetDetailsDefaultShipping("Default Option", "Glendale, CA");
        actionwords.clickAddToCart();
        actionwords.applyCouponCode();
        actionwords.validateShoppingCart("FREE Ground Shipping", "$0.00", "Glendale, CA", "7", "$13.54", "$0.00", "$6.77");
        actionwords.clickClearCart();
    }
}