package testngdiscussion;

import org.testng.annotations.Test;

public class InvocationCountCase {
	

	@Test(priority = -1, invocationCount = 5, timeOut = 1)
	public void login() throws InterruptedException
	{
		System.out.println("login test case");
		
		
	}
	
	@Test
	public void dashBoard()
	{
		System.out.println("DashBoard test case");
	}

}
