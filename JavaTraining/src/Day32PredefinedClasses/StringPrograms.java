package Day32PredefinedClasses;

public class StringPrograms {

	public  static void main(String[] args) {
//		String str1="Pune".toLowerCase();//output: enuPironahD
//		String temp="";
//		//to print one by one character of string
//		for(int i=str1.length()-1;i>=0;i--) {
//			temp=temp+str1.charAt(i);
//		}
//
//		System.out.println("Actaul String: "+str1);
//		System.out.println("Reverse String: "+temp);
//		if(str1.equals(temp)) {
//			System.out.println("given string is palin");
//		}else {
//			System.out.println("not palin");
//		}
		checkPalin("nayan1");
	}
	
	public static void checkPalin(String s1) {
		String str1=s1.toLowerCase();//output: enuPironahD
		String temp="";
		//to print one by one character of string
		for(int i=str1.length()-1;i>=0;i--) {
			temp=temp+str1.charAt(i);
		}

		System.out.println("Actaul String: "+str1);
		System.out.println("Reverse String: "+temp);
		if(str1.equals(temp)) {
			System.out.println("given string is palin");
		}else {
			System.out.println("not palin");
		}
	}
}
