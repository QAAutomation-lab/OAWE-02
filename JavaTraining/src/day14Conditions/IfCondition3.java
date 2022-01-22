package day14Conditions;
public class IfCondition3 {
	public static void main(String[] args) {
		// Creating two variables for age and weight
		int age = 20;
		int weight = 40;
		// applying condition on age and weight
		if (age >= 18) {
			if (weight > 50) {
				System.out.println("You are eligible to donate blood");
			} else {
				System.out.println("You are not eligible to donate blood");
			}
		}
//		char c1='a';
//		if(c1=='a' || c1=='e'||c1=='i'||c1=='o'||c1=='u') {
//			System.out.println("vowels");
//		}else {
//			System.out.println("not vowels");
//		}
		checkVowels('a');
		checkVowels('t');
	}
	static void checkVowels(char c1) {
		if(c1=='a' || c1=='e'||c1=='i'||c1=='o'||c1=='u') {
			System.out.println("vowels");
		}else {
			System.out.println("not vowels");
		}
	}
}