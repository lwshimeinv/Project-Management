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
	    webtest.type("name=name", "1234567");
	    Thread.sleep(1000);
	    webtest.click("xpath=//button[text()='保存']");
	    Thread.sleep(1000);	
  } 
      			
	    		
	    		
	    	 
  public void test35() throws InterruptedException {
	    webtest.click("xpath=//span[text()='权限控制']");
	    webtest.click("xpath=//span[text()='角色管理']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//a[@class='am-btn am-btn-warning am-radius am-btn-sm am-icon-filter']");   
	    Thread.sleep(1000);	
  } 
  
  
  //新增管理员
  @Test
  public void test36() throws InterruptedException {
	    webtest.click("xpath=//span[text()='系统设置']");
	    webtest.click("xpath=//span[text()='后台配置']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//span[text()='utf-8']");   
	    webtest.click("xpath=//li[@class='active-result']"); 
	    webtest.click("xpath=//span[text()='启用']");
	    webtest.click("xpath=//li[@class='active-result highlighted']");
	    webtest.click("name=common_page_size");
	    webtest.type("name=common_page_size","9");
	    webtest.click("name=common_spec_add_max_number");
	    webtest.type("name=common_spec_add_max_number","1111111");
	    webtest.click("xpath=//button[text()='保存']");
	    Thread.sleep(1000);	
  } 
  
  
  //点击查看首页信息
  @Test
  public void test37() throws InterruptedException {
	    webtest.click("xpath=//span[text()='查看首页']");	     
	    Thread.sleep(1000);	
  } 
  
  
  
  //全屏显示和退出
  @Test
  public void test38() throws InterruptedException {
	    webtest.click("xpath=//span[text()='开启全屏']");	   
	    webtest.click("xpath=//span[text()='退出全屏']");	 
	    Thread.sleep(1000);	
  } 
  
  
  
  //首页admin设置跳转
  
  @Test
  public void test39() throws InterruptedException {
	    webtest.click("xpath=//span[text()='admin']");	   
	    webtest.click("xpath=//a[@data-url='http://localhost/admin.php?s=/admin/saveinfo/id/1.html']");	 
	    Thread.sleep(1000);	
  } 
  
  
  //首页admin，退出
   
  @Test
  public void test40() throws InterruptedException {
	    webtest.click("xpath=//span[text()='admin']");	   
	    webtest.click("xpath=//i[@class='am-icon-power-off']");	 
	    Thread.sleep(1000);	
  } 
  
  
  
   //首页点击ShopXO企业级电商系统提供商
  @Test
  public void test41() throws InterruptedException {
	    webtest.click("xpath=//a[@target='_blank'] ");	         
	    Thread.sleep(1000);	
  } 
  
  
  
  //首页点击 龚哥哥  
  @Test
  public void test42() throws InterruptedException {
	    webtest.click("xpath=//a[@target='_blank'] ");	         
	    Thread.sleep(1000);	
  }   
  
   
  //站点类型修改
  @Test
  public void tes43() throws InterruptedException {
	    webtest.click("xpath=//span[text()='站点配置']");
	    webtest.click("xpath=//span[text()='站点设置']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//a[text()='站点类型']");
	    webtest.click("xpath=//div[@class='chosen-drop']");
	    webtest.click("xpath=//li[@class='active-result highlighted']");
	    webtest.click("xpath=//div[@class='chosen-drop']");
	    webtest.click("xpath=//li[@class='active-result highlighted']");
	    webtest.click("xpath=//div[@class='chosen-drop']");
	    webtest.click("xpath=//li[@class='active-result highlighted']");
	    webtest.click("xpath=//button[text()='保存']");
	    Thread.sleep(1000);	
  }         
  
  
  //修改用户注册
  
  @Test
  public void tes44() throws InterruptedException {
	    webtest.click("xpath=//span[text()='站点配置']");
	    webtest.click("xpath=//span[text()='站点设置']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//a[text()='用户注册']");
	    webtest.click("xpath=//span[text()='开启']");	   
	    webtest.click("xpath=//li[@class='active-result highlighted']");
	    webtest.click("xpath=//span[text()='否']");	   
	    webtest.click("xpath=//li[@class='active-result highlighted']");
	    webtest.click("xpath=//span[text()='开启']");	   
	    webtest.click("xpath=//li[@class='active-result highlighted']");
	    webtest.click("xpath=//button[text()='保存']");
	    Thread.sleep(1000);	
  }         
  
  
 //修改用户登录
  
  @Test
  public void tes45() throws InterruptedException {
	    webtest.click("xpath=//span[text()='站点配置']");
	    webtest.click("xpath=//span[text()='站点设置']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//a[text()='用户登录']");
	    webtest.click("xpath=//span[text()='开启']");	   
	    webtest.click("xpath=//li[@class='active-result highlighted']");	    
	    webtest.click("xpath=//span[text()='开启']");	   
	    webtest.click("xpath=//li[@class='active-result highlighted']");
	    webtest.click("xpath=//button[text()='保存']");
	    Thread.sleep(1000);	
  }         
  
  
  
  //修改验证码
  
  @Test
  public void tes46() throws InterruptedException {
	    webtest.click("xpath=//span[text()='站点配置']");
	    webtest.click("xpath=//span[text()='站点设置']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//a[text()='验证码']");
	    webtest.click("xpath=//span[text()='开启']");	   
	    webtest.click("xpath=//li[@class='active-result highlighted']");	    	    
	    webtest.click("xpath=//button[text()='保存']");
	    Thread.sleep(1000);	
  }         
  
  
  
  
  //修改订单售后
  
  @Test
  public void tes47() throws InterruptedException {
	    webtest.click("xpath=//span[text()='站点配置']");
	    webtest.click("xpath=//span[text()='站点设置']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//a[text()='订单售后']");
	    webtest.click("name=home_order_aftersale_return_launch_day");
	    webtest.type("name=home_order_aftersale_return_launch_day", "100");
	    webtest.click("xpath=//button[text()='保存']");
	    Thread.sleep(1000);	
  }         
  
  //修改搜索
  
  @Test
  public void tes48() throws InterruptedException {
	    webtest.click("xpath=//span[text()='站点配置']");
	    webtest.click("xpath=//span[text()='站点设置']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//a[text()='搜索']");
	    webtest.click("xpath=//span[text()='自定义']");	   
	    webtest.click("xpath=//li[@class='active-result']");	    	    
	    webtest.click("xpath=//button[text()='保存']");
	    Thread.sleep(1000);	
  }         
  
  
  //修改商品
  @Test
  public void tes49() throws InterruptedException {
	    webtest.click("xpath=//span[text()='站点配置']");
	    webtest.click("xpath=//span[text()='站点设置']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//a[text()='商品']");
	    webtest.click("xpath=//span[text()='否']");	   
	    webtest.click("xpath=//li[@class='active-result']");	    	    
	    webtest.click("xpath=//button[text()='保存']");
	    Thread.sleep(1000);	
  }         
  
  
  
  //修改扩展项
  @Test
  public void tes50() throws InterruptedException {
	    webtest.click("xpath=//span[text()='站点配置']");
	    webtest.click("xpath=//span[text()='站点设置']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//a[text()='扩展项']");
	    webtest.click("xpath=//span[text()='否']");	   
	    webtest.click("xpath=//li[@class='active-result']");	    	    
	    webtest.click("xpath=//button[text()='保存']");
	    Thread.sleep(1000);	
  }         
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  }