package automation_code_jan_17th_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class How_To_Validate {

	public static void main(String[] args) throws InterruptedException {

		// how to validate? if this url is correct then click on this specific link etc 
		

		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
				
	
		// landing page 
				
		driver.get("https://rediff.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
				
		String actualTitle = "Rediff.com: News | Rediffmail | Stock Quotes | Shopping";
		String expectedTitle = driver.getTitle();
		
		String actualCurrentUrl = "https://www.rediff.com/";
		String expectedCurrentUrl = driver.getCurrentUrl();
				
		if (actualTitle.equals(expectedTitle) && actualCurrentUrl.equals(expectedCurrentUrl)) {
			driver.findElement(By.className("signin")).click();
					
					
		} else {
			System.out.println("Either title or url is wrong");
		}
				
		// login  
				
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
				
		String actualTitle1 = "Rediffmail";
		String expectedTitle1 = driver.getTitle();
				
		String actualCurrentUrl1 = "https://mail.rediff.com/cgi-bin/login.cgi";
		String expectedCurrentUrl1 = driver.getCurrentUrl();
				
		if (actualTitle1.equals(expectedTitle1) && actualCurrentUrl1.equals(expectedCurrentUrl1)) {
					
		driver.findElement(By.id("login1")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Selenium@123");
		driver.findElement(By.className("signinbtn")).click();
		} else {
					
		System.out.println("Either title or url is wrong");
		
		}
				
		//logout 
				
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
				
		String actualTitle2 = "Rediffmail";
		String expectedTitle2 = driver.getTitle();
				
		String actualCurrentUrl2 = "https://f5mail.rediff.com/ajaxprism/container?angular=1&els=8783b8b6edab5d67221e0efd32c0c98c&user_size=1";
		String expectedCurrentUrl2 = driver.getCurrentUrl();
				
				
				
		if (actualTitle2.equals(expectedTitle2) && actualCurrentUrl2.equals(expectedCurrentUrl2)) {
					
					
		driver.findElement(By.className("rd_logout")).click();
		Thread.sleep(3000);
					
		} else {
			System.out.println("Either title or url is wrong");
		}
				
	}

}
