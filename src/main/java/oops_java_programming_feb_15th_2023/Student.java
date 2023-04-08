package oops_java_programming_feb_15th_2023;

public class Student {
	/*
	 * 
	 * - constructor has the class name. 
	 * - constructor is a block which is initialized the moment an Object is created. 
	 * - it looks like a method but it is not a method.
	 * - constructor does not have a return type.
	 * - private, public, default, protected access modifiers can be used for constructor.
	 * - constructor does not have return type
	 * 
	 */
	
	String name; 
	int age; 
	int grade; 
	
	public static void main(String[] args) {
		
		

		Student st1 = new Student("John", 5, 10); // when using NEW keyword a default constructor is automatically created
		Student st2 = new Student("Sam", 4, 9); // another constructor will be created

	}

	public Student(String name, int grade, int age) {
		// this is a constructor

	}

}
