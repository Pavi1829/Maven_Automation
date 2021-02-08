package com.test.concepts;

import org.testng.annotations.*;

public class SimpleAnnotations {
	
	@BeforeSuite
	private void SetUp() {
		System.out.println("SetUp");

	}
	@BeforeTest
	private void browserLaunch() {
		System.out.println("Browser Launch");

	}
	
	@BeforeClass
	private void Url() {
		System.out.println("Url");

	}
	
	@BeforeMethod
	private void login() {
		System.out.println("login");

	}
	
		
	@Test
	private void SearchLaptop() {
		System.out.println("Search Laptop");

	}
	
	@Test
	private void SearchMobile() {
		System.out.println("Search Mobile");

	}

	
	@AfterMethod
	private void VerifyHomePage() {
		System.out.println("Verify Home Page");

	}
	
	@AfterClass
	private void logout() {
		System.out.println("Logout");

	}
	
	@AfterTest
	private void CloseBrowser() {
		System.out.println("Close Browser");

	}
	
	@AfterSuite
	private void DeleteCookies() {
		System.out.println("Delete Cookies");

	}
	
	

}
