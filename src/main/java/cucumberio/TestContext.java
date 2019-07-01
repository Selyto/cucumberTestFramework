package cucumberio;

import managers.DriverManager;
import managers.PageObjectManager;

public class TestContext {

	DriverManager webDriverManager;
	PageObjectManager pageobjectmanager;
	ScenarioContext scenarioContext;
	
	
	public TestContext() {
		webDriverManager = new DriverManager();
		pageobjectmanager = new PageObjectManager(webDriverManager.getWebDriver());
		scenarioContext = new ScenarioContext();
	}
	
	public DriverManager getWebDriverManager() {
		return webDriverManager;
	}
	
	public PageObjectManager getPageObjectManager() {
		return pageobjectmanager;
	}
	
	public ScenarioContext getScenarioContext() {
		return scenarioContext;
	}
	
}
