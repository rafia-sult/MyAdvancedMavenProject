package java_code_strings_feb_28th_2023;

public class Interview_Strings {

	public static void main(String[] args) {

		// which one will you choose in your framework? both are correct give a through explanation 

		String S1 = "selenium"; // 1 object will created in SLP/SCP
		String S2 = new String("selenium"); // 2 objects will be created. will occupy twice the memory. one is heap cause of new keyword and another will be created in SLP/SCP
		
		// Always chose S1 cause less memory stored cause only 1 object is created. S2 is heavier, the heavier the 
		// memory the slower is the programming. The more object is created the heavier the programming will be. 
		// Therefore S1 is the faster way of doing it. 
		
		
		
		
	}

}
