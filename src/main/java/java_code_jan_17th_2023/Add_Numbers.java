package java_code_jan_17th_2023;

public class Add_Numbers {

	public static void main(String[] args) {
		
		
		// Find the sum of first 10 natural numbers 
		// has to be a variable sum
		// natural number represent with i 
		// 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10 = 
		

		int i = 1;
		int sum = 0;
		
		while (i <= 10) {
			sum = sum+ i; 
			i++;
			
			
		}
		
		System.out.println("The sum of first 10 natural numbers is: " + sum);
	}

}
