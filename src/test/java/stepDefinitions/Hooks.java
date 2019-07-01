package stepDefinitions;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.google.common.io.Files;
import com.vimalselvam.cucumber.listener.Reporter;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumberio.TestContext;

public class Hooks {

	TestContext testcontext;
	
	public Hooks(TestContext context) {
		testcontext = context;
	}
	
	@Before
	public void BeforeSteps() {
		testcontext.getWebDriverManager().getWebDriver(); //Works in scenario level
		
	}
	
	@After(order=0)
	public void AfterSteps() {
		testcontext.getWebDriverManager().closeDriver(); //Works in scenario level
	}
	
	@After(order = 1)
	public void afterScenario(Scenario scenario) {
		if (scenario.isFailed()) {
			String screenshotName = scenario.getName().replaceAll(" ", "_");
			try {
				//This takes a screenshot from the driver at save it to the specified location
				File sourcePath = ((TakesScreenshot) testcontext.getWebDriverManager().getWebDriver()).getScreenshotAs(OutputType.FILE);
				
				//Building up the destination path for the screenshot to save
				//Also make sure to create a folder 'screenshots' with in the cucumber-report folder
				File destinationPath = new File(System.getProperty("user.dir") + "/target/cucumber-reports/screenshots/" + screenshotName + ".png");
				
				//Copy taken screenshot from source location to destination location
				Files.copy(sourcePath, destinationPath);   

				//This attach the specified screenshot to the test
				Reporter.addScreenCaptureFromPath(destinationPath.toString());
			} catch (IOException e) {
			} 
		}
	}
	
}
