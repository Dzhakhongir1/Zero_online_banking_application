package com.zerobank.stepdefinition;

import com.zerobank.pages.FindTransactionPages;
import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Collections;
import java.util.List;

public class Findtransaction_stefDef {
    FindTransactionPages pages = new FindTransactionPages();






    @Given("the user accesses the find Transaction tab")
    public void the_user_accesses_the_find_transaction_tab() {
        pages.navigateToFindTransaction();

    }

    @When("the user enters data range from {string} to {string}")
    public void the_user_enters_data_range_from_to(String from, String to) {
        pages.dateFrom.sendKeys(from);
        pages.dateTo.sendKeys(to);

    }

    @When("cluck search")
    public void cluck_search() {
        pages.findButton.click();
    }

    @Then("result table should only show transaction dates between {string} to {string}")
    public void result_table_should_only_show_transaction_dates_between_to(String from, String to) {
        List<String> dates = BrowserUtils.getElementsText(pages.tablesDates);
        for (String each : dates) {
            if (Integer.parseInt(each.substring(8)) < 1 && Integer.parseInt(each.substring(8)) > 6) {
                Assert.fail();
            }
        }
        Assert.assertTrue(true);


    }

    @Then("the result should be sorted by most recent date")
    public void the_result_should_be_sorted_by_most_recent_date() {
        List<String> dates = BrowserUtils.getElementsText(pages.tablesDates);
        Collections.sort(dates);
        int recentDate = 6;
        Assert.assertEquals(Integer.parseInt(dates.get(2).substring(8)), recentDate);

    }

    @Then("the result table should not contain transaction date {string}")
    public void the_result_table_should_not_contain_transaction_date(String string) {
        List<String> dates = BrowserUtils.getElementsText(pages.tablesDates);
        for (String each : dates) {
            if (each.equals(string)) {
                Assert.fail();
            }
        }
        Assert.assertTrue(true);
    }
    @When("the user enters description {string}")
    public void the_user_enters_description(String string) {
        pages.descriptionSendKeys(string);
    }
    @Then("results table should	only show descriptions containing {string}")
    public void results_table_should_only_show_descriptions_containing(String string) {
        for (String each : pages.tablesData(string) ) {
            Assert.assertTrue(each.contains(string));
        }
    }
    @But("results table	should not show	descriptions containing	{string}")
    public void resultsTableShouldNotShowDescriptionsContaining(String arg0) {
        for (String each : pages.tablesData("OFFICE") ) {
            Assert.assertTrue(!each.equals(arg0));
        }
    }

    @Then("result should show at least one result under Deposit")
    public void result_should_show_at_least_one_result_under_deposit() {
        int count =0;
        for (String each : pages.IndexChnage("3") ) {
            count++;
            Assert.assertTrue(count>0);
        }
    }
    @Then("result tab should show at least one result under Withdrawal")
    public void result_tab_should_show_at_least_one_result_under_withdrawal() {
        int count =0;
        for (String each : pages.IndexChnage("4") ) {
            count++;
            Assert.assertTrue(count>0);
        }
    }
    @When("user selects type {string}")
    public void user_selects_type(String string) {
        pages.dropDownSelect(string);
    }
    @Then("result table should not show results under Withdrawal")
    public void result_table_should_not_show_results_under_withdrawal() {
        int count =0;
        for (String each : pages.IndexChnage("4") ) {
            count++;
            Assert.assertTrue(count>0);
        }
    }
    @Then("result table should not show results under Deposit")
    public void result_table_should_not_show_results_under_deposit() {
        int count =0;
        for (String each : pages.IndexChnage("3") ) {
            count++;
            Assert.assertTrue(count>0);
        }

    }



}


