package testngdiscussion;

import org.testng.Assert;
import org.testng.annotations.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClassListeners {
	static WebDriver driver;
	@Test
	public void loginWithIncorrectCreds()
	{
		System.setProperty("webdriver.chrome.driver",
				"E:\\Desktop\\VimanNagar\\Dec 21\\Selenium downloads\\chromedriver.exe");
		 driver = new ChromeDriver();

		driver.manage().window().maximize();// maximize the window of the browser

		driver.get("https://opensource-demo.orangehrmlive.com/index.php");
		// xpath
		WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));

		username.sendKeys("Admine");

		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");

		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		String urlofpage =  driver.getCurrentUrl();
		
	boolean actualcondition = urlofpage.contains("Dashboard");
	
	boolean expectedcondition = true;
	
	Assert.assertEquals(actualcondition, expectedcondition);
		
		
		
	}

}
