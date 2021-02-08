package com.test.concepts;

import org.testng.annotations.Test;

public class DependencyTest {
	@Test
	private void searchMobile() {
		System.out.println("Search Mobile");

	}
	
	@Test(dependsOnMethods = "searchMobile" )
	private void searchLaptop() {
		System.out.println("Search Laptop");

	}
	
	@Test(dependsOnMethods = "searchLaptop")
	private void searchWatch() {
		System.out.println("Search Watch");

	}
	
	@Test(dependsOnMethods = "searchLaptop")
	private void searchTV() {
		System.out.println("Search TV");

	}
	
	




}
