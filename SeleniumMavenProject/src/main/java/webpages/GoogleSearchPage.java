package webpages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.SeleniumUtils;

public class GoogleSearchPage extends SeleniumUtils{

	public GoogleSearchPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="q")
	private WebElement searchInputField;
	
	public void searchText(String input) {
		typeInput(searchInputField, input);
		getActiveElement().sendKeys(Keys.ENTER);
	}
}
