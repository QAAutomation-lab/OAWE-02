package seleniumDay1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAutomation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./executables/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		/** enter required URL */
		driver.get("https://demosite.executeautomation.com/Login.html");
		
		System.out.println(driver.getPageSource());
		System.out.println("Page Title: "+driver.getTitle());
		System.out.println("Page current URL: "+driver.getCurrentUrl());
		
		String expectedUrl="Execute Automation";
		String acutalUrl=driver.getCurrentUrl();
		
		if(expectedUrl.equals(acutalUrl)) {
			System.out.println("both are same");
		}else {
			System.out.println("not matched");
		}
//		driver.findElement(By.name("UserName")).sendKeys("execution");
//		driver.findElement(By.name("Password")).sendKeys("admin");
//		driver.findElement(By.xpath("//input[@name='Login']")).click();
		}

}
