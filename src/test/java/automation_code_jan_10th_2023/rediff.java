package automation_code_jan_10th_2023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class rediff {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rediff.com");
//		driver.findElement(By.className("signin")).click();
//		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
//		driver.findElement(By.name("passwd")).sendKeys("Selenium@123");
//		driver.findElement(By.className("signinbtn")).click();
//		driver.findElement(By.className("rd_logout")).click();
		//driver.quit(); 
		
		// I want to click on shopping by using linkText
		
		// driver.findElement(By.linkText("Shopping")).click();
		
		driver.findElement(By.linkText("Rediffmail")).click();
		driver.navigate().back();
		Thread.sleep(2000);
		
		
		driver.findElement(By.linkText("Money")).click();
		driver.navigate().back();
		Thread.sleep(2000);
//		driver.findElement(By.linkText("Business Email")).click();
//		driver.navigate().back();
//		Thread.sleep(2000);
//		driver.findElement(By.linkText("Videos")).click();
//		driver.navigate().back();
//		Thread.sleep(2000);
//		driver.findElement(By.linkText("Shopping")).click();
//		driver.navigate().back();
//		Thread.sleep(2000);
//		driver.findElement(By.linkText("Sign in")).click();
//		driver.navigate().back();
//		Thread.sleep(2000);
//		driver.findElement(By.linkText("Create Account")).click();
//		driver.navigate().back();
//		Thread.sleep(2000);
		//driver.findElement(By.linkText("MOVIES")).click();
		//driver.findElement(By.linkText("TELEVISION")).click();
		
		
		
	

	}

}
