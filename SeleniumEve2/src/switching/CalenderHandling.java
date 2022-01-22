package switching;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utilites.SeleniumUtils;

public class CalenderHandling extends SeleniumUtils{
	static WebDriver driver;
	@Test
	public void testAlerts() throws InterruptedException{
		driver= setUp("chrome","https://www.makemytrip.com/");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("li[data-cy='account']")).click();
		//to open calender
		driver.findElement(By.cssSelector("label[for='departure']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
		Thread.sleep(2000);
		//to select date from calender
		driver.findElement(By.cssSelector("div.DayPicker-Months>div:nth-of-type(2)>.DayPicker-Body>div:nth-of-type(2)>div:nth-of-type(2)")).click();
	}

}
