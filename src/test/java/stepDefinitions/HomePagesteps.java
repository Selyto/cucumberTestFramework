package stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumberio.TestContext;
import managers.PageObjectManager;
import pageObjects.HomePage;

public class HomePagesteps {

	WebDriver driver;
	HomePage hompage;
	TestContext testContext;
	
	public HomePagesteps(TestContext context) {
		 testContext = context;
		 hompage = testContext.getPageObjectManager().getHomePage();
	}
	
	@Given("User is on home page")
	public void user_is_on_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		hompage.clickOnText();
		System.out.println("Step 1");
	    
	}

	@When("he search for {string}")
	public void he_search_for(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step 2 " + string );
	    
	}

	@When("Choose first Item")
	public void choose_first_Item() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Step 3");
	    
	}

	
}
