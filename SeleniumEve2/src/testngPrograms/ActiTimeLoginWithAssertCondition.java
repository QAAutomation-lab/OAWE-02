package testngPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActiTimeLoginWithAssertCondition {
	WebDriver driver;
	@Test(priority=0)
	public void openBroserAndLogin() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		String expectedTitle="actiTIME - Login";
		String actualTitle=driver.getTitle();
//		if(actualTitle.equals(expectedTitle)) {
//			System.out.println("Login page displayed..");
//		}else {
//			System.out.println("Either login page not displayed or entered invalid URL");
//		}		
				//or
		//Assert.assertEquals(actualTitle, expectedTitle);
		Assert.assertEquals(actualTitle, expectedTitle,"Either login page not displayed or entered invalid URL");		
		boolean checkBoxStatus=driver.findElement(By.name("remember")).isSelected();
		//Assert.assertFalse(checkBoxStatus);
		Assert.assertFalse(checkBoxStatus,"By Default remeber me checkbox should be unchecked");
		driver.findElement(By.id("username")).sendKeys("admin");		
		driver.findElement(By.name("pwd")).sendKeys("manager");	
		
		WebElement loginBtn=driver.findElement(By.id("loginButton"));
		//Assert.assertEquals(loginBtn.isDisplayed(), true);
		//Assert.assertTrue(loginBtn.isDisplayed());
		Assert.assertTrue(loginBtn.isDisplayed(),"Login button should be displayed in login page");
		loginBtn.click();
	}
	@Test(priority=1)
	public void logoutAndClose() {
		WebElement logoutLink=driver.findElement(By.linkText("Logout"));
		WebDriverWait wait=new WebDriverWait(driver,20);		
		wait.until(ExpectedConditions.elementToBeClickable(logoutLink));
		System.out.println("Page title after login: "+driver.getTitle());	
		logoutLink.click();	
		driver.close();
	}
}
