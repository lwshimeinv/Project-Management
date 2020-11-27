package com.webtest.demo;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.core.WebDriverEngine;
import com.webtest.utils.Log;
import com.webtest.utils.ReadProperties;



public class Admin_Login  extends BaseTest{
	@BeforeClass
	public void doBeforeClass() throws Exception {
		webtest.open("http://localhost/");
		
	}
	
	@Test
	public void testLogin() {
		
		webtest.click("xpath =//a[contains(text(),'µÇÂ¼')]");
		webtest.type("xpath = /html/body/div[4]/div/div[2]/div[2]/form/div[1]/input", "admin");
		webtest.type("xpath = /html/body/div[4]/div/div[2]/div[2]/form/div[2]/input", "admin");
		webtest.type("xpath = /html/body/div[4]/div/div[2]/div[2]/form/div[3]/div/input", "shengbin");
		webtest.click("xpath = /html/body/div[4]/div/div[2]/div[2]/form/div[4]/button");
		
		assertEquals(true, webtest.isTextPresent("µÇÂ¼"));
	}

}
