package com.www.lw.selenium;

import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeMethod;


//import org.junit.Test;

import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
import com.webtest.core.WebDriverEngine;
import com.webtest.freemarker.MailUtil;

public class Demo extends BaseTest{
	
	MailUtil m=new MailUtil();
	String URL= "http://localhost/admin.php?s=/admin/logininfo.html";
	
	@BeforeMethod
	public void test_login1() throws InterruptedException {
		webtest.open(URL);
//		Thread.sleep(1000);
		webtest.click("name=username");
		webtest.type("name=username", "admin");
//		Thread.sleep(1000);
		webtest.click("name=password");
		webtest.type("name=login_pwd", "shopxo");
//		Thread.sleep(2000);
		webtest.click("xpath=//button[text()='登录']");
		Thread.sleep(1000);
	}
	

	
	@Test
//	查看用户详情
	public void test2() throws InterruptedException {
//		点击用户管理
		webtest.click("xpath=//span[text()='用户管理']");
//		Thread.sleep(1000);
		webtest.click("xpath=//span[text()='用户列表']");
//		Thread.sleep(1000);
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='详情']");
		webtest.click("xpath=//span[@class='am-close am-close-alt am-icon-times am-close-spin']");
		Thread.sleep(1000);		
		System.out.print("方法完成");
	}
	
	@Test
//	编辑用户信息(成功了哈哈哈哈哈哈哈哈哈哈或)
	public void test3() throws InterruptedException {
//		点击用户管理
		webtest.click("xpath=//span[text()='用户管理']");
//		Thread.sleep(1000);
		webtest.click("xpath=//span[text()='用户列表']");
//		Thread.sleep(1000);
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='编辑']");
//		Thread.sleep(1000);
		webtest.click("xpath=//button[text()='保存']");
		System.out.print("方法完成");
		
	}
	
	@Test
//	删除用户(cg)
	public void test4() throws InterruptedException {
//		点击用户管理
		webtest.click("xpath=//span[text()='用户管理']");
//		Thread.sleep(1000);
		webtest.click("xpath=//span[text()='用户列表']");
//		Thread.sleep(1000);
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//button[@class='am-btn am-btn-danger am-radius am-btn-xs am-icon-trash-o form-table-operate-top-delete-submit']");
//		Thread.sleep(1000);
		webtest.click("xpath=//span[text()='确定']");
		Thread.sleep(1000);
		System.out.print("方法完成");
	}
	@Test
//添加用户
	public void test5() throws InterruptedException {
//		点击用户管理
		webtest.click("xpath=//span[text()='用户管理']");
//		Thread.sleep(1000);
		webtest.click("xpath=//span[text()='用户列表']");
		Thread.sleep(1000);
//		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//a[@class='am-btn am-btn-secondary am-radius am-btn-xs am-icon-plus']");
		Thread.sleep(1000);
		webtest.click("name=username");
		webtest.type("name=username", "admin");
		webtest.click("xpath=//button[text()='保存']");
		Thread.sleep(1000);
		System.out.print("方法完成");
	}
	@Test
//	生成Excel表格
	public void test6() throws InterruptedException {
//		点击用户管理
		webtest.click("xpath=//span[text()='用户管理']");
//		Thread.sleep(1000);
		webtest.click("xpath=//span[text()='用户列表']");
		Thread.sleep(1000);
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//a[@class='am-btn am-btn-success am-btn-xs am-icon-file-excel-o am-radius']");
		Thread.sleep(1000);
		System.out.print("方法完成");
	}
	
	@Test
//	查找用户
	public void test7() throws InterruptedException {
//		点击用户管理
		webtest.click("xpath=//span[text()='用户管理']");
//		Thread.sleep(1000);
		webtest.click("xpath=//span[text()='用户列表']");
		Thread.sleep(1000);
		webtest.enterFrame("ifcontent");
		webtest.click("name=f1p");
		webtest.type("name=f1p", "1324885562");
		Thread.sleep(1000);
		System.out.print("方法完成");
//		实现回车键---------------------------------------------------------------------
	}

	@Test
//	查找用户-用户名
	public void test8() throws InterruptedException {
//		点击用户管理
		webtest.click("xpath=//span[text()='用户管理']");
//		Thread.sleep(1000);
		webtest.click("xpath=//span[text()='用户列表']");
		Thread.sleep(1000);
		webtest.enterFrame("ifcontent");
		webtest.click("name=f3p");
		webtest.type("name=f3p", "admin");
		System.out.print("方法完成");
		Thread.sleep(1000);
//		实现回车键---------------------------------------------------------------------
	}
	
	@Test
