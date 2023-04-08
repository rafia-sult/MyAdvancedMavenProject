package java_code_jan_11th_2023;

public class LeapYear_Or_Not { 

	public static void main(String[] args) {
		
		int year1 = 1994; 
		int year2 = 2000; 
		
		
		if ((year1 % 400 == 0) || ((year1 % 4 ==0) && (year1 % 100 != 0))) {
			
			System.out.println( year1 + " is a leap year");
		} else {
			System.out.println(year1 + " is not a leap year");
		}
		
		if ((year2 % 400 == 0) || ((year2 % 4 ==0) && (year2 % 100 != 0))) {
			
			System.out.println(year2 + " is a leap year");
		} else {
			System.out.println( year2 + " is not a leap year");
		}
		
		
	
		
//		if (year1 % 4 ==0) {
//			System.out.println("year1 is leap year: " + year1);
//			
//		} else {
//			System.out.println("year1 is not leap year: " + year1);
//		}
//		
//		if (year2 % 4 == 0) {
//			System.out.println("year2 is leap year: " + year2);
//		} else {
//			System.out.println("year2 is not leap year: " + year2);
//			
//		}
		
		
		
		
		
		
		
		
	}

}
