package com.Cucumber.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeatureFiles/CRM.feature",
				glue={"com.Cucumber.Stepdef","com.Cucumber.Hooks"},
				publish=true,
				plugin={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class CRMRunner {

}
