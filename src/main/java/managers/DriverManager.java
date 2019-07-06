package managers;

import java.io.IOException;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import utils.Browser;

public class DriverManager {

	WebDriver driver;
	static Browser browser;
	
	
	public WebDriver getWebDriver() {
		if(driver == null) driver = createWebDriver();
		return driver;
	}
	
	public WebDriver createWebDriver() {
		try {
			if(FileReaderManager.fileRead().getConfiguration().getisRemote().equalsIgnoreCase("Y")) {
				driver = setUpRemoteBrowser();
			}
			else {
				driver = setUpLocalBrowser();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return driver;
	}
	
	public WebDriver setUpRemoteBrowser() {
		return driver; //implement grid
	}
	
	public WebDriver setUpLocalBrowser() throws IOException {
		switch(FileReaderManager.fileRead().getConfiguration().getbrowser()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "iexplorer":
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			break;
		case "edge":
			break;
		case "safari":
			break;
		}
		return driver;
	}
	
	public void closeDriver() {
		driver.close();
		driver.quit();
	}
}
