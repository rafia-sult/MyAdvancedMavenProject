package revision_day_1_mar_14th_2023;

public class Java_Revision_For_Loop {

	// for loop is more professional because for loop is giving you
	// initialization + condition + increment/decrement operation (updation) at one
	// place in one visible block
	// for loop keeps everything in one line

	public static void main(String[] args) {
		// initialize = what exactly it mean? once initialized it is initialized.

		// print 1 - 15

		for (int i = 1; i <= 15; i++) {
			System.out.println(i);
		}

		// print i am learning java 15 times

		for (int i = 1; i <= 15; i++) {
			System.out.println("I am learning Java");
		}

		for (int i = 5; i <= 10; i++) {
			System.out.println(i);
		}

		System.out.println("***********");

		// print first 10 even numbers

		for (int i = 0; i < 10; i++) {
			System.out.println(2 * i + 2);

		}

		// print first 10 odd numbers

		System.out.println("***********");

		for (int i = 1; i < 10; i++) {
			System.out.println(2 * i - 1);
		}

		// first 10 prime numbers in java using for loop

		for (int i = 0; i < 10; i++) {

		}

	}

}
