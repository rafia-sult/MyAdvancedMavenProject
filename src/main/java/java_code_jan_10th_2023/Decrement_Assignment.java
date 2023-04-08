package java_code_jan_10th_2023;

public class Decrement_Assignment {

	public static void main(String[] args) {
		int i = 5; // 5 changes to 4 
		int j = --i; // 4
		
		System.out.println("line 7 i is:" + i);
		System.out.println("line 7 j is:" + j);
		
		int k = j-- - j--; // j is now 3 - 2 that means k is 1 
		System.out.println("at line 12 k is: " + k);
		System.out.println("at line 12 j is: " + j);
		
		// latest value of i = 4
		// latest value of j = 2
		// latest value of k = 1
		
		int l = --i - i-- + i-- - j--; // i is now 3 - 3  +  2 - 2, l is 0  
		
		System.out.println("at line 17 l is: " + l);
		
		System.out.println("The new values of the variables are: ");
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);
		

	}

}
