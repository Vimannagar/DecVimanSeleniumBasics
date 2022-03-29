package waitsdiscusion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaitDisc {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Desktop\\VimanNagar\\Dec 21\\Selenium downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();// maximize the window of the browser

		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");

		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
										.withTimeout(Duration.ofSeconds(60))
										.pollingEvery(Duration.ofMillis(9)); 
		
		
	
		driver.findElement(By.xpath("//*[@id='enable-button']")).click();

		WebElement disablebutton = driver.findElement(By.xpath("//*[@id='disable']"));

		
		wait.until(ExpectedConditions.elementToBeClickable(disablebutton));
		
		driver.findElement(By.xpath("//*[@id='enable-button']")).click();
	
	
	
	}

}
