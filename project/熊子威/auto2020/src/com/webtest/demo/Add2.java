package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.demo1.Base1;

public class Add2 extends Base1{
	@Test
	public void testAddPictures() throws InterruptedException {
		webtest.open("http://localhost:100/admin.php?s=/admin/logininfo.html");
		webtest.click("xpath=//a[text()='µÇÂ¼']");
		webtest.type("name=user", "admin");
		webtest.type("name=pw", "shopxo");
		webtest.click("xpath=//input[@type='submit']");
		
		Thread.sleep(1000);
		
		webtest.mouseToElement("xpath=//strong[text()='²é¿´Ê×Ò³']");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='×¢²á']");
		webtest.click("xpath=//strong[text()='ÕËºÅ×¢²á']");
		webtest.enterFrame(0);
		webtest.type("name=user", "admin123");
		webtest.type("name=pw", "123456");
		webtest.type("name=verify_code", "9W9K");
		webtest.click("xpath=//input[@value='×¢²á']");
		Thread.sleep(3000);
		webtest.leaveFrame();
	}
}
