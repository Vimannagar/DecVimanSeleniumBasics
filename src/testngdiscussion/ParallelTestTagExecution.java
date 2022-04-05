package testngdiscussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTestTagExecution {

@Parameters("url")
@Test
public void getUrl(String value)
{
	System.setProperty("webdriver.chrome.driver",
			"E:\\Desktop\\VimanNagar\\Dec 21\\Selenium downloads\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();// maximize the window of the browser

	driver.get(value);
	
	String fburl = driver.getCurrentUrl();
	
	System.out.println(fburl);
	
	
}
	

}
