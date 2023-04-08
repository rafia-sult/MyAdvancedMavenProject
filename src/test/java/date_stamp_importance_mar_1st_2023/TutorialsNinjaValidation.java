package date_stamp_importance_mar_1st_2023;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

// date time stamp method will override the warning that doesnt let you enter wrong credentials for more than 5 times or whatever limit the website has
public class TutorialsNinjaValidation {

	public static WebDriver driver;

	@Test(invocationCount = 10)
	public void invalidCredentials() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("riftarafia" + dateTimeStamp() + "@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Seleniumwa2023");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		String actualWarningMessage = driver
				.findElement(By.xpath("//div[contains(@class,'alert alert-danger alert-dismissible')]")).getText();
		String expectedWarningMessage = "Warning: No match for E-Mail Address and/or Password.";
		Assert.assertTrue(actualWarningMessage.contains(expectedWarningMessage));
	}

	public String dateTimeStamp() {
		Date date = new Date();
		return date.toString().replace(" ", "_").replace(":", "_");
	}

}
