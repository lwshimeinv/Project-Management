package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class changeTravels extends BaseTest{
	@Test
	public void testChangeTravels() throws InterruptedException {
		webtest.open("http://www.roqisoft.com/zhsx/");
		webtest.click("xpath=//a[text()='��¼']");
		webtest.type("name=user", "wangshuai");
		webtest.type("name=pw", "wangshuai");
		webtest.click("xpath=//input[@type='submit']");
		
		Thread.sleep(1000);
		webtest.click("xpath=//strong[text()='�ҵĿռ�']");
		Thread.sleep(1000);
		webtest.click("xpath=//u[text()='����д�μ�']");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='����']");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='��ð����ܰ���']");
		Thread.sleep(1000);
		webtest.type("id=title", "��ð�");
		webtest.tapClick();
		webtest.tapType("wangshuai��ð����ܰ���");
		webtest.type("id=sort", "��˧");
		Thread.sleep(3000);
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(3000);
	}
}
