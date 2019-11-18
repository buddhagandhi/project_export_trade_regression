package com.example.test_suites;

import org.testng.annotations.*;
import com.example.Actionwords;

public class UploaderTest {

    public Actionwords actionwords;

    @BeforeMethod
    public void setUp() {
        actionwords = new Actionwords();
    }
    //
    // Tags: Smoke
    @Test
    public void classicUploader() {
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
    public void flexUploader() {
        actionwords.selectProductToBuild("Foil Worx", "2\" x 3.5\" 16PT Silk Laminated Foiled Business Cards");
        actionwords.selectPrimaryAttributes("500", "5/5 (4/4 with Foil on Both Sides)", "5-7 Business Days");
        actionwords.selectBaseJobOptionsFoilColor("Black Foil");
        actionwords.setPrintSetDetailsPickUp("Glendale, CA");
        actionwords.checkoutWithPayByCheck();
        actionwords.clickOnUPLOADARTWORK();
        // TODO: Implement result: "New Tab opens up with Flex tool"
        // TODO: Implement action: "Click Add Files"
        // TODO: Implement result: "Finder / Open Window Pops Up"
        // TODO: Implement action: "Select Files to Upload and Click Open"
        // TODO: Implement result: "Files shown in Flex Tool."
        // TODO: Implement action: "Set Side Chooser Front"
        // TODO: Implement action: "Set Side Chooser Front Foil Mask"
        // TODO: Implement action: "Set Side Chooser Back"
        // TODO: Implement action: "Set Side Chooser Back Foil Mask"
        // TODO: Implement action: "Click Upload Artwork"
        // TODO: Implement result: "Uploads Complete, Thank you."
        // TODO: Implement action: "Click Close"
        // TODO: Implement action: "Click Cancel Job"
        // TODO: Implement action: "Input \"QA_4OVER_TEST\""
        // TODO: Implement action: "Click Ok"
        // TODO: Implement result: "Job cancelled successfully"

        throw new UnsupportedOperationException();
    }
}