package revision_automation_code_mar_14th_2023;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Flipkart {
	public static WebDriver driver;
	public static ChromeOptions options;

	public static void main(String[] args) {

		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.addArguments("--start-maximized");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get(
				"https://www.flipkart.com/mens-tshirts/pr?sid=clo,ash,ank,edy&fm=neo%2Fmerchandising&iid=M_ecacb764-c596-4c4c-b16a-6db1ad164e97_1_372UD5BXDFYS_MC.IF56C41VGEYS&otracker=hp_rich_navigation_2_1.navigationCard.RICH_NAVIGATION_Fashion~Men%2527s%2BTop%2BWear~Men%2527s%2BT-Shirts_IF56C41VGEYS&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_2_L2_view-all&cid=IF56C41VGEYS");

		// Casual T shirts
		List<WebElement> casualTShirts = driver.findElements(By.cssSelector("img._2r_T1I"));
		System.out.println("Total number of casual t-Shits: " + casualTShirts.size());

//		for (WebElement f : casualTShirts) {
//			System.out.println(f.getText());

		List<WebElement> priceTShirts = driver.findElements(By.xpath("//div[@class = '_30jeq3']"));
		System.out.println("Total number of price rep. for the tshirts: " + priceTShirts.size());

		for (int i = 0; i < casualTShirts.size(); i++) {
			System.out.println(casualTShirts.get(i).getText() + "-----------" + priceTShirts.get(i).getText());
		}
	}

}
