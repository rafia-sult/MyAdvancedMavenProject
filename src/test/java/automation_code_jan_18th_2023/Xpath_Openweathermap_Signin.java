package automation_code_jan_18th_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Openweathermap_Signin {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();		
		driver.get("https://openweathermap.org/");
		Thread.sleep(6000);	
		driver.findElement(By.xpath("//a[text()='Sign in']")).click();
		driver.findElement(By.xpath("//div[@class = 'input-group']/child::input[@id='user_email']")).sendKeys("rasultana@mybihs.org");
		driver.findElement(By.xpath("//div[@class = 'input-group']/following-sibling::div[1]/child::input[@id='user_password']")).sendKeys("Selenium2023");
		driver.findElement(By.xpath("//form[@id='new_user']/child::input[@name='commit']")).click();
		

	}

}


