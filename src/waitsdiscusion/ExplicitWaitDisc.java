package waitsdiscusion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDisc {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Desktop\\VimanNagar\\Dec 21\\Selenium downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();// maximize the window of the browser

		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");

	
//		driver.findElement(By.xpath("//*[@id='enable-button']")).click();

//		WebElement disablebutton = driver.findElement(By.xpath("//*[@id='disable']"));
		
		WebDriverWait wait = new WebDriverWait(driver,50);
		
//		wait.until(ExpectedConditions.elementToBeClickable(disablebutton));
//		
//		
//		driver.findElement(By.xpath("//*[@id='enable-button']")).click();
		
		
//		driver.findElement(By.xpath("//*[@id='display-other-button']")).click();
//	
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='hidden']")));
//		
//		driver.findElement(By.xpath("//*[@id='display-other-button']")).click();
		
		
//		handling alert pop up with explicit wait
		
//		driver.findElement(By.xpath("//*[@id='alert']")).click();
//		
//		wait.until(ExpectedConditions.alertIsPresent());
//		
//		driver.switchTo().alert().accept();// handling the alert pop up
	
//		Assignment -- > to handle the text based on wait, 
//						to wait till the checkbox get selected and its status become true
	
//		wait till Text to be present 
		driver.findElement(By.xpath("//*[@id='populate-text']")).click();
		wait.until(ExpectedConditions.textToBe(By.xpath("//*[@id='h2']"), "Selenium Webdriver"));
		
	}


}
