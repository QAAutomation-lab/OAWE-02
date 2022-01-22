package day26Pack2;

import day26Pack1.Modifiers;
import day26Pack1.PublicMembers;

public class AccessPublicMembers2 {

	public static void main(String[] args) {
		
		PublicMembers p1=new PublicMembers();
		System.out.println("Accessing Default members from another class outside package");
		System.out.println(p1.accNum);
		p1.displayAccNum();
		
		Modifiers m1=new Modifiers();
		System.out.println(m1.num4);
					//using fully qualified class name---> packagename.classname
//		day26Pack1.PublicMembers p1=new day26Pack1.PublicMembers();
//		System.out.println("Accessing Default members from another class outside package");
//		System.out.println(p1.accNum);
//		p1.displayAccNum();
//		
//		day26Pack1.Modifiers m1=new day26Pack1.Modifiers();
//		System.out.println(m1.num4);
		
		
	}
}
