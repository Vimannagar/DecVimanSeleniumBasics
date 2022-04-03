package testngdiscussion;

import org.testng.annotations.Test;

public class GroupingOfTestCase2 {

	@Test(priority = 1, groups = "Sanity")
	public void myInfo()
	{
		System.out.println("My info test case");
		
	}
	
	@Test(priority = 2, groups = "Functional")
	public void editDetails()
	{
		System.out.println("Edit details test case");
	}

	
}
