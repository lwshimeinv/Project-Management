package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class addEvaluation extends BaseTest {
	@Test
	public void testAddEvaluation() throws InterruptedException {
		webtest.open("http://www.roqisoft.com/zhsx/");
		webtest.click("xpath=//a[text()='��¼']");
		webtest.type("name=user", "wangshuai");
		webtest.type("name=pw", "wangshuai");
		webtest.click("xpath=//input[@type='submit']");

		Thread.sleep(1000);

		webtest.open("http://www.roqisoft.com/zhsx/blog/");
		webtest.click("xpath=//span[@class='more']/a[text()='�Ķ�ȫ��']");
		String javascript = "var top=document.documentElement.scrollTop=1000";
		webtest.runJs(javascript);
		webtest.type("name=comment", "��ð����ܰ���");
		Thread.sleep(3000);
		webtest.click("xpath=//input[@value=\"��д���ˣ�(Ctrl+Enter)\"]");
		Thread.sleep(3000);
	}
}
