package automation_code_feb_7th_2023;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Costco {

	public static WebDriver driver;

	@BeforeMethod

	public void openWebsite() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.costco.com/");
	}

	@Test

	public void costcoPage() {
		System.out.println("Code for costco goes here");
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
