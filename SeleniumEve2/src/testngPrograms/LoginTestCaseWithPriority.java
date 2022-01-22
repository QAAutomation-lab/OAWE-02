package testngPrograms;

import org.testng.annotations.Test;

public class LoginTestCaseWithPriority {  
  @Test(priority=0)
  public void loginWithValidUser() {
	  System.out.println("loginWithValidUser");
  }
  @Test(priority=1)
  public void loginWithInValidUser() {
	  System.out.println("loginWithInValidUser");
  }
  @Test(priority=2)
  public void loginWithEmpty() {
	  System.out.println("loginWithEmpty");
  }
}
