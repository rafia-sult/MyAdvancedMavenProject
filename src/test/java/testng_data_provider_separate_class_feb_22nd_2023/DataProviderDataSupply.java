package testng_data_provider_separate_class_feb_22nd_2023;

import org.testng.annotations.DataProvider;

public class DataProviderDataSupply {
	
	@DataProvider
	public Object[][] dataSupplier() {
		Object[][] data = {{"riftarafia@gmail.com", "Selenium2023"}, 
						  {"riftarafia1@gmail.com", "Selenium2023"}, 
						  {"riftarafia2@gmail.com", "Selenium2023"}, 
						  {"riftarafia3@gmail.com", "Selenium2023"}}; 
		
	
	return data;
		
		
	}


}