//	查找用户-昵称
	public void test9() throws InterruptedException {
//		点击用户管理
		webtest.click("xpath=//span[text()='用户管理']");
//		Thread.sleep(1000);
		webtest.click("xpath=//span[text()='用户列表']");
		Thread.sleep(1000);
		webtest.enterFrame("ifcontent");
		webtest.click("name=f4p");
		webtest.type("name=f4p", "梁美女");
		System.out.print("方法完成");
		Thread.sleep(1000);
//		实现回车键---------------------------------------------------------------------
	}
	
	@Test
//	查找用户-手机号
	public void test10() throws InterruptedException {
//		点击用户管理
		webtest.click("xpath=//span[text()='用户管理']");
//		Thread.sleep(1000);
		webtest.click("xpath=//span[text()='用户列表']");
		Thread.sleep(1000);
		webtest.enterFrame("ifcontent");
		webtest.click("name=f5p");
		webtest.type("name=f5p", "19831128152");
		System.out.print("方法完成");
		Thread.sleep(1000);
//		实现回车键---------------------------------------------------------------------
	}
	@Test
//	查找用户-邮箱
	public void test11() throws InterruptedException {
//		点击用户管理
		webtest.click("xpath=//span[text()='用户管理']");
//		Thread.sleep(1000);
		webtest.click("xpath=//span[text()='用户列表']");
		Thread.sleep(1000);
		webtest.enterFrame("ifcontent");
		webtest.click("name=f6p");
		webtest.type("name=f6p", "1324885562@qq.com");
		System.out.print("方法完成");
		Thread.sleep(1000);
//		实现回车键---------------------------------------------------------------------
	}
	@Test
//	筛选用户
	public void test12() throws InterruptedException {
//		点击用户管理
		webtest.click("xpath=//span[text()='用户管理']");
//		Thread.sleep(1000);
		webtest.click("xpath=//span[text()='用户列表']");
		Thread.sleep(1000);
		webtest.enterFrame("ifcontent");
//		webtest.click("xpath=//input[@value,'请选择性别']");
		webtest.click("xpath=/html/body/div[2]/div/form/div[3]/table/thead/tr[2]/td[8]/div/ul/li/input");
		webtest.type("xpath=/html/body/div[2]/div/form/div[3]/table/thead/tr[2]/td[8]/div/ul/li/input", "女");
		webtest.enter();
		System.out.print("方法完成");
		Thread.sleep(2000);
//		实现回车键---------------------------------------------------------------------
	}
	
	@Test
//	查看商品详情
	public void test13() throws InterruptedException {
//		点击商品管理
		webtest.click("xpath=//span[text()='商品管理']");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div[1]/div/ul/li[6]/ul/li[1]/a/span");
		Thread.sleep(1000);
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='详情']");
		System.out.print("方法完成");
		Thread.sleep(1000);		
	}
	@Test
//	查看商品详情
	public void test14() throws InterruptedException {
//		点击商品管理
		webtest.click("xpath=//span[text()='商品管理']");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div[1]/div/ul/li[6]/ul/li[1]/a/span");
		Thread.sleep(1000);
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='编辑']");
		System.out.print("方法完成");
		Thread.sleep(1000);		
	}
	@Test
//	复制商品
	public void test15() throws InterruptedException {
//		点击商品管理
		webtest.click("xpath=//span[text()='商品管理']");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div[1]/div/ul/li[6]/ul/li[1]/a/span");
		Thread.sleep(1000);
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='复制']");
		System.out.print("方法完成");
		Thread.sleep(1000);		
	}
	
	@Test
//	删除商品
	public void test16() throws InterruptedException {
//		点击商品管理
		webtest.click("xpath=//span[text()='商品管理']");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div[1]/div/ul/li[6]/ul/li[1]/a/span");
		Thread.sleep(1000);
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='删除']");
		Thread.sleep(1000);		
		webtest.click("xpath=//span[text()='确定']");
		System.out.print("方法完成");
		Thread.sleep(1000);
	}
	
	@Test
