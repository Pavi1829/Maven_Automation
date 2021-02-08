package com.test.concepts;

import org.testng.annotations.Test;

public class TimeOut {
	
	@Test(timeOut =3000 )
	private void SearchDress() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Search Dress");

	}
	
	
	@Test(timeOut = 700 )
	private void SearchGoogle() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("Search Google");

	}

}
