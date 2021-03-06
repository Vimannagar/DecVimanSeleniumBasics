package dropdownhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NormalDropdown {

	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Desktop\\VimanNagar\\Dec 21\\Selenium downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		

		driver.manage().window().maximize();// maximize the window of the browser

		driver.get("https://www.facebook.com/signup");
		
		WebElement day = driver.findElement(By.xpath("//*[@id='day']"));
		
		Select sel = new Select(day);
		
		sel.selectByVisibleText("25");
		
		
		WebElement month = driver.findElement(By.xpath("//*[@id='month']"));
		
		Select sel1 = new Select(month);
		
		sel1.selectByValue("8");
		
		
		
		WebElement year = driver.findElement(By.xpath("//*[@id='year']"));
		
		Select sel2 = new Select(year);
		
		sel2.selectByIndex(6);
		
		
		
	}
}
