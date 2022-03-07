package basiccomponents;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSpecificMethods {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"E:\\Desktop\\VimanNagar\\Dec 21\\Selenium downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		

		driver.manage().window().maximize();// maximize the window of the browser

		driver.get("https://www.google.com");

		Thread.sleep(2000);

		driver.get("https://www.facebook.com");
		Thread.sleep(2000);
		driver.navigate().back();// press the back button of the browser
		Thread.sleep(2000);
		driver.navigate().forward();// press the forward button of the browser

		driver.navigate().refresh();// press the refresh button of the browser

		driver.close();// to close the current window

	}
}