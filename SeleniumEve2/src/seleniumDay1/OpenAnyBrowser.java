package seleniumDay1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenAnyBrowser {

	public static void main(String[] args) {
		
		// set path for driver executable
		System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
		WebDriver driver1=new ChromeDriver();
		
		// set path for driver executable
		System.setProperty("webdriver.gecko.driver", ".\\executables\\geckodriver.exe");
		WebDriver driver2=new FirefoxDriver();
		
		// set path for driver executable
		System.setProperty("webdriver.ie.driver", ".\\executables\\IEDriverServer.exe");
		WebDriver driver3=new InternetExplorerDriver();
	}
}
