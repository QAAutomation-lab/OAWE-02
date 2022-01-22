package day28Encapsulation;

class Student2 {
	// private data member
	private String collegeName = "AKG";
	// getter method for college
	public String getCollegeName() {
		return collegeName;
	}
}

public class ReadOnly {

	public static void main(String[] args) {

		// creating instance of the encapsulated class
		Student2 s = new Student2();
		// getting value of the name member
		System.out.println(s.getCollegeName());
	}
}