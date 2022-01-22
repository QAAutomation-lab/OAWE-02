package day20Opps;
/**
 * Interface: 
 * 		1. In java we can't achieve "multiple" inheritance using classes but this can be overcome by using interface
 *		2. Interface is 100% abstract
 *		3. Interface contains:	
 *				a. variable : by default public static final
 *				b. method   : by default public abstract	
 *      4. When a interface is getting inherited by a sub-class dn sub-class will use "implements" keyword to represent 
 *         inheritance
 *      5. When a interface is getting inherited by a sub-class dn sub-class should be/must be overriding all the abstract
 *         method of interface otherwise sub-class become abstract.
 */ 
public interface DemoInterface {
	int age=25;// public static final int age=25;
	void display();// public abstract void display();
}
class Demo13 implements DemoInterface{
	
	public void display() {
		System.out.println("hello");
	}
	public static void main(String[] args) {
		Demo13 d1=new Demo13();
		d1.display();
		
	}
}
