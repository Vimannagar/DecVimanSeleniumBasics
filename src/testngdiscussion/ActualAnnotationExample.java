package testngdiscussion;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ActualAnnotationExample {
	
	@BeforeSuite
	public void openBrowser()
	{
		System.out.println("Opening the browser");
	}
	
	@AfterSuite
	public void quitBrowser()
	{
		System.out.println("Closing the browser");
	}
	
	@BeforeTest
	public void navToUrl()
	{
		System.out.println("Navigate to url");
	}
	
	
	@AfterTest
	public void navToBackToOriginalUrl()
	{
		System.out.println("Navigate back to original url");
	}
	
	@BeforeClass
	
	public void loginToApp()
	{
		System.out.println("Login to application");
	}
	
@AfterClass
	
	public void logoutFromApp()
	{
		System.out.println("Logoff from application");
	}

@BeforeMethod
public void navToTestCaseSection()
{
	System.out.println("Navigate to Test case case location");
}

@AfterMethod
public void navBackToOriginal()
{
	System.out.println("Navigate back to original location");
}

@Test
public void testCase()
{
	System.out.println("Testcase 1");
}
	
	
	
	

}
