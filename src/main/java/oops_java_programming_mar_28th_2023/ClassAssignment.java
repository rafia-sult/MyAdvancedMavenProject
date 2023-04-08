package oops_java_programming_mar_28th_2023;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

// retrieve the value in 120th 4th column
// total company names
// total current price 

public class ClassAssignment {

	public static WebDriver driver;
	public static ChromeOptions options;
	public static String companyName1 = "Tasty Bite";
	public static String companyName2 = "Flex Foods";

	public static void main(String[] args) {
		
		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.addArguments("--start-maximized");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("https://money.rediff.com/gainers");
		
		//to determine the element in 120th row 4th column 
		String element = driver.findElement(By.xpath("//table[@class = 'dataTable']/tbody/tr[120]/td[4]")).getText();
		System.out.println("The name of the element is: " + element);
		
		//determine total companies 
		List<WebElement> companies = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
		System.out.println("Total number of companies are: " + companies.size());
		
		//determine total current prices 
		List<WebElement> currentPrices = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
		System.out.println("Total current prices are: " + currentPrices.size());
		
		//print names of all the companies along with there current prices
//		for(int i = 0; i<companies.size();i++) {
//			System.out.println(companies.get(i).getText()+"-----------" + currentPrices.get(i).getText());
//		}

		//determine the current price of Tasty Bite company //first declare Tasty Bite above 
		for(int i =0; i<companies.size();i++) {
			if(companyName1.equals(companies.get(i).getText())) {
				System.out.println(companies.get(i).getText()+"--------"+currentPrices.get(i).getText());
				break;
			}
		}
		
		//if you want to find 2 company names 
		for(int i =0; i<companies.size();i++) {
			if(companyName1.equals(companies.get(i).getText()) && companyName2.equals(companies.get(i).getText()) ) {
				System.out.println(companies.get(i).getText()+"--------"+currentPrices.get(i).getText());
				break;
			}
		}
		
	}

}
