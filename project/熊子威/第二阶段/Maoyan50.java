package com.webtest.demo;
import org.testng.annotations.Test;

import com.webtest.demo1.Base1;

public class Maoyan50 extends Base1 {
	@Test
	public void testAddEvaluation() throws InterruptedException {
		webtest.open("http://localhost:100/admin.php?s=/admin/logininfo.html");
		webtest.click("xpath=//a[text()='µÇÂ¼']");
		webtest.type("name=user", "admin");
		webtest.type("name=pw", "shopxo");
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(1000);

		webtest.open("http://localhost:100/index.php?s=/index/user/logininfo.html");
		webtest.click("xpath=//span[@class='more']/a[text()='µÇÂ¼']");
		String javascript = "var top=document.documentElement.scrollTop=1000";
		webtest.runJs(javascript);
		webtest.type("name=user", "admin");
		webtest.type("name=pw", "123456");
		webtest.type("name=verify_code", "E7UK");
		Thread.sleep(3000);
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(3000);
		
		webtest.open("http://localhost:100/index.php?s=/index/user/logininfo.html");
		webtest.click("xpath=//span[@class='more']/a[text()='µÇÂ¼']");
		String javascript1 = "var top=document.documentElement.scrollTop=1000";
		webtest.runJs(javascript1);
		webtest.type("name=user", "admin1");
		webtest.type("name=pw", "123456");
		webtest.type("name=verify_code", "E7UK");
		Thread.sleep(3000);
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(3000);
		
		webtest.open("http://localhost:100/index.php?s=/index/user/logininfo.html");
		webtest.click("xpath=//span[@class='more']/a[text()='µÇÂ¼']");
		String javascript2 = "var top=document.documentElement.scrollTop=1000";
		webtest.runJs(javascript2);
		webtest.type("name=user", "admin2");
		webtest.type("name=pw", "123456");
		webtest.type("name=verify_code", "E7UK");
		Thread.sleep(3000);
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(3000);
		
		webtest.open("http://localhost:100/index.php?s=/index/user/logininfo.html");
		webtest.click("xpath=//span[@class='more']/a[text()='µÇÂ¼']");
		String javascript3 = "var top=document.documentElement.scrollTop=1000";
		webtest.runJs(javascript3);
		webtest.type("name=user", "admin3");
		webtest.type("name=pw", "123456");
		webtest.type("name=verify_code", "E7UK");
		Thread.sleep(3000);
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(3000);
		
		webtest.open("http://localhost:100/index.php?s=/index/user/logininfo.html");
		webtest.click("xpath=//span[@class='more']/a[text()='µÇÂ¼']");
		String javascript4 = "var top=document.documentElement.scrollTop=1000";
		webtest.runJs(javascript4);
		webtest.type("name=user", "admin4");
		webtest.type("name=pw", "123456");
		webtest.type("name=verify_code", "E7UK");
		Thread.sleep(3000);
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(3000);
		
		webtest.open("http://localhost:100/index.php?s=/index/user/logininfo.html");
		webtest.click("xpath=//span[@class='more']/a[text()='µÇÂ¼']");
		String javascript5 = "var top=document.documentElement.scrollTop=1000";
		webtest.runJs(javascript5);
		webtest.type("name=user", "admin5");
		webtest.type("name=pw", "123456");
		webtest.type("name=verify_code", "E7UK");
		Thread.sleep(3000);
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(3000);
		
		webtest.open("http://localhost:100/index.php?s=/index/user/logininfo.html");
		webtest.click("xpath=//span[@class='more']/a[text()='µÇÂ¼']");
		String javascript6 = "var to=document.documentElement.scrollTop=1000";
		webtest.runJs(javascript6);
		webtest.type("name=user", "admin6");
		webtest.type("name=pw", "123456");
		webtest.type("name=verify_code", "E7UK");
		Thread.sleep(3000);
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(3000);
		
		webtest.open("http://localhost:100/index.php?s=/index/user/logininfo.html");
		webtest.click("xpath=//span[@class='more']/a[text()='µÇÂ¼']");
		String javascript7 = "var to=document.documentElement.scrollTop=1000";
		webtest.runJs(javascript7);
		webtest.type("name=user", "admin7");
		webtest.type("name=pw", "123456");
		webtest.type("name=verify_code", "E7UK");
		Thread.sleep(3000);
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(3000);
		
		webtest.open("http://localhost:100/index.php?s=/index/user/logininfo.html");
		webtest.click("xpath=//span[@class='more']/a[text()='µÇÂ¼']");
		String javascript8 = "var to=document.documentElement.scrollTop=1000";
		webtest.runJs(javascript8);
		webtest.type("name=user", "admin8");
		webtest.type("name=pw", "123456");
		webtest.type("name=verify_code", "E7UK");
		Thread.sleep(3000);
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(3000);
		
		webtest.open("http://localhost:100/index.php?s=/index/user/logininfo.html");
		webtest.click("xpath=//span[@class='more']/a[text()='µÇÂ¼']");
		String javascript9 = "var to=document.documentElement.scrollTop=1000";
		webtest.runJs(javascript9);
		webtest.type("name=user", "admin9");
		webtest.type("name=pw", "123456");
		webtest.type("name=verify_code", "E7UK");
		Thread.sleep(3000);
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(3000);
		
		webtest.open("http://localhost:100/index.php?s=/index/user/logininfo.html");
		webtest.click("xpath=//span[@class='more']/a[text()='µÇÂ¼']");
		String javascript10 = "var to=document.documentElement.scrollTop=1000";
		webtest.runJs(javascript10);
		webtest.type("name=user", "admin10");
		webtest.type("name=pw", "123456");
		webtest.type("name=verify_code", "E7UK");
		Thread.sleep(3000);
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(3000);
		
		webtest.open("http://localhost:100/index.php?s=/index/user/logininfo.html");
		webtest.click("xpath=//span[@class='more']/a[text()='µÇÂ¼']");
		String javascript11 = "var to=document.documentElement.scrollTop=1000";
		webtest.runJs(javascript11);
		webtest.type("name=user", "admin11");
		webtest.type("name=pw", "123456");
		webtest.type("name=verify_code", "E7UK");
		Thread.sleep(3000);
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(3000);
		
		webtest.open("http://localhost:100/index.php?s=/index/user/logininfo.html");
		webtest.click("xpath=//span[@class='more']/a[text()='µÇÂ¼']");
		String javascript12 = "var to=document.documentElement.scrollTop=1000";
		webtest.runJs(javascript12);
		webtest.type("name=user", "admin12");
		webtest.type("name=pw", "123456");
		webtest.type("name=verify_code", "E7UK");
		Thread.sleep(3000);
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(3000);
		
		webtest.open("http://localhost:100/index.php?s=/index/user/logininfo.html");
		webtest.click("xpath=//span[@class='more']/a[text()='µÇÂ¼']");
		String javascript13 = "var to=document.documentElement.scrollTop=1000";
		webtest.runJs(javascript13);
		webtest.type("name=user", "admin13");
		webtest.type("name=pw", "123456");
		webtest.type("name=verify_code", "E7UK");
		Thread.sleep(3000);
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(3000);
		
		webtest.open("http://localhost:100/index.php?s=/index/user/logininfo.html");
		webtest.click("xpath=//span[@class='more']/a[text()='µÇÂ¼']");
		String javascript14 = "var to=document.documentElement.scrollTop=1000";
		webtest.runJs(javascript14);
		webtest.type("name=user", "admin14");
		webtest.type("name=pw", "123456");
		webtest.type("name=verify_code", "E7UK");
		Thread.sleep(3000);
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(3000);
		
		webtest.open("http://localhost:100/index.php?s=/index/user/logininfo.html");
		webtest.click("xpath=//span[@class='more']/a[text()='µÇÂ¼']");
		String javascript15 = "var to=document.documentElement.scrollTop=1000";
		webtest.runJs(javascript15);
		webtest.type("name=user", "admin15");
		webtest.type("name=pw", "123456");
		webtest.type("name=verify_code", "E7UK");
		Thread.sleep(3000);
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(3000);
		
		webtest.open("http://localhost:100/index.php?s=/index/user/logininfo.html");
		webtest.click("xpath=//span[@class='more']/a[text()='µÇÂ¼']");
		String javascript16 = "var to=document.documentElement.scrollTop=1000";
		webtest.runJs(javascript16);
		webtest.type("name=user", "admin16");
		webtest.type("name=pw", "123456");
		webtest.type("name=verify_code", "E7UK");
		Thread.sleep(3000);
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(3000);
		
		webtest.open("http://localhost:100/index.php?s=/index/user/logininfo.html");
		webtest.click("xpath=//span[@class='more']/a[text()='µÇÂ¼']");
		String javascript17 = "var to=document.documentElement.scrollTop=1000";
		webtest.runJs(javascript17);
		webtest.type("name=user", "admin17");
		webtest.type("name=pw", "123456");
		webtest.type("name=verify_code", "E7UK");
		Thread.sleep(3000);
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(3000);
		
		webtest.open("http://localhost:100/index.php?s=/index/user/logininfo.html");
		webtest.click("xpath=//span[@class='more']/a[text()='µÇÂ¼']");
		String javascript18 = "var to=document.documentElement.scrollTop=1000";
		webtest.runJs(javascript18);
		webtest.type("name=user", "admin18");
		webtest.type("name=pw", "123456");
		webtest.type("name=verify_code", "E7UK");
		Thread.sleep(3000);
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(3000);
		
		webtest.open("http://localhost:100/index.php?s=/index/user/logininfo.html");
		webtest.click("xpath=//span[@class='more']/a[text()='µÇÂ¼']");
		String javascript19 = "var to=document.documentElement.scrollTop=1000";
		webtest.runJs(javascript19);
		webtest.type("name=user", "admin19");
		webtest.type("name=pw", "123456");
		webtest.type("name=verify_code", "E7UK");
		Thread.sleep(3000);
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(3000);
		
		webtest.open("http://localhost:100/index.php?s=/index/user/logininfo.html");
		webtest.click("xpath=//span[@class='more']/a[text()='µÇÂ¼']");
		String javascript20 = "var to=document.documentElement.scrollTop=1000";
		webtest.runJs(javascript20);
		webtest.type("name=user", "admin20");
		webtest.type("name=pw", "123456");
		webtest.type("name=verify_code", "E7UK");
		Thread.sleep(3000);
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(3000);
		
		webtest.open("http://localhost:100/index.php?s=/index/user/logininfo.html");
		webtest.click("xpath=//span[@class='more']/a[text()='µÇÂ¼']");
		String javascript21 = "var to=document.documentElement.scrollTop=1000";
		webtest.runJs(javascript21);
		webtest.type("name=user", "admin21");
		webtest.type("name=pw", "123456");
		webtest.type("name=verify_code", "E7UK");
		Thread.sleep(3000);
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(3000);
		
		webtest.open("http://localhost:100/index.php?s=/index/user/logininfo.html");
		webtest.click("xpath=//span[@class='more']/a[text()='µÇÂ¼']");
		String javascript22 = "var to=document.documentElement.scrollTop=1000";
		webtest.runJs(javascript22);
		webtest.type("name=user", "admin22");
		webtest.type("name=pw", "123456");
		webtest.type("name=verify_code", "E7UK");
		Thread.sleep(3000);
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(3000);
		
		webtest.open("http://localhost:100/index.php?s=/index/user/logininfo.html");
		webtest.click("xpath=//span[@class='more']/a[text()='µÇÂ¼']");
		String javascript23 = "var to=document.documentElement.scrollTop=1000";
		webtest.runJs(javascript23);
		webtest.type("name=user", "admin23");
		webtest.type("name=pw", "123456");
		webtest.type("name=verify_code", "E7UK");
		Thread.sleep(3000);
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(3000);
		
		webtest.open("http://localhost:100/index.php?s=/index/user/logininfo.html");
		webtest.click("xpath=//span[@class='more']/a[text()='µÇÂ¼']");
		String javascript24 = "var to=document.documentElement.scrollTop=1000";
		webtest.runJs(javascript24);
		webtest.type("name=user", "admin24");
		webtest.type("name=pw", "123456");
		webtest.type("name=verify_code", "E7UK");
		Thread.sleep(3000);
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(3000);
		
		webtest.open("http://localhost:100/index.php?s=/index/user/logininfo.html");
		webtest.click("xpath=//span[@class='more']/a[text()='µÇÂ¼']");
		String javascript25 = "var to=document.documentElement.scrollTop=1000";
		webtest.runJs(javascript25);
		webtest.type("name=user", "admin25");
		webtest.type("name=pw", "123456");
		webtest.type("name=verify_code", "E7UK");
		Thread.sleep(3000);
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(3000);
		
		webtest.open("http://localhost:100/index.php?s=/index/user/logininfo.html");
		webtest.click("xpath=//span[@class='more']/a[text()='µÇÂ¼']");
		String javascript26 = "var to=document.documentElement.scrollTop=1000";
		webtest.runJs(javascript26);
		webtest.type("name=user", "admin26");
		webtest.type("name=pw", "123456");
		webtest.type("name=verify_code", "E7UK");
		Thread.sleep(3000);
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(3000);
		
		webtest.open("http://localhost:100/index.php?s=/index/user/logininfo.html");
		webtest.click("xpath=//span[@class='more']/a[text()='µÇÂ¼']");
		String javascript27 = "var to=document.documentElement.scrollTop=1000";
		webtest.runJs(javascript27);
		webtest.type("name=user", "admin27");
		webtest.type("name=pw", "123456");
		webtest.type("name=verify_code", "E7UK");
		Thread.sleep(3000);
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(3000);
		
		webtest.open("http://localhost:100/index.php?s=/index/user/logininfo.html");
		webtest.click("xpath=//span[@class='more']/a[text()='µÇÂ¼']");
		String javascript28 = "var to=document.documentElement.scrollTop=1000";
		webtest.runJs(javascript28);
		webtest.type("name=user", "admin28");
		webtest.type("name=pw", "123456");
		webtest.type("name=verify_code", "E7UK");
		Thread.sleep(3000);
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(3000);
		
		webtest.open("http://localhost:100/index.php?s=/index/user/logininfo.html");
		webtest.click("xpath=//span[@class='more']/a[text()='µÇÂ¼']");
		String javascript29 = "var to=document.documentElement.scrollTop=1000";
		webtest.runJs(javascript29);
		webtest.type("name=user", "admin29");
		webtest.type("name=pw", "123456");
		webtest.type("name=verify_code", "E7UK");
		Thread.sleep(3000);
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(3000);
		
		webtest.open("http://localhost:100/index.php?s=/index/user/logininfo.html");
		webtest.click("xpath=//span[@class='more']/a[text()='µÇÂ¼']");
		String javascript30 = "var to=document.documentElement.scrollTop=1000";
		webtest.runJs(javascript30);
		webtest.type("name=user", "admin30");
		webtest.type("name=pw", "123456");
		webtest.type("name=verify_code", "E7UK");
		Thread.sleep(3000);
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(3000);
		
		webtest.open("http://localhost:100/index.php?s=/index/user/logininfo.html");
		webtest.click("xpath=//span[@class='more']/a[text()='µÇÂ¼']");
		String javascript31 = "var to=document.documentElement.scrollTop=1000";
		webtest.runJs(javascript31);
		webtest.type("name=user", "admin31");
		webtest.type("name=pw", "123456");
		webtest.type("name=verify_code", "E7UK");
		Thread.sleep(3000);
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(3000);
		
		webtest.open("http://localhost:100/index.php?s=/index/user/logininfo.html");
		webtest.click("xpath=//span[@class='more']/a[text()='µÇÂ¼']");
		String javascript32 = "var to=document.documentElement.scrollTop=1000";
		webtest.runJs(javascript32);
		webtest.type("name=user", "admin32");
		webtest.type("name=pw", "123456");
		webtest.type("name=verify_code", "E7UK");
		Thread.sleep(3000);
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(3000);
		
		webtest.open("http://localhost:100/index.php?s=/index/user/logininfo.html");
		webtest.click("xpath=//span[@class='more']/a[text()='µÇÂ¼']");
		String javascript33 = "var to=document.documentElement.scrollTop=1000";
		webtest.runJs(javascript33);
		webtest.type("name=user", "admin33");
		webtest.type("name=pw", "123456");
		webtest.type("name=verify_code", "E7UK");
		Thread.sleep(3000);
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(3000);
		
		webtest.open("http://localhost:100/index.php?s=/index/user/logininfo.html");
		webtest.click("xpath=//span[@class='more']/a[text()='µÇÂ¼']");
		String javascript34 = "var to=document.documentElement.scrollTop=1000";
		webtest.runJs(javascript34);
		webtest.type("name=user", "admin34");
		webtest.type("name=pw", "123456");
		webtest.type("name=verify_code", "E7UK");
		Thread.sleep(3000);
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(3000);
		
		webtest.open("http://localhost:100/index.php?s=/index/user/logininfo.html");
		webtest.click("xpath=//span[@class='more']/a[text()='µÇÂ¼']");
		String javascript35 = "var to=document.documentElement.scrollTop=1000";
		webtest.runJs(javascript35);
		webtest.type("name=user", "admin35");
		webtest.type("name=pw", "123456");
		webtest.type("name=verify_code", "E7UK");
		Thread.sleep(3000);
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(3000);
		
		webtest.open("http://localhost:100/index.php?s=/index/user/logininfo.html");
		webtest.click("xpath=//span[@class='more']/a[text()='µÇÂ¼']");
		String javascript36 = "var to=document.documentElement.scrollTop=1000";
		webtest.runJs(javascript36);
		webtest.type("name=user", "admin36");
		webtest.type("name=pw", "123456");
		webtest.type("name=verify_code", "E7UK");
		Thread.sleep(3000);
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(3000);
		
		webtest.open("http://localhost:100/index.php?s=/index/user/logininfo.html");
		webtest.click("xpath=//span[@class='more']/a[text()='µÇÂ¼']");
		String javascript37 = "var to=document.documentElement.scrollTop=1000";
		webtest.runJs(javascript37);
		webtest.type("name=user", "admin37");
		webtest.type("name=pw", "123456");
		webtest.type("name=verify_code", "E7UK");
		Thread.sleep(3000);
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(3000);
		
		webtest.open("http://localhost:100/index.php?s=/index/user/logininfo.html");
		webtest.click("xpath=//span[@class='more']/a[text()='µÇÂ¼']");
		String javascript38 = "var to=document.documentElement.scrollTop=1000";
		webtest.runJs(javascript38);
		webtest.type("name=user", "admin38");
		webtest.type("name=pw", "123456");
		webtest.type("name=verify_code", "E7UK");
		Thread.sleep(3000);
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(3000);
		
		webtest.open("http://localhost:100/index.php?s=/index/user/logininfo.html");
		webtest.click("xpath=//span[@class='more']/a[text()='µÇÂ¼']");
		String javascript39 = "var to=document.documentElement.scrollTop=1000";
		webtest.runJs(javascript39);
		webtest.type("name=user", "admin39");
		webtest.type("name=pw", "123456");
		webtest.type("name=verify_code", "E7UK");
		Thread.sleep(3000);
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(3000);
		
		webtest.open("http://localhost:100/index.php?s=/index/user/logininfo.html");
		webtest.click("xpath=//span[@class='more']/a[text()='µÇÂ¼']");
		String javascript40 = "var to=document.documentElement.scrollTop=1000";
		webtest.runJs(javascript40);
		webtest.type("name=user", "admin40");
		webtest.type("name=pw", "123456");
		webtest.type("name=verify_code", "E7UK");
		Thread.sleep(3000);
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(3000);
		
		webtest.open("http://localhost:100/index.php?s=/index/user/logininfo.html");
		webtest.click("xpath=//span[@class='more']/a[text()='µÇÂ¼']");
		String javascript41 = "var to=document.documentElement.scrollTop=1000";
		webtest.runJs(javascript41);
		webtest.type("name=user", "admin41");
		webtest.type("name=pw", "123456");
		webtest.type("name=verify_code", "E7UK");
		Thread.sleep(3000);
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(3000);
		
		webtest.open("http://localhost:100/index.php?s=/index/user/logininfo.html");
		webtest.click("xpath=//span[@class='more']/a[text()='µÇÂ¼']");
		String javascript42 = "var to=document.documentElement.scrollTop=1000";
		webtest.runJs(javascript42);
		webtest.type("name=user", "admin42");
		webtest.type("name=pw", "123456");
		webtest.type("name=verify_code", "E7UK");
		Thread.sleep(3000);
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(3000);
		
		webtest.open("http://localhost:100/index.php?s=/index/user/logininfo.html");
		webtest.click("xpath=//span[@class='more']/a[text()='µÇÂ¼']");
		String javascript43 = "var to=document.documentElement.scrollTop=1000";
		webtest.runJs(javascript43);
		webtest.type("name=user", "admin43");
		webtest.type("name=pw", "123456");
		webtest.type("name=verify_code", "E7UK");
		Thread.sleep(3000);
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(3000);
		
		webtest.open("http://localhost:100/index.php?s=/index/user/logininfo.html");
		webtest.click("xpath=//span[@class='more']/a[text()='µÇÂ¼']");
		String javascript44 = "var to=document.documentElement.scrollTop=1000";
		webtest.runJs(javascript44);
		webtest.type("name=user", "admin44");
		webtest.type("name=pw", "123456");
		webtest.type("name=verify_code", "E7UK");
		Thread.sleep(3000);
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(3000);
		
		webtest.open("http://localhost:100/index.php?s=/index/user/logininfo.html");
		webtest.click("xpath=//span[@class='more']/a[text()='µÇÂ¼']");
		String javascript45 = "var to=document.documentElement.scrollTop=1000";
		webtest.runJs(javascript45);
		webtest.type("name=user", "admin45");
		webtest.type("name=pw", "123456");
		webtest.type("name=verify_code", "E7UK");
		Thread.sleep(3000);
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(3000);
		
		webtest.open("http://localhost:100/index.php?s=/index/user/logininfo.html");
		webtest.click("xpath=//span[@class='more']/a[text()='µÇÂ¼']");
		String javascript46 = "var to=document.documentElement.scrollTop=1000";
		webtest.runJs(javascript46);
		webtest.type("name=user", "admin46");
		webtest.type("name=pw", "123456");
		webtest.type("name=verify_code", "E7UK");
		Thread.sleep(3000);
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(3000);
		
		webtest.open("http://localhost:100/index.php?s=/index/user/logininfo.html");
		webtest.click("xpath=//span[@class='more']/a[text()='µÇÂ¼']");
		String javascript47 = "var to=document.documentElement.scrollTop=1000";
		webtest.runJs(javascript47);
		webtest.type("name=user", "admin47");
		webtest.type("name=pw", "123456");
		webtest.type("name=verify_code", "E7UK");
		Thread.sleep(3000);
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(3000);
		
		webtest.open("http://localhost:100/index.php?s=/index/user/logininfo.html");
		webtest.click("xpath=//span[@class='more']/a[text()='µÇÂ¼']");
		String javascript48 = "var to=document.documentElement.scrollTop=1000";
		webtest.runJs(javascript48);
		webtest.type("name=user", "admin48");
		webtest.type("name=pw", "123456");
		webtest.type("name=verify_code", "E7UK");
		Thread.sleep(3000);
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(3000);
		
		webtest.open("http://localhost:100/index.php?s=/index/user/logininfo.html");
		webtest.click("xpath=//span[@class='more']/a[text()='µÇÂ¼']");
		String javascript49 = "var to=document.documentElement.scrollTop=1000";
		webtest.runJs(javascript49);
		webtest.type("name=user", "admin49");
		webtest.type("name=pw", "123456");
		webtest.type("name=verify_code", "E7UK");
		Thread.sleep(3000);
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(3000);
		
		webtest.open("http://localhost:100/index.php?s=/index/user/logininfo.html");
		webtest.click("xpath=//span[@class='more']/a[text()='µÇÂ¼']");
		String javascript50 = "var to=document.documentElement.scrollTop=1000";
		webtest.runJs(javascript50);
		webtest.type("name=user", "admin50");
		webtest.type("name=pw", "123456");
		webtest.type("name=verify_code", "E7UK");
		Thread.sleep(3000);
		webtest.click("xpath=//input[@type='submit']");
		Thread.sleep(3000);
	}
}
