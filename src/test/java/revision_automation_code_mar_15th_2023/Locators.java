package revision_automation_code_mar_15th_2023;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Locators {
	
	public static ChromeOptions options; 
	public static WebDriver driver; 

	public static void main(String[] args) {

//		WebDriver driver = new ChromeDriver();
		/*
		 * this line of code will only work for selenium 4.6.0 and above this will not
		 * work for selnium 4.6.0 and below for 4.6.0 and below either you can to use
		 * webdriver manager or system.setProperty
		 */
		
		
		options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("https://rediff.com");
		
//we need this above code for updated chrome version 

		// what you want to do in the browser?
		
		// is helped by understanding of locators in selenium
			// id, class, name, linkText, partialLinkText, xpath, cssSelector, tagname these are the 8 are the most popular 
			//ByAll, ByIdOrName, ByChained 
			//near, above, below, toRightOf, toLeftOf
		
		
		
			// driver.findElement(By.className("bmailicon relative")).click();
		
			driver.findElement(By.partialLinkText("Create Acc")).click();
//---------------------------------------------------------------------------------------		

			//tagname is mostly used for retrival, its not used for highlighting something and it is mostly used for 
			//multiple webelements not single webelement 
			driver.findElements(By.tagName("input")); //you can store all these input tag in a list of webElements like this: 
			
			List <WebElement> webelements = driver.findElements(By.tagName("input"));
			System.out.println("total web elements that has input html tags are: " + webelements.size());
			
			
		// what all you want to automate?

		// only writting the code the flow is not automation
	}

}
