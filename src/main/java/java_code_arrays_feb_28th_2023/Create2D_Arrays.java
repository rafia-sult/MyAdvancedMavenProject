package java_code_arrays_feb_28th_2023;

public class Create2D_Arrays {

	public static void main(String[] args) {

		int[][] a; // declaration

		a = new int[2][3]; // creation

		int[][] a1 = new int[2][3]; // declaration + creation
		
		a1[0][0] = 10;
		a1[0][1] = 20;
		a1[0][2] = 30;
		
		a1[1][0] = 40;
		a1[1][1] = 50;
		a1[1][2] = 60;
		
		int[][]b = new int[][] {{10,20,30},{40,50,60}};
		
		int[][]c = {{10,20,30},{40,50,60}}; //both b and c is correct 
		
		Object [][]data = {{"seleniumpanda@gmail.com", "Selenium@13"}};
	}

}
