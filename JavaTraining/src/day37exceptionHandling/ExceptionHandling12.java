package day37exceptionHandling;

//Throwing UserDefinedException 
//class represents user-defined exception  
class UserDefinedException extends Exception {
	public UserDefinedException(String str) {
		// Calling constructor of parent Exception
		super(str);
	}
}
//Class that uses above MyException  
public class ExceptionHandling12 {
	public static void main(String args[]) {
		try {
			// throw an object of user defined exception
			throw new UserDefinedException("This is user-defined exception");
		} catch (UserDefinedException ude) {
			System.out.println("Caught the exception "+ude);
		}
		System.out.println("rest code...");
	}
}