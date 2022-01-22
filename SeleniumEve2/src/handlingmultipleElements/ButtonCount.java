package handlingmultipleElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonCount {

	public static void main(String[] args) throws InterruptedException {
		//Step1: open browser
		System.setProperty("webdriver.chrome.driver","./executables/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//full screen browser 
		driver.manage().window().maximize();
		/**Step2: enter required URL */
		driver.get("http://demo.automationtesting.in/Register.html");
		//implicit wait: Interface->Interface->Interface->abstract method*/
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(2000);
		
		WebElement signupBtn=driver.findElement(By.name("signup"));
		System.out.println(signupBtn.isDisplayed()+ " : "+signupBtn.isEnabled());
		/**
		 * <tagname> innertext </tagname>
		 * <button type="submit" class="btn btn-primary" name="signup"> Submit </button>
		 * 
		 * to fetch innertext from HTML. first identify the webelement dn use getText() of selenium to fetch it
		 */
		System.out.println("Button Name: "+signupBtn.getText());
		
		/**
		 * <button type="submit" class="btn btn-primary" name="signup"> Submit </button>
		 * getAttribute("attribute_name")- first identify the webelement dn we can user getAttribute("",) 
		 * to get the html attribute value based on attribute name
		 */
		System.out.println("name attribute value: "+signupBtn.getAttribute("name"));
		System.out.println("class attribute value: "+signupBtn.getAttribute("class"));
		System.out.println("type attribute value: "+signupBtn.getAttribute("type"));
		
		/**
		 * findElements(By): to identify multiple elements from the web page and returns List<WebElement>
		 * if you want to count the identified element dn use size()
		 * if you want to get specific element from the list use get(index) by using passing the required element
		 * index number or use for loop to iterate all the list elements
		 */
		List<WebElement> buttons=driver.findElements(By.tagName("button"));
		System.out.println("Button count: "+buttons.size());
		for(int i=0;i<buttons.size();i++) {
			System.out.println(buttons.get(i).getAttribute("class"));
		}
	}
}
