package stepdefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import utils.SeleniumUtils;

public class ActitimeLoginWithParamStepDefinition extends SeleniumUtils {

	WebDriver driver;
	 @Given("^User opens actitime application (.+) in chrome browser$")
	    public void user_opens_actitime_application_in_chrome_browser(String url){
	    // Write code here that turns the phrase above into concrete actions
	    driver= setUp("chrome", url);
	}

	 @When("^user enters valid username as (.+) and password as (.+)$")
	    public void user_enters_valid_username_as_and_password_as(String username, String password){
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
	}

	 @And("^clicks on login button$")
	    public void clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("loginButton")).click();

	}

	 @Then("^Actitime home page should be opened with the title as (.+)$")
	    public void actitime_home_page_should_be_opened_with_the_title_as(String expectedtitle)throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		   Thread.sleep(2000);
	    Assert.assertEquals(expectedtitle, driver.getTitle());
	    driver.close();
	}
}
