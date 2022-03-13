package dropdownhandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDownHandlingUsingFindElements {
	
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Desktop\\VimanNagar\\Dec 21\\Selenium downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();// maximize the window of the browser

		driver.get("https://www.facebook.com/signup");
		
		List<WebElement> dayvalues = driver.findElements(By.xpath("//*[@id='day']//option"));
		
//		Using for each loop
//		for(WebElement value :dayvalues)
//		{
//			String text = value.getText();
//			
//			System.out.println(text);
//			if(text.equals("16"))
//			{
//				value.click();
//			}
//		}
		
		
//		Using normal forloop:
		
		int numberofdays = dayvalues.size();
			
		for(int i =0; i<numberofdays; i++ )
		{
			String value = dayvalues.get(i).getText();
			System.out.println(value);
			
			if(value.equals("6"))
			{
				dayvalues.get(i).click();
			}
			
		}
		
		
//		WAP to handle Autosuggestion text box
		
		
	}
		// 

}
