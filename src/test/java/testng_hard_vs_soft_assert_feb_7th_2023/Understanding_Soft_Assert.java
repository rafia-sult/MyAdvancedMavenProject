package testng_hard_vs_soft_assert_feb_7th_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Understanding_Soft_Assert {

	public static WebDriver driver;
	public static SoftAssert softassert;

	@BeforeMethod
	public void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
	}

	@Test
	public void rediffTest() {

		softassert = new SoftAssert();

//		System.out.println(driver.getTitle());
		String expectedTitle = driver.getTitle();
		String actualTitle = "Rediff.com: News | Rediffmail | Stock Quotes | Shopping";

		softassert.assertEquals(expectedTitle, actualTitle, "if title dont match print title mismatch");

		if (expectedTitle.equals(actualTitle)) {
			driver.findElement(By.xpath("//a[@class=\"signin\"]")).click();
		}

		softassert.fail("deliberately failing");

		if (true == true) {
			System.out.println("The world is beautiful");
			// this logic is correct so it will execute even though the test case will fail
			// softassert.fail
		}

		softassert.assertAll(); // you have to declare this to make sure everything logically correct prints
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
