package keyboardMouseOps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {

			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();

			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		/**
		 * Mouse operations: 
		 * 1. Create an instance of Actions class by passing webdriver instance as an argument to its constructor 
		 * 2. Identify the required element in which you want to perform mouse operations 
		 * 3. Using actions class reference call the appropriate method of actions class
		 */
		// S1: Create an instance of Actions class and pass webdriver instance as an
		// argument to its constructor
//		Actions action = new Actions(driver);
		// s2: identify the element in which you want to perform action
//		WebElement freeBookLink = driver.findElement(By.xpath("//a[text()='Free Ebooks']"));
		// S3: using Actions class instance call appropriate method of action class to
		// perform mouse hover
		// action.moveToElement(freeBookLink).perform();
//		action.moveToElement(freeBookLink, 100, 0).perform();
//		Thread.sleep(2000);
//		action.moveByOffset(-100, 0).perform();
		
		WebElement freeBookLink = driver.findElement(By.xpath("//a[text()='Free Ebooks']"));
		mouseHover("target", driver, freeBookLink, null, null);
		Thread.sleep(2000);
		mouseHover("targetWithCords", driver, freeBookLink, 100, 0);
		Thread.sleep(2000);
		mouseHover("cordsOnly", driver, null, -100, 0);
	}

	public static void mouseHover(String hoverOp, WebDriver driver, WebElement element, Integer x, Integer y) {
		Actions action = new Actions(driver);

		if (hoverOp.equalsIgnoreCase("target")) {
			action.moveToElement(element).perform();
		} else if (hoverOp.equalsIgnoreCase("targetWithCords")) {
			action.moveToElement(element, x, y).perform();
		} else {
			action.moveByOffset(x, y).perform();
		}
	}
}
