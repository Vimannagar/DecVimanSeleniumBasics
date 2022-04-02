package testngdiscussion;

import org.testng.annotations.Test;

public class DependsOnMethods2 {
	
	
	@Test(priority = 5, dependsOnMethods = "testngdiscussion.DependsOnMethodDisc.dashBoard")
	public void myInfo()
	{
		System.out.println("My information");
	}
	
	@Test(priority = 6)
	public void checkBox()
	{
		System.out.println("Check box");
	}

}
