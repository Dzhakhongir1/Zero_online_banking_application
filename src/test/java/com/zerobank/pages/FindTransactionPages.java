package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class FindTransactionPages extends BasePage{
    public FindTransactionPages(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//a[.='Find Transactions']")
    public WebElement findTransactionButton;

    @FindBy(id = "aa_fromDate")
    public WebElement dateFrom;

    @FindBy(id = "aa_toDate")
    public WebElement dateTo;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement findButton;

    @FindBy(xpath = "//*[@id='filtered_transactions_for_account']/table/tbody/tr/td[1]")
    public List<WebElement> tablesDates;


    @FindBy(id = "aa_description")
    public WebElement description;

    @FindBy(xpath = "//select[@id='aa_type']")
    public WebElement DropDown;


    public void navigateToFindTransaction(){
        this.accountActivityTAb.click();
        findTransactionButton.click();
    }
    public void descriptionSendKeys(String text){
        description.sendKeys(text);
    }
    public List <String> tablesData(String text){
     List<WebElement> tablesData =   Driver.getDriver().findElements(By.xpath("//*[@id='filtered_transactions_for_account']/table/tbody/tr/td[.='"+text+"']"));
     List <String> newtablesList = new ArrayList<>();
        for (WebElement eachElemnt : tablesData) {
            newtablesList.add(eachElemnt.getText());
        }

        return newtablesList;
    }

    public void checkIfcontains(String searchingfor, String Result){
        if (tablesData(searchingfor).contains(Result)){
            Assert.fail();
        }
    }

    public  List <String> IndexChnage(String num){
    List<WebElement> indexOfDeposit = Driver.getDriver().findElements(By.xpath("//*[@id='filtered_transactions_for_account']/table/tbody/tr/td["+num+"]"));
        List <String> newtablesList = new ArrayList<>();
        for (WebElement eachElemnt : indexOfDeposit) {
            newtablesList.add(eachElemnt.getText());

        }

        return newtablesList;

    }

    public void dropDownSelect(String visibletex){
        Select select = new Select(Driver.getDriver().findElement(By.xpath("//select[@id='aa_type']")));
        DropDown.click();
        select.selectByVisibleText(visibletex);
    }
}
