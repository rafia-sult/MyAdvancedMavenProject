package revision_day_1_mar_14th_2023;

public class Java_Revision_Patter_Programming {

	public static void main(String[] args) {

		for (int row = 1; row <= 5; row++) {
			for (int column = 1; column <= row; column++) {
				
				System.out.print("* ");
			}
			System.out.println();

		}
		
		System.out.println("----------------------------------------");
		
		for (int i =1; i<=5; i++) {
			for (int j =5; j>=i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		System.out.println("----------------------------------------");
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				
				System.out.print("* ");
			}
			System.out.println();

		}	
		
		for (int i =1; i<=5; i++) {
			for (int j =4; j>=i; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		
		
	}

}
