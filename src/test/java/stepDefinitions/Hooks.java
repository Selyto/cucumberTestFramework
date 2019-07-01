package stepDefinitions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import testContext.TestContext;

public class Hooks {

	TestContext testcontext;
	
	public Hooks(TestContext context) {
		testcontext = context;
	}
	
	@Before
	public void BeforeSteps() {
		testcontext.getWebDriverManager().getWebDriver(); //Works in scenario level
	}
	
	@After
	public void AfterSteps() {
		testcontext.getWebDriverManager().closeDriver(); //Woeks in scenario level
	}
	
}
