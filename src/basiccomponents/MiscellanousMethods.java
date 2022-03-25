package basiccomponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MiscellanousMethods {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Desktop\\VimanNagar\\Dec 21\\Selenium downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();// maximize the window of the browser
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		//xpath
		
		WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));

		username.sendKeys("Admin");
		
		String val = username.getAttribute("value");
		
		System.out.println("the entered text is "+ val);
		
		
		
//		getCurrentURL();
		
		String url = driver.getCurrentUrl();
		
		System.out.println(url);
		
//		getTitle();
		
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		

			

	}

}
