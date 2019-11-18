package com.example.test_suites;

import org.testng.annotations.*;
import com.example.Actionwords;

public class BuyABatchTest {

    public Actionwords actionwords;

    @BeforeMethod
    public void setUp() {
        actionwords = new Actionwords();
    }
    public void checkSupportedFiles(String file) {
        actionwords.clickOnBuyABatch();
        actionwords.uploadFrontImageInBuyABatch(String.format("%s", file));
    }

    @Test
    public void checkSupportedFilesPdf() {
        checkSupportedFiles("bab_test_file-preflight.pdf");
    }

    @Test
    public void checkSupportedFilesJpg() {
        checkSupportedFiles("bab_test_file.jpg");
    }

    @Test
    public void checkSupportedFilesJpeg() {
        checkSupportedFiles("bab_test_file.jpeg");
    }

    @Test
    public void checkSupportedFilesTif() {
        checkSupportedFiles("bab_test_file.tif");
    }

    @Test
    public void checkSupportedFilesTiff() {
        checkSupportedFiles("bab_test_file.tiff");
    }

    @Test
    public void checkSupportedFilesEps() {
        checkSupportedFiles("bab_test_file.eps");
    }

    @Test
    public void checkSupportedFilesPng() {
        checkSupportedFiles("bab_test_file.png");
    }


    public void checkUnsupportedFiles(String file) {
        actionwords.clickOnBuyABatch();
        actionwords.uploadBadImageInBuyABatch(String.format("%s", file));
    }

    @Test
    public void checkUnsupportedFilesGif() {
        checkUnsupportedFiles("bab_test_file.gif");
    }

    @Test
    public void checkUnsupportedFilesPsd() {
        checkUnsupportedFiles("bab_test_file.psd");
    }

    @Test
    public void checkUnsupportedFilesAi() {
        checkUnsupportedFiles("bab_test_file.ai");
    }

    @Test
    public void checkUnsupportedFilesDoc() {
        checkUnsupportedFiles("bab_test_file.docx");
    }

    @Test
    public void checkUnsupportedFilesXls() {
        checkUnsupportedFiles("bab_test_file.xlsx");
    }


