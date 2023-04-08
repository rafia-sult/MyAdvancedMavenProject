package automation_code_mar_21st_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AsapTickets_CalendarDemo {
	
	public static ChromeOptions options; 
	public static WebDriver driver; 

	public static void main(String[] args) throws Exception {
		options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);

		driver.get("https://www.asaptickets.com/");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("label.defaultRadioStyle__Style-sc-1hj6l0v-0.SltMF.pos-rlt.pointer.no-wrap.checked.m-r-sm")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='mui-45209']")).click();
		Thread.sleep(1000);
		
		
		////input[@id = 'mui-59484']

	}

}
