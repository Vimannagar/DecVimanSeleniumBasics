package basiccomponents;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Desktop\\VimanNagar\\Dec 21\\Selenium downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();// maximize the window of the browser

		driver.get("https://www.kotakgeneral.com/");

	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement username = driver.findElement(By.xpath("//*[@class='insurenceTypes']//h2[text()='Health Insurance']"));
		
		username.click();
		
		driver.findElement(By.xpath("//*[@class='btnValSec adultMemVal']//button[text()='+']")).click();
		
		
		driver.findElement(By.xpath("//*[@id='txtMobile']")).sendKeys("9876543210");
		
		
		driver.findElement(By.xpath("//*[@id='txtPinCode']")).sendKeys("425201");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='ctl00_Content_C001_btnCalculte']")).click();
		
		driver.findElement(By.xpath("//*[@class='year']")).click();
	}
		
}
