package testrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
		 features = {"src/test/resources/features/actitimeLogin.feature"},//feature file folder name
			        glue = {"stepdefinition"},//step definition package name
			       plugin = {"html:target/cucumber-html-report"},// reporting
			        monochrome = true
		)
public class Runner extends AbstractTestNGCucumberTests{

}

