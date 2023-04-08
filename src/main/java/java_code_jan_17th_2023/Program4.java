package java_code_jan_17th_2023;

public class Program4 {
	
	// WAP to print 20 multiples of 5 in decreasing order starting from 250 and add 


	public static void main(String[] args) {

		int value = 250;
		int sum = 0; 
		int limit = 20; 
		
		while (limit >= 0) {
			sum = sum + value;
			System.out.println(value);
			value = value - 5;
			limit--;
		}
		
		System.out.println("The summation of these numbers is: " + sum);
		
		
	}

}
