package testngPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test
public class ActiTimeLoginWithClassLevelAnnotation {
	WebDriver driver;
	Actions action;
	public void tc1_openBroserAndLogin() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		action=new Actions(driver);
		driver.findElement(By.id("username")).sendKeys("admin");		
		driver.findElement(By.name("pwd")).sendKeys("manager");		
		driver.findElement(By.id("loginButton")).click();
	}
	public void tc2_logoutAndClose() {
		WebElement logoutLink=driver.findElement(By.linkText("Logout"));
		WebDriverWait wait=new WebDriverWait(driver,20);		
		wait.until(ExpectedConditions.elementToBeClickable(logoutLink));
		System.out.println("Page title after login: "+driver.getTitle());	
		logoutLink.click();	
		driver.close();
	}
}
