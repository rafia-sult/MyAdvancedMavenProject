package testng_automation_code_mar_1st_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TutorialsNinjaParameterization {
	
	public static WebDriver driver;
	
	@Test
	@Parameters ({"url", "username", "password"})
	public void tutorialsNinjaTest(String url, String username, String password) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.id("input-email")).sendKeys(username);
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		

	
	}

}
