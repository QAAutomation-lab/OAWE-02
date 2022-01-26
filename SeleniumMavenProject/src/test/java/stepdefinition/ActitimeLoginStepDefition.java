//package stepdefinition;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import io.github.bonigarcia.wdm.WebDriverManager;
//
//
//public class ActitimeLoginStepDefition {
//	WebDriver driver;
//	@Given("^User opens actitime application in chrome browser$")
//	public void user_opens_actitime_application_in_chrome_browser() {
//	    WebDriverManager.chromedriver().setup();
//	    driver=new ChromeDriver();
//	    driver.manage().window().maximize();
//		driver.get("https://demo.actitime.com/login.do");
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);	    
//	}
//
//	@When("^user enters valid username and password$")
//	public void user_enters_valid_username_and_password() {
//	    // Write code here that turns the phrase above into concrete actions
//		driver.findElement(By.id("username")).sendKeys("admin");
//		driver.findElement(By.name("pwd")).sendKeys("manager");
//	}
//
//	@And("^clicks on login button$")
//	public void clicks_on_login_button() {
//	    // Write code here that turns the phrase above into concrete actions
//		driver.findElement(By.id("loginButton")).click();
//	}
//
//	@Then("^Actitime home page should be opened$")
//	public void actitime_home_page_should_be_opened() throws InterruptedException {
//	   Thread.sleep(2000);
//	    Assert.assertEquals("actiTIME - Enter Time-Track", driver.getTitle());
//	    driver.close();
//	}
//}
