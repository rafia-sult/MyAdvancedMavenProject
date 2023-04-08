package oops_java_programming_feb_15th_2023;

public class OverLoading_Main_Method {

	public static void main(String[] args) {
		System.out.println("This is the main method");
		main(10);
	}
	
	public static void main(int n) {
		System.out.println("This is overloaded main method with 1 int paremeter");
	}
	
	public static void main(String[] args1, String[] args2) {
		System.out.println("this is overloaded main method with 2 arguments");
	}

}
