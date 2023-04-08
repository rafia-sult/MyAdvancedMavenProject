package group_study_mar_23_2023;

public class Increment {

	public static void main(String[] args) {

		// if ++ is before the value is gonna change on the same line, but if ++ is
		// after the value is gonna change next line

		int i = 6; // value of i 6
		int j = i++; // value of i is 7 and j is 6
		int k = j-- + i++; // value of j is 5, i is 8, k is 13
		int l = ++i - k-- + ++j; // value of i is 9, k is 12, j is 5, l is 2
		// 9 - 13 + 6
		
		//homework 
		int m = k++ - --i + j-- + ++l;

		// value of i is 9
		// value of j is 6
		// value of k is 12
		// value of l is 2

		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(l);

	}

}
