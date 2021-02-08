package com.test.concepts;

import org.testng.annotations.Test;

public class Dependency1 {
	
	@Test//(groups = "pre-tests")
	public void init() {
		System.out.println("init resources");
	}

	@Test//(groups = "tests", dependsOnGroups = "pre-tests")
	public void insert() {
		System.out.println("inserting demo data");
	}

	@Test(dependsOnMethods = "cleanup")
	public void select() {
		System.out.println("selecting demo data");
	}

	@Test(dependsOnMethods = "select")
	public void update() {
		System.out.println("updating demo data");
	}

	@Test(dependsOnMethods =  "update" )
	public void delete() {
		System.out.println("deleting demo data");
	}

	@Test
	public void cleanup() {
		System.out.println("closing resources");
	}


}
