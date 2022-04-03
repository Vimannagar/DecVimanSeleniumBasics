package testngdiscussion;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class GroupingOfTestCase {

	
	
	@BeforeGroups({"Sanity", "Regression"})
	public void beforeGroup()
	{
		System.out.println("Sanity and Regression before group");
	}
	
	@AfterGroups("Functional")
	public void afterGroup()
	{
		System.out.println("Functional after group");
	}
	
	@Test(priority = 1, groups = "Sanity")
	public void login()
	{
		System.out.println("Login to the application");
		
	}
	
	@Test(priority = 2, groups = {"Functional", "Sanity"})
	public void dashBoard()
	{
		System.out.println("Dashboard");
	}

	@Test(priority = 3, groups = "Regression")
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
