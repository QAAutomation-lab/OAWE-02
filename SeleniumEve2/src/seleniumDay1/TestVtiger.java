package seleniumDay1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestVtiger {

	public static void main(String[] args) {
		//Step1: open browser
				System.setProperty("webdriver.chrome.driver","./executables/chromedriver.exe");
				WebDriver driver=new ChromeDriver();
				/**Step2: enter required URL */
				driver.get("https://demo.vtiger.com/vtigercrm/index.php");
				
				//implicit wait: Interface->Interface->Interface->abstract method*/
								/* WebDriver->Manage->Timeouts->implicitlyWait*/
				driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				//full screen browser 
				driver.manage().window().maximize();
				
				//Step3: login page title
				System.out.println("Page title before login: "+driver.getTitle());	
				/**Step4: locate username field, 0-20 sec---> 2secs */
				WebElement userName=driver.findElement(By.id("username"));
				System.out.println("userName visibility is: "+userName.isDisplayed());
				System.out.println("userName is editable or not: "+userName.isEnabled());
				userName.clear();
				userName.sendKeys("admin");		
				/**Step5: locate password field, 0-20 sec ----> 10secs */
				WebElement pwd=driver.findElement(By.id("password"));
				System.out.println(pwd.isDisplayed());
				System.out.println(pwd.isEnabled());
				pwd.clear();
				pwd.sendKeys("Test@123");		
				/**Step6: locate login button 0-20sec --->9 sec*/
				WebElement loginButton=driver.findElement(By.tagName("button"));
				System.out.println(userName.isDisplayed());
				System.out.println(userName.isEnabled());
				loginButton.click();
				
				driver.findElement(By.className("userName")).click();
				driver.findElement(By.id("menubar_item_right_LBL_SIGN_OUT")).click();

	}

}
