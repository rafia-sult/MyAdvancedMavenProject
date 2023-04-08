package testng_automation_code_feb_1st_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
 * create 1 Class
 * Please do not select the main method because you will use TestNG here 
 * In the Class, create three Test Cases for the website http://tutorialsninja.com/demo
 * make sure the 2nd Test Case is dependent on the 1st and the 3rd Test Case is dependent on the both 1st and 2nd
 * Fail the 1st test case and analyze the results
 * in the 2nd test case and 3rd test case override the dependency failure and make them execute
 * then execute the 3rd test case 5 times
 * 
 */
public class ClassAssignment {

	public WebDriver driver;

	@BeforeMethod
	public void openBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.tutorialsninja.com/demo/");
	}

	@Test(priority = 1)
	public void clickOnMyAccountLink() {
		driver.findElement(By.linkText("My Account")).click();
		Assert.fail("As per the assignment");
	}

	@Test(dependsOnMethods = "clickOnMyAccountLink", alwaysRun = true) // override the failure as per the assignment
	public void clickOnLogIn() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("eiads@gmail.com");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("Selenium2023");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}

	@Test(dependsOnMethods = { "clickOnMyAccountLink", "clickOnLogIn" }, alwaysRun = true, invocationCount = 5)
	public void clickOnLogOut() {
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("eiads@gmail.com");
		driver.findElement(By.cssSelector("input#input-password")).sendKeys("Selenium2023");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		driver.findElement(By.linkText("Logout")).click();

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
