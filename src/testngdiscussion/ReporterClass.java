package testngdiscussion;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReporterClass {
	
	@Test
	public void tc1()
	{
		System.out.println("Testcase 1");
		
		Reporter.log("This is test case 1", true);
		Reporter.log("This is test case next line", true);
		
	}

}
