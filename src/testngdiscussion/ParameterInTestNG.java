package testngdiscussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterInTestNG {
	
	
	@Parameters("urltobelaunch")
	@Test
	public void launchUrl(String url)
	{
		System.setProperty("webdriver.chrome.driver",
				"E:\\Desktop\\VimanNagar\\Dec 21\\Selenium downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		if(url.contains("facebook"))
		{
			driver.get(url);
		}
		else
		{
			driver.get("https://www.google.com");
		}
		
	}
	
	@Parameters({"environment", "version"})
	@Test
	public void buildInfo(String env, String version)
	{
		System.out.println("Environment used is "+env);
		
		System.out.println("Build version is "+version);
		
	}

}
