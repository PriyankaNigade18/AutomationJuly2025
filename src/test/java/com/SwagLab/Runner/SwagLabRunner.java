package com.SwagLab.Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/FeatureFiles/Login.feature",
							"src/test/resources/FeatureFiles/InventoryPage.feature"},
				glue={"com.SwagLab.Steps","com.SwagLab.Hooks"},
				publish=true,
				plugin={"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class SwagLabRunner {

}
