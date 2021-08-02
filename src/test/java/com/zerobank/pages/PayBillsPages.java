package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Map;

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

    @FindBy(xpath = "//a[.='Add New Payee']")
    public WebElement addNewPayeeButton;

    @FindBy(id = "np_new_payee_name")
    public WebElement payeeName;

    @FindBy(id = "np_new_payee_address")
    public WebElement address;

    @FindBy(xpath = "//input[@id='np_new_payee_account']")
    public WebElement Account;

    @FindBy(id = "np_new_payee_details")
    public WebElement details;

    @FindBy(id = "add_new_payee")
    public WebElement add;

    @FindBy(xpath = "//div[.='The new payee The Law Officers of Hyde, Price & Scharks was successfully created.']")
    public WebElement conformation;

    @FindBy(xpath = "//a[.='Purchase Foreign Currency']")
    public WebElement foreignCurrency;

    @FindBy(id = "pc_currency")
    public WebElement curencydropDown;

    @FindBy(id = "pc_calculate_costs")
    public WebElement calculateButton;

    @FindBy(id = "purchase_cash")
    public WebElement purchaseButton;


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

    public List<String> allcurency(){
      Select select = new Select(curencydropDown);
      List<String> curencys = BrowserUtils.getElementsText(select.getOptions());
      return curencys;

    }







}
