package Day32PredefinedClasses;

public class ObjectClass5{

	static int last_roll = 100;
	int roll_no;
	// Constructor
	ObjectClass5()
    {
        roll_no = last_roll;
        last_roll++;
    }
	// Driver code
	public static void main(String args[]) {
		ObjectClass5 s = new ObjectClass5();
		// Below two statements are equivalent
		System.out.println(s);
		System.out.println(s.hashCode());
		
		ObjectClass5 s1 = new ObjectClass5();
		// Below two statements are equivalent
		System.out.println(s1);
		System.out.println(s1.hashCode());
		//equals() is used to compare two objects based on address or hashcode
		System.out.println(s.equals(s1));
		
		ObjectClass5 s2=s1;
		System.out.println(s2.equals(s1));
	}
}
