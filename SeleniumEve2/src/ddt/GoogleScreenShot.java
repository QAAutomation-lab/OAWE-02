package ddt;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleScreenShot {

	@Test
	public void takeScreenshotForGoogle() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		takeScreenShotOfThePage(driver, "./ScreenShot/ActitimePage101.png");
//		// downcast the driver to access TakesScreenshot method
//				TakesScreenshot ts = (TakesScreenshot) driver;
//				// capture screenshot as output type FILE
//				File file = ts.getScreenshotAs(OutputType.FILE);
//
//				try {
//					// save the screenshot taken in destination path
//					FileUtils.copyFile(file, new File("./ScreenShot/ActitimePage.png"));
//				} catch (IOException e) {
//					e.printStackTrace();
//				}
				System.out.println("page screenshot is taken");
				driver.close();
	}
	
	public void takeScreenShotOfThePage(WebDriver driver,String location) {
		// downcast the driver to access TakesScreenshot method
		TakesScreenshot ts = (TakesScreenshot) driver;
		// capture screenshot as output type FILE
		File file = ts.getScreenshotAs(OutputType.FILE);

		try {
			// save the screenshot taken in destination path
			FileUtils.copyFile(file, new File(location));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
