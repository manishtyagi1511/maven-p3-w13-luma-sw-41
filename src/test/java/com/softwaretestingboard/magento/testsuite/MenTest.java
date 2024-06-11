package com.softwaretestingboard.magento.testsuite;

import com.softwaretestingboard.magento.pages.MenMenu;
import com.softwaretestingboard.magento.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MenTest extends BaseTest {

    MenMenu menMenu = new MenMenu();

    /*
    userShouldAddProductSuccessFullyTo
ShoppinCart()
* Mouse Hover on Men Menu
* Mouse Hover on Bottoms
* Click on Pants
* Mouse Hover on product name
‘Cronus Yoga Pant’ and click on size
32.
* Mouse Hover on product name
‘Cronus Yoga Pant’ and click on colour
Black.
* Mouse Hover on product name
‘Cronus Yoga Pant’ and click on
‘Add To Cart’ Button.
* Verify the text
‘You added Cronus Yoga Pant to your shopping cart.’
* Click on ‘shopping cart’ Link into
message
* Verify the text ‘Shopping Cart.’
* Verify the product name ‘Cronus Yoga Pant’
* Verify the product size ‘32’
* Verify the product colour ‘Black’
     */

    @Test
    public void userShouldAddProductSuccessFullyToShoppinCart() {
        menMenu.mouseHooverOnMenMenu();
        menMenu.mouseHooverOnBottom();
        menMenu.clickOnPant();
        menMenu.mouseHooverOnProductNameCronusYoga();
        menMenu.setClickOnSize32();
        menMenu.mouseHooverOnCronusYoga();
        menMenu.clickOnColorBlack();
        menMenu.setAddToCart();

        String expected="You added Cronus Yoga Pant to your shopping cart.";
        String actual=menMenu.verifyCronusYogaPantToShoppingCart();
        Assert.assertEquals(actual,expected,"Display message is incorrect");

        String expected1="shopping cart";
        String actual1=menMenu.verifyShoppingCartText();
        Assert.assertEquals(actual1,expected1,"Shopping Cart Text does not match");

        String expected3="Cronus Yoga Pant";
        String actual3=menMenu.setVerifyCronusYogaPantText();
        Assert.assertEquals(actual3,expected3,"Cronus Yoga Pant is not verified:");

        String expectedSize32="32";
        String actualSize32= menMenu.setVerifySize32();
        Assert.assertEquals(actualSize32,expectedSize32,"Size 32 is not verified");

        String expectedColorBlack="black";
        String actualColorBlack= menMenu.setverifyColorBlack();
        Assert.assertEquals(actualColorBlack,expectedColorBlack,"Color Black is not verified ");






    }


}
