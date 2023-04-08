package oops_java_programming_jan_31st_2023;

public class Practice {

	public static void main(String[] args) {

		System.out.println("This is main method");
		
		methodName1(); // i can also call static method by the class name Practice.methodName1
		methodName2();
		methodName3();
		methodName4();
		methodName5();
		
		Practice practice = new Practice(); // to call non-static method we have to create object of that class
		practice.methodName6();
		practice.methodName7();
		practice.methodName8();
		practice.methodName9();
		practice.methodName10();

	
	}
	
	public static void methodName1 () {
		System.out.println("This is static method");
	}
	
	private static void methodName2 () {
		System.out.println("This is static method");
	}
	
	protected static void methodName3 () {
		System.out.println("This is static method");
	}
	
	public static void methodName4 () {
		System.out.println("This is static method");
	}
	
	public static void methodName5 () {
		System.out.println("This is static method");
	}
	
	public void methodName6() {
		System.out.println("This is non-static method");
	}
	
	protected void methodName7() {
		System.out.println("This is non-static method");
	}
	
	private void methodName8() {
		System.out.println("This is non-static method");
	}
	
	public void methodName9() {
		System.out.println("This is non-static method");
	}
	
	void methodName10() {
		System.out.println("This is non-static method");
	}
	
	
}
