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
//		����ҳ
		webtest.open(url);
//		����û���
		webtest.click("name=username");
//		�����û���
		webtest.type("name=username", "admin");
		webtest.click("name=login_pwd");
		webtest.type("name=login_pwd", "shopxo");
		webtest.click("xpath=//button[text()='��¼']");
//		ͣ��1��
		Thread.sleep(1000);	}


  @Test
  public void test2() throws InterruptedException {
	    webtest.click("xpath=//span[text()='ϵͳ����']");
	    webtest.click("xpath=//span[text()='��̨����']");
	    
  }    
	    
	    
	    
  @Test
  public void test3() throws InterruptedException {
	    webtest.click("xpath=//span[text()='ϵͳ����']");
	    webtest.click("xpath=//span[text()='��̨����']");
	    webtest.click("xpath=//button[text()='����'");
	    Thread.sleep(1000);	
  }      
	    
	    
  @Test
  public void test4() throws InterruptedException {
	    webtest.click("xpath=//span[text()='ϵͳ����']");
	    webtest.click("xpath=//span[text()='�̵���Ϣ']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//button[text()='����']");
	    Thread.sleep(1000);	
  }         
	    
  @Test
  public void test5() throws InterruptedException {
	    webtest.click("xpath=//span[text()='վ������']");
	    webtest.click("xpath=//span[text()='վ������']");
	    webtest.click("xpath=//button[text()='����']");
	    Thread.sleep(1000);	
  }         
	    
  @Test
  public void test6() throws InterruptedException {
	  
	    webtest.click("xpath=//span[text()='վ������']");
	    Thread.sleep(1000);	
	    webtest.click("xpath=//span[text()='վ������']");
	    webtest.click("xpath=//a[text()='������Ϣ']");
	    webtest.click("xpath=//button[text()='����']");
	    Thread.sleep(1000);	
  }         
	    
	    
  @Test
  public void test7() throws InterruptedException {
	    webtest.click("xpath=//span[text()='վ������']");
	    webtest.click("xpath=//span[text()='վ������']");
	    webtest.click("xpath=//a[text()='վ������']");
	    webtest.click("xpath=//button[text()='����']");
	    Thread.sleep(1000);	
  }         
  
  
  @Test
  public void test8() throws InterruptedException {
	    webtest.click("xpath=//span[text()='վ������']");
	    webtest.click("xpath=//span[text()='վ������']");
	    
	    webtest.click("xpath=//button[text()='����']");
	    Thread.sleep(1000);	
  }         
  
  
  @Test
  public void test9() throws InterruptedException {
	    webtest.click("xpath=//span[text()='վ������']");
	    webtest.click("xpath=//span[text()='վ������']");
	    
	    webtest.click("xpath=//button[text()='����']");
	    Thread.sleep(1000);	
  }  
  }
	
	
	
	
	
	
	
	
 