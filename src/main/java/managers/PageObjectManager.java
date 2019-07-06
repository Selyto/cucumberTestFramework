package managers;

import org.openqa.selenium.WebDriver;

import pageObjects.CartPage;
import pageObjects.HomePage;

public class PageObjectManager {
 
	private WebDriver driver;
 
	private HomePage homepage;
	private CartPage cartpage;
 
 public PageObjectManager(WebDriver driver) {
	 this.driver = driver;
 }
 
 public HomePage getHomePage() {
	  return (homepage == null) ? homepage = new HomePage(driver) : homepage;
 }
 
 public CartPage getCartPage() {
	 return (cartpage == null) ? cartpage = new CartPage(driver) : cartpage;
 }
}
