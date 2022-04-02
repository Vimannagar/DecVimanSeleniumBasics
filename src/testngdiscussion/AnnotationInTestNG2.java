package testngdiscussion;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationInTestNG2 {
	
	
	@BeforeClass
	public void beforeClass2()
	{
		System.out.println("Before class 2");
	}
	
	@AfterClass
	public void afterClass2()
	{
		System.out.println("after class 2");
	}
	
	@AfterTest
	public void afterTest2()
	{
		System.out.println("after test 2");
	}
	
	@Test
	public void testCase3()
	{
		System.out.println("Test case 3");
	}

}
