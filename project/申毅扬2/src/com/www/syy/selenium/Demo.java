 package com.www.syy.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Demo2 extends BaseTest{
	String url = "http://localhost/admin.php?s=/admin/logininfo.html";
	
	@BeforeMethod
//	@Test
	public void test1() throws InterruptedException {
//		打开网页
		webtest.open(url);
//		点击用户名
		webtest.click("name=username");
//		输入用户名
		webtest.type("name=username", "admin");
		webtest.click("name=login_pwd");
		webtest.type("name=login_pwd", "shopxo");
		webtest.click("xpath=//button[text()='登录']");
//		停顿1秒
		Thread.sleep(1000);	}


  @Test
  public void test2() throws InterruptedException {
	    webtest.click("xpath=//span[text()='系统设置']");
	    webtest.click("xpath=//span[text()='后台配置']");
	    
  }    
	    
	    
	    
  @Test
  public void test3() throws InterruptedException {
	    webtest.click("xpath=//span[text()='系统设置']");
	    webtest.click("xpath=//span[text()='后台配置']");
	    webtest.click("xpath=//button[text()='保存'");
	    Thread.sleep(1000);	
  }      
	    
	    
  @Test
  public void test4() throws InterruptedException {
	    webtest.click("xpath=//span[text()='系统设置']");
	    webtest.click("xpath=//span[text()='商店信息']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//button[text()='保存']");
	    Thread.sleep(1000);	
  }         
	    
  @Test
  public void test5() throws InterruptedException {
	    webtest.click("xpath=//span[text()='站点配置']");
	    webtest.click("xpath=//span[text()='站点设置']");
	    webtest.click("xpath=//button[text()='保存']");
	    Thread.sleep(1000);	
  }         
	    
  @Test
  public void test6() throws InterruptedException {
	  
	    webtest.click("xpath=//span[text()='站点配置']");
	    Thread.sleep(1000);	
	    webtest.click("xpath=//span[text()='站点设置']");
	    webtest.click("xpath=//a[text()='备案信息']");
	    webtest.click("xpath=//button[text()='保存']");
	    Thread.sleep(1000);	
  }         
	    
	    
  @Test
  public void test7() throws InterruptedException {
	    webtest.click("xpath=//span[text()='站点配置']");
	    webtest.click("xpath=//span[text()='站点设置']");
	    webtest.click("xpath=//a[text()='站点类型']");
	    webtest.click("xpath=//button[text()='保存']");
	    Thread.sleep(1000);	
  }         
  
  
  @Test
  public void test8() throws InterruptedException {
	    webtest.click("xpath=//span[text()='站点配置']");
	    webtest.click("xpath=//span[text()='站点设置']");
	    
	    webtest.click("xpath=//button[text()='保存']");
	    Thread.sleep(1000);	
  }         
  
  
  @Test
  public void test9() throws InterruptedException {
	    webtest.click("xpath=//span[text()='站点配置']");
	    webtest.click("xpath=//span[text()='站点设置']");
	    
	    webtest.click("xpath=//button[text()='保存']");
	    Thread.sleep(1000);	
  }  
  }
	
	
	
	
	
	
	
	
 