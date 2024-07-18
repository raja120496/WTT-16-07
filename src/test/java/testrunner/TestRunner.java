package testrunner;
import io.cucumber.messages.internal.com.google.common.reflect.ClassPath;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;


@RunWith(Cucumber.class)
@CucumberOptions(
		plugin = {"pretty:target/cucumber/cucumber.txt",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"html:target/cucumber/report",
				"json:target/cucumber/cucumber.json",
				"util.MyTestListener"}
		,features= {"classpath:features/OVR/OVR_Schedule.feature"}
		,glue = {"StepDefinition"}
		//,dryRun = true
		,monochrome = true
		,snippets = SnippetType.CAMELCASE
		,tags = ""
		//,publish = true
		)
//@SpringBootTest
//@ContextConfiguration(classes = SpringBootTestApplication.class)
public class TestRunner {

}