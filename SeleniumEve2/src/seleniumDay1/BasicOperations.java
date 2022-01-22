package seleniumDay1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicOperations {

	public static void main(String[] args) {
		
		
		/**
		 * Absolute path --> F:\SeleniumWorkspace\SeleniumEve2\executables\chromedriver.exe
		 * Relative path --> .\executables\chromedriver.exe
		 */
		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		/** enter required URL */
		driver.get("http://www.google.com");
		
		/** print page source code */
		System.out.println("Page source: "+driver.getPageSource().length());
		
		/** current page title */
		//String currentPageTitle=driver.getTitle();
		//System.out.println("Current page title: "+currentPageTitle);
				//or
		System.out.println("Current page title: "+driver.getTitle());
		
		/** current page URL */
		System.out.println("Current page URL: "+driver.getCurrentUrl());
		//close current browser instance
		driver.close();
	}
}
