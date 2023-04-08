package automation_code_jan_18th_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Using_Contains {

	
	/* syntax5
	  *  //html [contains(@attribute, 'value')] 
	  *  
	  */
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
		driver.findElement(By.xpath("//input[contains(@id, 'input-firstname')]")).sendKeys("Rafia");
		driver.findElement(By.xpath("//input[contains(@id, 'input-lastname')]")).sendKeys("Sultana");
		driver.findElement(By.xpath("//input[contains(@id, 'input-email')]")).sendKeys("rafia@gmail.com");
		driver.findElement(By.xpath("//input[contains(@id, 'input-telephone')]")).sendKeys("000-000-0000");
		driver.findElement(By.xpath("//input[contains(@id, 'input-password')]")).sendKeys("RafiaSultana");
		driver.findElement(By.xpath("//input[contains(@id, 'input-confirm')]")).sendKeys("RafiaSultana");
		driver.findElement(By.xpath("//input[contains(@name, 'newsletter')]")).click();
		driver.findElement(By.xpath("//input[contains(@name, 'agree')]")).click();

		


		
		
	}

}
