package testng_automation_code_jan_31st_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoingWithTheFlow {

	public WebDriver driver;

	@BeforeTest
	public void openRediff() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
	}

	@Test(priority = 1)
	public void clickOnSignInLink() throws Exception {
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys("John");
	}

	@Test(priority = 2)
	public void clickOnCloseIcon() throws Exception {
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("img._8idr.img")).click();

	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
