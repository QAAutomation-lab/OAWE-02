package sampletest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utils.SeleniumUtils;


public class JavaScriptScroll extends SeleniumUtils{

	@Test
	public void testCase1() {
      		
        //Launching the Site.		
       WebDriver driver=setUp("chrome","https://www.flipkart.com/");
       
       driver.findElement(By.xpath("//body")).sendKeys(Keys.ESCAPE);
     //Creating the JavascriptExecutor interface object by Type casting		
       JavascriptExecutor js = (JavascriptExecutor)driver;			
        		
//        //Vertical scroll down by 600  pixels		
//        js.executeScript("window.scrollBy(0,600)");	
//        
//        //scroll page till the element is found
//        js.executeScript("argument[0].scrollIntoView();", webelement);
        
        //scroll page till bottom
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}

}
