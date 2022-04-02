package testngdiscussion;

import org.testng.annotations.Test;

public class InclusionExclusionOfTestCase {
	
	
	@Test(priority = 1)
	public void login()
	{
		System.out.println("Login to the application");
		
	}
	
	@Test(priority = 2)
	public void dashBoard()
	{
		System.out.println("Dashboard");
	}

	@Test(priority = 3)
	public void profile()
	{
		System.out.println("Profile");
	}
	
	@Test(priority = 4)
	public void logout()
	{
		System.out.println("Logout test case");
	}

}
