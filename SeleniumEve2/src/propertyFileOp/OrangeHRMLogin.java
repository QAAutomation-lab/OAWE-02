package propertyFileOp;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMLogin {

	public static void main(String[] args) throws IOException {

		// Step1: Create an instance of FileInputStream class and pass property file
		// location to its constructor
		// using relative path
		FileInputStream fis = new FileInputStream(".\\testdata\\appData.properties");
		// Step2: Create an instance of Properties class
		Properties prop = new Properties();
		// Step3: call load() method of Properties class and pass FileInputStream
		// instance as an argument to it
		prop.load(fis);
		// step4: read the required data from property file based on the Key defined in
		// the file
		String url = prop.getProperty("appUrl");
		String uname = prop.getProperty("username");
		String pwd = prop.getProperty("password");
		String expectedLoginPageTitle = prop.getProperty("loginPageTitle");
		// Step1: open browser
		System.setProperty(prop.getProperty("chromedriverKey"), prop.getProperty("chromedriverValue"));
		WebDriver driver = new ChromeDriver();
		// full screen browser
		driver.manage().window().maximize();
		/** Step2: enter required URL */
		driver.get(url);
		// implicit wait: Interface->Interface->Interface->abstract method*/
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		if(driver.getTitle().equals(expectedLoginPageTitle)) {
			System.out.println("Login page displayed...");
		}else {
			System.out.println("Login page not diplayed..");
		}
		driver.findElement(By.id("txtUsername")).sendKeys(uname);
		driver.findElement(By.id("txtPassword")).sendKeys(pwd);
		driver.findElement(By.id("btnLogin")).click();
	}
}
