package com.webtest.demo;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.webtest.demo1.Base1;
import com.webtest.demo2.Read1;

public class Add3 extends Base1{
	
	
	
	@Test
	public void testAddTravels() throws InterruptedException, IOException {
		webtest.open("http://www.roqisoft.com/zhsx/");
		webtest.click("xpath=//a[text()='登录']");
		webtest.type("name=user", "xzw");
		webtest.type("name=pw", "xzw");
		webtest.click("xpath=//input[@type='submit']");
		
		
		webtest.click("xpath=//strong[text()='我的空间']");
		webtest.click("xpath=//u[text()='点我写游记']");
		Thread.sleep(3000);
		webtest.type("name=title",Read1.getPropertyValue("title") );
		webtest.tapClick();
		webtest.tapType(Read1.getPropertyValue("tapType"));
		webtest.type("id=sort", "熊子威");
		Thread.sleep(3000);
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(3000);
	}
}
