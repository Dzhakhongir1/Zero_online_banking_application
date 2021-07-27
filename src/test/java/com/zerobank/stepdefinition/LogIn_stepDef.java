package com.zerobank.stepdefinition;

import com.zerobank.pages.AccountSummaryPAges;
import com.zerobank.pages.LogInPage;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class LogIn_stepDef {
    LogInPage  page = new LogInPage();
    AccountSummaryPAges acs= new AccountSummaryPAges();
    @Given("Users	with wrong username	or wrong password should not be	able to	login")
    public void users_with_wrong_username_or_wrong_password_should_not_be_able_to_login() {
        String url = "http://zero.webappsecurity.com/login.html";
        Driver.getDriver().get(url);
        page.username.sendKeys("username");
        page.password.sendKeys("pasword");
        page.logInButton.click();



    }
    @Then("error message {string} are	wrong should be displayed.")
    public void error_message_are_wrong_should_be_displayed(String string) {
        Assert.assertEquals(string,page.failedCredentials.getText());
    }



    @Given("Users with blank username or password should also not be able to login")
    public void users_with_blank_username_or_password_should_also_not_be_able_to_login() {
        String url = "http://zero.webappsecurity.com/login.html";
        Driver.getDriver().get(url);
        page.username.sendKeys("");
        page.password.sendKeys("password");
        page.logInButton.click();
    }




    @Then("{string} page should be	displayed.")
    public void page_should_be_displayed(String string) {
        Assert.assertEquals(acs.AccountSummaryTab.getText(),string);
    }

}
