package assignments;

import static org.testng.Assert.assertThrows;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActitimeTask {

	WebDriver driver = null;

	public void setSleepTime(long time) {
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void createTaskAndVerify() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.id("container_tasks")).click();
		driver.findElement(By.xpath("//div[text()='Add New']")).click();
		driver.findElement(By.cssSelector(".item.createNewTasks")).click();
		setSleepTime(2000);
		List<WebElement> element = driver.findElements(
				By.xpath("//div[contains(text(),'Select Customer')]//following::div[@class='comboboxButton']"));
		element.get(0).click();
		List<WebElement> customerList = driver.findElements(By.xpath(
				"//div[div[contains(text(),'Select Customer')]]//tbody/tr[1]//div[@class='searchItemList']/div"));
		if (customerList.size() > 3) {
			customerList.get(2).click();
			// to avoid staleElement exception
			element = driver.findElements(
					By.xpath("//div[contains(text(),'Select Customer')]//following::div[@class='comboboxButton']"));
			element.get(1).click();
			List<WebElement> projectList = driver.findElements(By.xpath(
					"//div[div[contains(text(),'Select Customer')]]//tbody/tr[3]//div[@class='searchItemList']/div"));
			if (projectList.size() >= 4) {
				projectList.get(3).click();
			} else {
				driver.findElement(By.xpath("//body")).sendKeys(Keys.TAB);
				driver.findElement(By.xpath("(//input[@placeholder='Enter Project Name'])[2]"))
						.sendKeys("AutomationTesting");
			}
		} else {
			driver.findElement(
					By.xpath("//div[//div[contains(text(),'Select Customer')]]//div[@class='searchItemList']/div[1]"))
					.click();
			driver.findElement(By.xpath("(//input[@placeholder='Enter Customer Name'])[2]")).sendKeys("AutomationUser");
			driver.findElement(By.xpath("(//input[@placeholder='Enter Project Name'])[2]"))
					.sendKeys("AutomationTesting");
		}
		driver.findElement(By.xpath("//input[@placeholder='Enter task name']")).sendKeys("AutomationTask");
		driver.findElement(By.xpath("//table[@class='createTasksTable']/tbody/tr[1]/td[5]")).click();
		driver.findElement(By.xpath("//table[@class='createTasksTable']/tbody/tr[1]/td[5]//div[@class='typeOfWorkList']/div[3]")).click();
		driver.findElement(By.xpath("//div[text()='Create Tasks']")).click();
		setSleepTime(2000);
		// verified created task
		List<WebElement> taskNameList = driver.findElements(By.cssSelector(".taskRow .title"));
		for (int i = 0; i < taskNameList.size(); i++) {
			String newTaskName = taskNameList.get(i).getText();
			if (newTaskName.equals("AutomationTask")) {
				System.out.println("Created task present:" + i + " " + newTaskName);
			}
		}
	}

	@Test
	public void deleteTaskAndVerify() {
		// verified created task
		List<WebElement> taskNameList = driver.findElements(By.cssSelector(".taskRow .title"));
		for (int i = 0; i < taskNameList.size(); i++) {
			String newTaskName = taskNameList.get(i).getText();
			List<WebElement> taskCheckBoxs = driver.findElements(By.cssSelector(".taskRow .checkbox"));
			if (newTaskName.equals("AutomationTask")) {
				System.out.println("Matched Task names:" + i + " " + newTaskName);
				taskCheckBoxs.get(i).click();
				setSleepTime(2000);
				driver.findElement(By.xpath("//div[text()='Delete']")).click();
				driver.findElement(By.xpath("//span[text()='Delete permanently']")).click();
				System.out.println("Task deleted..");
			}
		}
		WebElement logoutLink = driver.findElement(By.linkText("Logout"));
		logoutLink.click();
		driver.close();
	}
}
