package Day31Array;

class M_Array2 {
	public static void main(String args[]) {
		//declaring and initializing 2D array  
		int arr[][] = { { 1, 2, 3 }, { 4, 5 }, { 7,8,9,4} };
		//printing 2D array  
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		char[] charArr[]= {{'a','b'},{'e','c','d'},{'x','y','z'}};
		for (int i = 0; i < charArr.length; i++) {
			for (int j = 0; j < charArr[i].length; j++) {
				System.out.print(charArr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
