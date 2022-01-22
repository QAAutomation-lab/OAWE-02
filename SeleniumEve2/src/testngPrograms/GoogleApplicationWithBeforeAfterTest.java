package testngPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleApplicationWithBeforeAfterTest {

	WebDriver driver;
	@BeforeTest
	public void startUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@Test
	public void testGoogleLandingPage() {
		String expectedTitle = "Google";
		String actualTitle = driver.getTitle();
		// Assert.assertEquals(actualTitle, expectedTitle);
		Assert.assertEquals(actualTitle, expectedTitle,
				"Either Google search page not opened or page title got changed");
		// System.out.println(expectedTitle.equals(actualTitle));
		System.out.println("TestGoogleLandingPage is finished");
	}
	@Test
	public void testSearch() {
		WebElement searchInputField = driver.findElement(By.name("q"));
		Assert.assertTrue(searchInputField.isDisplayed());
		Assert.assertTrue(searchInputField.isEnabled());
		searchInputField.sendKeys("SQL questions", Keys.ENTER);
		System.out.println(driver.getTitle());
		System.out.println("TestSearch is finished");
	}
	@AfterTest
	public void cleanUp() {
		driver.close();
		System.out.println("CleanUp is done");
	}
}
