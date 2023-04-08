package automation_code_jan_11th_2023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NinjaTutorial {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.tutorialsninja.com/demo/");
		driver.findElement(By.xpath("//span [contains(text(), 'My Account')]")).click();
		driver.findElement(By.xpath("//a[contains(text(), 'Login')]")).click();
		driver.findElement(By.xpath("//input[@id = 'input-email']")).sendKeys("rasultana@mybihs.org");
		driver.findElement(By.xpath("//input[@id = 'input-password']")).sendKeys("Selenium2023");
		driver.findElement(By.xpath("//input[@class='btn btn-primary']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
//		driver.findElement(By.name("firstname")).sendKeys("Rafia");
//		driver.findElement(By.id("input-lastname")).sendKeys("Sultana");
//		driver.findElement(By.id("input-email")).sendKeys("eiads@gmail.com");
//		driver.findElement(By.id("input-telephone")).sendKeys("0000000000");
//		driver.findElement(By.id("input-password")).sendKeys("Selenium2023");
//		driver.findElement(By.id("input-confirm")).sendKeys("Selenium2023");
//		driver.findElement(By.name("agree")).click();
//		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
//		
	
		
		
		
		

	}

}
