package pageObjects;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import managers.FileReaderManager;

public class HomePage {
	
	WebDriver driver;
	Actions act;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		 act = new Actions(driver);
	}
	
	@FindBy(id="search_query_top")
	WebElement txtSearch;
	
	@FindBy(name="submit_search")
	WebElement btnSearch;
	
	@FindBy(xpath="//a[@class='product-name']")
	List<WebElement> lblProductTitle;
	
	@FindBy(xpath="//div[@class='right-block']")
	WebElement productContainer;
	
	@FindBy(xpath="//a/span[text()='Add to cart']")
	WebElement btnAdd;
	
	@FindBy(xpath="//b[text()='Cart']")
	WebElement lnkCart;

	
	public void doSearch(String term) {
		txtSearch.sendKeys(term);
		btnSearch.click();
	}
	
	public void isProductDisplayedForSearchTerm(String term) {
		for(WebElement product : lblProductTitle) {
			if(!product.getText().contains(term)) {
				System.out.println("Failed");
				break;
			}
		}
	}
	
	public void purchaseProduct() {
		act.moveToElement(productContainer).perform();
		btnAdd.click();
		
	}
	
	public void gotoCart() {
		lnkCart.click();
	}
	
	public String getProdName() {
		return lblProductTitle.get(0).getText();
	}
	
	public void getUrl() {
		try {
			driver.get(FileReaderManager.fileRead().getConfiguration().getURL());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
