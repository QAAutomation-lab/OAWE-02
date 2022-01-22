package seleniumDay1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenBrowser {

	public static void main(String[] args) {

		// set path for driver executable
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		// open chrome browser
		ChromeDriver cdriver = new ChromeDriver();

		// set path for driver executable
		System.setProperty("webdriver.gecko.driver", ".\\executables\\geckodriver.exe");
		// open firefox browser
		FirefoxDriver fdriver = new FirefoxDriver();
		
		// set path for d	river executable
		System.setProperty("webdriver.ie.driver", ".\\executables\\IEDriverServer.exe");
		// open ie browser
		InternetExplorerDriver idriver = new InternetExplorerDriver();

	}

}
