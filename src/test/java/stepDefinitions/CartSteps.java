package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumberio.ScenarioContext;
import cucumberio.TestContext;
import dataReader.ConfigReader;
import managers.FileReaderManager;
import pageObjects.CartPage;
import pageObjects.HomePage;
import utils.Context;

public class CartSteps {

	HomePage hompage;
	CartPage cart;
	TestContext testContext;
    ScenarioContext sContext;
	
	public CartSteps(TestContext context) throws IOException {
		 testContext = context;
		 hompage = testContext.getPageObjectManager().getHomePage();
		 cart = testContext.getPageObjectManager().getCartPage();
		 sContext = testContext.getScenarioContext();
	}
	
	
	@Then("Cart has the item")
	public void cart_has_the_item() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		hompage.gotoCart();
		cart.isCarthasItem(sContext.getContext(Context.PRODUCT_NAME).toString());
	}
	
	
	
}
