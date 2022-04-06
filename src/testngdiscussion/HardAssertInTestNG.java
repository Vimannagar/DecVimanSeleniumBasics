package testngdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertInTestNG {
	
	@Test
	public void testCase1()
	{
		System.out.println("first line");
		
		System.out.println("Second line");
		
		int i =10;
		int j= 20;
		boolean value = i>j;
		
		Assert.assertTrue(value);//---> Failed
		System.out.println("third line");
		
		System.out.println("fourth line");
		
		
		
	}
	
	
	@Test
	public void testCase2()
	{
		System.out.println("fifth line");
		
		System.out.println("sixth line");
		
		int i =10;
		int j= 20;
		boolean value = i<j;
		
		Assert.assertTrue(true);// condition matched
		System.out.println("seventh line");
		
		System.out.println("eight line");
		Assert.assertTrue(value);//---> Failed
		
		
	}
	
	@Test(enabled = false)
	public void verifyMessage()
	{
		System.setProperty("webdriver.chrome.driver",
				"E:\\Desktop\\VimanNagar\\Dec 21\\Selenium downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();// maximize the window of the browser
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
//xpath
			WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
			username.sendKeys("Admine");
			
			driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		String actualmessage = driver.findElement(By.xpath("//*[@id='spanMessage']")).getText();
	
		String expectedmessage = "Invalidd credentials";
		
	Assert.assertEquals(actualmessage, expectedmessage);// assertion failed hence mark the test case as failed.
	
	System.out.println("Text message comparison done check the results");
	
	
	
	
	}
	
	
	@Test
	public void testCase4()
	{
		Assert.fail("Test case is failed deliberately");
	}
	
	
	

}
