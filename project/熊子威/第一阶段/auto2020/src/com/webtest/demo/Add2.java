package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Add2 extends BaseTest{
	@Test
	public void testAddPictures() throws InterruptedException {
		webtest.open("http://localhost:100/index.php?s=/index/user/logininfo.html");
		webtest.click("xpath=//a[text()='��¼']");
		webtest.type("name=user", "xzw123");
		webtest.type("name=pw", "xzw123456");
		webtest.click("xpath=//input[@type='submit']");
		
		Thread.sleep(1000);
		
		webtest.mouseToElement("xpath=//strong[text()='�鿴��ҳ']");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='ע��']");
		webtest.click("xpath=//strong[text()='�˺�ע��']");
		webtest.enterFrame(0);
		webtest.type("name=user", "admin123");
		webtest.type("name=pw", "123456");
		webtest.type("name=verify_code", "9W9K");
		webtest.click("xpath=//input[@value='ע��']");
		Thread.sleep(3000);
		webtest.leaveFrame();
	}
}
