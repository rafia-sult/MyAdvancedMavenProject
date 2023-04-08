package java_code_jan_10th_2023;

public class Increment_Assignment {

	public static void main(String[] args) {
		int i = 1; // latest value of i is 1
		int j = i++;  // latest value of i is 2 and j is 1
		int k = ++j; // latest value of j is 2 and  k is 2 
		int l = k++ + ++i; //latest value of k is 3 and i is 2
		
		System.out.println("at row 7 value of j is: " + j);
		System.out.println("at row 8 value of k is: " + k);
		
		
		
		// l = 2 + 3 
		// k individually becomes 3
		// i individually becomes 3
		// j remains 2
		
		
		
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);

	}

}
