package testngdiscussion;

import org.testng.annotations.Test;

public class DependsOnMethodDisc {
	
	@Test(priority = 1)
	public void login()
	{
		System.out.println("Login to the application");
		
		throw new NullPointerException();
	}
	
	@Test(priority = 2, dependsOnMethods = "login")
	public void dashBoard()
	{
		System.out.println("Dashboard");
	}

	@Test(priority = 3)
	public void profile()
	{
		System.out.println("Profile");
	}
	
	@Test(priority = 4, dependsOnMethods = {"dashBoard", "profile" })
	public void logout()
	{
		System.out.println("Logout test case");
	}
	
}
