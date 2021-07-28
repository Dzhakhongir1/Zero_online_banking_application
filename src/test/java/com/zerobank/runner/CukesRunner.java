package com.zerobank.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber-report.html",

        },
        features = "src/test/resources/features",
        glue = "com/zerobank/stepdefinition",
        dryRun = false,
        tags = "@wip1"


)

public class CukesRunner {
}
