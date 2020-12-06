package com.webtest.demo;

import static org.testng.Assert.assertTrue;


import org.testng.annotations.Test;

import com.webtest.demo1.Base1;



public class Admin1  extends Base1{
	
	@Test
	public void testLogin() {
		
		webtest.open("http://localhost:100/admin.php?s=/admin/logininfo.html");
		webtest.click("xpath=//a[text()='µÇÂ¼']");
		webtest.type("name=user", "admin");
		webtest.type("name=pw", "shopxo");
		webtest.click("xpath=//input[@type='submit']");
		assertTrue(webtest.isTextPresent("ÍË³ö"));
	}

}
