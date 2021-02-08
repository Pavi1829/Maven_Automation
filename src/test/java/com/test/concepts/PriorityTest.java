package com.test.concepts;

import org.testng.annotations.Test;

public class PriorityTest {
	@Test(priority = 1)
	private void SearchDress() {
		System.out.println("Search Dress");

	}
	
	@Test(priority=4)
	private void SearchFlower() {
		System.out.println("Search Flower");

	}
	
	@Test(priority = 0 )
	private void SearchFruits() {
		System.out.println("Search Fruits");

	}

	@Test
	private void SearchShoes() {
		System.out.println("Search Shoes");

	}

	@Test
	private void SearchMilk() {
		System.out.println("Search Milk");

	}


}
