package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.demo1.Base1;

public class Change1 extends Base1{
	@Test
	public void testChangeTravels() throws InterruptedException {
		webtest.open("http://localhost:100/admin.php?s=/admin/logininfo.html");
		webtest.click("xpath=//a[text()='��¼']");
		webtest.type("name=user", "admin");
		webtest.type("name=pw", "shopxo");
		webtest.click("xpath=//input[@type='submit']");
		
		Thread.sleep(1000);
		
		webtest.mouseToElement("xpath=//strong[text()='�鿴��ҳ']");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='ע��']");
		webtest.click("xpath=//strong[text()='����ע��']");
		webtest.enterFrame(0);
		webtest.type("name=user", "252462163@qq.com");
		webtest.type("name=pw", "123456");
		webtest.type("name=verify_code", "KPGB");
		webtest.click("xpath=//input[@value='ע��']");
		Thread.sleep(3000);
		webtest.leaveFrame();
	}
}
