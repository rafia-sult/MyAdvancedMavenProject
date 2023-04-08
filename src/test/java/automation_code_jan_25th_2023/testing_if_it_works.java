package automation_code_jan_25th_2023;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testing_if_it_works {

	public static void main(String[] args) {

		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		
		
	}

}
