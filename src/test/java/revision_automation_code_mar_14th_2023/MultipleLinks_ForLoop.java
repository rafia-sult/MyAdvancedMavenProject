package revision_automation_code_mar_14th_2023;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MultipleLinks_ForLoop {

	public static WebDriver driver;
	public static ChromeOptions options;

	public static void main(String[] args) {
		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.addArguments("--start-maximized");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("http://amazon.com");

		// which html tag represents link? a (ancor tag)
		List<WebElement> AllLinks = driver.findElements(By.tagName("a"));

		// total number of links for amazon.com page as of march 14th 2022, 19:50 EST

		System.out.println("Total links: " + AllLinks.size());

		// for that we have to use for loop

		for (int i = 1; i < AllLinks.size(); i++) {
			WebElement TotalLinks = AllLinks.get(i);
			System.out.println(TotalLinks.getText());
		}

		// get the text of 31st link

		WebElement ThirtyFirstLink = AllLinks.get(30);
		System.out.println("Text of the 101st link is: " + ThirtyFirstLink.getText());

		// print all the links present in the amazon.com webpage

		for (int i =1; i<AllLinks.size(); i++) {
			WebElement TotalLinks = AllLinks.get(i);
			System.out.println(TotalLinks.getText());
		}
	}

}
