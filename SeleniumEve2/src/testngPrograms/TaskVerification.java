package testngPrograms;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TaskVerification {
	WebDriver driver;
	Actions action;

	@Test(priority = 0)
	public void openBroserAndLogin() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		action = new Actions(driver);
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();

		driver.findElement(By.id("container_tasks")).click();

		List<WebElement> taskNameList = driver.findElements(By.cssSelector(".taskRow .title"));
		for (int i = 0; i < taskNameList.size(); i++) {
			String taskName = taskNameList.get(i).getText();
			List<WebElement> taskCheckBoxs = driver.findElements(By.cssSelector(".taskRow .checkbox"));
			if (taskName.equals("3D modelling")) {
				System.out.println("Matched Task names:" + i + " " + taskName);
				taskCheckBoxs.get(i).click();
				driver.findElement(By.xpath("//div[text()='Change Status']")).click();
				driver.findElement(
						By.xpath("//div[div[text()='New Status:']]//div[contains(@class,'workflowStatus ')]")).click();
				driver.findElement(By.xpath("(//div[text()='OPEN TASKS'])[2]//following::div[text()='In Progress']"))
						.click();
				driver.findElement(By.xpath("//span[text()='Apply']")).click();
				break;
			} else {
				System.out.println("Task names:" + i + " " + taskName);
			}
		}
	}

	@Test
	public void taskCreate() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		driver.findElement(By.id("container_tasks")).click();
		driver.findElement(By.xpath("//div[text()='Add New']")).click();
		driver.findElement(By.cssSelector(".item.createNewTasks")).click();
		Thread.sleep(2000);
		List<WebElement> element = driver.findElements(
				By.xpath("//div[contains(text(),'Select Customer')]//following::div[@class='comboboxButton']"));
		element.get(0).click();
		driver.findElement(
				By.xpath("//div[//div[contains(text(),'Select Customer')]]//div[@class='searchItemList']/div[3]"))
				.click();
		Thread.sleep(2000);
		// to avoid staleelement exception
		element = driver.findElements(
				By.xpath("//div[contains(text(),'Select Customer')]//following::div[@class='comboboxButton']"));
		element.get(1).click();
		driver.findElement(By.xpath(
				"//div[div[text()='Select Customer and Project to Add Tasks for']]//div[@class='searchItemList']/div[4]"))
				.click();
		driver.findElement(By.xpath("//input[@placeholder='Enter task name']")).sendKeys("Testing110");
		driver.findElement(By.xpath("//table[@class='createTasksTable']/tbody/tr[1]/td[5]")).click();
		driver.findElement(By.xpath("//table[@class='createTasksTable']/tbody/tr[1]/td[5]//div[text()='ann']")).click();
		driver.findElement(By.xpath("//div[text()='Create Tasks']")).click();
		Thread.sleep(2000);
		// verified created task
		List<WebElement> taskNameList = driver.findElements(By.cssSelector(".taskRow .title"));
		for (int i = 0; i < taskNameList.size(); i++) {
			String taskName = taskNameList.get(i).getText();
			if (taskName.equals("Testing110")) {
				System.out.println("Created task present:" + i + " " + taskName);
				break;
			}
		}
		// delete created task
		taskNameList = driver.findElements(By.cssSelector(".taskRow .title"));
		for (int i = 0; i < taskNameList.size(); i++) {
			String taskName = taskNameList.get(i).getText();
			List<WebElement> taskCheckBoxs = driver.findElements(By.cssSelector(".taskRow .checkbox"));
			if (taskName.equals("Testing110")) {
				System.out.println("Matched Task names:" + i + " " + taskName);
				taskCheckBoxs.get(i).click();
				driver.findElement(By.xpath("//div[text()='Delete']")).click();
				driver.findElement(By.xpath("//span[text()='Delete permanently']")).click();
				break;
			}
		}
		// verified task deleted
		taskNameList = driver.findElements(By.cssSelector(".taskRow .title"));
		for (int i = 0; i < taskNameList.size(); i++) {
			String taskName = taskNameList.get(i).getText();
			if (!taskName.equals("Testing110")) {
				System.out.println("Task name" + i + " " + taskName);
			} else {
				System.out.println("task is not deleted yet");
			}
		}
	}
}
