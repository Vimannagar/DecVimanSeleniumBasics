package testngdiscussion;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC2 extends TC1 {
	
	@Test(priority = 2)
	public void checkBox()
	{
		driver.findElement(By.xpath("//*[@id='menu_admin_viewAdminModule']")).click();
		
		for(int i=1; i<=40; i++)
		{
		driver.findElement(By.xpath("(//*[contains(@id,'ohrmList_chkSelectRecord_')])["+i+"]")).click();
		System.out.println("i value is :"+i);
		}
	}

}
