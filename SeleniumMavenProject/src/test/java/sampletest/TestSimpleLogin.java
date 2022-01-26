package sampletest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import utils.SeleniumUtils;



public class TestSimpleLogin extends SeleniumUtils{

	@Test
	public void testActitimeLogin() {
        		
        //Launching the Site.		
       WebDriver driver=setUp("chrome","https://demo.actitime.com/login.do");	
     //Creating the JavascriptExecutor interface object by Type casting		
       JavascriptExecutor js = (JavascriptExecutor)driver;		
       
        WebElement userNameInputField=driver.findElement(By.id("username"));
		//perform typing operation
		userNameInputField.sendKeys("admin");
//		//identify password field
//		WebElement passwordInputField=driver.findElement(By.name("pwd"));
//		//perform typing operation
//		passwordInputField.sendKeys("manager");
		js.executeScript("document.getElementsByName('pwd')[0].value='manager';");
		//identify login button 
		WebElement loginButton=driver.findElement(By.id("loginButton"));
		//perform click operation
		loginButton.click();				
    }

}
