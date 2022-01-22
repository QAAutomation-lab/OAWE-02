package testngsamples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utilites.SeleniumUtils;

public class Actitime extends SeleniumUtils{
	static WebDriver driver;
	@Test
	public void a_openBrowserAndAppURL() {
		driver=setUp("chrome","https://demo.actitime.com/login.do");
		System.out.println("Browser opened and URL is also entered....");
	}
	@Test
	public void b_login() {
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager",Keys.ENTER);
		System.out.println("Username and password entered and login successfully...");
	}
	@Test
	public void c_createTask() {
		System.out.println("Task is created sucessfully");
	}
	@Test
	public void d_logoutClose() {
		System.out.println("Logout from application...");
		cleanUp();
	}
}
