package dropdownhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapHandlingUsingJavaScriptExe {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Desktop\\VimanNagar\\Dec 21\\Selenium downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		

		driver.manage().window().maximize();// maximize the window of the browser

		driver.get("https://zoom.us/signup");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//*[@class='onetrust-close-btn-handler onetrust-close-btn-ui banner-close-button ot-close-icon']")).click();
		
		WebElement month = driver.findElement(By.xpath("//*[@id='select-0']"));
		
		month.click();
		
		
		WebElement october = driver.findElement(By.xpath("//*[@id='select-item-select-0-9']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].click();", october);
		
	}

}
