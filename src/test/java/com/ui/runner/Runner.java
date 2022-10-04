package com.ui.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions (
        plugin = {
                "html:target/cucumber-reports.html",
                "rerun:target/rerun.txt",
                "pretty"
        },
        features = "src/test/resources/features_ui",
        glue = "com/ui/step_definitions",
        dryRun = false,
        publish = true
)



public class Runner {
}
