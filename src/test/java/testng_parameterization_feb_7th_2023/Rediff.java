package testng_parameterization_feb_7th_2023;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Rediff {

	public static WebDriver driver;

	@Test
	@Parameters({ "Browser", "url", "username", "password" })
	public void checkRediff(String Browser, String url, String username, String password) {
		if (Browser.equals("Chrome"));
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}
	
	// driver.get(url);
	
	
	

}
