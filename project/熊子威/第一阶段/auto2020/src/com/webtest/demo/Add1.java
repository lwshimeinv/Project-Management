package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Add1 extends BaseTest {
	@Test
	public void testAddEvaluation() throws InterruptedException {
		webtest.open("http://localhost:100/index.php?s=/index/user/logininfo.html");
		webtest.click("xpath=//a[text()='µÇÂ¼']");
		webtest.type("name=user", "xzw123");
		webtest.type("name=pw", "xzw123456");
		webtest.click("xpath=//input[@type='submit']");

		Thread.sleep(1000);

		webtest.open("http://localhost:100/index.php?s=/index/user/logininfo.html");
		webtest.click("xpath=//span[@class='more']/a[text()='µÇÂ¼']");
		String javascript = "var top=document.documentElement.scrollTop=1000";
		webtest.runJs(javascript);
		webtest.type("name=user", "xzw123");
		webtest.type("name=pw", "xzw123456");
		webtest.type("name=verify_code", "E7UK");
		Thread.sleep(3000);
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(3000);
	}
}
