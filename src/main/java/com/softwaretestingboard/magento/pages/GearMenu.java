package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class GearMenu extends Utility {

    By mHooverOnGear = By.id("ui-id-6");
    By clickBags = By.xpath("//span[normalize-space()='Bags']");
    By pNameOverNight = By.xpath("//a[normalize-space()='Overnight Duffle']");
    By verifyTextOver = By.xpath("//span[@class='base']");
    By clickQuantity = By.id("qty");
    By changeQuantity = By.id("qty");
    By addToCart = By.id("product-addtocart-button");
    By verifyOverNight = By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    By shoppingCart = By.linkText("shopping cart");
    By verifyOverNightD = By.partialLinkText("Overnight Duf");
    // By verifyQuantity3= By.xpath("//input[@class='input-text qty']");
    By verify135 = By.xpath("//span[@class='cart-price']//span[@class='price'][normalize-space()='$135.00']");
    By quantity5 = By.xpath("//input[@class='input-text qty']");
    By send5 = By.xpath("//input[@class='input-text qty']");
    By updateScart = By.xpath("//span[normalize-space()='Update Shopping Cart']");
    By productPrice = By.xpath("//span[@class='cart-price']//span[@class='price'][normalize-space()='$225.00']");


    public void mouseHooverOnGearMenu() {
        mouseHoverToElement(mHooverOnGear);
    }

    public void clickOnBags() {
        clickOnElement(clickBags);
    }

    public void clickOnProductNameOverNightDuffle() {
        clickOnElement(pNameOverNight);
    }

    public String verifyTextOverNightDuffle() {
        return getTextFromElement(verifyTextOver);
    }

    public void clickOnQuantity() {
        clickAndClear(clickQuantity);
    }

    public void changeQuantityTo3() {
        sendTextToElement(changeQuantity, "3");

    }

    public void clickOnAddToCart() {
        clickOnElement(addToCart);
    }

    public String verifyOverNightDuffleText() {
        return getTextFromElement(verifyOverNight);
    }

    public void clickOnShoppingCart() {
        clickOnElement(shoppingCart);
    }

    public String verifyProductNameOverNightDuffle() {
        return getTextFromElement(verifyOverNightD);

    }

    //public String verifyQuantityThree(){
//        return getTextFromElement(verifyQuantity3);
//}
    public String verifyproductPrice() {
        return getTextFromElement(verify135);

    }

    public void changeQuantityTo5() {
        clickAndClear(quantity5);
    }

    public void sendQuantity5() {
        sendTextToElement(send5, "5");
    }


    public void clickOnUpdateShoppingCartButton() {
        clickOnElement(updateScart);
    }

    public String verifyProductPrice1() {
        return getTextFromElement(productPrice);
    }

}