package sampletest;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utils.SeleniumUtils;



public class Sample extends SeleniumUtils {

	@Test
	public void testCase1() {
        		
        //Launching the Site.		
       WebDriver driver=setUp("chrome","https://www.browserstack.com/users/sign_in");
	//Creating the JavascriptExecutor interface object by Type casting		
    JavascriptExecutor js = (JavascriptExecutor)driver;		
		js.executeScript("document.getElementById('user_email_login').value='rbc@xyz.com';");
		js.executeScript("document.getElementById('user_password').value='password';");
		//click using javascript
		js.executeScript("document.getElementById('user_submit').click();");
		
		/**
		 * 1. getElementById
		 * 2. getElementsByName
		 * 3. getElementsByCss
		 * 4. getElementsByTagName
		 */
						//or
//		WebElement signUp=driver.findElement(By.id("user_submit"));
//		 //Perform Click on LOGIN button using JavascriptExecutor		
//		js.executeScript("arguments[0].click();", signUp);
		
		js.executeScript("alert('enter correct login credentials to continue');");

	}

}
