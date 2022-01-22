package day20Opps;
/**
 * 
 * A method can't be declared with 'abstract final' keyword
 */

abstract class Beta{
	// abstract says you should/must override and provide method body 
	// but final says you can't override once a method is declared as final
	abstract final void demo();// invalid combination for method declaration
}
public class AbstractFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
