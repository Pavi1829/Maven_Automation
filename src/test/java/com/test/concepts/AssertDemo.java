package com.test.concepts;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertDemo {
	String actual = "Pavi";
	String expected = "Ram";

	// Hard Asset
	/*
	 * @Test private void test1() { System.out.println("Test1 Started");
	 * Assert.assertEquals(actual, expected); System.out.println("Test1 Completed");
	 * 
	 * }
	 */
	
    //Soft Assert
	@Test
	private void test2() {
		SoftAssert sa = new SoftAssert();
		System.out.println("Test2 Started");
		sa.assertEquals(actual, expected);
		System.out.println("Test2 Completed");
		sa.assertAll();

	}

}
