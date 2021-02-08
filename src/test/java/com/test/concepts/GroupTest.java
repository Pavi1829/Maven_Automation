package com.test.concepts;

import org.testng.annotations.Test;

public class GroupTest {
	@Test(groups = "Selenium")
	private void seleniumTest1() {
		System.out.println("Log In");

	}

	@Test(groups = "API")
	private void APITest1() {
		System.out.println("Post Test");

	}

	@Test(groups = "Java")
	private void JavaTest1() {
		System.out.println("Print");

	}

	@Test(groups = "API")
	private void APITest2() {
		System.out.println("GET Test");

	}

	@Test(groups = "Selenium")
	private void seleniumTest2() {
		System.out.println("Order a product");
	}

	@Test(groups = "Java")
	private void JavaTest2() {
		System.out.println("Output");

	}

}