//	新增商品
	public void test17() throws InterruptedException {
//		点击商品管理
		webtest.click("xpath=//span[text()='商品管理']");
		Thread.sleep(1000);

		webtest.click("xpath=/html/body/div[1]/div[1]/div/ul/li[6]/ul/li[1]/a/span");
		Thread.sleep(1000);
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//a[@class='am-btn am-btn-secondary am-radius am-btn-xs am-icon-plus']");
		System.out.print("方法完成");
		Thread.sleep(1000);		
	}
	
	@Test
//	查找商品-id
	public void test18() throws InterruptedException {
//		点击商品管理
		webtest.click("xpath=//span[text()='商品管理']");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div[1]/div/ul/li[6]/ul/li[1]/a/span");
		Thread.sleep(1000);
		webtest.enterFrame("ifcontent");
		webtest.click("name=f1p");
		webtest.type("name=f1p", "1324885562");
		System.out.print("方法完成");
		Thread.sleep(1000);	
	}
	@Test
//	查找商品-商品名称
	public void test19() throws InterruptedException {
//		点击商品管理
		webtest.click("xpath=//span[text()='商品管理']");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div[1]/div/ul/li[6]/ul/li[1]/a/span");
		Thread.sleep(1000);
		webtest.enterFrame("ifcontent");
		webtest.click("name=f2p");
		webtest.type("name=f2p", "破碎花裙子");
		System.out.print("方法完成");
		Thread.sleep(1000);	
	}
	@Test
//	查找商品-商品分类
	public void test20() throws InterruptedException {
//		点击商品管理
		webtest.click("xpath=//span[text()='商品管理']");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div[1]/div/ul/li[6]/ul/li[1]/a/span");
		Thread.sleep(1000);
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=/html/body/div[2]/div/form/div[3]/table/thead/tr[2]/td[4]/div/ul/li/input");
		webtest.type("xpath=/html/body/div[2]/div/form/div[3]/table/thead/tr[2]/td[4]/div/ul/li/input", "破洞裤");
		System.out.print("方法完成");
		Thread.sleep(1000);	
	}
	
	@Test
//	查找商品-简述
	public void test21() throws InterruptedException {
//		点击商品管理
		webtest.click("xpath=//span[text()='商品管理']");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div[1]/div/ul/li[6]/ul/li[1]/a/span");
		Thread.sleep(1000);
		webtest.enterFrame("ifcontent");
		webtest.click("name=f2p");
		webtest.type("name=f2p", "这是一个可爱的小裙子，公主风，小朋友都很喜欢");
		Thread.sleep(1000);	
	}
	@Test
//	查找商品-商品品牌
	public void test22() throws InterruptedException {
//		点击商品管理
		webtest.click("xpath=//span[text()='商品管理']");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div[1]/div/ul/li[6]/ul/li[1]/a/span");
		Thread.sleep(1000);
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=/html/body/div[2]/div/form/div[3]/table/thead/tr[2]/td[5]/div/ul/li/input");
		webtest.type("xpath=/html/body/div[2]/div/form/div[3]/table/thead/tr[2]/td[5]/div/ul/li/input", "佳洁士");
		Thread.sleep(1000);	
	}
	
	@Test
//	查找商品-商品名称
	public void test23() throws InterruptedException {
//		点击商品管理
		webtest.click("xpath=//span[text()='商品管理']");
		Thread.sleep(1000);
		webtest.click("xpath=/html/body/div[1]/div[1]/div/ul/li[6]/ul/li[1]/a/span");
		Thread.sleep(1000);
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//a[text()='新增']");
		Thread.sleep(1000);	
	}
//--------------------------------商品管理-商品分类-------------------------------------------------------------	
	@Test
//	查找商品-商品名称
	public void test24() throws InterruptedException {
//		点击商品管理
		webtest.click("xpath=//span[text() ='商品管理']");
		Thread.sleep(1000);
		webtest.click("xpath=//span[text() ='商品分类']");
		Thread.sleep(1000);
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//button[@class='am-btn am-btn-secondary am-radius am-btn-xs am-icon-plus tree-submit-add']");
		Thread.sleep(1000);
		webtest.click("name=name");
		webtest.type("name=name", "123445");
		Thread.sleep(1000);
		webtest.click("xpath=//button[text()='保存']");	
		Thread.sleep(1000);	
	}
	
	@Test
