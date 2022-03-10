package basiccomponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathLocator {

	
	public static void main(String[] args) {
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
//		contains()	
//			driver.get("https://www.facebook.com/signup");
//			
//			driver.findElement(By.xpath("//input[contains(@id,'u_0_jhsjd')]")).sendKeys("Gourav");

			
//			text()
			
			WebElement text = driver.findElement(By.xpath("//div[text()='LOGIN Panel']"));
			
			
			String textonwebelement = text.getText();
			
			System.out.println(textonwebelement);
			
	}
	
	
	
}
