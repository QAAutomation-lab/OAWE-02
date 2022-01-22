package Day32PredefinedClasses;

final class SamplePrint {

	void display(int i) {
		System.out.println("display() of SamplePrint class, i:" + i);
	}
}

public class PrintlnMethod {

	static SamplePrint s1 = new SamplePrint();

	public static void main(String[] args) {
//final_class.static_ref_variable.public_method
		System.out.println("Hello");
//final_class.static_ref_variable.public_method			
		PrintlnMethod.s1.display(10);
		
		SamplePrint s2 = new SamplePrint();
		s2.display(25);
	}
}
