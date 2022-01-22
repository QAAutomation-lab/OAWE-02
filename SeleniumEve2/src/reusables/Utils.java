package reusables;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Utils {

	static public WebDriver setUp(String browserName,String appurl) {
		WebDriver driver=null;
		if(browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			
		} else if(browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}else if(browserName.equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(appurl);
		return driver;
	}
	
	public static void mouseHover(String hoverOp, WebDriver driver, WebElement element, Integer x, Integer y) {
		Actions action = new Actions(driver);

		if (hoverOp.equalsIgnoreCase("target")) {
			action.moveToElement(element).perform();
		} else if (hoverOp.equalsIgnoreCase("targetWithCords")) {
			action.moveToElement(element, x, y).perform();
		} else {
			action.moveByOffset(x, y).perform();
		}
	}
	
	public static void getScreenShot(WebDriver driver,String fileName) {
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File file=ts.getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file, new File(fileName));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
