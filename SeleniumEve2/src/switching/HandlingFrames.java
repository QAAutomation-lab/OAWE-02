package switching;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utilites.SeleniumUtils;

public class HandlingFrames extends SeleniumUtils{
	static WebDriver driver;
	@Test
	public void testFrames() throws InterruptedException{
		driver= setUp("chrome","https://jqueryui.com/");
		driver.findElement(By.xpath("//a[text()='Autocomplete']")).click();
		//taking control inside the frame from main page
		//driver.switchTo().frame(0);
		//Identify the frame 
		//WebElement e1=driver.findElement(By.cssSelector(".demo-frame"));
		//switch control to the frame
		driver.switchTo().frame(0);
		driver.findElement(By.cssSelector("input#tags")).sendKeys("ja");
		Thread.sleep(2000);
		driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		//coming back to main/home page from the frame
		driver.switchTo().defaultContent();
		driver.findElement(By.cssSelector(".logo")).click();

	}

}
