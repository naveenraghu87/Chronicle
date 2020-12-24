package ChronicleSystems.chronicle.Runner;

import org.junit.Test;
import org.junit.runner.RunWith;
import ChronicleSystems.chronicle.util.WebController;
import cucumber.api.junit.Cucumber;
import cucumber.api.*;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = { "html:target/cucumber-reports/cucumber-html-report",
		"json:target/cucumber-reports/cucumber.json", "pretty:target/cucumber-reports/cucumber-pretty.txt",
		"usage:target/cucumber-reports/cucumber-usage.json", "junit:target/cucumber-reports/cucumber-results.xml",
		"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-extent-reports/report.html" }, 
		features = {"src/main/resources/Chronicle/ui/features" }, 
		glue = { "ChronicleSystems.chronicle.PageObjects","ChronicleSystems.chronicle.StepDefinitions", "ChronicleSystems.chronicle.util","ChronicleSystems.chronicle.Runner" },
		tags = {"@Demo" },
		dryRun = false, 
		snippets = SnippetType.CAMELCASE)

public class CucumberRunner_ui {

	public static void tearDown() {
		WebController.closeDeviceDriver();
	}

}