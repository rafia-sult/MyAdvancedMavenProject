package automation_code_feb_15th_2023;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class ScreenShots {

	public static WebDriver driver;

	@Test
	public void checkingScreenShot() throws Exception{

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.jeevansathi.com/");

		WebElement titlePhoto = driver.findElement(By.cssSelector("div.middle_div.mtn606"));
		WebElement logo = driver.findElement(By.cssSelector("img.brdr-0.vmid.hgt63"));


		File destination = new File("C:\\Users\\Rafia Sultana\\eclipse-workspace\\ADVANCED_MAVEN_PROJECT\\ScreenShots\\jeevansathilogo.png");
		File source = logo.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(source, destination);
		
		File destination1 = new File("C:\\Users\\Rafia Sultana\\eclipse-workspace\\ADVANCED_MAVEN_PROJECT\\ScreenShots\\jeevansathipicture.png");
		File source1 = titlePhoto.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(source1, destination1);
		
		
	}

}