    // Checks Functionality for Center and Fit in Buy A Batch - Fit Front / Fit Back
    @Test
    public void artworkModifierFF() {
        actionwords.clickOnBuyABatch();
        actionwords.selectBuyABatchDoubleSided();
        actionwords.selectBuyABatchProductSize("18 x 24 inches");
        actionwords.setBuyABatchQuantity("6");
        actionwords.uploadFrontImageInBuyABatch("18x24.pdf");
        actionwords.uploadBackImageInBuyABatch("18x24.pdf");
        actionwords.centerFrontFile();
        actionwords.centerBackFile();
        actionwords.fitFrontFile();
        actionwords.fitBackFile();
        actionwords.validateBuyABatchPrice("50.00");
        actionwords.continueToOrderSummaryInBuyABatch();
        actionwords.validateBuyABatchProductSize("18 x 24 inches");
        actionwords.validateBuyABatchSheetCount("1");
        actionwords.validateNumberOfSigns("6");
        actionwords.validateBuyABatchTotalCost("50.00");
        actionwords.continueToBuyABatchProductBuilder();
        actionwords.validateBuyABatchOrder("4CORO-BABRIGID-48X96");
        actionwords.validateBuyABatchProductDetail("1", "4:4", "Next Business Day");
        actionwords.validateFluteDirection("Vertical Flute Direction");
        actionwords.setPrintSetDetailsDefaultShipping("Default Option", "Glendale, CA");
        actionwords.clickAddToCart();
    }
    // Checks Functionality for Center and Fit in Buy A Batch - Fit Front / Center Back
    @Test
    public void artworkModifierFC() {
        actionwords.clickOnBuyABatch();
        actionwords.selectBuyABatchDoubleSided();
        actionwords.selectBuyABatchProductSize("18 x 24 inches");
        actionwords.setBuyABatchQuantity("6");
        actionwords.uploadFrontImageInBuyABatch("18x24.pdf");
        actionwords.uploadBackImageInBuyABatch("18x24.pdf");
        actionwords.centerBackFile();
        actionwords.fitFrontFile();
        actionwords.validateBuyABatchPrice("50.00");
        actionwords.continueToOrderSummaryInBuyABatch();
        actionwords.validateBuyABatchProductSize("18 x 24 inches");
        actionwords.validateBuyABatchSheetCount("1");
        actionwords.validateNumberOfSigns("6");
        actionwords.validateBuyABatchTotalCost("50.00");
        actionwords.continueToBuyABatchProductBuilder();
        actionwords.validateBuyABatchOrder("4CORO-BABRIGID-48X96");
        actionwords.validateBuyABatchProductDetail("1", "4:4", "Next Business Day");
        actionwords.validateFluteDirection("Vertical Flute Direction");
        actionwords.setPrintSetDetailsDefaultShipping("Default Option", "Glendale, CA");
        actionwords.clickAddToCart();
    }
    // Checks Functionality for Center and Fit in Buy A Batch - Center Front / Fit Back
    @Test
    public void artworkModifierCF() {
        actionwords.clickOnBuyABatch();
        actionwords.selectBuyABatchDoubleSided();
        actionwords.selectBuyABatchProductSize("18 x 24 inches");
        actionwords.setBuyABatchQuantity("6");
        actionwords.uploadFrontImageInBuyABatch("18x24.pdf");
        actionwords.uploadBackImageInBuyABatch("18x24.pdf");
        actionwords.centerFrontFile();
        actionwords.fitBackFile();
        actionwords.validateBuyABatchPrice("50.00");
        actionwords.continueToOrderSummaryInBuyABatch();
        actionwords.validateBuyABatchProductSize("18 x 24 inches");
        actionwords.validateBuyABatchSheetCount("1");
        actionwords.validateNumberOfSigns("6");
        actionwords.validateBuyABatchTotalCost("50.00");
        actionwords.continueToBuyABatchProductBuilder();
        actionwords.validateBuyABatchOrder("4CORO-BABRIGID-48X96");
        actionwords.validateBuyABatchProductDetail("1", "4:4", "Next Business Day");
        actionwords.validateFluteDirection("Vertical Flute Direction");
        actionwords.setPrintSetDetailsDefaultShipping("Default Option", "Glendale, CA");
        actionwords.clickAddToCart();
    }
    public void createAOrderOneSided(String size, int qty, String file) {
        // Tags: Smoke
        actionwords.clickOnBuyABatch();
        actionwords.selectBuyABatchProductSize(String.format("%s", size));
        actionwords.setBuyABatchQuantity(String.format("%s", qty));
        actionwords.uploadFrontImageInBuyABatch(String.format("%s", file));
        actionwords.validateBuyABatchPrice("40.00");
        actionwords.continueToOrderSummaryInBuyABatch();
        actionwords.validateBuyABatchProductSize(String.format("%s", size));
        actionwords.validateBuyABatchSheetCount("1");
        actionwords.validateNumberOfSigns(String.format("%s", qty));
        actionwords.validateBuyABatchTotalCost("40.00");
        actionwords.continueToBuyABatchProductBuilder();
        actionwords.validateBuyABatchOrder("4CORO-BABRIGID-48X96");
        actionwords.validateBuyABatchProductDetail("1", "4:0", "Next Business Day");
        actionwords.validateFluteDirection("Vertical Flute Direction");
        actionwords.setPrintSetDetailsDefaultShipping("Default Option", "Glendale, CA");
        actionwords.clickAddToCart();
    }

    @Test
    public void createAOrderOneSided18X24Inches() {
        createAOrderOneSided("18 x 24 inches", 6, "18x24.pdf");
    }

    @Test
    public void createAOrderOneSided12X18Inches() {
        createAOrderOneSided("12 x 18 inches", 15, "12x18.pdf");
    }

    @Test
    public void createAOrderOneSided18X12Inches() {
        createAOrderOneSided("18 x 12 inches", 14, "18x12.pdf");
    }

    @Test
    public void createAOrderOneSided36X24Inches() {
        createAOrderOneSided("36 x 24 inches", 3, "36x24.pdf");
    }

    @Test
    public void createAOrderOneSided24X6Inches() {
        createAOrderOneSided("24 x 6 inches", 30, "24x6.pdf");
    }

    @Test
    public void createAOrderOneSided24X18Inches() {
        createAOrderOneSided("24 x 18 inches", 10, "24x18.pdf");
    }

