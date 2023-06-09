package automation_code_feb_21st_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptions_Code {
	
	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--Start-maximized");
		options.setPageLoadStrategy(PageLoadStrategy.NORMAL); // NORMAL is a little bit slow, EAGER is a little bit faster than normal // we generally use normal  
		options.addArguments("--incognito");
		
		
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("riftarafia@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium2023");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		driver.findElement(By.linkText("Logout")).click();
		driver.findElement(By.linkText("Continue")).click();
		
	}

}
