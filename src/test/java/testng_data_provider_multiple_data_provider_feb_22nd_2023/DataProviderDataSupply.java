package testng_data_provider_multiple_data_provider_feb_22nd_2023;

import org.testng.annotations.DataProvider;

public class DataProviderDataSupply {

	@DataProvider(name = "ninjaDataSupply")
	public Object[][] ninjaDataSupplier() {
		Object[][] data = {{"riftarafia@gmail.com", "Selenium2023"}, 
						  {"riftarafia1@gmail.com", "Selenium2023"}, 
						  {"riftarafia2@gmail.com", "Selenium2023"}, 
						  {"riftarafia3@gmail.com", "Selenium2023"}}; 
		
	
	return data;
		
	}
	
	@DataProvider(name = "ninjaDataSupply")
	public Object[][] rediffDataSupplier() {
		Object[][] data = {{"seleniumpanda@rediffmail.com", "Selenium@123"}, 
						  {"riftarafia1@rediffmail.com", "Selenium2023"}, 
						  {"riftarafia2@rediffmail.com", "Selenium2023"}, 
						  {"riftarafia3@rediffmail.com", "Selenium2023"}}; 
		
	
	return data;
}
}
