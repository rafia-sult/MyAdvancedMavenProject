package collection_framework_march_29th_2023;

import java.util.ArrayList;
import java.util.List;

public class Collection {

	public static void main(String[] args) {
		// Collection framework uses Wrapper Classes, it does not use regular classes at
		// all
		// list of webElement (list is collection)
		// driver.findelement is also collection
		// List <WebElement> Companies = driver.findElements(By.xpath("some xpath"));
		// what is the <WebElement> here? inside the < > brackets?
		// WebElement is an interface
		// similarly WebDriver driver = new ChromeDriver();
		// ChromeDriver is an implementing class of WebDriver interface. WebDriver is
		// using its reference, driver, WebDriver is telling driver please connect to my
		// implementing class which is ChromeDriver

		// everything in an angular bracket <> is <WrapperClass>
		// when there are too many data like char, boolean etc java will not understand,
		// java will understand objects and objects will be represented in the form of
		// wrapper classes.

		List<Integer> list1 = new ArrayList<Integer>();
		// here List is an Interface, Integer is a WrapperClass, list1 is a reference,
		// ArrayList(implementing class of List)
		
		ArrayList<String> al = new ArrayList<String>();
		//here ArrayList is a class, String is a WrapperClass 
		// ALWAYS REMEMBER STRING IS THE ONLY CLASS IN JAVA THAT IS ALSO AN OBJECT

	}

}
