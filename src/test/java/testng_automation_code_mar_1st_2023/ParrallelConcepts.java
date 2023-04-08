package testng_automation_code_mar_1st_2023;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

// convert to testNG via tests on the option 

public class ParrallelConcepts {
	
	public static WebDriver driver;
	
	@Test(invocationCount = 2, threadPoolSize = 2)
	public void ninjaRandomParallelTest() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.tutorialsninja.com/demo/");
		driver.quit();
	}

}
