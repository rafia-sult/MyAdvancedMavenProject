package testng_DATA_DRIVEN_TESTING_feb_22nd_2023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Rediff_Data_Driven {
	
	public static WebDriver driver; 
	public static WebDriverWait wait;
	
	
	
	@Test (dataProvider = "dataSupplier")
	public void loginTest(String username, String password) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("login1")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("signinbtn")).click();

		
		WebElement logoutLink = driver.findElement(By.className("rd_logout"));
		wait = new WebDriverWait (driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(logoutLink));
		
		driver.quit();
	}
	
	@DataProvider
	public Object[][] dataSupplier(){
		
		Object[][] data = {{"seleniumpanda@rediffmail.com", "Selenium@123"},
						  {"seleniumpanda1@rediffmail.com", "Selenium@123"}, 
						  {"seleniumpanda2@rediffmail.com", "Selenium@123"}};
		
		return data;
		
	}
}


