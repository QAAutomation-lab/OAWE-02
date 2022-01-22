package keyboardMouseOps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActitimeLogin {

	public static void main(String[] args) throws InterruptedException {
		
		//Step1: open browser
	WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		/**Step2: enter required URL */
		driver.get("https://demo.actitime.com/login.do");
		
		//implicit wait: Interface->Interface->Interface->abstract method*/
						/* WebDriver->Manage->Timeouts->implicitlyWait*/
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(2000);
		WebElement un=driver.findElement(By.id("username"));
				un.sendKeys("admin",Keys.TAB);
		Thread.sleep(2000);
		driver.get("https://www.flipkart.com/");
		//to remove login popup press Escape button
		driver.findElement(By.xpath("//body")).sendKeys(Keys.ESCAPE);
	}
}
