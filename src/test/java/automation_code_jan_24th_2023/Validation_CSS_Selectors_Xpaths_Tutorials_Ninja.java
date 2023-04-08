package automation_code_jan_24th_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validation_CSS_Selectors_Xpaths_Tutorials_Ninja {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://www.tutorialsninja.com/demo/");
		driver.findElement(By.xpath("//span[@class='caret']/preceding-sibling::span[1]")).click();
		// driver.findElement(By.xpath("//a[text()='Register']")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("Rafia");
		driver.findElement(By.cssSelector("input#input-lastname.form-control")).sendKeys("Sultana");
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("rifta123567@yahoo.com");
		driver.findElement(By.cssSelector("input#input-telephone.form-control")).sendKeys("0000000000");
		driver.findElement(By.cssSelector("input#input-password.form-control")).sendKeys("Rafia2023");
		driver.findElement(By.cssSelector("input#input-confirm.form-control")).sendKeys("Rafia2023");
		driver.findElement(By.cssSelector("input[name=agree]")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();

		// validation for account creation

		WebElement proofOfAccountCreation = driver
				.findElement(By.xpath("//h1[contains(text(), 'Your Account Has Been Created!')]"));
		WebElement proofOfAccountCreation1 = driver.findElement(
				By.xpath("//p[contains(text(), 'Congratulations! Your new account has been successfully created!')]"));
		if (proofOfAccountCreation.isDisplayed() || proofOfAccountCreation1.isDisplayed()) {
			driver.findElement(By.cssSelector("a.btn.btn-primary")).click();
		}

		driver.findElement(By.linkText("Logout")).click();

		// validation for logout

		WebElement proofOfLogout = driver.findElement(By.xpath("//h1[contains(text(), 'Account Logout')]"));

		if (proofOfLogout.isDisplayed()) {
			driver.findElement(By.cssSelector("a.btn.btn-primary")).click();
		}

		driver.findElement(By.xpath("//span[@class='caret']/preceding-sibling::span[1]")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("rifta123567@yahoo.com");
		driver.findElement(By.id("input-password")).sendKeys("Rafia2023");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();

	}
}
