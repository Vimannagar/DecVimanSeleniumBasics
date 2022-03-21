package windowshandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SingleWindowHandling {
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
		
		Set<String> allwindowid = driver.getWindowHandles();
		
		
		for(String winid:allwindowid)
		{
			
			if(!(parentwinid.equals(winid)))
			{
				driver.switchTo().window(winid);// switching from parent window to child 
				
				driver.findElement(By.xpath("//*[@class='btn-orange trial-btn pulse ']")).click();// performing operation on that window
			
				driver.get("https://www.google.co.in/");// to go to another url
			
//				driver.close();//to close the current focused window
			}
			System.out.println(winid);
			
			
			driver.switchTo().window(parentwinid);// to switch back to parent window
			
			WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
			
			
			username.sendKeys("Admin");
			
			driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
			
		}

		
		
		
		
		

	}
	

}
