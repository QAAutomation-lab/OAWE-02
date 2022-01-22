package Day32PredefinedClasses;
class Demo1223{
	//Rule1: constructor as private
	private Demo1223() {
		System.out.println("I am zero-param");
	}
	//Rule2: static instance
	static Demo1223 d1=new Demo1223();
	String name="Pune";
	//Rule3: static method with return type as class
	static Demo1223 getInstance() {
		return d1;
	}
	 void print() {
		 System.out.println("I am print() of Singleton class Demo1223 ");
	 }
}
public class SingletonClass2 {
	 int age=25;
	public static void main(String[] args) {
		SingletonClass2 s1=new SingletonClass2();
		System.out.println(s1.age);
		s1.age=30;
		System.out.println(s1.age);
		SingletonClass2 s2=new SingletonClass2();
		System.out.println(s2.age);
		//Demo1223 d1=new Demo1223();//compile time error due to singleton class concept
				//or
		Demo1223 obj1=Demo1223.getInstance();//getInstance()=d1=new Demo1223();
		obj1.print();
		System.out.println(obj1.name);//Pune
		obj1.name="Bangalore";
		System.out.println("obj1 ref: "+obj1.name);//Bangalore
		Demo1223 obj2=Demo1223.getInstance();//getInstance()=d1=new Demo1223();
		System.out.println("obj2 ref: "+obj2.name);//Bangalore
		System.out.println(obj1==obj2);//obj1 & obj2 both are pointing to same object
	}

}
