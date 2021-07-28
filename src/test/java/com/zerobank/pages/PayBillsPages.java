package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PayBillsPages extends BasePage{

    public PayBillsPages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//input[@id='sp_amount']")
    public WebElement amountInput;

    @FindBy(xpath = "//input[@id='sp_date']")
    public WebElement dateInput;

    @FindBy(xpath = "//input[@id='sp_description']")
    public WebElement descriptionsInput;

    @FindBy(xpath = "//input[@type='submit']")
    public WebElement submitButton;


    public void textDisplayed(String expectedText){
        WebElement text = Driver.getDriver().findElement(By.xpath("//span[.='"+expectedText+"']"));
        String actualText = text.getText();
        Assert.assertEquals(expectedText,actualText);
    }
    public void amountSendKeys(int amount){
        amountInput.sendKeys(String.valueOf(amount));
    }
    public void dateSendKeys(int date){
        dateInput.sendKeys(String.valueOf(date));
    }
    public void descriptionSendKeys(String reason){
        descriptionsInput.sendKeys(reason);
        submitButton.click();
    }
    public void failScenerio(){
        amountInput.sendKeys("blabla@#^^$^&");
        dateInput.sendKeys("no no you're wrong!!");
    }




}
