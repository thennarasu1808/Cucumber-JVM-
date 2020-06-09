package com.cucumberTutorial.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
					features = "featureFiles/ContactsScenarioOutlineFeature.feature",
					glue= {"stepDefinition"},
					plugin= {"pretty" , "html:test_output" , "json: json_output/cucmber.json" , "junit: junit_xml/cucumber.xml"},
					monochrome = true,
					strict = true,
					dryRun= false
							)


public class RunnerScenarioOutline {

}
