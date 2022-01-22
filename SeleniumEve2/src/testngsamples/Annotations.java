package testngsamples;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	
	/**
	 * Behalf of all the @Test annotation method executes only once either in the starting or in the end of all the TCs
	 */
	@BeforeTest
	public void setUp() {
		System.out.println("Open browser and login into application");
	}
	@Test
	public void taskCreation() {
		System.out.println("Create new task");
		
	}
	@Test
	public void taskDeletion() {
		System.out.println("Delete new task");
		
	}
	@AfterTest
	public void cleanUp() {
		System.out.println("logout and close browser");
	}
}
