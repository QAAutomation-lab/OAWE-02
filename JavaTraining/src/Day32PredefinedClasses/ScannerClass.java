package Day32PredefinedClasses;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {

//		int age=10;
//		double salary=2566.36;
//		String name="Pune";

		// Object creation of Scanner class
		Scanner scnRef = new Scanner(System.in);
		int age;
		double salary;
		String name;
		boolean valid;
		/* Initialization of variable using Scanner class */
		System.out.println("Get age value from console");
		age = scnRef.nextInt();
		System.out.println("Get salary value from console");
		salary = scnRef.nextDouble();
		System.out.println("Get name value from console");
		name = scnRef.next();
		System.out.println("Enter true/false value from console");
		valid = scnRef.nextBoolean();

		System.out.println("age: " + age);
		System.out.println("salary: " + salary);
		System.out.println("name: " + name);
		System.out.println("valid: " + valid);
		int num1, num2;
		System.out.println("Enter num1: ");
		num1 = scnRef.nextInt();
		System.out.println("Enter num2: ");
		num2 = scnRef.nextInt();
		char op;
		System.out.println("Enter op: ");
		op = scnRef.next().charAt(0);
		System.out.println("Addition of two numbers: " + addNumber(op, num1, num2));
		System.out.println("*****************************************");
	}

	static int addNumber(char op, int num1, int num2) {
		if (op == '+') {
			return num1 + num2;
		} else if (op == '-') {
			return num1 - num2;
		} else if (op == '/') {
			return num1 / num2;
		} else if(op=='*') {
			return num1*num2;
			}
		return 0;
	}

}
