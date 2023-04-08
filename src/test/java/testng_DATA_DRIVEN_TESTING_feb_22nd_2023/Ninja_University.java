package testng_DATA_DRIVEN_TESTING_feb_22nd_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Ninja_University {
	
	public static WebDriver driver;
	public static SoftAssert softassert = new SoftAssert();
	
	@Test (priority = 1, dataProvider = "dataSupplier")
	public void loginTest (String username, String password) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys(username);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		softassert.assertTrue(driver.findElement(By.linkText("Edit your account information")).isDisplayed());
		softassert.assertAll();
		driver.findElement(By.linkText("Logout")).click();
		driver.findElement(By.linkText("Continue")).click();
		driver.quit();
		
		
	}
	
	@DataProvider
	public Object[][] dataSupplier() {
		Object[][] data = {{"riftarafia@gmail.com", "Selenium2023"}, 
						  {"riftarafia1@gmail.com", "Selenium2023"}, 
						  {"riftarafia2@gmail.com", "Selenium2023"}, 
						  {"riftarafia3@gmail.com", "Selenium2023"}, 
						  {"rasultana@mybihs.org", "Selenium2023"}};
		
	
	return data;
		
		
	}
}

