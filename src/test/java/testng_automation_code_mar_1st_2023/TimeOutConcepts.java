package testng_automation_code_mar_1st_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TimeOutConcepts {
	
	public static WebDriver driver;
	
	//what is the client says do what you gotta do make it run in 4 secs make it fast. use chrome options in that case 
	
	public static ChromeOptions options; 
	
	@Test(timeOut = 4000) // this code has to execute within 4 secs but it will not be able to fulfill 
	public void tutorialsNinjaDemoLogin() {
		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.addArguments("--start-maximized");
		options.addArguments("incognito");
		driver = new ChromeDriver (options);
//		driver.manage().window().maximize();
		driver.get("http://www.tutorialsninja.com/demo/");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("riftarafia@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium2023");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		driver.quit();
	}

}
