package testngsamples;

import org.testng.annotations.Test;

public class ThirdNGClass {

	@Test(priority=3)
	public void draft() {
		System.out.println("draft successfull");
	}
	@Test(priority=1)
	public void login() {
		System.out.println("Login successfull");
	}
	@Test(priority=0)
	public void signUp() {
		System.out.println("signup successfull");
	}
	@Test(priority=2)
	public void compose() {
		System.out.println("compose successfull");
	}
}
