package oops_java_programming_feb_1st_2023;

//static can be used in certain entities
// variable (class level it can be used)
// variable (local level it cannot be used. will throw and error
// with blocks
// with inner class
// static cannot be used with outer class
// static belongs to the Class
// non-static belongs to the Object

// static entity will call static entity only. It will never call non-static
// entity.
// will non-static entity be able to call a static entity? -- YES
// non-static can call static but static cannot call non-static

public class StaticAndNonStatic {

	String name = "John"; // it is an instance variable because it is declared under the class
	static int i = 25; // any instance variable will become static when i write static

	public static void display(int x, int y) {
		// local variable cause its inside a method. it is only local to this method
		int i = 2; // local variable is neither static or non-static
	}

	public static void hello() {
		System.out.println("This is a static hello method");
		display(10, 20);
	}
	
	public void test() {
		System.out.println("non static test method");
		hello();
	}
	
	public static void main(String[] args) {

		// main method is always static
		
		display(1,2);
		StaticAndNonStatic.display(4, 5);
		
		StaticAndNonStatic san = new StaticAndNonStatic();
		
		san.test();
		san.hello();
		
		StaticAndNonStatic san1 = new StaticAndNonStatic();

	}

}
