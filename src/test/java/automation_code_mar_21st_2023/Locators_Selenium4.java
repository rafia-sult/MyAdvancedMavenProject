package automation_code_mar_21st_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class Locators_Selenium4 {

	// what are the new locators that are in selenium 4 that wasnt in selenium 3
	// They might ask about these locators in interview 
	// near
	// below
	// above
	// torightOf
	// toLeftOf

	public static ChromeOptions options;
	public static WebDriver driver;

	public static void main(String[] args) {
		
		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.addArguments("--start-maximized");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		//Step 1 - you have to identify a reference WebElement 
		WebElement referencePoint = driver.findElement(By.xpath("//p[contains(text(),'Password')]"));
		
		
		//above
		
		// you have to manually import WITH
		String aboveElement = driver.findElement(with(By.tagName("p")).above(referencePoint)).getText();
		System.out.println("The element above the reference is: " +aboveElement);
		
		//below 
		
		String belowElement = driver.findElement(with(By.tagName("label")).below(referencePoint)).getText();
		System.out.println("The element below the reference is: " +belowElement);

		
		//near
		
		
	


	}

}