    @Test
    public void createAOrderOneSided24X24Inches() {
        createAOrderOneSided("24 x 24 inches", 6, "24x24.pdf");
    }

    @Test
    public void createAOrderOneSided24X36Inches() {
        createAOrderOneSided("24 x 36 inches", 4, "24x36.pdf");
    }


    public void createAOrderTwoSided(String size, int qty, String fileName) {
        actionwords.clickOnBuyABatch();
        actionwords.selectBuyABatchDoubleSided();
        actionwords.selectBuyABatchProductSize(String.format("%s", size));
        actionwords.setBuyABatchQuantity(String.format("%s", qty));
        actionwords.uploadFrontImageInBuyABatch(String.format("%s", file_name));
        actionwords.uploadBackImageInBuyABatch(String.format("%s", file_name));
        actionwords.validateBuyABatchPrice("50.00");
        actionwords.continueToOrderSummaryInBuyABatch();
        actionwords.validateBuyABatchProductSize(String.format("%s", size));
        actionwords.validateBuyABatchSheetCount("1");
        actionwords.validateNumberOfSigns(String.format("%s", qty));
        actionwords.validateBuyABatchTotalCost("50.00");
        actionwords.continueToBuyABatchProductBuilder();
        actionwords.validateBuyABatchOrder("4CORO-BABRIGID-48X96");
        actionwords.validateBuyABatchProductDetail("1", "4:4", "Next Business Day");
        actionwords.validateFluteDirection("Vertical Flute Direction");
        actionwords.setPrintSetDetailsDefaultShipping("Default Option", "Glendale, CA");
        actionwords.clickAddToCart();
    }

    @Test
    public void createAOrderTwoSided18X24Inches() {
        createAOrderTwoSided("18 x 24 inches", 6, "18x24.pdf");
    }

    @Test
    public void createAOrderTwoSided12X18Inches() {
        createAOrderTwoSided("12 x 18 inches", 15, "12x18.pdf");
    }

    @Test
    public void createAOrderTwoSided18X12Inches() {
        createAOrderTwoSided("18 x 12 inches", 14, "18x12.pdf");
    }

    @Test
    public void createAOrderTwoSided36X24Inches() {
        createAOrderTwoSided("36 x 24 inches", 3, "36x24.pdf");
    }

    @Test
    public void createAOrderTwoSided24X6Inches() {
        createAOrderTwoSided("24 x 6 inches", 30, "24x6.pdf");
    }

    @Test
    public void createAOrderTwoSided24X18Inches() {
        createAOrderTwoSided("24 x 18 inches", 10, "24x18.pdf");
    }

    @Test
    public void createAOrderTwoSided24X24Inches() {
        createAOrderTwoSided("24 x 24 inches", 6, "24x24.pdf");
    }

    @Test
    public void createAOrderTwoSided24X36Inches() {
        createAOrderTwoSided("24 x 36 inches", 4, "24x36.pdf");
    }


    public void shippingRules(int sheetCount, int qty, String size, String file, String shippingCost, String rewardsPoints, String subtotal, String shippingMethod) {
        // For Buy-A-Batch orders, the following shipping costs will be charged based on Sheet Quantity:
        // - 1-3 Sheets: $10 Next Day Anywhere
        // - 4-6 Sheets: $20 Next Day Anywhere
        // - 7-9 Sheets: $30 Next Day Anywhere
        // - 10-11 Sheets: $50
        // - 12-13 Sheets: $70
        // - 14-15 Sheets: $90
        //
        // __Code looks for BABRIGID to apply shipping cost__
        actionwords.clickOnBuyABatch();
        actionwords.selectBuyABatchProductSize(String.format("%s", size));
        actionwords.setBuyABatchQuantity(String.format("%s", qty));
        actionwords.uploadFrontImageInBuyABatch(String.format("%s", file));
        actionwords.validateBuyABatchPrice(String.format("%s", subtotal));
        actionwords.continueToOrderSummaryInBuyABatch();
        actionwords.validateBuyABatchProductSize(String.format("%s", size));
        actionwords.validateBuyABatchSheetCount(String.format("%s", sheet_count));
        actionwords.validateNumberOfSigns(String.format("%s", qty));
        actionwords.validateBuyABatchTotalCost(String.format("%s", subtotal));
        actionwords.continueToBuyABatchProductBuilder();
        actionwords.validateBuyABatchOrder("4CORO-BABRIGID-48X96");
        actionwords.validateBuyABatchProductDetail("1", "4:0", "Next Business Day");
        actionwords.validateFluteDirection("Vertical Flute Direction");
        actionwords.setPrintSetDetailsDefaultShipping("Default Option", "Glendale, CA");
        actionwords.clickAddToCart();
        actionwords.validateShoppingCart(String.format("%s", shipping_method), String.format("%s", shipping_cost), "Glendale, CA", String.format("%s", rewards_points), String.format("%s", subtotal), "$0.00", "$0.00");
        actionwords.clickClearCart();
    }

