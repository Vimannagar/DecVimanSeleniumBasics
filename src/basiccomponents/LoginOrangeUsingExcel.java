package basiccomponents;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.ExcelReader;

public class LoginOrangeUsingExcel {
	
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Desktop\\VimanNagar\\Dec 21\\Selenium downloads\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();// maximize the window of the browser
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
//xpath
		
		WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		
		ExcelReader er = new ExcelReader();
	
			
		username.sendKeys(er.readData(2, 0));
		
		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys(er.readData(2, 1));
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

}
