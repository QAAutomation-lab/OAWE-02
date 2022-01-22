package propertyFileOp;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLoginWithAppData {

	public static void main(String[] args) {
		// Step1: open browser
		System.setProperty("webdriver.chrome.driver", "./executables/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// full screen browser
		driver.manage().window().maximize();
		/** Step2: enter required URL */
		driver.get("https://demo.actitime.com/login.do");
		// implicit wait: Interface->Interface->Interface->abstract method*/
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		WebElement userName = driver.findElement(By.cssSelector("#demoCredentials>tbody>tr:first-child>td:last-child"));	
//			String name=userName.getText();
//			System.out.println(name);
//			String[] splitName=name.split(" ");
//			System.out.println("index 0: "+splitName[0]);
//			System.out.println("index 1: "+splitName[1]);
					//or
//			String n1=userName.getText().split(" ")[1];
//			System.out.println("n1: "+n1);

		WebElement pass=driver.findElement(By.cssSelector("#demoCredentials>tbody>tr:nth-of-type(2)>td"));
//		String p1=pass.getText();
//		System.out.println(p1);
//		String[] splitPass=p1.split(" ");
//		System.out.println("index 0: "+splitPass[0]);
//		System.out.println("index 1: "+splitPass[1]);
//				//or
//		String p2=pass.getText().split(" ")[1];
//		System.out.println("p2: "+p2);
				//or
		driver.findElement(By.id("username")).sendKeys(userName.getText().split(" ")[1]);
		driver.findElement(By.name("pwd")).sendKeys(pass.getText().split(" ")[1]);
	}

}
