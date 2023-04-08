package revision_day_1_mar_14th_2023;

public class Java_Revision_While_Loop {

	public static void main(String[] args) {

		System.out.println("Hello World!!");

		/*
		 * While loop - control flow statements you are a developer (java SDET) you want
		 * to control the code, dont let the code control you
		 * 
		 * control flow statements
		 * 
		 * repeatedly based on a condition (true or false). while loop is nothing but a
		 * repeated if statement
		 * 
		 * if no of iterations is not fixed, then it is recommended to use While loop
		 */

		while (true != false) {
			System.out.println("I will sleep late"); // this will continue to print until its true
			break;  								// this will stop the loop // you are controlling the logic

		}

		// print i am learning java 10 times using while loop

		int i = 0;

		while (i < 10) {
			System.out.println("I am learning Java");
			i++;
		}

		// using while loop print sum of first 10 natural number 1+ .... +10 =?

		int sum = 0;
		int noofnaturalnumbers = 1;

		while (noofnaturalnumbers <= 10) {
			sum = sum + noofnaturalnumbers;
			noofnaturalnumbers++;
			
		}
		System.out.println("the total is: " + sum);

	}

}
