package testngPrograms;

import org.testng.annotations.Test;

public class LoginTestCaseWithEnable {
  @Test(enabled=true)
  public void loginWithValidUser() {
	  System.out.println("Login successfully...");
  }
  @Test(enabled=false)
  public void createTask()  {
	  System.out.println("Task created successfully....");
  }
}
