package java_code_jan_10th_2023;

public class Increment_Operators_Understanding {

	public static void main(String[] args) {
		// increment operators are adding ++ (++ represent increase by 1) 
			// pre-increment
			// post-increment
		
		// decrement operators are decreasing -- (-- represent decrease by 1) 
			// pre-decrement
			// post-decrement 
		
		
//		int i = 1; 
//		i++; // post increment operator
//		++i; // pre increment operator 
//		
//		i--; // post decrement operator
//		--i; // pre decrement operator 
		
		int a = 5; // latest value of a is 5
		int b = a++; // the first thing b finds is a it assigns itself value of a which is 5... 
					 // ++ operator is attached to the body of a so a has to increment itself by 1
		int c = b;	// c will be b and b latest value is 5
		int d = c;  // d will also be 6 cause in the next line d is incremented by 1
		int e = d++; 
		
		System.out.println(a); 
		System.out.println(b); 
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		


}
}
