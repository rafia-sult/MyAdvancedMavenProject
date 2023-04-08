package java_code_arrays_feb_22nd_2023;

public class Retrieval1D_Arrays {

	public static void main(String[] args) {

		int[] a = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100 };

		String[] S = { "java", "selenium", "python", ".Net", "c", "c++", "cobol", "cypress", "javaScript" };

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " ");

		}
		System.out.println();
		
		System.out.println(a[5]);
		
		System.out.println("the 10th element is: " + a[9]);
		
		System.out.println();


		for (int j = 0; j < S.length; j++) {
			System.out.println(S[j] + " ");
		}
	}

}
