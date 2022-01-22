package testngsamples;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utilites.SeleniumUtils;

public class Actitime_DependsOn {

	@Test(priority=1,enabled=true)
	public void openBrowserAndAppURL() {
		int i=10/0;
		System.out.println("Open browser and enter app url");
	}
	@Test(priority=2,enabled=true, dependsOnMethods="openBrowserAndAppURL")
	public void login() {
		System.out.println("enter username, password and click on login button");
	}
	@Test(priority=3,enabled=true)
	public void createTask() {
		System.out.println("create new task");
	}
	@Test(priority=4,enabled=true)
	public void logoutClose() {
		System.out.println("Logout from the application and close the browser");
	}
}
