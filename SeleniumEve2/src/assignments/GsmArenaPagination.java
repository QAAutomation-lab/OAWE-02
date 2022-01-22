package assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GsmArenaPagination {

	WebDriver driver = null;
	WebDriverWait wait;

	public void setUp(String browserName, String appurl) {
		if (browserName.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		wait = new WebDriverWait(driver, 20);
		driver.get(appurl);
	}
	public void setSleepTime(long time)
	{
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	@Test
	public void getAllPhoneNames() {
		setUp("chrome","https://www.gsmarena.com/");
		List<WebElement> phoneNames =	driver.findElements(By.cssSelector(".brandmenu-v2>ul>li>a"));
		for(int i=0;i<phoneNames.size();i++) {
			System.out.println(phoneNames.get(i).getText());
		}
		driver.close();
	}
	@Test
	public void getAllDeviceNameInEachPage() {
		setUp("chrome","https://www.gsmarena.com/realme-phones-118.php");
		System.out.println("Current Page title: "+driver.getTitle());
		List<WebElement> pagi = driver.findElements(By.cssSelector(".nav-pages>a"));
		List<WebElement> deviceList=driver.findElements(By.cssSelector(".makers>ul>li>a>strong>span"));
		if (pagi.size() > 0) {
			int x=1;
			for (int i = 0; i <= pagi.size(); i++) {

				WebElement nextButton = driver.findElement(By.cssSelector(".pages-next"));
				for(int j=0;j<deviceList.size();j++) {
					System.out.println(x+": "+deviceList.get(j).getText());
					x++;
				}
				if (!nextButton.getAttribute("class").contains("disabled")) {
					nextButton.click();
					setSleepTime(1000);
				}
				//to avoid staleElement exception
				deviceList=driver.findElements(By.cssSelector(".makers>ul>li>a>strong>span"));
				pagi = driver.findElements(By.cssSelector(".nav-pages>a"));
			}
		}else {
			for(int i=0;i<deviceList.size();i++) {
				System.out.println(deviceList.get(i).getText());
			}
		}
		driver.close();
	}

	@Test
	public void testGsmArenaNavigateToEachPageAndGetTitle() {
		setUp("chrome","https://www.gsmarena.com/realme-phones-118.php");
		System.out.println("Current Page title: "+driver.getTitle());
		List<WebElement> pagi = driver.findElements(By.cssSelector(".nav-pages>a"));
		if (pagi.size() > 0) {
			for (int i = 0; i < pagi.size(); i++) {

				WebElement nextButton = driver.findElement(By.cssSelector(".pages-next"));
				if (nextButton.isEnabled()) {
					nextButton.click();
					setSleepTime(1000);
					System.out.println(driver.getTitle());
				} else {
					setSleepTime(1000);
					System.out.println(driver.getTitle());
				}
				//to avoid staleElement exception
				pagi = driver.findElements(By.cssSelector(".nav-pages>a"));
			}
		}
		driver.close();
	}

}
