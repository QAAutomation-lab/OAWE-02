package webpages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.SeleniumUtility;

public class ActitimeLoginPage extends SeleniumUtility{
	WebDriver driver;

	public ActitimeLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="username")
	private WebElement userNameInputField;
	
	@FindBy(name="pwd")
	private WebElement passwordInputField;
	
	@FindBy(id="loginButton")
	private WebElement loginButton;
	
	public void enterUsernameAndPassword(String un,String pd) {
		typeInput(userNameInputField, un);
		typeInput(passwordInputField, pd);
	}
	
	public void clickOnLoginButton() {
		clickOnElement(loginButton);
	}
}
