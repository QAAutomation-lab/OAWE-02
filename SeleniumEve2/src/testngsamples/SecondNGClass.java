package testngsamples;

import org.testng.annotations.Test;

public class SecondNGClass {

	@Test
	public void draft() {
		System.out.println("draft successfull");
	}
	@Test
	public void login() {
		System.out.println("Login successfull");
	}
	@Test
	public void signUp() {
		System.out.println("signup successfull");
		System.out.println(getReverse(new StringBuffer("Bangalore")));
	}
	@Test
	public void compose() {
		System.out.println("compose successfull");
	}
	
	StringBuffer getReverse(StringBuffer sb) {
		return sb.reverse();
	}
}
