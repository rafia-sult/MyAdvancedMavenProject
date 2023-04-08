package oops_java_programming_feb_15th_2023;

public class Polymorphism {
	// poly means many
	// morphism means form 
	
	// there are 2 types
	// 1. CompileTime/Static 
	// > it is achieved by method overloading
	// > method name should be same, Class should be same, Different arguments/parameterized 
	// > it is handles by the compiler 
	
	public static void main(String[] args) {
		
		Polymorphism poly = new Polymorphism();
		poly.display();
		poly.display(10, 20);
		poly.display(new StringBuffer("World"));
		poly.display(new StringBuilder("World"));
		poly.display("Hello");
		poly.display(5);
		poly.display("Rafia", "Sultana");
		poly.display(25, "Rafia");

	}
	
	
	public void display() {
		System.out.println("This is a non parameterized display method");
	}
	
	public void display (int age) {
		System.out.println("This is a int parameterized display method");
	}
	
	public void display (int i, int k) {
		System.out.println("This is two int parameterized display method");
	}
	
	public void display (String name) {
		System.out.println("This is a String parameterized display method");
	}
	
	public void display (String name, String name1) {
		System.out.println("This is a two String parameterized display method");
	}
	
	public void display (int k, String name1) {
		System.out.println("This is a int and String parameterized display method");
	}
	
	public void display (StringBuffer S3) {
		System.out.println("This is StringBuffer parameterized display method");
	}
	
	public void display (StringBuilder S4) {
		System.out.println("This is StringBuilder parameterized display method");
	}
	
	
	


}
