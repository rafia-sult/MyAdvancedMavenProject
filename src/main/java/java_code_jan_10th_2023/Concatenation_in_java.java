package java_code_jan_10th_2023;

public class Concatenation_in_java {

	public static void main(String[] args) {
		
		// concatenation is adding (NO - this is wrong)
		// concatenation is joining. And we use + operator 
		
		int i = 10;
		int j = 20;
		String firstName = "Rafia";
		String lastName = "Sultana";
	
		
		System.out.println(i + j); // this will add the 2 numbers together cause its in brackets 
	    System.out.println("the concatenated value is : " + i + j); // this will join the numbers 
	    
	    System.out.println(i + j + firstName + lastName); // this will add the integers first 
	    System.out.println(firstName + lastName + i + j); // this will join firstName, lastName, i , j 
	    System.out.println(i + " " + j); // adding a statement will join instead of addition
		
		System.out.println(firstName + lastName + (i+j)); // this will add i and j cause they are in bracket 
		
		

	}

}
