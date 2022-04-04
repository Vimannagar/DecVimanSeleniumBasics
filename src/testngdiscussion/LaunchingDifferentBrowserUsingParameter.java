package testngdiscussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LaunchingDifferentBrowserUsingParameter {
	WebDriver driver;
	
			
		@Parameters("browser")
		@Test
		public void launchBrowser(String value)
		{
			if(value.equals("Chrome"))
			{
			System.setProperty("webdriver.chrome.driver",
					"E:\\Desktop\\VimanNagar\\Dec 21\\Selenium downloads\\chromedriver.exe");
		 driver = new ChromeDriver();
			}
			else if(value.equals("Firefox"))
			{
				System.setProperty("webdriver.gecko.driver",
						"E:\\Desktop\\VimanNagar\\Dec 21\\Selenium downloads\\geckodriver.exe");
			 driver = new FirefoxDriver();
			}
			
		}


}
