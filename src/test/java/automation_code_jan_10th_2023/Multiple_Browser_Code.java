package automation_code_jan_10th_2023;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multiple_Browser_Code {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		//WebDriver is an interface. interface is used for security purpose. 
		//because it enables abstraction 
		
		driver.manage().window().maximize();
		// this will maximize the website window 
		
		driver.manage().deleteAllCookies();
		// this will delete all the cookies 
		
		driver.get("https://amazon.com");
		
		//driver.close(); 
		
		// this will close the web site automatically without you having to manually do it 
		
		driver.quit(); 
		// its better to use this command than driver.close(); cause no memory will used.
		//driver.close will only close the web site but driver.quit will also delete the instance so no memory will be used

		WebDriver driver1 = new FirefoxDriver();
		driver1.manage().window().maximize();
		driver1.manage().window().maximize();
		driver1.manage().deleteAllCookies();
		driver1.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver1.get("https://rediff.com");
		driver1.quit();
		
		WebDriver driver2 = new EdgeDriver();
		driver2.manage().window().maximize();
		driver2.manage().window().maximize();
		driver2.manage().deleteAllCookies();
		driver2.get("https://walmart.com");
		driver2.quit();
		
		
	}

}
