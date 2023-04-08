package java_code_arrays_feb_22nd_2023;

public class Create1D_Arrays {

	public static void main(String[] args) {

		int []a; //array declaration 
		
		a = new int [3]; // array creation 
		
		int [] b = new int [3]; // this is declaration and creation together 
		System.out.println(b.length);
		
		int [] c = new int [0]; // interview question if an array is given 0 is there an error? no there is not error it will 
		System.out.println(c.length);
		
		int [] d = new int [-3]; // there are no compile error but will give you negative array size exception 
		System.out.println(d.length);
	
	}

}
