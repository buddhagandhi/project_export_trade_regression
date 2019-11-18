package com.example.test_suites;

import org.testng.annotations.*;
import com.example.Actionwords;

public class FishEyeMenuTest {

    public Actionwords actionwords;

    @BeforeMethod
    public void setUp() {
        actionwords = new Actionwords();
    }
    // Checking on Orders
    @Test
    public void orders() {
        actionwords.clickOnOrders();
        actionwords.clickOnLinkText("Completed Jobs");
        actionwords.clickOnLinkText("Awaiting Preview Approval");
        actionwords.clickOnLinkText("Job Status");
    }
    // Create a Estimate
    @Test
    public void estimate() {
        actionwords.clickOnEstimates();
        actionwords.clickOnRequestNewEstimate();
        actionwords.fillInEstimate("QA_TEST", "John", "wqa@1goodprint.com", "8777822737", "Postcards", "16PT", "4/4", "Gloss Lamination", "Yes", "No Countour Cut", "No Drill Hole", "No Hardware", "No Round Corners");
    }
    // Redeem Reward Points
    @Test
    public void reward() {
        actionwords.clickOnRewards();
        actionwords.redeemA100Coupon();
    }
}