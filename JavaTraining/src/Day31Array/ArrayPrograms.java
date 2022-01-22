package Day31Array;

public class ArrayPrograms {
	public static void main(String[] args) {
		int ar[]= {1,2,5,2,3,5};
		System.out.println(" elements");
		for(int i =0;i<ar.length;i++) {
			int j;
			for(j=0;j<i;j++) {
				if(ar[i]==ar[j]) {
					break;
				}
			}
			if(i==j) {
				System.out.print(ar[i]+" ");
			}
		}
	}
	
	static void dupElement() {
		int ar[]= {1,2,5,2,3,5};
		System.out.println("Dup elements");
		for(int i =0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]==ar[j]) {
					System.out.println(ar[i]);
				}
			}
		}
	}
	
	static void leftRotateArray() {
		int[] ar= {1,2,3,4,5};
		 int numberOfRotation=2;
		 System.out.println("Before rotate....");
		 for(int i=0;i<ar.length;i++) {
			 System.out.print(ar[i]+", ");
		 }
		 
		 for(int i=0;i<numberOfRotation;i++) {
			 int j, first;
			 first=ar[0];
			 
			 for( j=0;j<ar.length-1;j++) {
				 ar[j]=ar[j+1];
			 }
			 ar[j]=first;
		 }
		 System.out.println("\nAfter rotate...");
		 for(int i=0;i<ar.length;i++) {
			 System.out.print(ar[i]+", ");
		 }
	}
}
