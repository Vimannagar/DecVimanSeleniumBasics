package basiccomponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Desktop\\VimanNagar\\Dec 21\\Selenium downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		

		driver.manage().window().maximize();// maximize the window of the browser

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");

		// id locator 
		WebElement username = driver.findElement(By.id("txtUsername"));
		
		username.sendKeys("Dec21 Vimannagar");
		
	
		
		// name locator
		
		WebElement password = driver.findElement(By.name("txtPassword"));
		
		password.sendKeys("abc1234");
		
	// class locator
		
		WebElement loginbutton = driver.findElement(By.className("button"));
		
		loginbutton.click();
		
////		linkText locator
//		
//		WebElement forgotlink = driver.findElement(By.linkText("Forgot your password?"));
//		
//		forgotlink.click();
		
		
//		partialLinkText locator
		
		WebElement forgotlink2 = driver.findElement(By.partialLinkText("Orange"));
		
		
		forgotlink2.click();
		
	}

}
