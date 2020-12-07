package com.webtest.demo;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mysql.fabric.xmlrpc.base.Data;
import com.webtest.core.BaseTest;
import com.webtest.dataprovider.ExcelDataProvider;
import com.webtest.dataprovider.NSDataProvider;

public class ExcelTest1 extends BaseTest{
	
	@Test(dataProvider = "shopxo",dataProviderClass = NSDataProvider.class)
	public void test(String s1,String s2,String s3,String s4) throws InterruptedException, IOException {
		webtest.click("xpath=//span[@pmenuid='66']");
		Thread.sleep(1000);
		webtest.click("id=menu_list_num79");
		Thread.sleep(1000);
		
		webtest.click("id=menu_list_num69");
		Thread.sleep(2000);
		webtest.click("class=icon-plus");
		Thread.sleep(2000);
		
		webtest.enterFrame1("name=openinputiframe");
		Thread.sleep(3000);
		webtest.selectByValue("name=type",s1);
		Thread.sleep(1000);
		webtest.type("name=title", s2);
		Thread.sleep(1000);
		
		webtest.click("id=btnchange_fuze");
		Thread.sleep(1000);
		webtest.type("xpath=//input[starts-with(@id,'changekey')]", s3);
		Thread.sleep(1000);
		webtest.click("xpath=//input[starts-with(@name,'changeuserinput')]");
		Thread.sleep(1000);
		webtest.click("xpath=//input[starts-with(@id,'changeok')]");
		Thread.sleep(1000);
		
		webtest.click("id=btnchange_runuser");
		webtest.type("xpath=//input[starts-with(@id,'changekey')]",s4);
		Thread.sleep(1000);
		webtest.mouseToElementandClick("xpath=//input[contains(@name,'_soukey')]");
		Thread.sleep(1000);
		webtest.click("xpath=//input[starts-with(@id,'changeok')]");
		
		
		webtest.runJs("window.scrollTo(0,300);");
		Thread.sleep(1000);
		webtest.selectByValue("name=progress", "50");
		Thread.sleep(1000);
		webtest.selectByValue("name=status", "3");
		Thread.sleep(1000);
		webtest.click("id=AltS");
		Thread.sleep(3000);
		webtest.leaveFrame();
		webtest.click("class=icon-remove");
		Thread.sleep(1000);
		Boolean flag = webtest.isElementPresent("class=icon-home");
		System.out.println(flag);
		Assert.assertTrue(flag);
	}	
}	
