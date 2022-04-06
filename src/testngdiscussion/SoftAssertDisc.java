package testngdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDisc {

	@Test
	public void testCase1() {
		System.out.println("first line");

		System.out.println("Second line");

		int i = 10;
		int j = 20;
		boolean value = i > j;

		SoftAssert sa = new SoftAssert();
		sa.assertTrue(value);
		System.out.println("third line");

		System.out.println("fourth line");

		sa.assertAll();

	}

	@Test
	public void verifyMessage() {
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
		SoftAssert sa = new SoftAssert();

		sa.assertEquals(actualmessage, expectedmessage);

		System.out.println("Text message comparison done check the results");

		sa.assertAll();

	}

}
