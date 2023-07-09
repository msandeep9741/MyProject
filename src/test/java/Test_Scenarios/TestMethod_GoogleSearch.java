package Test_Scenarios;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Objects.FacebookPage;
import Objects.GoogleSearchPage;
import io.github.bonigarcia.wdm.WebDriverManager;


public class TestMethod_GoogleSearch {
	
	WebDriver driver;
	FacebookPage face;
	GoogleSearchPage page;
	
	
	@BeforeTest
	public void beforetest()
	{
		
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.google.com");
		
		
	}
	@Test(priority = 0)
	public void searchoperation(String searchinput) throws AWTException, InterruptedException {
		page = new GoogleSearchPage(driver);
		//page.searchbar(searchinput); provided a data by using agruement
		page.searchbar("Facebook");
	}
	
	
	@Test(priority = 1)
	public void FacebookVerify()
	{
		page = new GoogleSearchPage(driver);
		page.clickfacebook();
		
	}
	
	
	@Test(priority = 2)
	public void FacebookOperation() throws InterruptedException {
		face = new FacebookPage(driver);
		face.FacebookCalling("9663493546", "Sandeep@123");
	}
	
	
	
	
	
	@AfterTest
	public void aftertest()
	{
		driver.quit();
	}
	
}
