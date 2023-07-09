package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FacebookPage {
	
	WebDriver driver;
	
	public FacebookPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	By username_ID = By.xpath("//input[@name='email']");
	By password_Pwd = By.xpath("//input[@name='pass']");
	By Log_in = By.xpath("//button[.='Log in']");
	
	
	
	public void FacebookCalling(String facebookInput, String facebookPwd) throws InterruptedException {
		// TODO Auto-generated method stub
	
		driver.findElement(username_ID).sendKeys(facebookInput);
		Thread.sleep(3000);
		driver.findElement(password_Pwd).sendKeys(facebookPwd);
		Thread.sleep(3000);
		driver.findElement(Log_in).click();
		
	}
}
