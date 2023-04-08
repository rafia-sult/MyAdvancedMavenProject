package oops_java_programming_feb_15th_2023;

public abstract class About_Abstraction {

	// Abstraction means hiding data
	// abstract class will hide your data
	// an abstract method can only reside in a abstract class
	// an abstract class can have regular method and abstract method
	// one is up to 100% abstraction - done by using abstract class
	// one is 100% abstraction - done by using interface (WebDriver)

	public void showMe() {
		System.out.println("This is a normal method");
	}

	public abstract void hideME();

	protected abstract void hideMeMore();

//	private abstract void hideMeAsMuch();   // private abstract method is not allowed 

	abstract void hideMeAnyways();

}
