package java_code_arrays_feb_28th_2023;

// create a 2-dimensional String Array 
// 2*3
// retrieve all the elements 

public class Class_Assignment {

	public static void main(String[] args) {

		String[][] s = { { "selenium", "1234", "java" }, { "7980", "arrays", "4567" } };

		for (int i = 0; i < s.length; i++) {
			for (int j = 0; j < s[i].length; j++) {
				System.out.println(s[i][j]);
			}

			System.out.println();
		}

		// another way of doing it

		String[][] S1 = new String[2][3];

		S1[0][0] = "hello";
		S1[0][1] = "world";
		S1[0][2] = "automation";

		S1[1][0] = "hello1";
		S1[1][1] = "world1";
		S1[1][2] = "automation1";

		for (int i = 0; i < S1.length; i++) {
			for (int j = 0; j < S1[i].length; j++) {
				System.out.println(S1[i][j]);

			}
			System.out.println();

		}

	}
}
