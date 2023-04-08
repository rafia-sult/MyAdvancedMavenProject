package automation_code_jan_18th_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Rediff_Business_Email {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		driver.findElement(By.xpath("//a[@class='bmailicon relative']")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Business Email']")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Business Email' and @class ='bmailicon relative']")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Business Email' or @class ='bmailicon relative']")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Business Email') and @class='bmailicon relative']")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Business Email') or @class='bmailicon relative']")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Business Email')]")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='cell topicons']/child::a[@class='bmailicon relative']")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='cell topicons']/child::a[3]")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='table']/child::div[@class='cell topicons']/child::a[@class='bmailicon relative']")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='table']/child::div[@class='cell topicons']/child::a[3]")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='cell topicons']/child::a/following-sibling::a[@class='bmailicon relative']")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='logobar']/descendant::div[@class='cell topicons']/child::a[@class='bmailicon relative']")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='navbar']/preceding::div[@class='cell topicons']/child::a[@class='bmailicon relative']")).click();	
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='navbar']/preceding::div[@class='cell topicons']/child::a[3]")).click();	
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='navbar']/preceding-sibling::div[@class='logobar']/descendant::div[@class='cell topicons']/child::a[@class='bmailicon relative']")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='navbar']/preceding-sibling::div[@class='logobar']/descendant::div[@class='cell topicons']/child::a[3]")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='logobar']/child::div[@class='table']/child::div[@class='cell topicons']/child::a[@class='bmailicon relative']")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='cell topicons']/child::a[text()='Business Email' or @class='bmailicon relative']")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='cell topicons']/child::a[text()='Business Email']")).click();
		
		System.out.println("Successfully ran all 20 xpaths");

		
	}

}
