package java_code_strings_feb_28th_2023;

public class Immutability {

	public static void main(String[] args) {
		// you cannot change an object 
		// when you try to change something a new object is created 
		// for example: there are 100 players plays american football. one day one of the player decides 
		// to quit american football and switch to baseball. The american football object will not change 
		// a new baseball object will be created in the SLP/SCP area.
		
		String player1 = "American football"; 
		String player2 = "American football"; 

		String player3 = "Baseball"; 

		String player100 = "American football"; 
		
		///////////////
		
		String S1 = "America";
		
		S1.concat("States");
		
		System.out.println(S1);
		
		// it will not change the String S1 

	}

}
