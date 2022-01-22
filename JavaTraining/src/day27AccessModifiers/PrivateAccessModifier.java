package day27AccessModifiers;

class A {
	private int data = 40;
	int getData() {
		System.out.println("Hello java");
		return data;
	}
}

public class PrivateAccessModifier {
	private static int accountNum=12345;
	public static void main(String args[]) {
		System.out.println(PrivateAccessModifier.accountNum);
		A obj = new A();
		//System.out.println(obj.data);// Compile Time Error
		System.out.println(obj.getData());
	}
}
