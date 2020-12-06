package com.webtest.demo;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.utils.ReadProperties;

public class addTravels extends BaseTest{
	
	
	
	@Test
	public void testAddTravels() throws InterruptedException, IOException {
		webtest.open("http://www.roqisoft.com/zhsx/");
		webtest.click("xpath=//a[text()='登录']");
		webtest.type("name=user", "wangshuai");
		webtest.type("name=pw", "wangshuai");
		webtest.click("xpath=//input[@type='submit']");
		
		
		webtest.click("xpath=//strong[text()='我的空间']");
		webtest.click("xpath=//u[text()='点我写游记']");
		Thread.sleep(3000);
		webtest.type("name=title",ReadProperties.getPropertyValue("title") );
		webtest.tapClick();
		webtest.tapType(ReadProperties.getPropertyValue("tapType"));
		webtest.type("id=sort", "王帅");
		Thread.sleep(3000);
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(3000);
	}
}
