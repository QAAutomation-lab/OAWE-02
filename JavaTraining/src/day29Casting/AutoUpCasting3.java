package day29Casting;

class Star1 {
	void test1() {
		System.out.println("Class-A_Running test1()");
	}
}
class Moon1 extends Star1 {
	void test2() {
		System.out.println("Class-B_Running test2()");
	}
}
class Sun1 extends Moon1 {
	void test3() {
		System.out.println("Class-C_Running test3()");
	}
}
public class AutoUpCasting3 {
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
		
		Sun st=new Sun();
		st.test1();
		st.test2();
		st.test3();
		
		Moon mt=(Moon)st;//test3() will be hidden for mt,explicit ===> Moon mt= st;//implicit
		mt.test1();
		mt.test2();
		
		Star sr=st;//test2() & test3() will hidden for sr
		sr.test1();

		System.out.println("Program ends");
	}
}
