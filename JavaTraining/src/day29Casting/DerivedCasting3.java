package day29Casting;
//Base Class
class JD {
	public void printMe1() {
		System.out.println("JournalDev print method");
	}
	void disp() {
		System.out.println("JournalDev disp method");
	}
}
//Inherited class
class Java extends JD {
	public void printMe2() {
		System.out.println("Java print method");
	}
	void disp() {
		System.out.println("Java disp method");
	}
}
//Inherited class
class Android extends Java {
	public void printMe3() {
		System.out.println("Android print method");
	}
	void disp() {
		System.out.println("Android disp method");
	}
}
public class DerivedCasting3 {
	public static void main(String[] args) {		
		JD j1=new Android();//implicit upcasting
		j1.printMe1();
		j1.disp();//Android
		System.out.println("************************");
		Java j2=(Java)j1;//downcasting
		j2.printMe1();
		j2.printMe2();
		j2.disp();//Java
		System.out.println("************************");
		Android a1=(Android)j1;//downcasting
		a1.printMe1();
		a1.printMe2();
		a1.printMe3();
		a1.disp();	//Android
	}
}
