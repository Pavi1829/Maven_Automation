package com.test.concepts;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Sample {
	@Test//(retryAnalyzer = MyRetry.class)
	private void usernamevalidation() {
		Assert.assertEquals("Ram","Pavi");

	}
	@Test
	private void logIn() {
		Assert.assertEquals("PR","RP");

	}

}
