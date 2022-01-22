package day28Encapsulation;

class Student3 {
	// private data member
	private String collegeName="xyz";

	// getter method for college
	public void setCollegeName(String college) {
		this.collegeName = college;
	}
}
public class WriteOnly {

	public static void main(String[] args) {

		// creating instance of the encapsulated class
		Student3 s = new Student3();
		// getting value of the name member
		s.setCollegeName("RGIT");
		Student3 s1 = new Student3();
		System.out.println("Bye");
	}
}
