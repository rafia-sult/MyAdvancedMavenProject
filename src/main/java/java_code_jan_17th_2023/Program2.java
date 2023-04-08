package java_code_jan_17th_2023;

public class Program2 {
	// WAP to print first 20 multiples of 10 and add the multiples 

	public static void main(String[] args) {
		
		int i = 1;
		int sum = 0;
		
		while (i <= 20) {
			
		System.out.println(i * 10);
		sum = sum + (i*10);
		i++;
		
		}
		
		System.out.println("the final summation will be: " + sum);
		}

}
