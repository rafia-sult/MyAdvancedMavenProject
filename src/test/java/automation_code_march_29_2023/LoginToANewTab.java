package automation_code_march_29_2023;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginToANewTab {

	public static ChromeOptions options;
	public static WebDriver driver;

	@BeforeMethod
	public void ninjaTutorial() {
		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.addArguments("--start-maximized");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("https://www.amazon.com/");
	}

	@Test
	public void loginToNewTab() {
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("https://rediff.com");
	}

}
