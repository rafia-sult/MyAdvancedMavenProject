package oops_java_programming_feb_1st_2023;

/*
 *  create 4 non-static method addition, subtraction, multiplication, division 
 *  add 2 parameters in each of the method
 *  make sure to return the data type in each result
 */

public class ClassAssignment {

	public int addition(int a, int b) {

		int sum = a + b;
		return sum;
	}

	public int subtraction(int a, int b) {

		int sub = a - b;
		return sub;

	}

	public int multiplication(int a, int b) {
		int mult = a * b;
		return mult;

	}

	public int division(int a, int b) {
		int div = a / b;
		return div;

	}

	public static void main(String[] args) {

		ClassAssignment assignment = new ClassAssignment();
		int sumresult = assignment.addition(10, 10);
		System.out.println("The sum is: " + sumresult);
		int subresult = assignment.subtraction(10, 5);
		System.out.println("The difference is: " + subresult);
		int multresult = assignment.multiplication(5, 5);
		System.out.println("The multiplication is: " + multresult);
		int divresult = assignment.division(20, 2);
		System.out.println("The division is: " + divresult);

	}

}
