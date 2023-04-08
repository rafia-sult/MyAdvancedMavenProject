package java_code_jan_17th_2023;

public class Program5 {

	// 30 multiples of 9
	// starting point is 999
	// add only the even multiples 
	
	public static void main(String[] args) {
		int i = 999; 
		int sum = 0;
		int limit = 30;
		
		while(limit >= 0) {
			sum = sum % i;
			System.out.println(i);
			i = i -9;
			limit--;
			
			
		}
	
		System.out.println("The summtion of the even number are: " + sum);
		
	}

}
