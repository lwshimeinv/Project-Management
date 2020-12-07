package com.webtest.demo;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.utils.ReadProperties;

public class Add3 extends BaseTest{
	
	
	
	@Test
	public void testAddTravels() throws InterruptedException, IOException {
		webtest.open("http://localhost:100/index.php?s=/index/user/logininfo.html");
		webtest.click("xpath=//a[text()='µÇÂ¼']");
		webtest.type("name=user", "xzw123");
		webtest.type("name=pw", "xzw123456");
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
