package com.example.test_suites.product_builder;

import org.testng.annotations.*;
import com.example.Actionwords;

public class PromoProductsTest {

    public Actionwords actionwords;

    @BeforeMethod
    public void setUp() {
        actionwords = new Actionwords();
    }

    @Test
    public void buttons() {
        actionwords.selectProductToBuild("Buttons", "1\" Round Promotional Buttons w/ Locking Safety Pin");
        actionwords.selectPrimaryAttributes("100", "4:0", "2-4 Business Days");
        actionwords.setPrintSetDetailsDefaultShipping("Default Option", "Glendale, CA");
        actionwords.clickAddToCart();
        actionwords.validateShoppingCart("Ground Shipping", "$10.55", "Glendale, CA", "56", "$56.32", "$0.00", "$0.00");
        actionwords.clickClearCart();
    }

    @Test
    public void mugs() {
        actionwords.selectProductToBuild("Mugs", "White Ceramic Mug, 11oz w/ wraparound image, 3\" X 8.5\" print area");
        actionwords.selectPrimaryAttributes("1", "4:0", "5-7 Business Days");
        actionwords.setPrintSetDetailsDefaultShipping("Default Option", "Glendale, CA");
        actionwords.clickAddToCart();
        actionwords.validateShoppingCart("Ground Shipping", "$10.55", "Glendale, CA", "9", "$8.66", "$0.00", "$0.00");
        actionwords.clickClearCart();
    }

    @Test
    public void tShirts() {
        actionwords.selectProductToBuild("T-Shirts", "Kids Short Sleeve Black w/8.5\" x 11\" Print Area");
        actionwords.selectPrimaryAttributes("1", "4:0", "2-4 Business Days");
        actionwords.selectBaseJobOptionsTShirt("X-Small");
        actionwords.setPrintSetDetailsDefaultShipping("Default Option", "Glendale, CA");
        actionwords.clickAddToCart();
        actionwords.validateShoppingCart("Ground Shipping", "$10.55", "Glendale, CA", "12", "$11.91", "$0.00", "$0.00");
    }

    @Test
    public void toteBags() {
        actionwords.selectProductToBuild("Tote Bags", "Tote Bag Blue w/ 9\" x 13\" Print Area on 6OZ Cotton Canvas");
        actionwords.selectPrimaryAttributes("1", "4:0", "5-7 Business Days");
        actionwords.setPrintSetDetailsDefaultShipping("Default Option", "Glendale, CA");
        actionwords.clickAddToCart();
        actionwords.validateShoppingCart("Ground Shipping", "$10.55", "Glendale, CA", "9", "$8.62", "$0.00", "$0.00");
        actionwords.clickClearCart();
    }
}