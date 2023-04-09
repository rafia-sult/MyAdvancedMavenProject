package java_code_march_29th_2023;

public class WrapperClass {

	// how to convert these primitive data types into Objects

	// these are the 8 primitive data types
	// int - Integer
	// short - Short
	// long - Long
	// double - Double
	// float - Float
	// char - Character
	// byte - Byte
	// boolean - Boolean

	public static void main(String[] args) {

		int a = 10;
		// convert it using the wrapper class

		Integer aObject = Integer.valueOf(a);
		System.out.println("The Integer object is: " + aObject);

		byte b = 2;
		Byte bObject = Byte.valueOf(b);
		System.out.println("The Byte object is: " + bObject);

		short s = 3;
		Short sObject = Short.valueOf(s);
		System.out.println("The Short object is: " + sObject);

		long l = 1000000;
		Long lObject = Long.valueOf(l);
		System.out.println("The Long object is: " + lObject);

	}

}
