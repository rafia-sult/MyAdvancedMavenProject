package automation_code_feb_21st_2023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WaitConditions_Selenium {

	public static WebDriver driver;
	public WebDriverWait wait;

	@Test
	public void ninjaWait() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		//these are the 3 types of wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // it will run according to how fast the internet is it will not wait
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10)); // if it takes more than 10 secs selenium will fail it
		driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2)); 
		driver.get("http://tutorialsninja.com/demo");
		
		WebElement myAccountLink = driver.findElement(By.linkText("My Account"));
		wait = new WebDriverWait (driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(myAccountLink));
		myAccountLink.click();
		
		WebElement loginLink = driver.findElement(By.linkText("Login"));
		wait = new WebDriverWait (driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(loginLink));
		loginLink.click();
				
		WebElement emailTextbox = driver.findElement(By.id("input-email"));
		wait = new WebDriverWait (driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(emailTextbox));
		emailTextbox.sendKeys("riftarafia@gmail.com");
		
//		Thread.sleep(3000); // explicit wait. doesnt matter if the internet is fast or slow it will wait 3 secs
		
		WebElement passwordTextBox = driver.findElement(By.id("input-password"));
		wait = new WebDriverWait (driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(passwordTextBox));
		passwordTextBox.sendKeys("Selenium2023");
				
		WebElement loginButton = driver.findElement(By.cssSelector("input.btn.btn-primary"));
		wait = new WebDriverWait (driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(loginButton));
		loginButton.click();
			
		WebElement logoutButton = driver.findElement(By.linkText("Logout"));
		wait = new WebDriverWait (driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(logoutButton));
		logoutButton.click();
		
		WebElement continueButton = driver.findElement(By.linkText("Continue"));
		wait = new WebDriverWait (driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(continueButton));
		continueButton.click();
	}

}
