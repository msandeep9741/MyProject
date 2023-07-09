package Objects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleSearchPage {
	
	WebDriver driver;

	public GoogleSearchPage(WebDriver driver) {
		
		this.driver = driver;
	}

	//By search = By.xpath("//textarea[@name='q']");
	By search = By.name("q");
	By Facebook_Link = By.xpath("//h3[.='Facebook - log in or sign up']");
	By Google_Btn = By.xpath("(//input[@name='btnK'])[2]");
	
	public void searchbar(String searchinput) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		try {
		driver.findElement(search).sendKeys(searchinput);
		Thread.sleep(1000);
		//driver.findElement(Google_Btn).click();

		Robot rt = new Robot();
		 rt.keyPress(KeyEvent.VK_ENTER); 
		 rt.keyRelease(KeyEvent.VK_ENTER);
		 Thread.sleep(1000);
		}
		catch(Exception e) {
			System.out.println("Exception Caught "+e.getMessage());
		}
	}
		public void clickfacebook()
		{
			try {
				driver.findElement(Facebook_Link).click();
				Thread.sleep(3000);
				}
				catch(Exception e) {
					System.out.println("Exception Caught "+e.getMessage());
				}
			}
		}
		
	

	
	
	 
	
	
		
