package com.test.concepts;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class IgnoreTest {
	@Test
	@Ignore
	private void SearchMobile() {
		System.out.println("Search Mobile");

	}
	
	@Test
	private void SearchLaptop() {
		System.out.println("Search laptop");

	}
	
	@Test(enabled = false)
	private void SearchTv() {
		System.out.println("Search Television");

	}
	
	@Test
	private void SearchWatch() {
		System.out.println("Search Watch");

	}


	

}
