package com.app.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
    features = "src/test/java/features",
    glue = { "com.app.stepdefs" },
    dryRun=false,
    plugin = {
        "html:target/Login_Functionality_Report.html",
        "pretty",
        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
        "timeline:test-output-thread/"
    },
    tags="@chilternoak"
)
public class TestNgRunner extends AbstractTestNGCucumberTests {
	
	
    
}