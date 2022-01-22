package testngPrograms;

import org.testng.annotations.Test;

public class LoginTestCaseWithTimeOut {
  @Test(timeOut=2000)
  public void loginWithValidUser() throws InterruptedException {
	  Thread.sleep(3000);
	  System.out.println("I am passed");
  }
  
  @Test(timeOut=2000)
  public void loginWithInValidUser() throws InterruptedException {
	  Thread.sleep(1000);
	  System.out.println("I am passed");
  }
}
