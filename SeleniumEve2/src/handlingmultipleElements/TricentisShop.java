package handlingmultipleElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TricentisShop {

	public static void main(String[] args)throws InterruptedException {
		//Step1: open browser
		System.setProperty("webdriver.chrome.driver","./executables/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//full screen browser 
		driver.manage().window().maximize();
		/**Step2: enter required URL */
		driver.get("http://demowebshop.tricentis.com/");
		//implicit wait: Interface->Interface->Interface->abstract method*/
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		List<WebElement> catOptions=driver.findElements(By.cssSelector("div[class='block block-category-navigation']>div:nth-of-type(2)>ul>li>a"));
								//or
		//List<WebElement> catOptions=driver.findElements(By.cssSelector("div[class='block block-category-navigation'] ul>li>a"));
		System.out.println("Options count: "+catOptions.size());
		for(int i=0;i<catOptions.size();i++) {
			WebElement option=catOptions.get(i);
			System.out.println(option.getText());
					//or
			//System.out.println(catOptions.get(i).getText());
		}
	}

}
