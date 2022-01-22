package testngPrograms;

import org.testng.annotations.Test;

public class LoginTestCase {
  @Test
  public void loginWithValidUser() {
	  System.out.println("loginWithValidUser");
  }
  @Test
  public void loginWithInValidUser() {
	  System.out.println("loginWithInValidUser");
  }
  @Test
  public void loginWithEmpty() {
	  System.out.println("loginWithEmpty");
  }
}
