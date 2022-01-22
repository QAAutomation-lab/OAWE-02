package Day32PredefinedClasses;
class Demo{
	void display() {
		System.out.println("I am display()..");
	}
}
public class ObjectClass extends Demo{
	static int last_roll = 100;
	int roll_no;
	// Constructor
	ObjectClass()
    {
        roll_no = last_roll;
        last_roll++;
    }
	// Driver code
	public static void main(String args[]) {
		ObjectClass refVar = new ObjectClass();
		//fullyqualified classname===> packagename.classname
		//						  ===> Day32PredefinedClasses.ObjectClass
		// Below two statements are equivalent
		System.out.println(refVar);//refVar.toString() -->string representation of an object ==> FullyQualifiedClassname@hexadecimal
		System.out.println(refVar.toString());//string representation of an object
		Demo d1=new Demo();
		System.out.println(d1);//
		Demo d3=new Demo();
		System.out.println(d3.toString());		
		Demo d2=new ObjectClass();
		System.out.println(d2);
	}

}
