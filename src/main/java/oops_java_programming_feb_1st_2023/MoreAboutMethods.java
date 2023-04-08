package oops_java_programming_feb_1st_2023;

public class MoreAboutMethods {

	public void display() { // non-static method
		System.out.println("4k display");
	}

	public static void maximize() { // static method
		System.out.println("4k display");
	}

	public int add() { // instead of writing void change the method to int, string whatever your are
						// returning
		int a = 2;
		int b = 3; // if a method does not have a value to return then it is a void
		int sum = a + b;
		System.out.println(sum);
		return sum;
	}

	// parameters in method

	public void addTwoNumbers() {

	}
	
	public String joinTwoStatements(String S1, String S2) {
		String S3 = S1 + S2;
		return S3;
	}
}
