package testng_automation_code_mar_1st_2023;

import org.testng.annotations.Test;


// testNG.xml file if you only add group smoke and sanity.. only test case 1-4 will execute cause those 
// test cases include smoke and sanity. test case number 5 will not execute cause it only has regression 
// vive-versa which ever you included it will execute 
// if you exclude a group even if include group is there exclude will override and not execute the test case

public class Understanding_Groups {

	@Test(groups = {"smoke"})
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

	@Test(groups = {"sanity"})
	public void testCase4() {
		System.out.println("this is tc4");

	}

	@Test(groups = {"regression"})
	public void testCase5() {
		System.out.println("this is tc5");

	}

}
