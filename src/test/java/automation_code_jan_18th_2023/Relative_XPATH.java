package automation_code_jan_18th_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Relative_XPATH {

	public static void main(String[] args) {
		
 /*  Syntax of Relative Xpath 
  *  //html[@attribute = 'valueoftheattribute']
  *  
  *  id 
  *  name 
  *  className 
  *  
  *  syntax1
  *  //html[@attribute = 'valueoftheattribute']
  *  
  *  syntax2
  *  //html[@attribute1 = 'value' and @attribute2 = 'value']
  *  
  *  syntax3
  *  //html[@attribute1 = 'value' or @attribute2 = 'value']
  *  
  *  syntax4
  *  //html[text() = 'valueofthetext'] - this xpath only works for link 
  *  
  *  syntax5
  *  //html [contains(@attribute, 'value')] 
  *  
  *  syntax6 
  *  //html [contains(text(), 'valueofthetext')] - only for link 

  */
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo/index.php?route=account/register");
		driver.findElement(By.xpath("//input[@id = 'input-firstname']")).sendKeys("Rafia");
		driver.findElement(By.xpath("//input[@id = 'input-lastname' and @name = 'lastname']")).sendKeys("Sultana");
		driver.findElement(By.xpath("//input[@id = 'input-email' or @name = 'email']")).sendKeys("Rafia@gmail.com");
		driver.findElement(By.xpath("//input[@id = 'input-telephone']")).sendKeys("000-000-0000");
		driver.findElement(By.xpath("//input[@id = 'input-password']")).sendKeys("Rafia_sultana");
		driver.findElement(By.xpath("//input[@id = 'input-confirm']")).sendKeys("Rafia_sultana");
		
		driver.findElement(By.xpath("//input[@name = 'newsletter']")).click();
		
		
		
		
		
/*	ancestor 
 *  parents 
 *  child 
 *  following-sibling
 *  preceding-sibling 
 *  descendant
 *  following
 *  preceding 
 * 
 */
		
		//a[contains(text(), 'Videos')]
		
		


		
	}

}
