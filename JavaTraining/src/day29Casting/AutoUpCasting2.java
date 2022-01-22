package day29Casting;

class Star {
	void test1() {
		System.out.println("Class-A_Running test1()");
	}
}
class Moon extends Star {
	void test2() {
		System.out.println("Class-B_Running test2()");
	}
}
class Sun extends Moon {
	void test3() {
		System.out.println("Class-C_Running test3()");
	}
}
public class AutoUpCasting2 {
	public static void main(String[] args) {
		System.out.println("Program starts");
//		System.out.println("***********Sun Class**************");
//		Sun s1=new Sun();
//		s1.test1();
//		s1.test2();
//		s1.test3();
//		System.out.println("***********Moon Class**************");
//		Moon m1=new Moon();
//		m1.test1();
//		m1.test2();
//		System.out.println("***********Star Class**************");
//		Star t1=new Star();
//		t1.test1();	
		
			
		Moon obj1=new Sun();//implicit upcasting or auto upcasting
		obj1.test1();
		obj1.test2();
		
		Moon obj2=(Moon)new Sun();//explicit upcasting
		obj2.test1();
		obj2.test2();
		
		Sun s2=new Sun();//explicit upcasting
		Moon obj3=(Moon)s2;
		obj3.test1();
		obj3.test2();
	
		System.out.println("Program ends");

	}
}
