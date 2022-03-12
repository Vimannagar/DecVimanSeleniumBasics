package dropdownhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Desktop\\VimanNagar\\Dec 21\\Selenium downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		

		driver.manage().window().maximize();// maximize the window of the browser

		driver.get("https://paytm.com/recharge");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@class='_3_cL ']//input[@maxlength='10']")).sendKeys("9958467057");
		
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//div[@class='_3H1N']//div)[3]")).click();
		
	}
}
