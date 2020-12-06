package com.webtest.demo;

import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import com.webtest.demo1.Base1;

public class Admin2 extends Base1{
	@Test
	public void testLogin() {
		webtest.open("http://localhost:100/index.php?s=/index/user/logininfo.html");
		webtest.click("xpath=//a[text()='µÇÂ¼']");
		webtest.type("name=user", "admin");
		webtest.type("name=pw", "123456");
		webtest.click("xpath=//input[@type='submit']");
	}
}
