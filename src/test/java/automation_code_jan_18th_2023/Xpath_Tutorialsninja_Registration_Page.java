package automation_code_jan_18th_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Tutorialsninja_Registration_Page {

	public static void main(String[] args) {

		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
		driver.findElement(By.xpath("//input[@id = 'input-firstname']")).sendKeys("Rafia");
		
		
		driver.findElement(By.xpath("//input[@id = 'input-lastname']")).sendKeys("Sultana");
		driver.findElement(By.xpath("//input[@id = 'input-email']")).sendKeys("rasultana@mybihs.org");
		driver.findElement(By.xpath("//input[@id = 'input-telephone']")).sendKeys("347-221-7366");
		driver.findElement(By.xpath("//input[@id = 'input-password']")).sendKeys("Selenium2023");
		driver.findElement(By.xpath("//input[@id = 'input-confirm']")).sendKeys("Selenium2023");
		driver.findElement(By.xpath("//input[@name = 'newsletter']")).click();
		driver.findElement(By.xpath("//div [@class = 'pull-right']/child::input[@name = 'agree']")).click();
		driver.findElement(By.xpath("//div [@class = 'pull-right']/child::input[@class = 'btn btn-primary']")).click();


		
	}

}
