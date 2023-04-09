package java_code_march_29th_2023;

public class WrapperClass_Part2 {

	public static void main(String[] args) {

		// convert String value to int value

		String S1 = "100";
		String S2 = "200";

		// convert String value to int value

		int iValue = Integer.parseInt(S1);
		System.out.println(iValue + 200);

		// convert String value to double value
		String S3 = "11.22";
		double dValue = Double.parseDouble(S3);
		System.out.println(dValue + 10.10);

		// convert String to boolean
		String S4 = "false";
		boolean booValue = Boolean.parseBoolean(S4);
		System.out.println(booValue != true);

		// convert String to char
		// to convert a string to char array we can use 2 char array 
		// once you convert then you can use for loop to retrieve the value of the array 
		// concepts of array declaration, creation, initialization, retrieval 
		// interview question - how will you convert String to char primitive data type
		// - first convert your string into char array, becasue String is nothing but array of character so obously 
		// you can convert String using 2 char array method. once that array is created it will have elements, retrieve that, that is your output
		// this is homework 
		// - String to character - HOMEWORK 
		// - String to integer if the String is Alphanumeric - HOMEWORK 
		
		String S5 = "250B";
		int anValue = Integer.parseInt(S5);
		System.out.println(anValue);
		//this will not throw compile time error, this will give runtime error (NumberFormatException)

	}

}
