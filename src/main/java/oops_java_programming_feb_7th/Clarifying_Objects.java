package oops_java_programming_feb_7th;

/*
 * How do we create Objects? 
 * 1. new keyword (we only need new keyword for automation) 
 * 2. newInstance() method
 * 3. clone() method
 * 4. deserialization
 * 5. factory methods 
 * 
 * copy the class name, give a reference = new keyword 
 * object is instance of a class
 * 
 */

public class Clarifying_Objects {

	String name;
	int age;
	double height;
	static String name1;

	public static void main(String[] args) {

		Clarifying_Objects co = new Clarifying_Objects();
		Clarifying_Objects co1 = new Clarifying_Objects();
		// you can have more than 1 objects for the same class, it will have the same
		// entities name, age, height etc

		Clarifying_Objects.name1 = "rafia"; // class can only call static entity

		co.name = "john"; // object referance can call a non-static entity

		co.test1();

		co1.test1();

	}

	public void test1() {

	}

}
