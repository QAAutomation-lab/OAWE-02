package day29Casting;
class Pune{
	String stateName="Maharastra";
	void display() {
		System.out.println("State: "+stateName);
	}
}
public class DerivedCasting extends Pune {
	int d=25;
	void call(Pune p1) //Pune p1=new Pune();// Pune p1=p2=new DerivedCasting()
	{
		System.out.println(p1.stateName);
		p1.display();
	}
	
	void call(int a) //int a=25;
	{
		System.out.println("age: "+a);
	}
	public static void main(String[] args) {

		Pune p2=new DerivedCasting();//implicit up-casting or auto up-casting
		System.out.println(p2.stateName);
		p2.display();
		System.out.println("************************************8");
		DerivedCasting d1=(DerivedCasting)p2;//downcasting
		System.out.println(d1.stateName);
		d1.display();
		d1.call(25);
			//or
		int x=25;
		d1.call(x);
			//or
		d1.call(d1.d);
		System.out.println("**************************************");
		d1.call(new Pune());
				//or
		d1.call(p2);
				//or
		d1.call(new DerivedCasting());
		
	}

}
