package handlingmultipleElements;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GsmArena {

	public static void main(String[] args) {
		//Step1: open browser
		System.setProperty("webdriver.chrome.driver","./executables/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//full screen browser 
		driver.manage().window().maximize();
		/**Step2: enter required URL */
		driver.get("https://www.gsmarena.com/");
		//implicit wait: Interface->Interface->Interface->abstract method*/
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//driver.findElement(By.cssSelector(".brandmenu-v2>ul>li:first-child>a")).click();
		List<WebElement> mobiles=driver.findElements(By.cssSelector(".brandmenu-v2>ul>li>a"));
		System.out.println(mobiles.size());
		//mobiles.get(0).click();
		for(int i=0;i<mobiles.size();i++) {
			mobiles=driver.findElements(By.cssSelector(".brandmenu-v2>ul>li>a"));
			System.out.println(mobiles.get(i).getText());
			mobiles.get(i).click();			
		}
	}

}
