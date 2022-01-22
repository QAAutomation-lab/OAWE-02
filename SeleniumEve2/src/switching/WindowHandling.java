package switching;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utilites.SeleniumUtils;

public class WindowHandling extends SeleniumUtils{
	static WebDriver driver;
	@Test
	public void testWindow() throws InterruptedException{
		driver= setUp("chrome","https://demoqa.com/browser-windows");
		System.out.println("Home window currentURL: "+driver.getCurrentUrl());
		//to get current window id
		String homeWinId=driver.getWindowHandle();
		System.out.println("Home window id: "+homeWinId);
		//click on button to open new tab/window
		driver.findElement(By.id("windowButton")).click();
		//get the window ids of all the browser window open by webdriver
		Set<String> allWinIds=driver.getWindowHandles();
		System.out.println("All win ids: "+allWinIds);//2 Win IDs
		//get child window id
		allWinIds.remove(homeWinId);
		System.out.println("All win ids after removing homewinid: "+allWinIds);//1 winID
		//get child window string id from allwinid
//		Iterator<String> itr=allWinIds.iterator();
//		String childWinId=itr.next();
					//or
		String childWinId=allWinIds.iterator().next();
		//after getting required/child window id switch control to that window
		driver.switchTo().window(childWinId);
		System.out.println("After opening new tab/window, current url: "+driver.getCurrentUrl());
		//close child window in which driver has focus
		//driver.close();
		//once all the child page operation are done come back to main page
		driver.switchTo().window(homeWinId);
		System.out.println("After coming back to main page, current url: "+driver.getCurrentUrl());
		//driver.close();
		// to close all the driver instance 
		driver.quit();
	}
}
