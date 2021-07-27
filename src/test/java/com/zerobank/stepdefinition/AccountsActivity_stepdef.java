package com.zerobank.stepdefinition;

import com.zerobank.pages.LogInPage;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AccountsActivity_stepdef {
    LogInPage page = new LogInPage();
    @Given("the user is logged in")
    public void the_user_is_logged_in() {
        String url = "http://zero.webappsecurity.com/login.html";
        Driver.getDriver().get(url);
        page.logIn();
    }
    @When("the user clicks on    Savings link on the Account Summary    page")
    public void the_user_clicks_on_savings_link_on_the_account_summary_page() {

    }
    @Then("the Account Activity page should be displayed")
    public void the_account_activity_page_should_be_displayed() {

    }
    @Then("Account drop down should have {string} selected")
    public void account_drop_down_should_have_selected(String string) {

    }

    @When("the user clicks on    Brokerage link on the Account Summary page")
    public void the_user_clicks_on_brokerage_link_on_the_account_summary_page() {

    }


    @When("the user clicks on    Checking link on the Account Summary page")
    public void the_user_clicks_on_checking_link_on_the_account_summary_page() {

    }


    @When("the user clicks on Credit card    link on the Account    Summary    page")
    public void the_user_clicks_on_credit_card_link_on_the_account_summary_page() {

    }


    @When("the user clicks on Loan link on the Account Summary page")
    public void the_user_clicks_on_loan_link_on_the_account_summary_page() {

    }









}
