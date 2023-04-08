package oops_java_programming_feb_7th;

public class Animal {

	/*
	 * identity (name) state (breed, color, age) behavior (barking, sleeping,
	 * eating)
	 */

	static String name = "Marcus";
	String breed = "Labrador";
	int age = 5;
	String color = "Fawn";

	public static void main(String[] args) {
		Animal dog = new Animal();
		System.out.println(dog.name);
		System.out.println(dog.age);
		System.out.println(dog.breed);
		System.out.println(dog.color);
		sleeping();
		dog.barking();

		Birds parrot = new Birds();
		parrot.flying();
		parrot.name = "mithu";

	}

	public void barking() {
		System.out.println("Marcus barks");
	}

	public void eating() {
		System.out.println("Marcus eats");
	}

	public static void sleeping() {
		System.out.println("Marcus sleeps");
	}

}

class Birds {

	String name;
	int age = 2;

	public void flying() {
		System.out.println("parrot flies");
	}

}
