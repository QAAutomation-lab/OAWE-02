package assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demoblaze {

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
		wait=new WebDriverWait(driver,20);
		driver.get(appurl);
	}
	@Test(priority=0)
	public void openBroserAndLogin() throws InterruptedException {
		setUp("chrome", "https://www.demoblaze.com/");
		List<WebElement> name=driver.findElements(By.cssSelector("#tbodyid>div>div>div>h4>a"));
		int item=1;
		for(int j=0;j<name.size();j++) {
			System.out.println("item"+item+": "+name.get(j).getText());
			item++;
		}
		WebElement btn=driver.findElement(By.id("next2"));
		while(btn.isDisplayed()) {
			btn.click();
			Thread.sleep(2000);
			name=driver.findElements(By.cssSelector("#tbodyid>div>div>div>h4>a"));
			for(int j=0;j<name.size();j++) {
				System.out.println("item"+item+": "+name.get(j).getText());
				item++;
			}
		}
	}
}
