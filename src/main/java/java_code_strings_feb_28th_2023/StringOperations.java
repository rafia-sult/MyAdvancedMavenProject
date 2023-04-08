package java_code_strings_feb_28th_2023;

public class StringOperations {

	public static void main(String[] args) {
		
		
		// there are a lot of String operations 
		
		/*
		 * String S0 = null;
		 * 
		 * System.out.println(S0.length());
		 */
		
		String S1 = "I am coding Selenium with Java"; 
		
		
		System.out.println(S1.length()); //this is length method. 
		
		String S2 = "";
		System.out.println(S2.isEmpty()); // true or false 
		
		String S3 = "   I am driving   "; // add space 
		
		System.out.println(S3.length());
		
		String S4 = S3.trim(); // it will trim the spaces before and after
		System.out.println(S4.trim()); 
		System.out.println(S4.length());
		
		
		String S5 = "     I am writting phyton    "; 
		System.out.println(S5.length());
		System.out.println(S5.trim().length()); // this will trim and then count the length
		
		System.out.println("************************************************");
		
		//Comparison between Strings 
		
		String S6 = "world"; 
		String S7 = "world"; 
		
		System.out.println(S6.equals(S7));
		
		// its gonna be true cause both word are same also both are lower case 
		
		
		String S8 = "world"; 
		String S9 = "WOrld";
		System.out.println(S8.equals(S9));
		
		// this will be false cause one word is lower case and one is upper case 
		// to fix it simply write .equalsIgnoreCase
		
		System.out.println(S8.equalsIgnoreCase(S9));
		
		// this will be true 
		
		String S10 = "a"; //97
		String S11 = "A"; //65
		
		System.out.println(S10.compareTo(S11));
		// the output is 32 cause it compares the UNICODE values .. google unicode 
		
		// find out unicode value of lower case b and c 
		
		String S12 = "c"; 
		String S13 = "b";
		System.out.println(S12.compareTo(S13));
		System.out.println(S13.compareTo(S12));
		
		
		// Concatination of Strings 
		
		String S14 = "Hello";
		String S15 = S14.concat(S14);
		System.out.println(S15);
		
		String S16 = "hello";
		String S17 = S16.concat("world");
		System.out.println(S17);
		
		String S18 = "Honda";
		String S19 = "BMW";
		String S20 = "Mercedes";
		
		System.out.println(String.join(", ", S18, S19, S20));

		
		// Sub-String -- substituting 
		String S21 = "IamplayingHockey"; 
		System.out.println(S21.substring(1, 11));
		System.out.println(S21.substring(0, 10));
		
		//replace() 
		
		
		//replaceFirst()
		
		
		//replaceAll()
		
		
		//indexOf()
		//lastIndexOf()
		//CharAt()
		//contains()
		//endsWith()
		//startsWith()
		
		//toLowerCase()
		System.out.println(S21.toLowerCase());

		//toUpperCase()
		System.out.println(S21.toUpperCase());

		//valueOf()
		System.out.println();
		
		//toCharArray()
		

		
	}

}
