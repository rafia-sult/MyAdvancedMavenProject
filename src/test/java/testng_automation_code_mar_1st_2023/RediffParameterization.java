package testng_automation_code_mar_1st_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class RediffParameterization {

	// convert to testNG

	public static WebDriver driver;

	@Test
	@Parameters({ "url", "username", "password" })
// if you dont declare url in testNG.xml you can use optional parameterization like this
//	public void rediffTest(@Optional("https:mail.rediff.com/cgi-bin/login.cgi") String url, String username, @Optional ("Selenium@123")String password)

	public void rediffTest(String url, String username, String password) {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.id("login1")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.className("signinbtn")).click();

	}

}
