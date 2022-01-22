package day40Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample1 {
	public static void main(String args[]) {

		ArrayList list = new ArrayList();// Creating arraylist
		list.add("Mango");// auto-upcasting from String to Object class object
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");
		// Printing the arraylist object
		System.out.println("size of list: " + list.size());
		System.out.println("Elements of list: " + list);
		System.out.println("Print the element present in index 0: "+list.get(0));
		System.out.println("Traversing list through for loop:");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("Traversing list through for-each loop:");
		// Traversing list through for-each loop
		for (Object fruit : list) {
			System.out.println(fruit);
		}
		// accessing the element
		System.out.println("Returning element: " + list.get(1));// it will return the 2nd element, because index starts
																// from 0
		// changing the element
		list.set(1, "Dates");
		System.out.println("size of list: " + list.size());
		System.out.println("Elements of list: " + list);//Mongo, Dates,Banana, Grapes
		
		list.add(2, "Color");
		System.out.println("Elements of list: " + list);//Mongo, Dates,Color,Banana, Grapes
		
		System.out.println("Color is present in list or not: "+list.contains("Color"));
		
		System.out.println("Index of Banana in list: "+list.indexOf("Banana"));
		
		System.out.println("Is list empty? "+list.isEmpty());
		////Mongo, Dates,Color,Banana, Grapes
		System.out.println("Object removed from index 2 is : "+list.remove(2));//Color
		System.out.println("Banana Object removed from list : "+list.remove("Banana"));//true
		System.out.println("Before sorting, Elements of list: " + list);
		// Sorting the list //Mongo, Dates, Grapes ==>Dates, Grapes,Mango
		Collections.sort(list);//by default it sort the passed collection element in assending order and store it in the same collection
		System.out.println("size of list: " + list.size());
		System.out.println("After sorting, Elements of list: " + list);

		System.out.println("Traversing list through forEach() method:");
		// The forEach() method is a new feature, introduced in Java 8.
		list.forEach(a -> { // Here, we are using lambda expression
			System.out.println(a);
		});
		
		System.out.println("Traversing list through Iterator interface:");
		Iterator itr = list.iterator();
		/**
		 * List element: [Banana, Dates, Grapes, Mango]
		 * Iterator is a Interface in collection, which is used to iterate collection elements
		 * Iterator interface has following method to iterate collection elements
		 * 1. hasNext() ---> boolean --> true next element is present, false no next element
		 * 2. next() ---> Object --> it will return next element from collection
		 * 3. remove() --> void --> element deletion
		 * Iterator object can be use to iterate a collection only once, for 2nd iteration create new Iterator object
		 */
//		System.out.println(itr.hasNext());
//		System.out.println(itr.next());//Dates
//		System.out.println(itr.next());//Grapes
//		System.out.println(itr.next());//Mango
//		System.out.println(itr.next());//NoSuchElementException exception
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(itr.hasNext());//
		//for 2nd iteration we need to create new instance for Iterator interface
		System.out.println("***************************************");
		Iterator itr2=list.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}
}
