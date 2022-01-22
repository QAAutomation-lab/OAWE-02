package keyboardMouseOps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Copypaste {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	WebDriver driver =new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://demo.automationtesting.in/Register.html");
	WebElement firstName=driver.findElement(By.cssSelector("input[placeholder='First Name']"));
	WebElement lastName=driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
	Thread.sleep(2000);
	firstName.sendKeys("admin",Keys.chord(Keys.CONTROL,"a"),Keys.chord(Keys.CONTROL,"c"));
	Thread.sleep(2000);
	lastName.sendKeys(Keys.chord(Keys.CONTROL,"v"));
	}
}
