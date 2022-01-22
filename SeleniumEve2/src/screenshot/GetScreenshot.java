package screenshot;



import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import reusables.Utils;
import utilites.SeleniumUtils;

public class GetScreenshot extends SeleniumUtils{

	@Test
	public void getScreenShot() {
		WebDriver driver=setUp("chrome", "https://www.google.com");
//		TakesScreenshot ts=(TakesScreenshot)driver;
//		File file=ts.getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(file,new File("./screenshots/GoogleSearchPage.jpg"));
		Utils.getScreenShot(driver, "./screenshots/GoogleSearchPage2.png");
	}

}
