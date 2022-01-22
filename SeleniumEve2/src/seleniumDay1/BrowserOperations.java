package seleniumDay1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserOperations {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./executables/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		//full screen browser 
		driver.manage().window().maximize();
		/**Step2: enter required URL */
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//implicit wait: Interface->Interface->Interface->abstract method*/
						/* WebDriver->Manage->Timeouts->implicitlyWait*/
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//set window size as we don't have minimize method in selenium
		driver.manage().window().setSize(new Dimension(500, 600));
		Thread.sleep(2000);
		//full screen browser 
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		//previous page
		driver.navigate().back();
		Thread.sleep(2000);
		//next page
		driver.navigate().forward();
		Thread.sleep(2000);
		//reload
		driver.navigate().refresh();
		//move to another url
		driver.navigate().to("https://www.google.com");
	}
}
