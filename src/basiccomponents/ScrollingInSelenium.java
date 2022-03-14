package basiccomponents;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingInSelenium {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Desktop\\VimanNagar\\Dec 21\\Selenium downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();// maximize the window of the browser

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		// xpath
		WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));

		username.sendKeys("Admin");

		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");

		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']")).click();

		
		JavascriptExecutor js = (JavascriptExecutor)driver;
//		to scroll in downward direction:
		
//		js.executeScript("window.scrollBy(0,1000)");
		
		Thread.sleep(2000);
//		To perform scroll operation in upward direction
		
//		js.executeScript("window.scrollBy(0,-500)");
		
//		To perform scroll over a webelement
		
		WebElement checkbox = driver.findElement(By.xpath("//*[@id='ohrmList_chkSelectRecord_8']"));
		
		
		js.executeScript("arguments[0].scrollIntoView();", checkbox);
	}

}
