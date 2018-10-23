package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/reports/cucumber-html-report",
                "json:target/reports/cucumber.json",
                "pretty"},
        tags = {"@runit","~@ignore"},
        features = {"src/test/features"},
        glue = {"stepDefs"}
)

public class testRunner {
}
