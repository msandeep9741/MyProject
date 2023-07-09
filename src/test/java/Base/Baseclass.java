package Base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	
	WebDriver driver;
	
	@BeforeMethod
	public void beforetest()
	{
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void aftertest()
	{
		driver.close();
	}
	

}
