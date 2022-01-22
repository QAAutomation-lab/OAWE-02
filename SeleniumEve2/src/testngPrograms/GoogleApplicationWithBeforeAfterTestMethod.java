package testngPrograms;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleApplicationWithBeforeAfterTestMethod {

	WebDriver driver;
	@BeforeTest
	public void openBrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		System.out.println("Before Test....");
	}
	@Test
	public void testGoogleLandingPage() {
		String expectedTitle = "Google";
		String actualTitle = driver.getTitle();
		// Assert.assertEquals(actualTitle, expectedTitle);
		Assert.assertEquals(actualTitle, expectedTitle,
				"Either Google search page not opened or page title got changed");
		// System.out.println(expectedTitle.equals(actualTitle));
		System.out.println("TC1: TestGoogleLandingPage is finished");
	}
	@Test
	public void testSearch() {
		WebElement searchInputField = driver.findElement(By.name("q"));
		Assert.assertTrue(searchInputField.isDisplayed());
		Assert.assertTrue(searchInputField.isEnabled());
		searchInputField.sendKeys("SQL questions", Keys.ENTER);
		System.out.println(driver.getTitle());
		System.out.println("TC2: TestSearch is finished");
	}
	@BeforeMethod
	public void openAppUrl() {
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println("Before Method....");
	}
	@AfterMethod
	public void backToMainPage() {
		driver.navigate().back();
		System.out.println("After Method....");
	}
	@AfterTest
	public void cleanUp() {
		driver.close();
		System.out.println("After Test....");
	}
}
