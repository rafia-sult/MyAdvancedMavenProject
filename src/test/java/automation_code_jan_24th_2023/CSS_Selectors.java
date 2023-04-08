package automation_code_jan_24th_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selectors {

	/*
	 * css selectors are slightly faster than xpaths css selectors also handle
	 * compound classes better css selectors are slightly more accurate than xpaths
	 * in case you are using compound classes (he advises not to use it) but with
	 * css selectors they handle compound class better
	 * 
	 * syntax of css selectors
	 * 
	 * html[attribute = value]
	 * 
	 * html#id (# works only for id)
	 * 
	 * html.class (. workds for class)
	 * 
	 * html#id.class
	 * 
	 * html#id.class1.class2
	 * 
	 * to use compound class wherever there is a space just delete and write a . ex:
	 * a.bmailicon.relative put a . in between all the spaces no matter how big the
	 * compound class is
	 * 
	 * what if it has and id and class html#id.class html#id.class.class
	 * 
	 * use css seletors for compound classes otherwhise stick to xpaths especially
	 * for traveling
	 * 
	 * use css seletors for compound classes otherwhise stick to xpaths especially
	 * for traveling Sibling to sibling use + parent to child use space or parents
	 * to child use this syntax > html:nth-child(1) or parents to child use this
	 * syntax > html:nth-of-type(1)
	 * 
	 * CSS FAMILY TREE (openweather.com)
	 * 
	 * html attribute value of attribute > html : nth-child(number) > html :
	 * nth-child(number) 
	 * example: li.logo > a:nth-child(1) > img:nth-child(1)
	 * 
	 * use + to reach from sibling to sibling 
	 * html attribute value of attribute + name of sibling + name of sibling value of attribute > html attribute value
	 * of attribute > html attribute value of attribute > html >
	 * html:nth-child(number) 
	 * 
	 * example: div#banner_android + script + nav#nav-website > ul#first-level-nav > li.logo > a > img:nth-child(1) 
	 * or div#banner_android + script + nav#nav-website ul li a img
	 * 
	 * moving between sibling to sibling use + symble moving from a parent to child
	 * you can use a space or moving from a parent to child you can use > followed
	 * by html:nth-child(number) moving from a parent to child you can use >
	 * html:nth-of-type(1)
	 */

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("http://www.tutorialsninja.com/demo/");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.cssSelector("input#input-firstname")).sendKeys("Rafia");
		driver.findElement(By.cssSelector("input#input-lastname.form-control")).sendKeys("Sultana");
		driver.findElement(By.cssSelector("input#input-email")).sendKeys("Rafia@gmail.com");
		driver.findElement(By.cssSelector("input#input-telephone.form-control")).sendKeys("0000000000");
		driver.findElement(By.cssSelector("input#input-password.form-control")).sendKeys("Rafia2023");
		driver.findElement(By.cssSelector("input#input-confirm.form-control")).sendKeys("Rafia2023");
		driver.findElement(By.cssSelector("input[name=agree]")).click();
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();

	}

}
