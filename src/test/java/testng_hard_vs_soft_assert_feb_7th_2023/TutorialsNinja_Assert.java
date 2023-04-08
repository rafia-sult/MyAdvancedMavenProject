package testng_hard_vs_soft_assert_feb_7th_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TutorialsNinja_Assert {

	public static WebDriver driver;

	@BeforeMethod
	public void openTutorialsNinja() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo/");
	}

	@Test
	public void loginTest() throws InterruptedException {
//		System.out.println(driver.getTitle());
		String actualTitle = "Your Store";
		String expectedTitle = driver.getTitle();

		Assert.assertEquals(actualTitle, expectedTitle);
		driver.findElement(By.xpath("//a[@title = 'My Account']")).click();

		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("riftarafia@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium2023");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();

		WebElement validateLogin = driver.findElement(By.xpath("//a[contains (text(), 'Edit your account information')]"));
		Assert.assertTrue(validateLogin.isDisplayed());

		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(2000);

		String logoutConfirmationMessage = "You have been logged off your account. It is now safe to leave the computer.";

		WebElement confirmation = driver.findElement(By.xpath("//p[text()='You have been logged off your account. It is now safe to leave the computer.']"));
		Assert.assertEquals(confirmation.getText(), logoutConfirmationMessage);

		driver.findElement(By.cssSelector("a.btn.btn-primary")).click();
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
	

