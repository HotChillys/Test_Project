package com.zipcode.test.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//html:target/cucumber-reports.html
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "json:target/cucumber.json",
                "pretty",
                "html:target/default-html-reports"
        },
        features = "src/test/resources/features/",
        glue = "step_definitions",
        dryRun = false,
        tags = "@wip"
)
public class TestRunner {
}
