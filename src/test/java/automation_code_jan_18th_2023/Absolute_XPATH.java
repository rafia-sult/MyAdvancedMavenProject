package automation_code_jan_18th_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Absolute_XPATH {
	
	/* what are Xpaths? - address of a web element. Xpath is the symbolic form of an web element address. 
	 * types: 
	 * 1. Absolute Xpath
	 * 2. Relative Xpath 
	 * inspect --> right click --> copy --> copy full xpath 
	 * not advisable to use absolute Xpath 
	 * more accurate but should not be used 
	 * DO NOT USE ABSOLUTE XPATH 
	 * 
	 */
	

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo/");
		driver.findElement(By.xpath("/html/body/nav/div/div[2]/ul/li[2]/a/span[1]")).click(); // do not use xpath cause if dev change the div or anything small if your break your code 
		

		
		
		
		
		
	}

}
