package pageObjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	
	WebDriver driver;

	public CartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//tr[@id='product_1_1_0_0']//td[2]//a")
	List<WebElement> lblCartItems;
	
	public void isCarthasItem(String term) {
		for(WebElement item: lblCartItems) {
			if(item.getText().equalsIgnoreCase(term)) {
				System.out.println("Super");
					break;
			}
		}
	}
	
}
