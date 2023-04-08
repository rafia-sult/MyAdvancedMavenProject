package testng_hard_vs_soft_assert_feb_7th_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Rediff_Assert {

	public static WebDriver driver;

	@BeforeMethod
	public void openRediff() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");

	}

	@Test
	public void clickOnLoginTest() {
		String expectedTitle = driver.getTitle();
		String actualTitle = "Rediff.com: News | Rediffmail | Stock Quotes | Shopping";

		Assert.assertEquals(expectedTitle, actualTitle);

		if (expectedTitle.equals(actualTitle)) {
			driver.findElement(By.xpath("//a[@class='signin']")).click();
		}

	}

	@Test
	public void enterCredentialsTest() {
		driver.findElement(By.xpath("//a[@class='signin']")).click();
		String expectedTitle = driver.getTitle();
		String actualTitle = "Rediffmail";

		Assert.assertEquals(expectedTitle, actualTitle);

		if (expectedTitle.equals(actualTitle)) {
			driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("seleniumpanda@rediffmail.com");
			driver.findElement(By.cssSelector("input#password")).sendKeys("Selenium@123");
			driver.findElement(By.cssSelector("input.signinbtn")).click();
		}
	}

	
	@Test
	public void logoutTest() throws Exception {
		driver.findElement(By.xpath("//a[@class='signin']")).click();
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.cssSelector("input#password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.signinbtn")).click();
		Thread.sleep(3000);
		
		WebElement validateSignIn = driver.findElement(By.xpath("//b[contains(text(), 'Write mail')]"));
		Assert.assertTrue(validateSignIn.isDisplayed());
		
		driver.findElement(By.cssSelector("a.rd_logout")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//b[contains(text(),'Rediff Home')]")).click();
	}
	
	@Test
	public void validateLogout() throws Exception {
		driver.findElement(By.xpath("//a[@class='signin']")).click();
		driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.cssSelector("input#password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.signinbtn")).click();
		Thread.sleep(3000);
		
		WebElement validateSignIn = driver.findElement(By.xpath("//b[contains(text(), 'Write mail')]"));
		Assert.assertTrue(validateSignIn.isDisplayed());
		
		driver.findElement(By.cssSelector("a.rd_logout")).click();
		Thread.sleep(3000);
		
		String logoutConfirmationMessage = "You have successfully signed out of Rediffmail.";

		WebElement confirmation = driver.findElement(By.xpath("//p[text()='You have successfully signed out of Rediffmail.']"));
		Assert.assertEquals(confirmation.getText(), logoutConfirmationMessage);
		
		driver.findElement(By.xpath("//b[contains(text(),'Rediff Home')]")).click();
	}
		


	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
