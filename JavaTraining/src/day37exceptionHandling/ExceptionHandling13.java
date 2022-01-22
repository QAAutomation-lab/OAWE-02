package day37exceptionHandling;

public class ExceptionHandling13 {

	    public static void main(String[] args) //throws InterruptedException
	    {
	    	System.out.println("program starts");
	        
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

	        System.out.println("Hello Geeks");
	    }
}