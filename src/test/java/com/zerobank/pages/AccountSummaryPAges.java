package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountSummaryPAges extends BasePage {
    public AccountSummaryPAges(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "(//a[.='Savings'])[1]")
    public WebElement savingsButton;

    @FindBy(xpath = "//select[@id='aa_accountId']")
    public WebElement dropDown;

    @FindBy(xpath = "//a[.='Brokerage']")
    public WebElement BrokerageButton;

    @FindBy(xpath = "//a[.='Checking']")
    public WebElement checkingButton;

    @FindBy(xpath = "//a[.='Credit Card']")
    public WebElement CreditCardButton;

    @FindBy(xpath = "//a[.='Loan']")
    public WebElement LoanButton;
}
