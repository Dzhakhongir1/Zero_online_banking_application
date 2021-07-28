package com.zerobank.stepdefinition;

import com.zerobank.pages.PayBillsPages;
import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class PayBills_stepDef {
    PayBillsPages pages = new PayBillsPages();
    @And("clicks pay Bills tab")
    public void clicksPayBillsTab() {
        pages.PayBills.click();
    }
    @Then("title should be {string}")
    public void title_should_be(String expectedTitle) {
        BrowserUtils.assertTitle(expectedTitle);
    }
    @Then("fills out the form")
    public void fills_out_the_form() {
        pages.amountSendKeys(500);
        pages.dateSendKeys(2021);
        pages.descriptionSendKeys("For MUD");
    }
    @Then("user should get Message Displayed {string}")
    public void user_should_get_message_displayed(String string) {
        pages.textDisplayed(string);
    }


}
