package com.zerobank.stepdefinition;

import com.zerobank.pages.AccountSummaryPAges;
import com.zerobank.pages.LogInPage;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class AccountsActivity_stepdef {
    LogInPage page = new LogInPage();
    AccountSummaryPAges acs= new AccountSummaryPAges();

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
