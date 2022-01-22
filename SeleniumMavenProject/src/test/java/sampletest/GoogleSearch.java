package sampletest;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import utils.SeleniumUtils;
import webpages.GoogleSearchPage;

public class GoogleSearch extends SeleniumUtils {

	@Test
	public void googleSearch() {
		WebDriver driver=setUp("chrome", "https://www.google.com");

		GoogleSearchPage getGoogleSearchPage=new GoogleSearchPage(driver);
		getGoogleSearchPage.searchText("Selemium Testing");
		setSleepTime(2000);
		Assert.assertTrue(driver.getTitle().contains("Selenium"), "Selenium search is not successfull");
		driver.close();
	}
	
}