//	编辑商品
	public void test25() throws InterruptedException {
//		点击商品管理
		webtest.click("xpath=//span[text() ='商品管理']");
		Thread.sleep(1000); 
		webtest.click("xpath=//span[text() ='商品分类']");
		Thread.sleep(1000);
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//button[text() ='编辑']");
		Thread.sleep(1000);	
	}
	@Test
//	删除商品
	public void test26() throws InterruptedException {
//		点击商品管理
		webtest.click("xpath=//span[text() ='商品管理']");
		Thread.sleep(1000); 
		webtest.click("xpath=//span[text() ='商品分类']");
		Thread.sleep(1000);
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//button[text() ='删除']");
		Thread.sleep(1000);	
		webtest.click("xpath=//span[text() ='确定']");
	}
	
	@Test
//	删除商品评论
	public void test27() throws InterruptedException {
//		点击商品管理
		webtest.click("xpath=//span[text() ='商品管理']");
		Thread.sleep(1000); 
		webtest.click("xpath=//span[text() ='商品评论']");
		Thread.sleep(1000);
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//button[text() ='删除']");
		Thread.sleep(1000);	
		webtest.click("xpath=//span[text() ='确定']");
	}
	
	@Test
//	搜索商品评论-商品名称
	public void test28() throws InterruptedException {
//		点击商品管理
		webtest.click("xpath=//span[text() ='商品管理']");
		Thread.sleep(1000); 
		webtest.click("xpath=//span[text() ='商品评论']");
		Thread.sleep(1000);
		webtest.enterFrame("ifcontent");
		webtest.click("name=f1p");
		webtest.type("name=f1p", "佳洁士");
		Thread.sleep(1000);	
	}
	
	@Test
//	搜索商品评论-用户名
	public void test29() throws InterruptedException {
//		点击商品管理
		webtest.click("xpath=//span[text() ='商品管理']");
		Thread.sleep(1000); 
		webtest.click("xpath=//span[text() ='商品评论']");
		Thread.sleep(1000);
		webtest.enterFrame("ifcontent");
		webtest.click("name=f2p");
		webtest.type("name=f2p", "梁美女");
		Thread.sleep(1000);	
		webtest.enter();
	}
	@Test
//	搜索商品评论-邮箱
	public void test30() throws InterruptedException {
//		点击商品管理
		webtest.click("xpath=//span[text() ='商品管理']");
		Thread.sleep(1000); 
		webtest.click("xpath=//span[text() ='商品评论']");
		Thread.sleep(1000);
		webtest.enterFrame("ifcontent");
		webtest.click("name=f2p");
		webtest.type("name=f2p", "1324885562@qq.com");
		Thread.sleep(1000);	
		webtest.enter();
	}
	
	@Test
//	搜索商品评论-手机号
	public void test31() throws InterruptedException {
//		点击商品管理
		webtest.click("xpath=//span[text() ='商品管理']");
		Thread.sleep(1000); 
		webtest.click("xpath=//span[text() ='商品评论']");
		Thread.sleep(1000);
		webtest.enterFrame("ifcontent");
		webtest.click("name=f2p");
		webtest.type("name=f2p", "19831128152");
		Thread.sleep(1000);	
		webtest.enter();
	}
	
	@Test
//	搜索商品评论-业务类型
	public void test32() throws InterruptedException {
//		点击商品管理
		webtest.click("xpath=//span[text() ='商品管理']");
		Thread.sleep(1000); 
		webtest.click("xpath=//span[text() ='商品评论']");
		Thread.sleep(1000);
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=/html/body/div[2]/div/form/div[3]/table/thead/tr[2]/td[4]/div/ul/li/input");
		webtest.type("xpath=/html/body/div[2]/div/form/div[3]/table/thead/tr[2]/td[4]/div/ul/li/input", "订单");
		Thread.sleep(1000);	
		webtest.enter();
		Thread.sleep(2000);
	}
	
	@Test
//	搜索商品评论-评论内容
	public void test33() throws InterruptedException {
//		点击商品管理
		webtest.click("xpath=//span[text() ='商品管理']");
		Thread.sleep(1000); 
		webtest.click("xpath=//span[text() ='商品评论']");
		Thread.sleep(1000);
		webtest.enterFrame("ifcontent");
		webtest.click("name=f4p");
		webtest.type("name=f4p", "订单");
		Thread.sleep(1000);	
		webtest.enter();
		Thread.sleep(2000);
	}
	
	@Test
