package automation_code_feb_7th_2023;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Rediff {

	public static WebDriver driver;

	@BeforeMethod
	public void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
	}

	@Test

	public void rediffPage() {
		String expectedTitle = driver.getTitle();
		String actualTitle = "Rediff.com: News | Rediffmail | Stock Quotes | Shopping";

		Assert.assertEquals(expectedTitle, actualTitle);

		if (expectedTitle.equals(actualTitle)) {
			driver.findElement(By.className("signin")).click();

			if (true == true) {
				System.out.println("The world is beautiful");
			}

		}

	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
