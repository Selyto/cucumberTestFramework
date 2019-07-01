package stepDefinitions;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import managers.PageObjectManager;
import pageObjects.HomePage;

public class HomePagesteps2 {

	WebDriver driver;
	HomePage hompage;
	PageObjectManager pageManager;
	
	
	
	@Given("User is on home page")
	public void user_is_on_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		pageManager = new PageObjectManager(driver);
		hompage = pageManager.getHomePage();
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
