package automation_code_jan_18th_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Rediff_Create_Account {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		driver.findElement(By.xpath("//p[@id='signin_info']/child::a[2]")).click();	
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='cell alignR toprlinks']/child::p[@id='signin_info']/child::a[2]")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(), 'Create Account')]")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[(text() = 'Create Account')]")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='cell']/following-sibling::div[2]/descendant::a[2]")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='cell']/following::div[2]/descendant::a[2]")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='cell alignR toprlinks']/descendant::a[2]")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='cell topicons']/following-sibling::div[@class='cell alignR toprlinks']/child::p[@id='signin_info']/child::a[2]")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='cell topicons']/following-sibling::div[1]/descendant::a[2]")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='logobar']/child::div[1]/child::div[3]/child::p[1]/child::a[2]")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='logobar']/descendant::p[@id='signin_info']/child::a[2]")).click();	
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='logobar']/descendant::p/child::a[2]")).click();		
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='table']/child::div[3]/p[@id='signin_info']/child::a[2]")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='cell topicons']/following::div[1]/descendant::a[2]")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p[@id='signin_info']/child::a[@class='signin']/following::a[1]")).click();	
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//p[@id='signin_info']/child::a[@class='signin']/following-sibling::a[1]")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='navbar']/preceding-sibling::div[@class='logobar']/descendant::div[4]/descendant::a[2]")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='navbar']/preceding-sibling::div[@class='logobar']/descendant::div[4]/child::p[@id='signin_info']/child::a[2]")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='navbar']/preceding::div[@class='logobar']/descendant::div[4]/child::p[@id='signin_info']/child::a[2]")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='navbar']/preceding::div[@class='logobar']/descendant::div[4]/child::p[1]/child::a[1]/following::a[1]")).click();
	
		System.out.println("Successfully ran all 20 xpaths");
		
		
	}
	


}
