package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CreateCustomer {
	
WebDriver driver;
	
	@Test
	public void loginToApp()
	{
		System.out.println("this is a test  Create Customer functionality.");
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://google.com");
		System.out.println("Launched application successfully..");
		
	}

}
