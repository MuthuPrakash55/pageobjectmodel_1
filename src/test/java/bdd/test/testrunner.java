package bdd.test;

import io.cucumber.junit.CucumberOptions.SnippetType;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features ="./src/test/resources/features",
						glue = {"bdd.test"},dryRun = false,
						snippets = io.cucumber.testng.CucumberOptions.SnippetType.CAMELCASE,
						plugin = { "pretty", 
								"html:target/cucumber-reports/cucumber-pretty.html",
								"json:target/cucumber-reports/CucumberTestReport.json",
								"rerun:target/cucumber-reports/rerun.txt",
								"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
								)
public class testrunner extends AbstractTestNGCucumberTests {

}
