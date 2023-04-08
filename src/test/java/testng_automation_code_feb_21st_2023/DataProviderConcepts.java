package testng_automation_code_feb_21st_2023;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

// data provider means data is being provided 

public class DataProviderConcepts {
	
	// step 1: return a 2 dimensional object array
	// step 2: enter the rows and cloumns
	// step 3: pass the dataProvider annotation = "name of the method holding the @Data Provider
	
	// please go to testng.org and learn more things about it 
	
	@Test (dataProvider = "getData")
	public void sampleTest(String username, String browser, int roll_number, String email) {
		
	}

	@DataProvider 
	
	// change "void" to Object [] [] after writing return data; 
	
	public Object[][] getData () {
		Object [][] data = new Object [3][4];
		
		data[0][0] = "username1";
		data[0][1] = "Chrome";
		data[0][2] = 12345;
		data[0][3] = "seleniumpanda@gmail.com";
		
		data[1][0] = "username2";
		data[1][1] = "Firefox";
		data[1][2] = 123456;
		data[1][3] = "seleniumpanda1@gmail.com";
		
		data[2][0] = "username3";
		data[2][1] = "Edge";
		data[2][2] = 1234567;
		data[2][3] = "seleniumpanda2@gmail.com";
		
		return data; 
		
	}

}
