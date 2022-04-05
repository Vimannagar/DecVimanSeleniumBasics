package testngdiscussion;

import org.testng.annotations.Test;

public class ParallelClassExecution1 {
	@Test
	public void testCase1()
	{
		System.out.println("Test case 1 ");
	}
	
	@Test
	public void testCase2()
	{
		System.out.println("Test case 2 ");
	}

}
