package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.demo1.Base1;

public class Change1 extends Base1{
	@Test
	public void testChangeTravels() throws InterruptedException {
		webtest.open("http://www.roqisoft.com/zhsx/");
		webtest.click("xpath=//a[text()='��¼']");
		webtest.type("name=user", "xzw");
		webtest.type("name=pw", "xzw");
		webtest.click("xpath=//input[@type='submit']");
		
		Thread.sleep(1000);
		webtest.click("xpath=//strong[text()='�ҵĿռ�']");
		Thread.sleep(1000);
		webtest.click("xpath=//u[text()='����д�μ�']");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='����']");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='��']");
		Thread.sleep(1000);
		webtest.type("id=title", "��");
		webtest.tapClick();
		webtest.tapType("xzw��");
		webtest.type("id=sort", "������");
		Thread.sleep(3000);
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(3000);
	}
}
