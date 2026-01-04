package com.Cucumber.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeatureFiles/SwagLab.feature",
					glue={"com.Cucumber.Stepdef"})
public class SwagLabRunner {

}
