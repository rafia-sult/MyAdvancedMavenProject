package testng_hard_vs_soft_assert_feb_7th_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Understanding_Assert {

	public static WebDriver driver;

	@BeforeMethod
	public void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
	}

	@Test
	public void rediffTest() {

//		System.out.println(driver.getTitle());
		String expectedTitle = driver.getTitle();
		String actualTitle = "Rediff.com: News | Rediffmail | Stock Quotes | Shopping";
		
		Assert.assertEquals(expectedTitle, actualTitle, "if title dont match print title mismatch");
		
		if (expectedTitle.equals(actualTitle)) {
			driver.findElement(By.xpath("//a[@class=\"signin\"]")).click();
		}
		
//		Assert.fail("deliberately trying to fail");
		
		if (true == true) {
			System.out.println("The world is beautiful");
		}
		
		Assert.assertTrue(1<2);
		Assert.assertTrue(1>2);  // the overall test case will fail because this is not true
		
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
