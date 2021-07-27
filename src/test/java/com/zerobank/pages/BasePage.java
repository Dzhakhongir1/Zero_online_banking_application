package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[.='Account Activity']")
    public WebElement accountActivityTAb;

    @FindBy(xpath = "//a[.='Account Summary']")
    public WebElement AccountSummaryTab;

    @FindBy(xpath = "//a[.='Transfer Funds']")
    public WebElement TransferFundsTab;

    @FindBy(xpath = "//a[.='Pay Bills']")
    public WebElement PayBills;

    @FindBy(xpath = "//a[.='My Money Map']")
    public WebElement MyMoneyMap;








}
