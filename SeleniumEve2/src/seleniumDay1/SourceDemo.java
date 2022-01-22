package seleniumDay1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SourceDemo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
				
//		WebElement userNameInputField=driver.findElement(By.id("user-name"));
//		userNameInputField.sendKeys("standard_user");
							//or
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.id("login-button")).click();
		
		System.out.println("Page title: "+driver.getTitle());
		System.out.println("Page URL: "+driver.getCurrentUrl());
		
		driver.close();
	}

}
