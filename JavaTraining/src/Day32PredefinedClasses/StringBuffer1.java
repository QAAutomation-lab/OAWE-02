package Day32PredefinedClasses;

public class StringBuffer1 {

	public static void main(String[] args) {

		StringBuffer sb=new StringBuffer("Hello "); 
		System.out.println("Original StringBuffer value: "+sb);//Hello 
		sb.append("Java");//now original string is changed  
		System.out.println(sb);//Hello Java  
		
		sb.insert(5,"Pune");//now original string is changed  
		System.out.println(sb);//  
		
		sb.replace(1,3,"XXX"); //
		System.out.println(sb);//prints   
		
		sb.delete(1,4);  //
		System.out.println(sb);//
		
		StringBuffer s1=new StringBuffer("Bangalore is known for IT");
		s1.reverse();  
		System.out.println(s1);//
		System.out.println("*********************************************");
		StringBuffer s2=new StringBuffer();
		System.out.println(s2.capacity());//default 16  
		s2.append("Hello");  
		System.out.println(s2.capacity());//now 16  
		s2.append("java is my favourite language");  
		System.out.println(s2.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2  
		s2.append("I am from automation area");  
		System.out.println(s2.capacity());//now (34*2)+2=70 i.e (oldcapacity*2)+2
	}
}