    @Test
    public void shippingRules1Sheet() {
        shippingRules(1, 6, "18 x 24 inches", "18x24.pdf", "$10.00", 40, "$40.00", "Next Day Everywhere");
    }

    @Test
    public void shippingRules2Sheet() {
        shippingRules(2, 12, "18 x 24 inches", "18x24.pdf", "$10.00", 80, "$80.00", "Next Day Everywhere");
    }

    @Test
    public void shippingRules3Sheet() {
        shippingRules(3, 18, "18 x 24 inches", "18x24.pdf", "$10.00", 120, "$120.00", "Next Day Everywhere");
    }

    @Test
    public void shippingRules4Sheet() {
        shippingRules(4, 24, "18 x 24 inches", "18x24.pdf", "$20.00", 160, "$160.00", "Next Day Everywhere");
    }

    @Test
    public void shippingRules5Sheet() {
        shippingRules(5, 30, "18 x 24 inches", "18x24.pdf", "$20.00", 200, "$200.00", "Next Day Everywhere");
    }

    @Test
    public void shippingRules6Sheet() {
        shippingRules(6, 36, "18 x 24 inches", "18x24.pdf", "$20.00", 240, "$240.00", "Next Day Everywhere");
    }

    @Test
    public void shippingRules7Sheet() {
        shippingRules(7, 42, "18 x 24 inches", "18x24.pdf", "$30.00", 280, "$280.00", "Next Day Everywhere");
    }

    @Test
    public void shippingRules8Sheet() {
        shippingRules(8, 48, "18 x 24 inches", "18x24.pdf", "$30.00", 320, "$320.00", "Next Day Everywhere");
    }

    @Test
    public void shippingRules9Sheet() {
        shippingRules(9, 54, "18 x 24 inches", "18x24.pdf", "$30.00", 360, "$360.00", "Next Day Everywhere");
    }

    @Test
    public void shippingRules10Sheet() {
        shippingRules(10, 60, "18 x 24 inches", "18x24.pdf", "$50.00", 400, "$400.00", "Next Day Everywhere");
    }

    @Test
    public void shippingRules11Sheet() {
        shippingRules(11, 66, "18 x 24 inches", "18x24.pdf", "$50.00", 440, "$440.00", "Next Day Everywhere");
    }

    @Test
    public void shippingRules12Sheet() {
        shippingRules(12, 72, "18 x 24 inches", "18x24.pdf", "$70.00", 480, "$480.00", "Next Day Everywhere");
    }

    @Test
    public void shippingRules13Sheet() {
        shippingRules(13, 78, "18 x 24 inches", "18x24.pdf", "$70.00", 520, "$520.00", "Next Day Everywhere");
    }

    @Test
    public void shippingRules14Sheet() {
        shippingRules(14, 84, "18 x 24 inches", "18x24.pdf", "$90.00", 560, "$560.00", "Next Day Everywhere");
    }

    @Test
    public void shippingRules15Sheet() {
        shippingRules(15, 90, "18 x 24 inches", "18x24.pdf", "$90.00", 600, "$600.00", "Next Day Everywhere");
    }

    @Test
    public void shippingRules40Sheet() {
        shippingRules(40, 240, "18 x 24 inches", "18x24.pdf", "$330.00", "1,600", "$1,600.00", "Next Day Everywhere");
    }

    @Test
    public void shippingRules80Sheet() {
        shippingRules(80, 480, "18 x 24 inches", "18x24.pdf", "$730.00", "3,200", "$3,200.00", "Next Day Everywhere");
    }
}