//	商品浏览-查看详情
	public void test34() throws InterruptedException {
//		点击商品管理
		webtest.click("xpath=//span[text() ='商品管理']");
		Thread.sleep(1000); 
		webtest.click("xpath=//span[text() ='商品浏览']");
		Thread.sleep(1000);
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text='详情']");
		Thread.sleep(2000);
	}
	
	@Test
//	商品浏览-删除
	public void test35() throws InterruptedException {
//		点击商品管理
		webtest.click("xpath=//span[text() ='商品管理']");
		Thread.sleep(1000); 
		webtest.click("xpath=//span[text() ='商品浏览']");
		Thread.sleep(1000);
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=/html/body/div[2]/div/form/div[3]/table/tbody/tr[1]/td[7]/button[2]");
		Thread.sleep(2000);
		webtest.click("xpath=//span[text='确定']");
		Thread.sleep(1000);
	}
	
	@Test
//	商品浏览-批量删除
	public void test36() throws InterruptedException {
//		点击商品管理
		webtest.click("xpath=//span[text() ='商品管理']");
		Thread.sleep(1000); 
		webtest.click("xpath=//span[text() ='商品浏览']");
		Thread.sleep(1000);
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//button[text()='全选']");
		Thread.sleep(2000);
		webtest.click("xpath=//button[text()='删除']");
		webtest.click("xpath=//span[text='确定']");
		Thread.sleep(1000);
	}
	
	@Test
//	商品浏览-查找用户浏览信息
	public void test37() throws InterruptedException {
//		点击商品管理
		webtest.click("xpath=//span[text() ='商品管理']");
		Thread.sleep(1000); 
		webtest.click("xpath=//span[text() ='商品浏览']");
		Thread.sleep(1000);
		webtest.enterFrame("ifcontent");
		webtest.click("name=f1p");
		webtest.type("name=f1p", "梁美女");
		webtest.enter();
		Thread.sleep(2000);
	}
	
	@Test
//	商品浏览-查找用户浏览信息
	public void test38() throws InterruptedException {
//		点击商品管理
		webtest.click("xpath=//span[text() ='商品管理']");
		Thread.sleep(1000); 
		webtest.click("xpath=//span[text() ='商品浏览']");
		Thread.sleep(1000);
		webtest.enterFrame("ifcontent");
		webtest.click("name=f2p");
		webtest.type("name=f2p", "梁美女");
		webtest.enter();
		Thread.sleep(2000);
	}
	
	@Test
//	商品浏览-重置
	public void test39() throws InterruptedException {
//		点击商品管理
		webtest.click("xpath=//span[text() ='商品管理']");
		Thread.sleep(1000); 
		webtest.click("xpath=//span[text() ='商品浏览']");
		Thread.sleep(3000);
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//a[@class='am-btn am-btn-warning am-radius am-btn-sm am-icon-filter']");
		Thread.sleep(2000);
	}
	
	@Test
//	商品浏览-重置
	public void test40() throws InterruptedException {
//		点击商品管理
		webtest.click("xpath=//span[text() ='商品管理']");
		Thread.sleep(1000); 
		webtest.click("xpath=//span[text() ='商品收藏']");
		Thread.sleep(3000);
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//a[@class='am-btn am-btn-warning am-radius am-btn-sm am-icon-filter']");
		Thread.sleep(2000);
	}
		
	@Test
//	商品收藏-查找用户收藏信息-昵称
	public void test41() throws InterruptedException {
//		点击商品管理
		webtest.click("xpath=//span[text() ='商品管理']");
		Thread.sleep(1000); 
		webtest.click("xpath=//span[text() ='商品收藏']");
		Thread.sleep(1000);
		webtest.enterFrame("ifcontent");
		webtest.click("name=f1p");
		webtest.type("name=f1p", "梁美女");
		webtest.enter();
		Thread.sleep(2000);
	}
	@Test
//	商品收藏-查找用户收藏信息-邮箱
	public void test42() throws InterruptedException {
//		点击商品管理
		webtest.click("xpath=//span[text() ='商品管理']");
		Thread.sleep(1000); 
		webtest.click("xpath=//span[text() ='商品收藏']");
		Thread.sleep(1000);
		webtest.enterFrame("ifcontent");
		webtest.click("name=f1p");
		webtest.type("name=f1p", "1324885562@qq.com");
		webtest.enter();
		Thread.sleep(2000);
	}
	
	@Test
