package com.example.test_suites;

import org.testng.annotations.*;
import com.example.Actionwords;

public class MailingTest {

    public Actionwords actionwords;

    @BeforeMethod
    public void setUp() {
        actionwords = new Actionwords();
    }
    public void mailingLocations(String mailingOption, String facility) {
        // Tags: Smoke
        actionwords.selectProductToBuild("Postcards", "4\" X 6\" 16PT Postcards w/ Full UV on the front only, No UV Coating on the back");
        actionwords.selectPrimaryAttributes("2500", "4:4", "Next Day + 1");
        actionwords.selectBaseJobOptionsBundlingMailing("No Bundling Services", String.format("%s", mailing_option));
        actionwords.setPrintSetDetailsMailing(String.format("%s", facility));
        actionwords.clickAddToCart();
        actionwords.validateShoppingCart("Direct Mail Service", "$99.00", String.format("%s", facility), "63", "$62.82", "$0.00", "$0.00");
        actionwords.clickClearCart();
    }

    @Test
    public void mailingLocationsMIA() {
        mailingLocations("Yes, Direct Mailing from FL", "Miami, FL");
    }

    @Test
    public void mailingLocationsGLN() {
        mailingLocations("Yes, Direct Mailing from CA", "Glendale, CA");
    }

    @Test
    public void mailingLocationsEWR() {
        mailingLocations("Yes, Direct Mailing from NJ", "Moonachie, NJ");
    }

    @Test
    public void mailingLocationsDAY() {
        mailingLocations("Yes, Direct Mailing from OH", "Dayton, OH");
    }

    @Test
    public void mailingLocationsARL() {
        mailingLocations("Yes, Direct Mailing from TX", "Arlington, TX");
    }

    @Test
    public void mailingLocationsSEA() {
        mailingLocations("Yes, Direct Mailing from SEA", "Seattle, WA");
    }
}