package com.Cucumber.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

/*
 * execute single scenario: tags= "@sellpage"
 * execute multiple scenarios: tags="@sellpage or @fashionpage"
 * skip any scenario:tags= "not @fashionpage"
 * multiple scenarios to skip:not @ignore
 */
@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/FeatureFiles/Amazon.feature",
					glue= {"com.Cucumber.Stepdef"},
					tags= "@All")
public class AmazonRunner {

}
