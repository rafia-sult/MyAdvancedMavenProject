package pattern_programming_jan_25th;

	//for 1 run of outer for loop, everything in the inner for loop runs 
	// outer for loop is always for the number of rows 
	// inner for loop is always for the number of columns 
	/* 
	 
	 * * * * * 
	 * * * * * 
	 * * * * * 
	 * * * * * 
	 * * * * *
	 
	 */

public class Pattern1 {

	public static void main(String[] args) {

		for (int i = 1; i<=5; i++ ) {
			for (int j = 1; j<=5; j++) {
				System.out.print("* ");
			}
			
			System.out.println();
		}
	}

}
