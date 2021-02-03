package cucumberTest;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = "src/test/java/Features",
			glue = {"stepDefinition"},
			tags = "@CRM",
			plugin = {"pretty","html:target/cucumber-reports/crmreport1.html","json:target/cucumber-reports/crmreport.json"},
			monochrome = true
	)
	public class CRMActivityRunner {

	}

