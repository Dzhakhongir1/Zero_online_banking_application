package com.zerobank.stepdefinition;

import com.zerobank.pages.PayBillsPages;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;

import java.util.List;

public class PurchaseForeighStefDef {
    PayBillsPages pages = new PayBillsPages();
    @Given("the user accesses the Purchase foreign currency cash tab")
    public void the_user_accesses_the_purchase_foreign_currency_cash_tab() {
        pages.foreignCurrency.click();
    }
    @Then("Following Options should be available")
    public void following_options_should_be_available(List<String>allCurency) {
        Assert.assertEquals(allCurency,pages.allcurency());

    }


    @When("user tries to calculate cost without selecting a currency")
    public void userTriesToCalculateCostWithoutSelectingACurrency() {
        pages.calculateButton.click();
    }

    @Then("error message {string} should be displayed.")
    public void errorMessageShouldBeDisplayed(String arg0) {
        Alert alert = Driver.getDriver().switchTo().alert();
        Assert.assertEquals(arg0,alert.getText());
    }

    @When("user tries to calculate cost without entering a value")
    public void userTriesToCalculateCostWithoutEnteringAValue() {
        pages.purchaseButton.click();
    }
}
