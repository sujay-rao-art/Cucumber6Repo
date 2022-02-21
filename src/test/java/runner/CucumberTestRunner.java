package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "FeatureFiles",
glue = {"stepDefinations","Hooks"},
plugin = "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
dryRun = false,
tags = "@OutLineDemo",
strict = false
)
public class CucumberTestRunner {

}
