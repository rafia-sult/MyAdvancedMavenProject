package automation_code_jan_17th_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningValidations {

	// getTitle(); this gives title of the current web page 
	// getcurrentUrl(); this gives url
	// getpageSource(); 
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		System.out.println("This is the title of the page: " + driver.getTitle());
		System.out.println("current url of this page is: " + driver.getCurrentUrl());
		
		driver.findElement(By.className("signin")).click();
		System.out.println("Title of this page is: " + driver.getTitle());
		System.out.println("Current url of this page is: " + driver.getCurrentUrl());
		
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.name("passwd")).sendKeys("Selenium@123");
		driver.findElement(By.className("signinbtn")).click();
		Thread.sleep(3000);
		System.out.println("Title of this page is : " + driver.getTitle());
		System.out.println("Current url of this page is: " + driver.getCurrentUrl());
		
		driver.findElement(By.className("rd_logout")).click();
		Thread.sleep(3000);
		System.out.println("Title of this page is: " + driver.getTitle());
		System.out.println("Current url of this page is: " + driver.getCurrentUrl());

		
		
	
		
		
		
		
		
	
		
		
	}

}
