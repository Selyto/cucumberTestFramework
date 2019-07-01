package testContext;

import managers.DriverManager;
import managers.PageObjectManager;

public class TestContext {

	DriverManager webDriverManager;
	PageObjectManager pageobjectmanager;
	
	
	public TestContext() {
		webDriverManager = new DriverManager();
		pageobjectmanager = new PageObjectManager(webDriverManager.getWebDriver());
	}
	
	public DriverManager getWebDriverManager() {
		return webDriverManager;
	}
	
	public PageObjectManager getPageObjectManager() {
		return pageobjectmanager;
	}
	
}
