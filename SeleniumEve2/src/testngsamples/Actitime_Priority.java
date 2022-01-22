package testngsamples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utilites.SeleniumUtils;

public class Actitime_Priority extends SeleniumUtils{

	static WebDriver driver;
	@Test(priority=0, description="Openbrowser method")
	public void openBrowserAndAppURL() {
		driver=setUp("chrome","https://demo.actitime.com/login.do");
		//System.out.println("Browser opened and URL is also entered....");
	}
	@Test(priority=1, description="I am a login method" )
	public void login() {
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);
		//System.out.println("Username and password entered and login successfully...");
	}
	@Test(priority=2,description="I am creating new task")
	public void createTask() {
		//System.out.println("Task is created sucessfully");
	}
	@Test(priority=3,description="Logout and close browser")
	public void logoutClose() {
		//System.out.println("Logout from application...");
		cleanUp();
	}
}
