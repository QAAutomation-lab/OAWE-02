package Day32PredefinedClasses;

public class UnBoxingOperation2 {

	public static void main(String[] args) {
	
		//Double doubleObj=new Double(25.2566);//explicit boxing
		Double doubleObj=25.2566;//implicit boxing
		System.out.println("doubleObj: "+doubleObj);
		
		double salary=doubleObj.doubleValue();
		System.out.println(salary);
		
		System.out.println(doubleObj==salary);
		
		Integer obj=new Integer(5);
		System.out.println("Object: "+obj);
		
		int num=obj.intValue();
		System.out.println(num);
	}
}
