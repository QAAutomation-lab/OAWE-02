package Day32PredefinedClasses;

public class count {

	static void getcount(String s1) {		
		char[] cArray=s1.toCharArray();
		int letter=0,space=0,num=0,other=0;
		for(int i=0;i<s1.length();i++) {
			if(Character.isLetter(cArray[i])) {
				letter++;
			}else if(Character.isDigit(cArray[i])) {
				num++;
			} else if(Character.isSpaceChar(cArray[i])) {
				space++;
			}else {
				other++;
			}
		}
		System.out.println("Letter: "+letter);
		System.out.println("Spaces: "+space);
		System.out.println("Numbers: "+num);
		System.out.println("Other: "+other);
	}
	public static void main(String[] args) {
	getcount("I am from pune, lives in Dhanori 411015. A-1#1003");

	}

}
