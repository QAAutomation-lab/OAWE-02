package handlingmultipleElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTest {

	public static void main(String[] args) throws InterruptedException {
		//Step1: open browser
		System.setProperty("webdriver.chrome.driver","./executables/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//full screen browser 
		driver.manage().window().maximize();
		/**Step2: enter required URL */
		driver.get("https://www.amazon.in/");
		//implicit wait: Interface->Interface->Interface->abstract method*/
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		List<WebElement> mainMenu=driver.findElements(By.cssSelector("#nav-xshop>a"));
		System.out.println("main menu option count: "+mainMenu.size());
		
		for(int i=0;i<mainMenu.size();i++) {
			if(mainMenu.get(i).isDisplayed()) {
				System.out.println(mainMenu.get(i).getText());
			}else {
				System.out.println("with innerHTML attribute: "+mainMenu.get(i).getAttribute("innerHTML"));
			}
		}

	}

}
