package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.demo1.Base1;

public class Add1 extends Base1 {
	@Test
	public void testAddEvaluation() throws InterruptedException {
		webtest.open("http://www.roqisoft.com/zhsx/");
		webtest.click("xpath=//a[text()='��¼']");
		webtest.type("name=user", "xzw");
		webtest.type("name=pw", "xzw");
		webtest.click("xpath=//input[@type='submit']");

		Thread.sleep(1000);

		webtest.open("http://www.roqisoft.com/zhsx/blog/");
		webtest.click("xpath=//span[@class='more']/a[text()='�Ķ�ȫ��']");
		String javascript = "var top=document.documentElement.scrollTop=1000";
		webtest.runJs(javascript);
		webtest.type("name=comment", "��");
		Thread.sleep(3000);
		webtest.click("xpath=//input[@value=\"���ˣ�(Ctrl+Enter)\"]");
		Thread.sleep(3000);
	}
}
