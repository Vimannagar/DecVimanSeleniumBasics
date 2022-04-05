package testngdiscussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTestTagExecution2 {
	
	@Parameters("build")
	@Test
	public void buildInfo(String value)
	{
		System.out.println(value);
		
		
	}

}
