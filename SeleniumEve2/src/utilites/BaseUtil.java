package utilites;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseUtil {
	
	public static WebDriver driver;
	public static Actions action;
	public  static WebDriverWait wait;
	/**
	 * 
	 * @param browserType
	 * @param appUrl
	 */
	public static void setUp(String browserType,String appUrl){
		if(browserType.equalsIgnoreCase("chrome")){
			WebDriverManager.chromedriver().setup();
						driver=new ChromeDriver();
		}else if(browserType.equalsIgnoreCase("firefox")){
			WebDriverManager.firefoxdriver().setup();
						driver=new FirefoxDriver();
		}else{
			WebDriverManager.iedriver().setup();
						driver=new InternetExplorerDriver();
		}		
					driver.manage().window().maximize();
					driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
					wait=new WebDriverWait(driver,20);
					action=new Actions(driver);
					driver.get(appUrl);
		}
	public static void tearDown(){
		driver.close();
	}
}
