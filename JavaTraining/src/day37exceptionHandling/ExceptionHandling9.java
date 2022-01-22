package day37exceptionHandling;

//exception occurs and handled 
public class ExceptionHandling9 {
	public static void main(String args[]) {

		try {
			System.out.println("Inside try block");
			// below code throws divide by zero exception
			int data = 25 / 5;
			System.out.println(data);
			//System.exit(0);
		}
		// handles the Arithmetic Exception / Divide by zero exception
		catch (Exception e) {
			System.out.println("Exception handled");
			System.out.println(e);
		}
		// executes regardless of exception occured or not
		finally {
			System.out.println("finally block is always executed");
		}
		System.out.println("rest of the code...");
	}
}