package basiccomponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookSignuo {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Desktop\\VimanNagar\\Dec 21\\Selenium downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		

		driver.manage().window().maximize();// maximize the window of the browser

		driver.get("https://www.facebook.com/signup");
		
		driver.findElement(By.xpath("//input[contains(@id,'u_0_jhsjd')]")).sendKeys("Gourav");

	}
}
