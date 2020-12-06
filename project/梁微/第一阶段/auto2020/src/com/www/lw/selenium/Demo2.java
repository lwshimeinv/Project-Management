package com.www.lw.selenium;

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
	    webtest.enterFrame("ifcontent");
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
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//button[text()='保存']");
	    Thread.sleep(1000);	
  }         
	    
  @Test
  public void test6() throws InterruptedException {
	  
	    webtest.click("xpath=//span[text()='站点配置']");	    	
	    webtest.click("xpath=//span[text()='站点设置']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//a[text()='备案信息']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//button[text()='保存']");
	    Thread.sleep(1000);	
  }         
	    
	    
  @Test
  public void test7() throws InterruptedException {
	    webtest.click("xpath=//span[text()='站点配置']");
	    webtest.click("xpath=//span[text()='站点设置']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//a[text()='站点类型']");
	    webtest.click("xpath=//button[text()='保存']");
	    Thread.sleep(1000);	
  }         
  
  
  @Test
  public void test8() throws InterruptedException {
	    webtest.click("xpath=//span[text()='站点配置']");
	    webtest.click("xpath=//span[text()='站点设置']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//a[text()='用户注册 ']");
	    webtest.click("xpath=//button[text()='保存']");
	    Thread.sleep(1000);	
  }         
  
  
  @Test
  public void test9() throws InterruptedException {
	    webtest.click("xpath=//span[text()='站点配置']");
	    webtest.click("xpath=//span[text()='站点设置']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//a[text()='用户登录 ']");
	    webtest.click("xpath=//button[text()='保存']");
	    Thread.sleep(1000);	
  } 
  
  @Test
  public void test10() throws InterruptedException {
	    webtest.click("xpath=//span[text()='站点配置']");
	    webtest.click("xpath=//span[text()='站点设置']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//a[text()='密码找回 ']");
	    webtest.click("xpath=//button[text()='保存']");
	    Thread.sleep(1000);	
  } 
  
  @Test
  public void test11() throws InterruptedException {
	    webtest.click("xpath=//span[text()='站点配置']");
	    webtest.click("xpath=//span[text()='站点设置']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//a[text()='附件 ']");
	    webtest.click("xpath=//button[text()='保存']");
	    Thread.sleep(1000);	
  } 
  
  
  @Test
  public void test12() throws InterruptedException {
	    webtest.click("xpath=//span[text()='站点配置']");
	    webtest.click("xpath=//span[text()='站点设置']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//a[text()='验证码 ']");
	    webtest.click("xpath=//button[text()='保存']");
	    Thread.sleep(1000);	
  } 
  
  @Test
  public void test13() throws InterruptedException {
	    webtest.click("xpath=//span[text()='站点配置']");
	    webtest.click("xpath=//span[text()='站点设置']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//a[text()='订单售后 ']");
	    webtest.click("xpath=//button[text()='保存']");
	    Thread.sleep(1000);	
  } 
  
  @Test
  public void test14() throws InterruptedException {
	    webtest.click("xpath=//span[text()='站点配置']");
	    webtest.click("xpath=//span[text()='站点设置']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//a[text()='搜索 ']");
	    webtest.click("xpath=//button[text()='保存']");
	    Thread.sleep(1000);	
  } 
  
  
  @Test
  public void test15() throws InterruptedException {
	    webtest.click("xpath=//span[text()='站点配置']");
	    webtest.click("xpath=//span[text()='站点设置']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//a[text()='商品 ']");
	    webtest.click("xpath=//button[text()='保存']");
	    Thread.sleep(1000);	
  } 
  
  
  @Test
  public void test16() throws InterruptedException {
	    webtest.click("xpath=//span[text()='站点配置']");
	    webtest.click("xpath=//span[text()='站点设置']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//a[text()='扩展项 ']");
	    webtest.click("xpath=//button[text()='保存']");
	    Thread.sleep(1000);	
  } 
  
  
  @Test
  public void test17() throws InterruptedException {
	    webtest.click("xpath=//span[text()='站点配置']");
	    webtest.click("xpath=//span[text()='短信设置']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//button[text()='保存']");
	    Thread.sleep(1000);	
  } 
  
  
  @Test
  public void test18() throws InterruptedException {
	    webtest.click("xpath=//span[text()='站点配置']");
	    webtest.click("xpath=//span[text()='短信设置']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//a[text()='消息模版 ']");
	    webtest.click("xpath=//button[text()='保存']");
	    Thread.sleep(2000);	
  } 
  
  
  @Test
  public void test19() throws InterruptedException {
	    webtest.click("xpath=//span[text()='站点配置']");
	    webtest.click("xpath=//span[text()='邮箱设置']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//button[text()='保存']");
	    Thread.sleep(1000);	
  } 
  
  
  @Test
  public void test20() throws InterruptedException {
	    webtest.click("xpath=//span[text()='站点配置']");
	    webtest.click("xpath=//span[text()='邮箱设置']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//a[text()='消息模版 ']");
	    webtest.click("xpath=//button[text()='保存']");
	    Thread.sleep(1000);	
  } 
  
  @Test
  public void test21() throws InterruptedException {
	    webtest.click("xpath=//span[text()='站点配置']");
	    webtest.click("xpath=//span[text()='SEO设置']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//button[text()='保存']");
	    Thread.sleep(1000);	
  } 
  
  @Test
  public void test22() throws InterruptedException {
	    webtest.click("xpath=//span[text()='站点配置']");
	    webtest.click("xpath=//span[text()='协议管理']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//button[text()='保存']");
	    Thread.sleep(1000);	
  } 
  
  
  @Test
  public void test23() throws InterruptedException {
	    webtest.click("xpath=//span[text()='权限控制']");
	    webtest.click("xpath=//span[text()='管理员列表']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//span[text()='详情']");
	    Thread.sleep(1000);	
  } 
  
  @Test
  public void test24() throws InterruptedException {
	    webtest.click("xpath=//span[text()='权限控制']");
	    webtest.click("xpath=//span[text()='管理员列表']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//span[text()='编辑']");
	    webtest.click("xpath=//button[text()='保存']");
	    Thread.sleep(1000);	
  } 
  
   
  @Test
  public void test25() throws InterruptedException {
	    webtest.click("xpath=//span[text()='权限控制']");
	    webtest.click("xpath=//span[text()='管理员列表']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//span[text()='删除']");
	    webtest.click("xpath=//span[text()='确定']");
	    Thread.sleep(1000);	
  } 
  
  
  @Test
  public void test26() throws InterruptedException {
	    webtest.click("xpath=//span[text()='权限控制']");
	    webtest.click("xpath=//span[text()='角色管理']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//span[text()='详情']");
	    Thread.sleep(1000);	
  } 
  
  
  @Test
  public void test27() throws InterruptedException {
	    webtest.click("xpath=//span[text()='权限控制']");
	    webtest.click("xpath=//span[text()='角色管理']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//span[text()='编辑']");
	    webtest.click("xpath=//button[text()='保存']");
	    Thread.sleep(1000);	
  } 
  
  
  
  @Test
  public void test28() throws InterruptedException {
	    webtest.click("xpath=//span[text()='权限控制']");
	    webtest.click("xpath=//span[text()='角色管理']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//span[text()='删除']");
	    webtest.click("xpath=//span[text()='确定']");
	    Thread.sleep(1000);	
  } 
  
  
  @Test
  public void test29() throws InterruptedException {
	    webtest.click("xpath=//span[text()='权限控制']");
	    webtest.click("xpath=//span[text()='权限分配']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//button[@class='am-btn am-btn-secondary am-radius am-btn-xs am-icon-plus submit-add']");
	    webtest.click("name=name");
	    webtest.type("name=name", "syysyy");
	    Thread.sleep(1000);
	    webtest.click("name= control");
	    webtest.type("name=control","abcdefg");
	    webtest.click("name= action");
	    webtest.type("name=action", "ceshi");
	    webtest.click("xpath=//button[text()='保存']");
	    Thread.sleep(1000);	
  } 
  
  
  @Test
  public void test30() throws InterruptedException {
	    webtest.click("xpath=//span[text()='权限控制']");
	    webtest.click("xpath=//span[text()='管理员列表']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//a[@class='am-btn am-btn-secondary am-radius am-btn-xs am-icon-plus']");
	    webtest.click("name=username");
	    webtest.type("name=username", "syysyy");
	    Thread.sleep(1000);
	    webtest.click("name=login_pwd");
	    webtest.type("name=login_pwd","abcdefg");
	    webtest.click("name=mobile");
	    webtest.type("name=mobile", "18532135970");
	    webtest.click("xpath=//span[text()='可选择...']");
	    webtest.click("xpath=//li[@class='active-result']");
	    webtest.click("xpath=//button[text()='保存']");
	    Thread.sleep(1000);	
  } 
  
  
  
  
  @Test
  public void test31() throws InterruptedException {
	    webtest.click("xpath=//span[text()='权限控制']");
	    webtest.click("xpath=//span[text()='管理员列表']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//a[@class='am-btn am-btn-warning am-radius am-btn-sm am-icon-filter']");   
	    Thread.sleep(1000);	
  } 
  
  
  @Test
  public void test32() throws InterruptedException {
	    webtest.click("xpath=//span[text()='权限控制']");
	    webtest.click("xpath=//span[text()='管理员列表']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("name=f1p");  
	    webtest.type("name=f1p","admin");
	    Thread.sleep(1000);	
	    webtest.click("xpath=//button[@class='am-btn am-btn-primary am-radius am-btn-xs btn-loading-example am-icon-search']");
	    Thread.sleep(1000);	
  } 
  
  
  @Test
  public void test33() throws InterruptedException {
	    webtest.click("xpath=//span[text()='权限控制']");
	    webtest.click("xpath=//span[text()='角色管理']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("name=f1p");  
	    webtest.type("name=f1p","管理员");
	    Thread.sleep(1000);	
	    webtest.click("xpath=//button[@class='am-btn am-btn-primary am-radius am-btn-xs btn-loading-example am-icon-search']");
	    Thread.sleep(1000);	
  } 
  
  
  @Test
  public void test34() throws InterruptedException {
	    webtest.click("xpath=//span[text()='权限控制']");
	    webtest.click("xpath=//span[text()='角色管理']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//a[@class='am-btn am-btn-secondary am-radius am-btn-xs am-icon-plus']");
	    webtest.click("name=name");
	    webtest.type("name=name","666");
	    Thread.sleep(1000);
	    webtest.click("xpath=//button[text()='保存']");
	    Thread.sleep(1000);	
  } 
  
  
  @Test
  public void test35() throws InterruptedException {
	    webtest.click("xpath=//span[text()='权限控制']");
	    webtest.click("xpath=//span[text()='角色管理']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//a[@class='am-btn am-btn-warning am-radius am-btn-sm am-icon-filter']");   
	    Thread.sleep(1000);	
  } 
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  }
  
 