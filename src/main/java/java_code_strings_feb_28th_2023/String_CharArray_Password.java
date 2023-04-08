package java_code_strings_feb_28th_2023;

public class String_CharArray_Password {

	public static void main(String[] args) {
		// important interview question:: where should you store a password in a String
		// or CharArray??

		String S1 = new String("Password");

		char[] cr = new char[] { 'P', 'a', 's', 's', 'w', 'o', 'r', 'd' };
		
		
		System.out.println("The password is: " + S1);
		
		System.out.println("The password is: " + cr);
		
		// Always remember char array does not allow you to retrieve the password saved inside of them but String allows 
		
		// This is an exception in java, in one instance password should always be saved in char array 
		// cause char arrays do not allow retrieval when you try to print their output hence you should always 
		// store password in char array not inside string cause string allows retrieval. therefore char array is more secure
		
		

	}

}
