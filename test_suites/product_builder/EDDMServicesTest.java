package com.example.test_suites.product_builder;

import org.testng.annotations.*;
import com.example.Actionwords;

public class EDDMServicesTest {

    public Actionwords actionwords;

    @BeforeMethod
    public void setUp() {
        actionwords = new Actionwords();
    }

    @Test
    public void eDDMPrintOnly() {
        actionwords.selectProductToBuild("EDDM Print Only", "4.5\" X 12\" 14PT EDDM Postcards UV on 4-color side(s)");
        actionwords.selectPrimaryAttributes("100", "4:0", "2-4 Business Days");
        actionwords.selectBaseJobOptionsBundling("No Bundling Services");
        actionwords.setPrintSetDetailsDefaultShipping("Default Option", "Glendale, CA");
        actionwords.clickAddToCart();
        actionwords.validateShoppingCart("Ground Shipping", "$8.55", "Glendale, CA", "54", "$54.15", "$0.00", "$0.00");
        actionwords.clickClearCart();
    }
}