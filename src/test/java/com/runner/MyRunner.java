package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(

		features = "Feature/",
		glue = {"com.stepDefination"},
		plugin = {"json:target/cucumber.json"},
		monochrome = true,
		dryRun = false


		)
public class MyRunner extends AbstractTestNGCucumberTests {





}
