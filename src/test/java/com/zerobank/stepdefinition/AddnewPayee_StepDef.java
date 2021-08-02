package com.zerobank.stepdefinition;

import com.zerobank.pages.PayBillsPages;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.Map;

public class AddnewPayee_StepDef {
    PayBillsPages pages = new PayBillsPages();
    @Given("user clicks to Add new Payee tab")
    public void user_clicks_to_add_new_payee_tab() {
        pages.addNewPayeeButton.click();
    }
    @Given("creates new payee using following information")
    public void creates_new_payee_using_following_information(Map<String,String> list) {
        pages.payeeName.sendKeys(list.get("Payee Name"));
        pages.address.sendKeys(list.get("Payee Address"));
        pages.Account.sendKeys(list.get("Account"));
        pages.details.sendKeys(list.get("Payee details"));
        pages.add.click();
    }
    @Then("message {string} should be displayed")
    public void message_should_be_displayed(String string) {
        Assert.assertEquals(string,pages.conformation.getText());
    }
}
