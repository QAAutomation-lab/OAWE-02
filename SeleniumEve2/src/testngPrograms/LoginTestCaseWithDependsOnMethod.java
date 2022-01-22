package testngPrograms;

import org.testng.annotations.Test;

public class LoginTestCaseWithDependsOnMethod {
  @Test
  public void loginWithValidUser() {
	  int i=10/0;
	  System.out.println("Login successfully...");
  }
  @Test(dependsOnMethods="loginWithValidUser")
  public void createTask()  {
	  System.out.println("Task created successfully....");
  }
}
