package testngsamples;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilites.SeleniumUtils;

public class GoogleApplicationWithBeforeAfterMethod extends SeleniumUtils {
	
	WebDriver driver;
		@BeforeMethod
		public void startUp(){
			 driver=setUp("chrome", "https://www.google.com");
		}	
	  @Test
	  public void testGoogleLandingPage() {				
			String expectedTitle="Google";
			String actualTitle=driver.getTitle();
			System.out.println(expectedTitle.equals(actualTitle));
			/*validation is pending*/
	  }
	  @Test
	  public void testSearch(){		  
			driver.switchTo().activeElement().sendKeys("SQL",Keys.ENTER);
			System.out.println(driver.getTitle());
	  }
	  @AfterMethod
	  public void cleanUp(){
		  driver.close();
	  }
}
