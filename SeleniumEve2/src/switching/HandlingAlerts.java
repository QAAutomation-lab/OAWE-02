package switching;

import javax.swing.plaf.synth.SynthSpinnerUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import utilites.SeleniumUtils;

public class HandlingAlerts extends SeleniumUtils {
	static WebDriver driver;

	@Test
	public void testAlerts() throws InterruptedException {
		driver = setUp("chrome", "https://demoqa.com/alerts");

//		// to open alert popup
//		driver.findElement(By.id("alertButton")).click();
//		Thread.sleep(2000);
//		// switch your control to alert popup
//		String alertText = driver.switchTo().alert().getText();
//		System.out.println("Alert Popup text: " + alertText);
//		// to accept alert or to click on ok or yes button use
//		driver.switchTo().alert().accept();
//
//		// to open confirmation popup
//		driver.findElement(By.id("confirmButton")).click();
//		Thread.sleep(2000);
//		// switch your control to confirmation popup
//		String confirmationPopupText = driver.switchTo().alert().getText();
//		System.out.println("confirmation Popup text: " + confirmationPopupText);
//		// to accept alert or to click on ok or yes button use
//		// driver.switchTo().alert().accept();
//		// to click on cancel or no button
//		driver.switchTo().alert().dismiss();
//
//		// to open prompt popup
//		driver.findElement(By.id("promtButton")).click();
//		Thread.sleep(2000);
//		// switch your control to prompt popup
//		// String promptPopupText=driver.switchTo().alert().getText();
//		// System.out.println("prompt Popup text: "+promptPopupText);
//		// or
//		System.out.println(driver.switchTo().alert().getText());
//		// type text in popup
//		driver.switchTo().alert().sendKeys("Selenium Testing");
//		// Thread.sleep(2000);
//		// to accept alert or to click on ok or yes button use
//		driver.switchTo().alert().accept();
//		// to click on cancel or no button
//		// driver.switchTo().alert().dismiss();

		handleAlertPopup("accept");
		Thread.sleep(2000);
		handleConfirmatioPopup("accept");
		Thread.sleep(2000);
		handlePromptPopup("accept");

	}

	void handlePromptPopup(String popupAction) {
		// to open prompt popup
		driver.findElement(By.id("promtButton")).click();
		// switch your control to prompt popup
		// String promptPopupText=driver.switchTo().alert().getText();
		// System.out.println("prompt Popup text: "+promptPopupText);
		// or
		System.out.println(driver.switchTo().alert().getText());
		// type text in popup
		driver.switchTo().alert().sendKeys("Selenium Testing");
		// to accept alert or to click on ok or yes button use
		if (popupAction.equals("accept")) {
			driver.switchTo().alert().accept();
		} else {
			driver.switchTo().alert().dismiss();
		}
	}

	void handleConfirmatioPopup(String popupAction) {
		// to open confirmation popup
		driver.findElement(By.id("confirmButton")).click();
		// switch your control to confirmation popup
		String confirmationPopupText = driver.switchTo().alert().getText();
		System.out.println("confirmation Popup text: " + confirmationPopupText);
		// to accept alert or to click on ok or yes button use
		if (popupAction.equals("accept")) {
			driver.switchTo().alert().accept();
		} else {
			driver.switchTo().alert().dismiss();
		}
	}

	void handleAlertPopup(String popupAction) {
		// to open alert popup
		driver.findElement(By.id("alertButton")).click();
		// switch your control to alert popup
		String alertText = driver.switchTo().alert().getText();
		System.out.println("Alert Popup text: " + alertText);
		// to accept alert or to click on ok or yes button use
		if (popupAction.equals("accept")) {
			driver.switchTo().alert().accept();
		} else {
			driver.switchTo().alert().dismiss();
		}
	}

}
