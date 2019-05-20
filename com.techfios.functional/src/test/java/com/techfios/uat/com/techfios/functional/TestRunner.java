package com.techfios.uat.com.techfios.functional;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\luchengchao\\JAVA_Selenium\\com.techfios.functional\\src\\main\\java\\com\\techfios\\features",
		glue= {"com.StepDefination"},
		format= {"pretty","html:test-outout","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"},
		dryRun=false)
public class TestRunner {
	
}
