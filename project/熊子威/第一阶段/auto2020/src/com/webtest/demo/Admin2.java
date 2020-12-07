package com.webtest.demo;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Admin2 extends BaseTest{
	@Test
	public void testLogin() {
		webtest.open("http://localhost:100/index.php?s=/index/user/logininfo.html");
		webtest.click("xpath=//a[text()='µÇÂ¼']");
		webtest.type("name=user", "xzw123");
		webtest.type("name=pw", "xzw123456");
		webtest.click("xpath=//input[@type='submit']");
	}
}
