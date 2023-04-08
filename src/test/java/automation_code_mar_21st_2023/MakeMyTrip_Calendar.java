package automation_code_mar_21st_2023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MakeMyTrip_Calendar {
	public static ChromeOptions options;
	public static WebDriver driver;
	public static WebDriverWait wait;

	public static void main(String[] args) throws Exception {
		options = new ChromeOptions();
		options.addArguments("--start-maximized");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);

		driver.get("https://www.makemytrip.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[@data-cy='roundTrip']")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("fromCity")).click();
		Thread.sleep(2000);

//		driver.findElement(By.xpath("//p[contains(text(),'Mumbai, India')]")).click();

//		since new york is not working using the previous code try this below 
		driver.findElement(By.xpath("//input[@placeholder = 'From']")).sendKeys("New York");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[contains(text(),'New York, United States')]")).click();

		Thread.sleep(2000);

		driver.findElement(By.id("toCity")).click();
//		Thread.sleep(2000);

//		driver.findElement(By.xpath("//p[contains(text(), 'New Delhi, India')]")).click();

//		since boston is not working using the previous code try this below 

//		you can also use webDriver wait instead of thread.sleep 
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder = 'To']")));

		driver.findElement(By.xpath("//input[@placeholder = 'To']")).sendKeys("Boston");

//		Thread.sleep(2000);
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//p[contains(text(), 'Boston, United States')]")));
		driver.findElement(By.xpath("//p[contains(text(), 'Boston, United States')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='departure']")).click();
		Thread.sleep(2000);
		
		
		WebElement calendarToBeClicked = driver.findElement(By.xpath("//input[@id='departure']"));
		calendarToBeClicked.click();
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ui-datepicker-div")));
		
		
		
		departureDate("23", "April", "2023");
		

	}

	public static void departureDate(String calendarDay, String calendarMonth, String calendarYear) {
		if (Integer.parseInt(calendarDay) > 31) {
			System.out.println("Invalid Date");
			return;
		}
	}

	public static void returnDate(String calendarDay, String calendarMonth, String calendarYear) {
		if (Integer.parseInt(calendarDay) > 31) {
			System.out.println("Invalid Date");
			return;

		}
	}
}
