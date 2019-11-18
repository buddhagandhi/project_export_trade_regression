package com.example.test_suites;

import org.testng.annotations.*;
import com.example.Actionwords;

public class ProductBuilderTest {

    public Actionwords actionwords;

    @BeforeMethod
    public void setUp() {
        actionwords = new Actionwords();
    }

    @Test
    public void additionalOptions() {
        actionwords.selectProductToBuild("Business Cards", "ALL INCLUSIVE PRICING 2\" X 3.5\" 14PT Business Cards UV on 4-color side(s)");
        actionwords.selectPrimaryAttributes("25", "4:0", "Next Business Day");
        actionwords.selectAdditionalOptions();
        actionwords.setPrintSetDetailsDefaultShipping("Default Option", "Glendale, CA");
        actionwords.clickAddToCart();
        actionwords.validateShoppingCart("FREE Ground Shipping", "$0.00", "Glendale, CA", "29 ", "$28.53", "$0.00", "$0.00");
        actionwords.validateAdditionalOptions("Yes, send me PDF Proof");
        actionwords.validateAdditionalOptions("Yes, please send me samples");
        actionwords.clickClearCart();
    }
}