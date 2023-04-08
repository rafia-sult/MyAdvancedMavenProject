package testng_automation_code_mar_1st_2023;

import org.testng.annotations.Test;

// lets say which browser you want to execute in 
// in testNG.xml you would 
// write inside the include/exclude tag <include name = "windows.*"></include> 
// <include name = "linux.*"></include> 

public class RegularExpressions {

	
	@Test(groups = {"safari.smoke"})
	public void testCase1() {
		System.out.println("this is tc1");
	}

	@Test(groups = {"smoke", "sanity"})
	public void testCase2() {
		System.out.println("this is tc2");

	}

	@Test(groups = {"sanity", "smoke", "regression"})
	public void testCase3() {
		System.out.println("this is tc3");

	}

	@Test(groups = {"windows.sanity"})
	public void testCase4() {
		System.out.println("this is tc4");

	}

	@Test(groups = {"linux.regression"})
	public void testCase5() {
		System.out.println("this is tc5");

	}
	
}
