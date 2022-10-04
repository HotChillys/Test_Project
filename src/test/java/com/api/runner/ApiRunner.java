package com.api.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "pretty",
                "html:target/cucumber-reports.html"
        },
        features = "src/test/resources/feature_api",
        glue = "com/api/step_definitions",
        dryRun = false,
        tags = "@wip"
)
public class ApiRunner {
}
