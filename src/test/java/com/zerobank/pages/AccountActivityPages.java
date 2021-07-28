package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AccountActivityPages extends BasePage{
   public AccountActivityPages(){
       PageFactory.initElements(Driver.getDriver(),this);
   }
   @FindBy(xpath = "//*[@id='all_transactions_for_account']/table/thead/tr/th")
    public List<WebElement> tablesVerification;

    @FindBy(xpath = "//select[@id='aa_accountId']")
    public WebElement dropDown;


}
