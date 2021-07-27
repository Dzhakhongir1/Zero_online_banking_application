package com.zerobank.stepdefinition;

import com.zerobank.pages.AccountSummaryPAges;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import sun.java2d.pipe.DrawImage;

public class AccountSumary_stefDef {
    AccountSummaryPAges pAges = new AccountSummaryPAges();
    @Given("the title should be {string}")
    public void the_title_should_be(String string) {
        String actualtitle = Driver.getDriver().getTitle();
        Assert.assertEquals(string,actualtitle);
    }
    @Then("user should see {string}")
    public void user_should_see(String expectedTabName) {
       WebElement actualTabName= pAges.displayed(expectedTabName);
        Assert.assertEquals(expectedTabName,actualTabName.getText());
    }
}
