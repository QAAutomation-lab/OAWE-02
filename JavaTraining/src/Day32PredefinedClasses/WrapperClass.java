package Day32PredefinedClasses;

public class WrapperClass {
	WrapperClass(int age){
		
	}
	public static void main(String[] args) {
		
		WrapperClass w1=new WrapperClass(50);
		System.out.println(w1);
		int a=20;  
		/*
		 * In all the wrapper classes toString() will be overrided, Converting int into Integer  
		 */
		//Boxing operations
		Integer k=new Integer(a);//converting int into Integer object explicitly
		Integer l=new Integer(20);//converting int into Integer object explicitly
		Integer j=a;//autoboxing, now compiler will write Integer.valueOf(a) internally ==> new Integer(a);
		System.out.println("a: "+a+"\nk: "+k+"\nl: "+l+"\nj: "+j);  

		System.out.println("***Unboxing of boxed object*****");
		//Converting Integer to int    
		Integer a1=new Integer(3);  //boxing operation 
		int i1=a1.intValue();//converting Integer to int explicitly, unboxing 
		System.out.println("a1: "+a1+"\ni1: "+i1);   
		System.out.println((a1==i1));//
		System.out.println(a1.equals(i1));//
		
		Boolean b=new Boolean(true);//boxing
		boolean b1=b.booleanValue();
		System.out.println(b==b1);
		System.out.println(b.equals(b1));
	}

}
