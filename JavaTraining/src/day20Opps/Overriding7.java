package day20Opps;

//final methods cannot be overridden
class Parent3 {
	// Can't be overridden
	final void show() {
		System.out.println("I am final method of Parents class");
	}
}
class Child3 extends Parent3 {
	// This would produce error
	void show() {
		System.out.println("I am show method of child3 class");
	}
}
// Driver class
class Overriding67 {
	public static void main(String[] args) {

	}
}