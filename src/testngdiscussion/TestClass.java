package testngdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestClass {
	
	
	
	@Test
	public void firstTestCase()
	{
		System.setProperty("webdriver.chrome.driver",
				"E:\\Desktop\\VimanNagar\\Dec 21\\Selenium downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();// maximize the window of the browser

		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");

	
		
	}
	
	
	@Test
	public void secondTestCase()
	{
		System.out.println("Second test case");
	}

}
