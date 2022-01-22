package keyboardMouseOps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DragAndDropMouseOp {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/droppable/");
		//Switch to frame
		driver.switchTo().frame(0);	
		// S1: Create an instance of Actions class and pass webdriver instance as an argument to its constructor
		Actions action = new Actions(driver);
		//Identify source and target element for Drag and Drop
		WebElement src=driver.findElement(By.id("draggable"));
		WebElement target=driver.findElement(By.id("droppable"));
		//call dragAndDrop() of actions class
		action.dragAndDrop(src, target).build().perform();
		Thread.sleep(2000);
		//call dragAndDropBy() of actions class
		action.dragAndDropBy(src, 150, 50).build().perform();
		System.out.println("done");
	}

}
