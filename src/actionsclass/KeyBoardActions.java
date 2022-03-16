package actionsclass;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardActions {
		public static void main(String[] args) throws IOException, InterruptedException {
			System.setProperty("webdriver.chrome.driver",
					"E:\\Desktop\\VimanNagar\\Dec 21\\Selenium downloads\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();

			driver.manage().window().maximize();// maximize the window of the browser

			
			driver.get("https://www.facebook.com/signup");
			
		WebElement firstname = driver.findElement(By.xpath("//*[@name='firstname']"));

		Actions act = new Actions(driver);
		
		act.sendKeys(firstname, "Velocity").perform();
		
		act.sendKeys(" Corporate").perform();// this will type where the cursor is present
		
		
//		performing tab operation by pressing tab key through code
		
		act.sendKeys(Keys.TAB).sendKeys("Training Institute").build().perform();
		
	
		
		act.sendKeys(Keys.TAB).sendKeys("9988776655").build().perform();
		
	
		
		
		
	}
}
