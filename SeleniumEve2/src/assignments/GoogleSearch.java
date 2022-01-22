package assignments;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearch {

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
	public void googleSearch() {
		setUp("chrome", "https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Selenium Testing",Keys.ENTER);
		Assert.assertTrue(driver.getTitle().contains("Selenium"), "Selenium search is not successfull");
		driver.close();
	}
	@Test
	public void selectRequiredSuggestion() {
		setUp("chrome", "https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Selenium Testing");
		setSleepTime(1000);
		List<WebElement> suggestions=driver.findElements(By.xpath("//ul[@role='listbox']/li/div/div[2]/div[1]/span"));
		for(int i=0;i<suggestions.size();i++) {
			if(suggestions.get(i).getText().equalsIgnoreCase("selenium testing interview questions")) {
				suggestions.get(i).click();
				break;
			}
		}
		Assert.assertTrue(driver.getTitle().contains("selenium testing interview questions"), "Selenium search is not successfull");
		driver.close();
	}
	@Test
	public void getAllSuggestions() {
		setUp("chrome", "https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Selenium");
		List<WebElement> suggestions=driver.findElements(By.xpath("//ul[@role='listbox']/li/div/div[2]/div[1]/span"));
		for(int i=0;i<suggestions.size();i++) {
			System.out.println(suggestions.get(i).getText());
		}
		driver.close();
	}
}
