package automation_code_mar_21st_2023;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CalenderDemo1_JavascriptExecutor {
	public static ChromeOptions options;
	public static WebDriver driver;
	public static WebDriverWait wait;

	public static void main(String[] args) {
		options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");
		JavascriptExecutor jse = ((JavascriptExecutor) driver);
		jse.executeScript("document.getElementById('datepicker').value='09/27/2024'");

	}
}
