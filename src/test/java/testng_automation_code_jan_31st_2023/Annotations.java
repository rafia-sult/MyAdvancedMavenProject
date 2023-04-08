package testng_automation_code_jan_31st_2023;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//always choose testng.annotation DO NOT CHOOSE JUNIT
//after running the code right click on the project and refresh you will see the test-output folder
//test-output folder -> index.html -> right click -> properties -> click the little arrow -> open index.html page 
//only non-static methods for annotations 

public class Annotations {
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("this is before suite annotation");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("this is before test annotation");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("this is before class annotation");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("this is before method annotation");
		
	}
	
	@Test
	public void testCase1 () {
		System.out.println("this is my test case");
	}
	
	@Test
	public void testCase2() {
		System.out.println("this is my test case 2");
	}
	
	@Test 
	public void testCase3() {
		System.out.println("this is my test case 3");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("this is after method annotation");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("this is after class annotation");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("this is after test annotation");
	}
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("this is after suite annotation");
	}
	
	

}
