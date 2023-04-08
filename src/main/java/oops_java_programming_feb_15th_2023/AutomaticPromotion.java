package oops_java_programming_feb_15th_2023;

public class AutomaticPromotion {

	public static void main(String[] args) {
		AutomaticPromotion ap = new AutomaticPromotion();
		ap.show(5);
		ap.show("Rafia");

		
	}

	public void show (int i) {
		System.out.println("This is an int show method");
	}
	
	public void show (String name) {
		System.out.println("This is an String show method");
	}
}