//	商品收藏-查找用户收藏信息-手机
	public void test43() throws InterruptedException {
//		点击商品管理
		webtest.click("xpath=//span[text() ='商品管理']");
		Thread.sleep(1000); 
		webtest.click("xpath=//span[text() ='商品收藏']");
		Thread.sleep(1000);
		webtest.enterFrame("ifcontent");
		webtest.click("name=f1p");
		webtest.type("name=f1p", "19831128152");
		webtest.enter();
		Thread.sleep(2000);
	}
	
	@Test
//	商品收藏-查找用户收藏信息
	public void test44() throws InterruptedException {
//		点击商品管理
		webtest.click("xpath=//span[text() ='商品管理']");
		Thread.sleep(1000); 
		webtest.click("xpath=//span[text() ='商品收藏']");
		Thread.sleep(1000);
		webtest.enterFrame("ifcontent");
		webtest.click("name=f2p");
		webtest.type("name=f2p", "梁美女");
		webtest.enter();
		Thread.sleep(2000);
	}
	
	@Test
//	商品收藏-重置
	public void test45() throws InterruptedException {
//		点击商品管理
		webtest.click("xpath=//span[text() ='商品管理']");
		Thread.sleep(1000); 
		webtest.click("xpath=//span[text() ='商品收藏']");
		Thread.sleep(3000);
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//a[@class='am-btn am-btn-warning am-radius am-btn-sm am-icon-filter']");
		Thread.sleep(2000);
	}
//-------------------------------------订单管理-------------------------------------------------
	@Test
//	订单管理-查找订单信息
	public void test46() throws InterruptedException {
//		点击商品管理
		webtest.click("xpath=//span[text() ='订单管理']");
		Thread.sleep(1000); 
		webtest.click("xpath=/html/body/div[1]/div[1]/div/ul/li[7]/ul/li[1]/a");
		Thread.sleep(1000);
		webtest.enterFrame("ifcontent");
		webtest.click("name=f0p");
		webtest.type("name=f0p", "梁美女");
		webtest.enter();
		Thread.sleep(2000);
	}
	@Test
//	订单管理-查找订单信息
	public void test47() throws InterruptedException {
//		点击商品管理
		webtest.click("xpath=//span[text() ='订单管理']");
		Thread.sleep(1000); 
		webtest.click("xpath=/html/body/div[1]/div[1]/div/ul/li[7]/ul/li[1]/a");
		Thread.sleep(1000);
		webtest.enterFrame("ifcontent");
		webtest.click("name=f1p");
		webtest.type("name=f1p", "梁美女");
		webtest.enter();
		Thread.sleep(2000);
	}
	
	@Test
//	商品浏览-重置
	public void test48() throws InterruptedException {
//		点击商品管理
		webtest.click("xpath=//span[text() ='商品管理']");
		Thread.sleep(1000); 
		webtest.click("xpath=//span[text() ='商品收藏']");
		Thread.sleep(3000);
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//a[@class='am-btn am-btn-warning am-radius am-btn-sm am-icon-filter']");
		Thread.sleep(2000);
	}
	
	@Test
//	订单售后-查找订单信息
	public void test49() throws InterruptedException {
//		点击商品管理
		webtest.click("xpath=//span[text() ='订单管理']");
		Thread.sleep(1000); 
		webtest.click("xpath=/html/body/div[1]/div[1]/div/ul/li[7]/ul/li[1]/a");
		Thread.sleep(1000);
		webtest.enterFrame("ifcontent");
		webtest.click("name=f0p");
		webtest.type("name=f0p", "梁美女");
		webtest.enter();
		Thread.sleep(2000);
	}
	@Test
//	订单售后-查找订单信息
	public void test50() throws InterruptedException {
//		点击商品管理
		webtest.click("xpath=//span[text() ='订单管理']");
		Thread.sleep(1000); 
		webtest.click("xpath=/html/body/div[1]/div[1]/div/ul/li[7]/ul/li[1]/a");
		Thread.sleep(1000);
		webtest.enterFrame("ifcontent");
		webtest.click("name=f1p");
		webtest.type("name=f1p", "梁美女");
		webtest.enter();
		Thread.sleep(2000);
	}
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
