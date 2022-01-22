package Day31Array;
class Pune{
	int salary;
	void deccan() {
		System.out.println("I am in Pune");
	}
}
class Maharastra extends Pune{
	void display() {
		System.out.println("IT Citi");
	}
}
public class DemoArray extends Maharastra{

	void call() {
		System.out.println("Calling......");
	}
	public static void main(String[] args) {
		
		Pune obj[]=new Pune[3];
		obj[0]=new Pune();
		obj[1]=new Pune();
		obj[2]=new Pune();
		
		obj[0].salary=25000;
		System.out.println(obj[0].salary);
		obj[0].deccan();
		
		obj[1].salary=45000;
		System.out.println(obj[1].salary);
		obj[1].deccan();

		System.out.println(obj[2].salary);
		obj[2].deccan();
				//or
		Pune p1=new Pune();
		p1.salary=25000;
		System.out.println(p1.salary);
		p1.deccan();
		
		Pune p2=new Pune();
		p2.salary=45000;
		System.out.println(p2.salary);
		p2.deccan();
		
		Pune p3=new Pune();
		System.out.println(p3.salary);
		p3.deccan();
	}
}
