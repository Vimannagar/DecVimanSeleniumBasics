package testngdiscussion;

import org.testng.annotations.Test;

	public class SequenceOfTestCase {
	
		@Test
		public void login()
		{
			System.out.println("login test case");
		}
		
		@Test
		public void home()
		{
			System.out.println("home test case");
		}
		
		@Test
		public void dashBoard()
		{
			System.out.println("DashBoard test case");
		}
		
		@Test
		public void profile()
		{
			System.out.println("profile test case");
		}
	}
