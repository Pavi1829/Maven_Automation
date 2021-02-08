package com.test.concepts;

import org.testng.annotations.Test;

public class InvocationCount {
	
	@Test
	private void SearchLaptop() {
		System.out.println("Search Laptop");

	}
	
	@Test(invocationCount = 3)
	private void SearchWatch() {
		System.out.println("Search Watch");

	}

	
	@Test
	private void SearchTV() {
		System.out.println("Search TV");

	}

	
	@Test(invocationCount = 6)
	private void Searchdress() {
		System.out.println("Search Dress");

	}


}
