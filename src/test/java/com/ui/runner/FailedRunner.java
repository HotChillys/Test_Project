package com.ui.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = "src/test/java/com/ui/step_definitions",
        features = "@target/rerun.txt"
)


public class FailedRunner {
}
