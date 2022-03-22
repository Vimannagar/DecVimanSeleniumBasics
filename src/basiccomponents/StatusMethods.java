package basiccomponents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StatusMethods {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"E:\\Desktop\\VimanNagar\\Dec 21\\Selenium downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();// maximize the window of the browser

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		WebElement username = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		username.sendKeys("Admin");

		driver.findElement(By.xpath("//input[@name='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@type='submit']")).click();

		driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']")).click();

		WebElement checkbox = driver.findElement(By.xpath("//*[@id='ohrmList_chkSelectRecord_18']"));
		// isEnabled()- returns true if element is enable to perform the operation
		boolean isclickable = checkbox.isEnabled();
		System.out.println(isclickable);

//		isSelected - returns true if element is selected

		boolean isclicked = checkbox.isSelected();
		System.out.println(isclicked);

		checkbox.click();

		boolean isclickedafterwards = checkbox.isSelected();

		System.out.println(isclickedafterwards);
		
		
//		isDisplayed()- This returns true if element is display over the webpage
		
		
		
		WebElement hiddenelement = driver.findElement(By.xpath("(//*[@type='hidden'])[1]"));

		
	boolean isdisplaying = hiddenelement.isDisplayed();
	
	System.out.println(isdisplaying);
	
	driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
	
	WebElement disablebutton = driver.findElement(By.xpath("//*[@id='disable']"));
	
	boolean isdisabled = disablebutton.isEnabled();
	
	System.out.println(isdisabled);// false
	}

}
