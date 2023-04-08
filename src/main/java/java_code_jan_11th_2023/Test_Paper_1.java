package java_code_jan_11th_2023;

public class Test_Paper_1 {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		int d = 40;

		if (a > b && a > c) {
			System.out.println("the greatest integer is a: " + a);

		} else if (b > a && b > c) {

			System.out.println("the greatest integer is b: " + b);

		} else if (c > d && d > a && d > b) {

			System.out.println("the greatest integer is c: " + c);
		} else {

			System.out.println("the greatest integer is d: " + d);

		}

	}
}
