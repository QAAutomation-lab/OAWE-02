package testngPrograms;

import org.testng.annotations.Test;

public class AllAttributesInOne {
	 @Test(description="TC1: Login with valid user",priority=0,enabled=true,timeOut=2000)
	  public void loginWithValidUser() {
		  int i=10/2;
		  System.out.println("Login successfully...");
	  }
	  @Test(description="TC2: Create new task",dependsOnMethods="loginWithValidUser",priority=1,enabled=false,timeOut=2000)
	  public void createTask()  {
		  System.out.println("Task created successfully....");
	  }
}
