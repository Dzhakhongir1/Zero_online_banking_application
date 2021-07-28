package com.zerobank.stepdefinition;

import com.zerobank.pages.AccountActivityPages;
import com.zerobank.pages.AccountSummaryPAges;
import com.zerobank.pages.LogInPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AccountsActivity_stepdef {
    LogInPage page = new LogInPage();
    AccountSummaryPAges acs= new AccountSummaryPAges();
    AccountActivityPages aa = new AccountActivityPages();

    @Given("account title should be {string}")
    public void account_title_should_be(String string) {
        aa.accountActivityTAb.click();
        BrowserUtils.assertTitle(string);
    }
    @Given("Account dropdown should have")
    public void account_dropdown_should_have(List<String> dropDownExpectedOptions) {
        Select select = new Select(aa.dropDown);
        List <String>dropdownActual = BrowserUtils.getElementsText(select.getOptions());
        Assert.assertEquals(dropdownActual,dropDownExpectedOptions);

    }
    @Then("Transactions table should have column names")
    public void transactions_table_should_have_column_names(List<String> dataTableExpectedOptions) {

        List <String>dataTableActual = BrowserUtils.getElementsText(aa.tablesVerification);
        Assert.assertEquals(dataTableExpectedOptions,dataTableActual);
    }


    @Given("the user is logged in")
    public void the_user_is_logged_in() {
        String url = "http://zero.webappsecurity.com/login.html";
        Driver.getDriver().get(url);
        page.logIn();
    }
    @When("the user clicks on    Savings link on the Account Summary    page")
    public void the_user_clicks_on_savings_link_on_the_account_summary_page() {
        acs.savingsButton.click();


    }
    @Then("the Account Activity page should be displayed")
    public void the_account_activity_page_should_be_displayed() {
        Assert.assertTrue(acs.accountActivityTAb.isDisplayed());
    }
    @Then("Account drop down should have {string} selected")
    public void account_drop_down_should_have_selected(String string) {
        Select select =new Select(acs.dropDown);
        Assert.assertEquals(select.getFirstSelectedOption().getText(),string);
    }

    @When("the user clicks on    Brokerage link on the Account Summary page")
    public void the_user_clicks_on_brokerage_link_on_the_account_summary_page() {
        acs.BrokerageButton.click();
    }


    @When("the user clicks on    Checking link on the Account Summary page")
    public void the_user_clicks_on_checking_link_on_the_account_summary_page() {
        acs.checkingButton.click();
    }


    @When("the user clicks on Credit card    link on the Account    Summary    page")
    public void the_user_clicks_on_credit_card_link_on_the_account_summary_page() {
        acs.CreditCardButton.click();
    }


    @When("the user clicks on Loan link on the Account Summary page")
    public void the_user_clicks_on_loan_link_on_the_account_summary_page() {
        acs.LoanButton.click();
    }



}
