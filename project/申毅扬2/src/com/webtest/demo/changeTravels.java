package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class changeTravels extends BaseTest{
	@Test
	public void testChangeTravels() throws InterruptedException {
		webtest.open("http://www.roqisoft.com/zhsx/");
		webtest.click("xpath=//a[text()='登录']");
		webtest.type("name=user", "wangshuai");
		webtest.type("name=pw", "wangshuai");
		webtest.click("xpath=//input[@type='submit']");
		
		Thread.sleep(1000);
		webtest.click("xpath=//strong[text()='我的空间']");
		Thread.sleep(1000);
		webtest.click("xpath=//u[text()='点我写游记']");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='文章']");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='真好啊，很棒啊']");
		Thread.sleep(1000);
		webtest.type("id=title", "真好啊");
		webtest.tapClick();
		webtest.tapType("wangshuai真好啊，很棒啊");
		webtest.type("id=sort", "王帅");
		Thread.sleep(3000);
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(3000);
	}
}
