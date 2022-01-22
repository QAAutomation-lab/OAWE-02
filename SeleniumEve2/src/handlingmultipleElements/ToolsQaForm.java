package handlingmultipleElements;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolsQaForm {

	public static void main(String[] args) throws InterruptedException {
			//Step1: open browser
			System.setProperty("webdriver.chrome.driver","./executables/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			//full screen browser 
			driver.manage().window().maximize();
			/**Step2: enter required URL */
			driver.get("https://demoqa.com/automation-practice-form");
			//implicit wait: Interface->Interface->Interface->abstract method*/
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			/**
			 * If the checkbox is getting selected/deselected by using checkbox symbol dn identify it using input tag attributes
			 * id its getting selected/deselected by using checkbox symbol & labels both dn for click use label tag attributes and for isSelected using input tag
			 */
			WebElement checkBox=driver.findElement(By.id("hobbies-checkbox-1"));			
			WebElement element=driver.findElement(By.cssSelector("label[for='hobbies-checkbox-1']"));
			System.out.println(element.isSelected()+":  "+element.isDisplayed()+": "+element.isEnabled());
			element.click();
			System.out.println("Using input for only selected: "+checkBox.isSelected()+":  "+element.isDisplayed()+": "+element.isEnabled());
			element.click();
			System.out.println("Using input for only selected: "+checkBox.isSelected()+":  "+element.isDisplayed()+": "+element.isEnabled());
			
			//scrolling
			driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.CONTROL,Keys.END));
			
			WebElement button=driver.findElement(By.id("submit"));
			System.out.println(button.getText());
			button.click();
	}
}
