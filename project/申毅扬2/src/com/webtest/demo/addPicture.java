package com.webtest.demo;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class addPicture extends BaseTest{
	@Test
	public void testAddPictures() throws InterruptedException {
		webtest.open("http://www.roqisoft.com/zhsx/");
		webtest.click("xpath=//a[text()='登录']");
		webtest.type("name=user", "wangshuai");
		webtest.type("name=pw", "wangshuai");
		webtest.click("xpath=//input[@type='submit']");
		
		Thread.sleep(1000);
		
		webtest.mouseToElement("xpath=//strong[text()='我的空间']");
		Thread.sleep(1000);
		webtest.click("xpath=//a[text()='个人相册']");
		webtest.click("xpath=//strong[text()='点击上传图片']");
		webtest.enterFrame(0);
		webtest.type("name=attach[]", "E:\\MonkeyKing.jpg");
		webtest.click("xpath=//input[@value='上传']");
		Thread.sleep(3000);
		webtest.leaveFrame();
	}
}
