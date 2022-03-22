package windowshandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandling {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Desktop\\VimanNagar\\Dec 21\\Selenium downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();// maximize the window of the browser

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		// xpath
		WebElement link = driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']"));
		
		String	parentwinid= driver.getWindowHandle();
		
		System.out.println("Parent window id is "+parentwinid);
		
		link.click();
		link.click();
		link.click();
		
		Set<String> allwinid = driver.getWindowHandles();
			
				int numberofid = allwinid.size();
		
		
		String [] winid = new String[numberofid];
		
		int i =0;
		
		for(String id:allwinid)
		{
			winid[i]= id;
			
			i++;
			
		}
		
		for(String arrayelement:winid)
		{
			System.out.println(arrayelement);
		}
		
		
		driver.switchTo().window(winid[2]);
		
		driver.get("https://www.facebook.com/");
		
		driver.switchTo().window(parentwinid);
		
		driver.get("https://www.google.com/");
		
		driver.switchTo().window(winid[2]);
		
		
	}

}
