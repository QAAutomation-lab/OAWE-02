package keyboardMouseOps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class MouseOp2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://vtiger-demo.it-solutions4you.com/index.php");
		WebElement userName = driver.findElement(By.id("username"));
		// S1: Create an instance of Actions class and pass webdriver instance as an argument to its constructor
		Actions action = new Actions(driver);
		//double click on username field
		action.doubleClick(userName).build().perform(); //or
		//action.moveToElement(userName).doubleClick().build().perform();
		Thread.sleep(2000);
		//right click from mouse
		//action.contextClick(userName).build().perform();//or
		action.moveToElement(userName).contextClick().build().perform();
//		action.clickAndHold(userName).build().perform();
//		action.moveToElement(userName).release().build().perform();
	}

}
