package automation_code_feb_21st_2023;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileHandling {

	// how to read from a properties.file
	// really important
	// you will be doing this a lot for framework
	// what is properties.file?
	// - properties files take care of all hard code data

	// step 1: create a properties file (right click on the package -> new -> file -> nameanything.properties 
	// step 2: create the object of Properties Class
	// step 3: copy the path right click on the class -> properties -> copy path 

	public static WebDriver driver;

	public static void main(String[] args) throws Exception {
		
	// create the object of properties class
		
		Properties prop = new Properties();
		System.out.println(System.getProperty("user.dir"));
	
		// create the object of file input stream
		
		FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "\\src\\test\\java\\automation_code_feb_21st_2023\\config.properties");
		prop.load(ip);
		
	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.findElement(By.linkText(prop.getProperty("linkTextofMyAccount"))).click();
		driver.findElement(By.linkText(prop.getProperty("linkTextofLogin"))).click();
		driver.findElement(By.id(prop.getProperty("locatorIdEmailTextBox"))).sendKeys(prop.getProperty("username"));
		driver.findElement(By.id(prop.getProperty("locatorIdPasswordTextBox"))).sendKeys(prop.getProperty("password"));
		driver.findElement(By.cssSelector(prop.getProperty("cssSelectorofLoginButton"))).click();
		driver.findElement(By.linkText(prop.getProperty("linkTextofLogout"))).click();
		driver.findElement(By.linkText(prop.getProperty("linkTextofContinueButton"))).click();

	}

}
