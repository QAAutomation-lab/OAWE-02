package keyboardMouseOps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardOp {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
	WebDriver driver =new ChromeDriver();
	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.gsmarena.com/samsung-phones-9.php");
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//body")).sendKeys(Keys.PAGE_DOWN);
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//body")).sendKeys(Keys.PAGE_DOWN);
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//body")).sendKeys(Keys.PAGE_DOWN);
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//body")).sendKeys(Keys.PAGE_DOWN);
		//press control+end button to reach end of the page
		driver.findElement(By.xpath("//body")).sendKeys(Keys.chord(Keys.CONTROL,Keys.END));
	}
}
