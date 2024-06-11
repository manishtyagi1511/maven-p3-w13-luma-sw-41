package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utilities.Utility;
import org.openqa.selenium.By;

public class MenMenu extends Utility {

    By mHoover = By.xpath("//span[normalize-space()='Men']");
    By bottom = By.xpath("//body[1]/div[2]/div[1]/div[1]/div[2]/nav[1]/ul[1]/li[3]/ul[1]/li[2]/a[1]/span[2]");
    By pants=By.xpath("//a[@id='ui-id-23']//span[contains(text(),'Pants')]");
    By mHoover1=By.xpath("//a[normalize-space()='Cronus Yoga Pant']");
    By clickOnSize32=By.cssSelector("body > div:nth-child(5) > main:nth-child(4) > div:nth-child(4) > div:nth-child(1) > div:nth-child(4) > ol:nth-child(1) > li:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1)");
    By mHoover2=By.xpath("//a[normalize-space()='Cronus Yoga Pant']");
    By colorBlack=By.xpath("//body/div[2]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]");
    By addToCart=By.xpath("//body[1]/div[2]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/div[1]/div[3]/div[1]/div[1]/form[1]/button[1]/span[1]");
    By verifyCronusYoga=By.xpath("//div[@data-bind='html: $parent.prepareMessageForHtml(message.text)']");
    By shoppingCartText=By.xpath("//a[normalize-space()='shopping cart']");
    By verifyCronusYogaPantText=By.xpath("//body/div[2]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/div[1]/strong[1]/a[1]");
    By verifySize32=By.xpath("//body/div[2]/main[1]/div[3]/div[1]/div[3]/ol[1]/li[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]");
    By verifiedColorBlack=By.xpath("//dd[contains(text(),'Black')]");


    public void mouseHooverOnMenMenu() {
        mouseHoverToElement(mHoover);
    }

    public void mouseHooverOnBottom(){
        mouseHoverToElement(bottom);
    }

    public void clickOnPant(){
        clickOnElement(pants);
    }
    public void mouseHooverOnProductNameCronusYoga(){
        mouseHoverToElement(mHoover1);
    }
    public void setClickOnSize32(){
        mouseHoverToElementAndClick(clickOnSize32);
    }
    public void mouseHooverOnCronusYoga(){
        mouseHoverToElement(mHoover2);
    }
    public void clickOnColorBlack(){
        mouseHoverToElementAndClick(colorBlack);
    }

    public void setAddToCart(){
        mouseHoverToElementAndClick(addToCart);
    }

    public String verifyCronusYogaPantToShoppingCart(){
        return getTextFromElement(verifyCronusYoga);

    }
    public String verifyShoppingCartText(){
        return getTextFromElement(shoppingCartText);
    }

    public String setVerifyCronusYogaPantText(){
        return getTextFromElement(verifyCronusYogaPantText);
    }

    public String setVerifySize32(){
        return getTextFromElement(verifySize32);
    }

    public String setverifyColorBlack(){
     return getTextFromElement(verifiedColorBlack);
  }




}