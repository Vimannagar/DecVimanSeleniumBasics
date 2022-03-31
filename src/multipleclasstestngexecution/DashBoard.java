package multipleclasstestngexecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DashBoard {
	
	
	@Test
	public void handlingPopup()
	{
		System.out.println("pop up testcase");
		
		Reporter.log("pop up testcase", true);
		
		
	}

	
	@Test
	public void checkBox()
	{
		System.out.println("check box test case");
		
		Reporter.log("check box test case", true);
		
		
	}

}
