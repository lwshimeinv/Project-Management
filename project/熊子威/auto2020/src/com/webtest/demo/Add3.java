package com.webtest.demo;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.webtest.demo1.Base1;
import com.webtest.demo2.Read1;

public class Add3 extends Base1{
	
	
	
	@Test
	public void testAddTravels() throws InterruptedException, IOException {
		webtest.open("http://localhost:100/admin.php?s=/admin/logininfo.html");
		webtest.click("xpath=//a[text()='µÇÂ¼']");
		webtest.type("name=user", "admin");
		webtest.type("name=pw", "shopxo");
		webtest.click("xpath=//input[@type='submit']");
		
		
		webtest.mouseToElement("xpath=//strong[text()='²é¿´Ê×Ò³']");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='×¢²á']");
		webtest.click("xpath=//strong[text()='ÊÖ»úºÅ×¢²á']");
		webtest.enterFrame(0);
		webtest.type("name=user", "18871008816");
		webtest.type("name=pw", "123456");
		webtest.type("name=verify_code", "464R");
		webtest.click("xpath=//input[@value='×¢²á']");
		Thread.sleep(3000);
		webtest.leaveFrame();
	}
}
