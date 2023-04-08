package automation_code_feb_7th_2023;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Amazon {

	public static WebDriver driver;

	@BeforeMethod
	public void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://amazon.com");
	}

	@Test

	public void amazonPage() {
		System.out.println("Code for amazon goes here");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
