package waitsdiscusion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"E:\\Desktop\\VimanNagar\\Dec 21\\Selenium downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();// maximize the window of the browser

		driver.get("https://www.kotaklife.com/");
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		Actions act = new Actions(driver);

		WebElement plan = driver.findElement(By.xpath("//*[@data-action='online plans']"));
		WebElement retplan = driver
				.findElement(By.xpath("//*[@class='third_navUL third_navUL03']//a//span[text()='Retirement Plan']"));

		act.moveToElement(plan).moveToElement(retplan).click().build().perform();

		Thread.sleep(2000);

	}

}
