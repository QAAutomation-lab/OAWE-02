package testngPrograms;

import org.testng.annotations.Test;

public class LoginTestCaseWithDescription {
	  @Test(description="TC1: Login with valid user")
	  public void loginWithValidUser() {
		  System.out.println("loginWithValidUser");
	  }
	  @Test(description="TC2: Login with invalid user")
	  public void loginWithInValidUser() {
		  System.out.println("loginWithInValidUser");
	  }
	  @Test(description="TC3: Login with empty user")
	  public void loginWithEmpty() {
		  System.out.println("loginWithEmpty");
	  }
}
