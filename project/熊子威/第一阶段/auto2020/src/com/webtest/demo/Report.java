package com.webtest.demo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Report {
	@Test
	public void test1() {
		Assert.assertEquals(2, 2);
		Reporter.log("lctest1");
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(1, 1);
		Reporter.log("lctest2");
	}
	
	@Test
	public void test3() {
		Assert.assertEquals(13, 1);
		Reporter.log("lctest3");
	}
	
	@Test
	public void test4() {
		Assert.assertEquals(13, 13);
		Reporter.log("lctest4");
	}
	
	@Test
	public void test5() {
		Assert.assertEquals(13, 11);
		Reporter.log("lctest5");
	}

}
