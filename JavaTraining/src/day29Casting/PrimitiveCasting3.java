package day29Casting;

public class PrimitiveCasting3 {

	public static void main(String[] args) {

		double myDouble = 9.78d;
		int myInt = (int) myDouble; // Manual casting: double to int

		System.out.println(myDouble); // Outputs 9.78
		System.out.println(myInt); // Outputs 9
		
		char c='a';
		double d=c;
		System.out.println(d);
	}

}
