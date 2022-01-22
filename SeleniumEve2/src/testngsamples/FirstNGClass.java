package testngsamples;

import org.testng.annotations.Test;

public class FirstNGClass {
  @Test
  public void testCase100() {
	  System.out.println("TC100 is running");
  }
  
  @Test
  public void testCase101() {
	  int res=100/0;
	  System.out.println("TC101 is running");
	
  }
  
  @Test
  public void testCase102() {
	  System.out.println("TC102 is running");
  }
  @Test
  public void testCase103() {
	  System.out.println("TC103 is running");
  }
}
