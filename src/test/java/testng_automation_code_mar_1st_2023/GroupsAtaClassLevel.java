package testng_automation_code_mar_1st_2023;

import org.testng.annotations.Test;




@Test(groups= "CompleteClassLevelTests")

//in testNG you can include/exclude using the group name on top 

public class GroupsAtaClassLevel {
	
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
