package actionsclass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActions {
	
	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Desktop\\VimanNagar\\Dec 21\\Selenium downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();// maximize the window of the browser

		
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
		WebElement hoverpoint = driver.findElement(By.xpath("//*[@id='sub-menu']"));
		
		Actions act = new Actions(driver);
		
//		act.moveToElement(hoverpoint).perform();
		
//		driver.findElement(By.xpath("//*[@id='link2']")).click();
		
		
//		Double click 
		
		
		WebElement doubleclickbutton = driver.findElement(By.xpath("//*[@id='double-click']"));
		
		act.doubleClick(doubleclickbutton).perform();
		
		
		driver.switchTo().alert().accept();
		
		
		WebElement uploadbutton = driver.findElement(By.xpath("//*[@name='upload']"));
		
		
		act.contextClick(uploadbutton).perform();
		
		Robot robo = new Robot();
		
		robo.keyPress(KeyEvent.VK_DOWN);
		robo.keyPress(KeyEvent.VK_DOWN);
		robo.keyPress(KeyEvent.VK_ENTER);
		
		
		
		
	}

}
