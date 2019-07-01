package TestRunner;

import java.io.File;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.vimalselvam.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import managers.FileReaderManager;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/functionalTests"
		,glue = {"stepDefinitions"}  //byy default cucumber checks code inside src/test/java folder
		,plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/testreport.html",
				"pretty", "json:target/cucumber-reports/Cucumber.json",
				"junit:target/cucumber-reports/Cucumber.xml",
				"html:target/cucumber-reports"},
		monochrome = true
		)
public class TestRunner {
	@AfterClass
	public static void writeExtentReport() throws IOException {
		Reporter.loadXMLConfig(new File(FileReaderManager.fileRead().getConfiguration().getExtentConfig()));
		Reporter.setSystemInfo("Selenium", "3.7.0");
	}
}
