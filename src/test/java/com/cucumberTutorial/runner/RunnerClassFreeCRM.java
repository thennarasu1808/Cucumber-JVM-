package com.cucumberTutorial.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
				features="featureFiles/FreeCrmFeatureFiles.feature", glue= {"stepDefinitions"}, 
				plugin= {"pretty", "html: test-output", "json:json-output/cucumber.json", "junit:junit-xml/cucmber.xml"}, 
				monochrome=true, 
				dryRun= false
								)
public class RunnerClassFreeCRM {

}
