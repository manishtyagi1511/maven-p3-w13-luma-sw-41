package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.GearMenu;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GearTest extends BaseTest {

    GearMenu gearMenu = new GearMenu();

    @Test
    public void userShouldAddProductSuccessFullyToShoppinCart() {
        gearMenu.mouseHooverOnGearMenu();
        gearMenu.clickOnBags();
        gearMenu.clickOnProductNameOverNightDuffle();

        String expectedOverNightDuffle = "Overnight Duffle";
        String actualOverNightDuffle = gearMenu.verifyTextOverNightDuffle();
        Assert.assertEquals(expectedOverNightDuffle, actualOverNightDuffle, "Text is not verified");

        gearMenu.clickOnQuantity();
        gearMenu.changeQuantityTo3();
        gearMenu.clickOnAddToCart();

        String expectedDuffleText = "You added Overnight Duffle to your shopping cart.";
        String actualDuffleText = gearMenu.verifyOverNightDuffleText();
        Assert.assertEquals(actualDuffleText, expectedDuffleText, "Duffle Text is not verified:");

        gearMenu.clickOnShoppingCart();

        String expectedOnD = "Overnight Duffle";
        String actualOnD = gearMenu.verifyProductNameOverNightDuffle();
        Assert.assertEquals(actualOnD, expectedOnD, "Over Night Duffle Text is not Verified");

//        String expectedQ3 = "3";
//        String actualQ3 = gearMenu.verifyQuantityThree();
//        Assert.assertEquals(actualQ3, expectedQ3, "Verify quantity is not 3 ");


        String expected135 = "$135.00";
        String actual135 = gearMenu.verifyproductPrice();
        Assert.assertEquals(actual135, expected135, "$135.00 is not verified");

        gearMenu.changeQuantityTo5();
        gearMenu.sendQuantity5();
        gearMenu.clickOnUpdateShoppingCartButton();

        String expectedprice = "$225.00";
        String actualprice = gearMenu.verifyProductPrice1();
        Assert.assertEquals(actualprice, expectedprice, "$225.00 is not verified");


    }


}

