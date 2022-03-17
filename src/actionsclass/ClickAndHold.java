package actionsclass;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ClickAndHold {
	
	
	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver",
					"E:\\Desktop\\VimanNagar\\Dec 21\\Selenium downloads\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();// maximize the window of the browser

			
			driver.get("https://jqueryui.com/slider/");
			
			WebElement iframe = driver.findElement(By.xpath("//*[@class='demo-frame']"));
			
			driver.switchTo().frame(iframe);
			
			WebElement slider = driver.findElement(By.xpath("//*[@class='ui-slider-handle ui-corner-all ui-state-default']"));
			
			
			
			Actions act = new Actions(driver);
			
			act.clickAndHold(slider).moveByOffset(250, 0).release(slider).build().perform();
			
			Thread.sleep(2000);
			
			act.clickAndHold(slider).moveByOffset(-200, 0).release(slider).build().perform();
			
			driver.switchTo().parentFrame();
			
			driver.findElement(By.xpath("//*[text()='Droppable']")).click();
			
		
		
	}

}
