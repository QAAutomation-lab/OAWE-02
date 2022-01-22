package day40Collection;

import java.util.ArrayList;
import java.util.List;

public class ListExample extends Object{

	public static void main(String[] args) {
		
		ArrayList a1=new ArrayList();
		// creating an object of ArrayList and upcasting it to List interface
		List l1 =  new ArrayList();
		//In collection we can store only Object class object
		a1.add("Pune");// String object "Pune" will be upcasting to Object class object
		// int will be boxed(wrapper class) to Integer class object and dn that object will be upcasted to Object class object
		a1.add(123);
		/**
		 * java compiler will perform below action at compile time
		 	Integer intobj=new Integer(123);//boxing operation to get Integer class object
			Object obj4=intobj;// auto-upcasting Integer class object to Object class object
		 */
		a1.add(true);//boxing and dn autoupcasting
		a1.add(null);
		a1.add("Pune");
		System.out.println("size of list: "+a1.size());
		System.out.println("Elements of list: "+a1);		
		a1.add(1, "Mumbai");
		System.out.println("size of list: "+a1.size());
		System.out.println("Elements of list: "+a1);
		
		System.out.println("index specific element: "+a1.get(2));
		/*printing one by one element of an ArrayList using for loop*/
		for(int i=0;i<a1.size();i++) {
			System.out.println("Element at index: "+i+": "+a1.get(i));
		}
		
		for(Object obj:a1) {
			System.out.println(obj);
		}
		
		
	}

}
