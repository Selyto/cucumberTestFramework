package stepDefinitions;

import java.io.IOException;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumberio.ScenarioContext;
import cucumberio.TestContext;
import pageObjects.HomePage;
import utils.Context;

public class HomePagesteps {

	HomePage hompage;
	TestContext testContext;
    ScenarioContext sContext;
    
	
	public HomePagesteps(TestContext context) throws IOException {
		 testContext = context;
		 hompage = testContext.getPageObjectManager().getHomePage();
		 sContext = testContext.getScenarioContext();
		 }
	
	@Given("User is on home page")
	public void user_is_on_home_page() throws IOException {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		hompage.getUrl();
	}

	@When("he search for {string}")
	public void he_search_for(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		sContext.setContext(Context.SEARCH_TERM, string);
		hompage.doSearch(string);
	}

	@Then("Search should be displayed")
	public void choose_first_Item() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		hompage.isProductDisplayedForSearchTerm(sContext.getContext(Context.SEARCH_TERM).toString());
		sContext.setContext(Context.PRODUCT_NAME, hompage.getProdName());
	}

	@When("Add to cart")
	public void add_to_cart() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		hompage.purchaseProduct();
	}

	
}
