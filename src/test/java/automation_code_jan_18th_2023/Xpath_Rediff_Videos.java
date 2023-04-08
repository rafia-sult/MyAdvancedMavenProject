package automation_code_jan_18th_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Rediff_Videos {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		driver.findElement(By.xpath("//a[@class='vdicon']")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Videos']")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Videos' and @class ='vdicon']")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Videos' or @class ='vdicon']")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Videos') and @class='vdicon']")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Videos') or @class='vdicon']")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Videos')]")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='cell topicons']/child::a[@class='vdicon']")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='cell topicons']/child::a[4]")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='table']/child::div[@class='cell topicons']/child::a[@class='vdicon']")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='table']/child::div[@class='cell topicons']/child::a[4]")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='cell topicons']/child::a/following-sibling::a[@class='vdicon']")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='logobar']/descendant::div[@class='cell topicons']/child::a[@class='vdicon']")).click();		
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='navbar']/preceding::div[@class='cell topicons']/child::a[@class='vdicon']")).click();		
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='navbar']/preceding::div[@class='cell topicons']/child::a[4]")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='navbar']/preceding-sibling::div[@class='logobar']/descendant::div[@class='cell topicons']/child::a[@class='vdicon']")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='navbar']/preceding-sibling::div[@class='logobar']/descendant::div[@class='cell topicons']/child::a[4]")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='logobar']/child::div[@class='table']/child::div[@class='cell topicons']/child::a[@class='vdicon']")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='cell topicons']/child::a[text()='Videos' or @class='vdicon']")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='cell topicons']/child::a[text()='Videos']")).click();
		
		System.out.println("Successfully ran all 20 xpaths");

	}
	
	

}
