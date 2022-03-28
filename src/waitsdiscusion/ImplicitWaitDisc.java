package waitsdiscusion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ImplicitWaitDisc {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"E:\\Desktop\\VimanNagar\\Dec 21\\Selenium downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();// maximize the window of the browser

		driver.get("https://www.google.com/");

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

		WebElement searchbox = driver.findElement(By.xpath("//*[@name='q']"));

		Actions act = new Actions(driver);

		act.sendKeys(searchbox, "India").sendKeys(Keys.ENTER).build().perform();

		driver.findElement(By.xpath("//*[text()='Central Bank of India']")).click();

	}
}
