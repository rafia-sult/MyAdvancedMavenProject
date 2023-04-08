package oops_java_programming_feb_1st_2023;

public class Addition {

	// parameter in a method

	public static int addTwoNumbers(int a, int b) {
		int sum = a + b;
		return sum;

	}

	public static void main(String[] args) {
		
		Addition ad = new Addition();
		int result = ad.addTwoNumbers(5, 10);
		System.out.println("the sum is : " + result);
		System.out.println("the square root of 9 is : " + Math.sqrt(9));

//		System.out.println(addTwoNumbers(5, 10)); // one way of printing
//		int result = addTwoNumbers(5, 10); // another way 
//		System.out.println("the sum is: " + result); 
//		
		// if the method was non-static
//		
//		Addition ad = new Addition();
//		int result = addTwoNumbers(5, 10); 
//		System.out.println("the sum is: " + result); 

	}

}