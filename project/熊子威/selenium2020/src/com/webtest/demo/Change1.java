package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.demo1.Base1;

public class Change1 extends Base1{
	@Test
	public void testChangeTravels() throws InterruptedException {
		webtest.open("http://www.roqisoft.com/zhsx/");
		webtest.click("xpath=//a[text()='登录']");
		webtest.type("name=user", "xzw");
		webtest.type("name=pw", "xzw");
		webtest.click("xpath=//input[@type='submit']");
		
		Thread.sleep(1000);
		webtest.click("xpath=//strong[text()='我的空间']");
		Thread.sleep(1000);
		webtest.click("xpath=//u[text()='点我写游记']");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='文章']");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='好']");
		Thread.sleep(1000);
		webtest.type("id=title", "好");
		webtest.tapClick();
		webtest.tapType("xzw好");
		webtest.type("id=sort", "熊子威");
		Thread.sleep(3000);
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(3000);
	}
}
