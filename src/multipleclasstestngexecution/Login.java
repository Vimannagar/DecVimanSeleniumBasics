package multipleclasstestngexecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Login {
	
	@Test
	public void urlVerification()
	{
		System.out.println("Testcase 1");
		
		Reporter.log("This is test case 1", true);
		Reporter.log("This is test case next line", true);
		
	}

	
	@Test
	public void loginWithCorrectCreds()
	{
		System.out.println("Testcase 2");
		
		Reporter.log("This is test case 2", true);
		
		
	}
}
