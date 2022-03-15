package popuphandling;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUpHandling {
	
	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Desktop\\VimanNagar\\Dec 21\\Selenium downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();// maximize the window of the browser

		
		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
		driver.findElement(By.xpath("//*[@value='Alert']")).click();
		
		Thread.sleep(2000);
		
		String textonpopup = driver.switchTo().alert().getText();
		System.out.println("Message over the popup is "+textonpopup);
		
		driver.switchTo().alert().accept();
		
		
		driver.findElement(By.xpath("//*[@value='Confirmation Box']")).click();
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().dismiss();
		
		
		
		
		
	}

}
