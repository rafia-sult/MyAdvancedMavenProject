package automation_code_jan_10th_2023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://facebook.com");
//		driver.findElement(By.id("email")).sendKeys("riftarafia@gmail.com");
//		driver.findElement(By.name("pass")).sendKeys("password");
//		driver.findElement(By.name("login")).click();
		
		driver.findElement(By.linkText("Create new account")).click();	
		driver.findElement(By.name("firstname")).sendKeys("Rafia");
		driver.findElement(By.name("lastname")).sendKeys("Sultana");
		driver.findElement(By.name("reg_email__")).sendKeys("riftarafia@gmail.com");
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("riftarafia@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("password");
		
		//select from drop down
		//Create the object of Select class dropdown and pass the location in the constructor 
		//there are 3 methods user Select class which are selectByVisibleText, selectByIndex, selectByValue
		//we will only use selectByVisisbleText cause sometimes the index and value changes after adding more info to the dropdown
		
		Select select1 = new Select(driver.findElement(By.id("month")));
		select1.selectByVisibleText("Jul");
		
		Select select2 = new Select(driver.findElement(By.id("day")));
		select2.selectByVisibleText("20");
		
		Select select3 = new Select(driver.findElement(By.id("year")));
		select3.selectByVisibleText("1971");
		
		/*instead of typing select1,2,3 multiple times i can use public static on the top outside of main method
	 	to declare the variable once and use it as many times 
	 	like this: 
	 	first declare the variable outside of main method
	 	public static Select select; 
	 	
		select = new Select(driver.findElement(By.id("month")));
		select.selectByVisibleText("Jul");
		
		select = new Select(driver.findElement(By.id("day")));
		select.selectByVisibleText("20");
		
		select = new Select(driver.findElement(By.id("year")));
		select.selectByVisibleText("1971");
		 */
		
		driver.findElement(By.xpath("//label[contains(text(), 'Female')]")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();

	}

}
