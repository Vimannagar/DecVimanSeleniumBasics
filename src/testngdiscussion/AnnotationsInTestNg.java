package testngdiscussion;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsInTestNg {
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before suite method");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println(" After suite method");
	}
	
	@BeforeTest
	public void beforeTest1()
	{
		System.out.println("Before test 1");
	}
	
	
	
	@Test
	public void testCase1()
	{
		System.out.println("Test case 1");
	}
	
	@Test
	public void testCase2()
	{
		System.out.println("Test case 2");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Before method");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("After method");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("before class method");
	}
	

	@AfterClass
	public void AfterClass()
	{
		System.out.println("after class method");
	}
	

}
