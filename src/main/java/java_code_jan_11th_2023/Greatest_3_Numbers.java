package java_code_jan_11th_2023;

public class Greatest_3_Numbers {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		
		
		
		// find greatest out of a b c 
		
		if (a>b && a>c) {
			// false 
			System.out.println("a is the greatest: " + a); 
			
		} else if (b>a && b>c) { // f
			
			System.out.println("b is the greatest: " + b);
			
		} else {
			
			System.out.println("c is the greatest: " + c);
		}
		
		int i = 40;
		int j = 35;
		int k = 30;
		
		// find greatest out of i j k 
		
		if (i>j && i>k) {
			System.out.println("i is the greatest: " + i);
			
		} else if (j>i && j>k) {
			System.out.println("j is the greastest: " + j);
			
		} else {
			System.out.println("k is the greastet: " + k);
		}
		
		
		
	}

}
