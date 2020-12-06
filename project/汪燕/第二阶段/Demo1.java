package com.webtest.demo;

import static org.testng.Assert.assertTrue;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.webtest.core.BaseTest;

public class Demo1 extends BaseTest{
	String url = "http://localhost:92/admin.php?s=/admin/logininfo.html";
	
	@BeforeClass(description = "登录后台")
	public void test() {
		webtest.open(url);
		webtest.click("name=username");
		webtest.type("name=username", "admin");
		webtest.click("name=login_pwd");
		webtest.type("name=login_pwd", "123456");
		webtest.click("xpath=//button[text()='登录']");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
			Reporter.log(e.getMessage());
		}
	}
	@Test(description = "管理文章",priority = 1)
	public void test1()  {
		webtest.click("xpath=//span[text()='文章管理']");
		webtest.click("xpath=//ul[@id='power-menu-204']/li[1]/a");//点击文章管理
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			Reporter.log(e.getMessage());
			e.printStackTrace();
		}
	}
	

	@Test(description ="新增文章",priority = 2)
	public void test2()  {
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//div[@class='form-table-operate-top']/a");//点击新增
		webtest.leaveFrame();
		try {
			Thread.sleep(2000);
			webtest.enterFrame("ifcontent");
			webtest.type("name=title","文章一");
			Thread.sleep(2000);
			webtest.click("xpath=//div[@class='content']/form/div[2]/div/a/div");
			webtest.type("xpath=//div[@class='chosen-drop']/div/input","帮助中心");
			webtest.tapClick();//回车
			Thread.sleep(3000);
			webtest.click("xpath=//div[@class='content']/form/legend/a");//点击返回
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
			Reporter.log(e.getMessage());
		}finally {
			webtest.leaveFrame();
		}

	}	
	@Test(description = "删除1",priority = 4)
	public void test3() throws InterruptedException {
		webtest.enterFrame("ifcontent");
		//System.out.println(webtest.isDisplayed("xpath=//div[@class='form-table-operate-top']/button[1]"));
		webtest.click("xpath=//div[@class='form-table-operate-top']/button[1]");//点击删除
		webtest.leaveFrame();
	}
	@Test(description = "删除2",priority = 5)
	public void test4() throws InterruptedException {
		webtest.enterFrame("ifcontent");
		
		webtest.click("xpath=//button[text()='全选']");
		
		webtest.click("xpath=//div[@class='form-table-operate-top']/button[1]");//点击删除
		
		webtest.click("xpath=//div[@class='am-modal-footer']/span[1]");//点击取消
		boolean flag = webtest.isDisplayed("xpath=//tr[@id='data-list-30']/td[1]/div/label/span");
		webtest.leaveFrame();
	}

	@Test(description = "全选反选",priority = 6)
	public void test5() {
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//button[text()='全选']");
		webtest.click("xpath=//button[text()='反选']");
		webtest.leaveFrame();
	}
	@Test(description = "重置",priority = 7)
	public void test6() {
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//button[text()='全选']");
		webtest.click("xpath=//div[@class='form-table-operate-top']/a[2]");//点击重置
		webtest.leaveFrame();
	}
	
	@Test(description = "搜索",priority = 8)
	public void test7() {
		webtest.enterFrame("ifcontent");
		webtest.click("name=f1p");
		webtest.type("name=f1p","在线");
		webtest.click("xpath=//div[@class='form-table-operate-top']/button[2]");//点击搜索
		boolean flag = webtest.isTextPresent("在线");
		assertTrue(flag,"页面不存在 -在线-这个词汇");
		webtest.leaveFrame();
	}
	@Test(description = "搜索标题重置",priority = 9)
	public void test44() throws InterruptedException {
		webtest.enterFrame("ifcontent");
		webtest.click("name=f1p");
		webtest.type("name=f1p","关于");
		webtest.click("xpath=//div[@class='form-table-operate-top']/button[2]");//点击搜索
		webtest.click("xpath=//div[@class='form-table-operate-top']/a[2]");//点击重置
		boolean flag1=webtest.isDisplayed("xpath=//div[@class='form-table-operate-top']/button[2]");
		assertTrue(flag1);
		assertTrue(flag1, "搜索按钮未找到");
		assertTrue(webtest.isDisplayed("xpath=//div[@class='form-table-operate-top']/a[2]"),"重置按钮未找到");
		webtest.leaveFrame();
	}
	@Test(description = "详情",priority = 10)
	public void test8() throws InterruptedException {
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//tr[@id='data-list-28']/td[11]/button[1]");
		System.out.println(webtest.isDisplayed("xpath=//div[@class='am-popup  popup-iframe  popup-not-title am-modal-active']/div/span"));
		webtest.click("xpath=//div[@class='am-popup  popup-iframe  popup-not-title am-modal-active']/div/span");//点击叉号
		Thread.sleep(3000);
		webtest.leaveFrame();
	}
	@Test(description = "编辑",priority = 11)
	public void test9() {
		webtest.enterFrame("ifcontent");
		
		webtest.click("xpath=//tr[@id='data-list-28']/td[11]/a");//点击编辑
		webtest.click("xpath=//div[@class='content']/form/div[2]/div/a/div");
		webtest.type("xpath=//div[@class='chosen-drop']/div/input","帮助中心");
		webtest.click("xpath=//button[@class='am-btn am-btn-primary am-radius btn-loading-example am-btn-sm am-btn-block']");//点击保存
		webtest.leaveFrame();
	}
	@Test(description = "删除文章",priority = 12)
	public void test10() {
		webtest.enterFrame("ifcontent");
		
		webtest.click("xpath=//tr[@id='data-list-28']/td[11]/button[2]");//点击删除
		webtest.click("xpath=//div[@class='am-modal-footer']/span");//点击取消
		webtest.leaveFrame();
	}
	@Test(description = "页面转换",priority = 12)
	public void test11() throws InterruptedException {
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//ul[@class='am-pagination am-pagination-centered']/li[4]");
		Thread.sleep(3000);
		boolean flag = webtest.isTextPresent("忘记密码");

		
		webtest.click("xpath=//ul[@class='am-pagination am-pagination-centered']/li[3]");
		webtest.leaveFrame();
		
	}
	
	@Test(description = "文章分类",priority = 13)
	public void test12() throws InterruptedException {
//		webtest.click("xpath=//span[text()='文章管理']");
		webtest.click("xpath=//ul[@id='power-menu-204']/li[2]/a");;//点击文章分类
		Thread.sleep(2000);
	}
	@Test(description = "新增文章1",priority = 14)
	public void test13() {
		webtest.enterFrame("ifcontent");
		System.out.println(webtest.isDisplayed("xpath=//div[@class='am-g']/button"));
		webtest.click("xpath=//div[@class='am-g']/button");
		webtest.click("name=name");
		webtest.type("name=name","文章二");//输入名称
		webtest.click("xpath=//button[@type='submit']");//点击保存
		webtest.leaveFrame();
	}	

	@Test(description = "新增文章2",priority = 15)
	public void test14() {
		webtest.enterFrame("ifcontent");
		//System.out.println(webtest.isDisplayed("xpath=//div[@class='am-g']/button"));
		webtest.click("xpath=//div[@class='am-g']/button");
		webtest.click("xpath=//button[@type='submit']");//点击保存
		webtest.click("xpath=//span[@class='am-close']");//点击退出
		webtest.leaveFrame();
	}

/////////////////////////////////////////////////////////////////////////////////////////////	
	@Test(description = "问答留言",priority = 16)
	public void test15() {
		webtest.click("xpath=//span[text()='数据管理']");
		webtest.click("xpath=//ul[@id='power-menu-182']/li[1]/a");//点击问答留言
		
	}
	@Test(description = "搜索留言",priority = 17)
	public void test48() {
		webtest.enterFrame("ifcontent");
		System.out.println(webtest.isDisplayed("name=f2p"));

		webtest.click("name=f2p");
		webtest.type("name=f2p","admin");//输入联系人
		webtest.click("xpath=//div[@class='form-table-operate-top']/button[2]");//点击搜索
		boolean flag = webtest.isTextPresent("admin");
		assertTrue(flag,"搜索留言联系人amdin失败");
		webtest.leaveFrame();
	}
	@Test(description = "搜索联系人重置",priority = 19)
	public void test49() {
		webtest.enterFrame("ifcontent");
		System.out.println(webtest.isDisplayed("name=f2p"));

		webtest.click("name=f2p");
		webtest.type("name=f2p","admin");//输入联系人
		webtest.click("xpath=//div[@class='form-table-operate-top']/button[2]");//点击搜索
		webtest.click("xpath=//div[@class='form-table-operate-top']/a[2]");//点击重置
		webtest.leaveFrame();
	}
	@Test(description = "搜索留言重置",priority = 18)
	public void test50() {
		webtest.enterFrame("ifcontent");

		webtest.click("name=f4p");
		webtest.type("name=f4p","哈哈哈哈哈哈哈哈哈哈哈哈哈哈");//
		webtest.click("xpath=//div[@class='form-table-operate-top']/button[2]");//点击搜索
		webtest.click("xpath=//div[@class='form-table-operate-top']/a[2]");//点击重置
		webtest.leaveFrame();
	}
	@Test(description = "留言新增",priority = 20)
	public void test16() {
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//div[@class='form-table-operate-top']/a");//点击新增
		webtest.type("name=content", "哈哈哈哈哈");
		webtest.click("xpath=//button[@type='submit']");
		webtest.leaveFrame();
	}
	@Test(description = "留言新增",priority = 21)
	public void test17() {
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//div[@class='form-table-operate-top']/a");//点击新增
		webtest.type("name=content", "哈哈哈");//输入三个字保存
		webtest.click("xpath=//button[@type='submit']");
		webtest.click("xpath=//div[@class='content']/form/legend/a");//点击返回
		webtest.leaveFrame();
	}
	@Test(description = "留言删除",priority = 22)
	public void test18() throws InterruptedException {
		webtest.enterFrame("ifcontent");
		//System.out.println(webtest.isDisplayed("xpath=//div[@class='form-table-operate-top']/button[1]"));
		webtest.click("xpath=//div[@class='form-table-operate-top']/button[1]");//点击删除
		webtest.leaveFrame();
	}
	@Test(description = "删除2",priority = 23)
	public void test19() throws InterruptedException {
		webtest.enterFrame("ifcontent");
			
		webtest.click("xpath=//tr[@id='data-list-5']/td[1]/div/label/span");
		webtest.click("xpath=//div[@class='form-table-operate-top']/button[1]");//点击删除

		webtest.click("xpath=//div[@class='am-modal-footer']/span[1]");//点击取消
		webtest.leaveFrame();
	}
	@Test(description = "全选反选",priority = 24)
		public void test20() {
			webtest.enterFrame("ifcontent");
			webtest.click("xpath=//button[text()='全选']");
			webtest.click("xpath=//button[text()='反选']");
			webtest.leaveFrame();
		}
	@Test(description = "重置",priority = 25)
		public void test21() {
			webtest.enterFrame("ifcontent");
			webtest.click("xpath=//button[text()='全选']");
			webtest.click("xpath=//div[@class='form-table-operate-top']/a[2]");//点击重置
			webtest.leaveFrame();
	}
	@Test(description = "留言详情",priority = 26)
		public void test22() throws InterruptedException {
			webtest.enterFrame("ifcontent");
			webtest.click("xpath=//tr[@id='data-list-9']/td[13]/button[1]");
			System.out.println(webtest.isDisplayed("xpath=//div[@class='am-popup  popup-iframe  popup-not-title am-modal-active']/div/span"));
			webtest.click("xpath=//div[@class='am-popup  popup-iframe  popup-not-title am-modal-active']/div/span");//点击叉号
			Thread.sleep(3000);
			webtest.leaveFrame();
		}
	@Test(description = "编辑",priority = 27)
		public void test23(){
			webtest.enterFrame("ifcontent");
			
			webtest.click("xpath=//tr[@id='data-list-9']/td[13]/a");//点击编辑
			webtest.click("name=name");//点击联系人
			webtest.type("name=name","联系人一号");
			webtest.click("xpath=//div[@class='am-form-group am-form-group-refreshing']");
			webtest.leaveFrame();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				Reporter.log(e.getMessage());
			}
			
			
		}
	@Test(description = "回复留言1",priority = 28)
		public void test24() {
		webtest.enterFrame("ifcontent");
		
		webtest.click("xpath=//tr[@id='data-list-12']/td[13]/button[2]");//点击回复
		webtest.click("xpath=//form[@class='am-form form-validation-reply']/div[2]/button");//点击保存
		webtest.click("xpath=//span[@class='am-close']");
		webtest.leaveFrame();
	}
	@Test(description = "回复留言2",priority = 29)
		public void test25() throws InterruptedException {
			webtest.enterFrame("ifcontent");
			webtest.click("xpath=//tr[@id='data-list-12']/td[13]/button[2]");//点击回复
			webtest.click("name=reply");
			webtest.type("name=reply","回复哈哈哈");
			webtest.click("xpath=//form[@class='am-form form-validation-reply']/div[2]/button");//点击保存
			webtest.leaveFrame();
	}
	@Test(description = "删除留言",priority =30 )
		public void test26() throws InterruptedException {
			webtest.enterFrame("ifcontent");
			webtest.click("xpath=//tr[@id='data-list-12']/td[13]/button[3]");//点击删除
			webtest.click("xpath=//div[@class='am-modal-footer']/span[1]");//点击确定==取消
			webtest.leaveFrame();
	}	

		@Test(description = "消息管理",priority = 31)
		public void test27() {
			//webtest.click("xpath=//span[text()='数据管理']");
			webtest.click("xpath=//ul[@id='power-menu-182']/li[2]/a");//点击消息管理
			
		}
		@Test(description = "支付日志",priority = 32)
		public void test28() {
			//webtest.click("xpath=//span[text()='数据管理']");
			webtest.click("xpath=//ul[@id='power-menu-182']/li[3]/a");//点击支付日志
		}

		@Test(description = "退款日志",priority =33 )
		public void test29() {
			//webtest.click("xpath=//span[text()='数据管理']");
			webtest.click("xpath=//ul[@id='power-menu-182']/li[4]/a");//点击退款日志
			
		}
		@Test(description = "积分日志",priority = 34)
		public void test30() {
			//webtest.click("xpath=//span[text()='数据管理']");
			webtest.click("xpath=//ul[@id='power-menu-182']/li[5]/a");//点击退款日志
			
		}
		@Test(description = "应用管理",priority = 35)
		public void test31() {
			webtest.click("xpath=//span[text()='应用中心']");
			webtest.click("xpath=//ul[@id='power-menu-340']/li[1]/a");//点击应用管理
			
		}
		@Test(description = "应用管理-上传应用",priority = 36)
		public void test39() {
			webtest.enterFrame("ifcontent");//html/body/div[2]/div/ul/li[2]/a
			webtest.click("xpath=//div[@class='content-right']/div/ul/li[2]/a");
			webtest.click("xpath=//div[@class='content-right']/div/ul/li[1]/a");
			//System.out.println(webtest.isDisplayed("xpath=//div[@class='content-right']/div/ul/li[2]"));
			webtest.leaveFrame();
		}
		@Test(description = "应用商店",priority = 37)
		public void test32() {
			//webtest.click("xpath=//span[text()='应用中心']");
			webtest.click("xpath=//ul[@id='power-menu-340']/li[2]/a");//点击应用商店
		}
		@Test(description = "应用商店点击主题",priority = 38)
		public void test45() {
			webtest.enterFrame("ifcontent");

			//System.out.println(webtest.isDisplayed("xpath=//html/body/iframe"));
			webtest.enterFrame1("xpath=//html/body/iframe");
			System.out.println(webtest.isDisplayed("xpath=//ul[@class='am-nav am-nav-pills am-topbar-nav']"));
			webtest.click("xpath=//ul[@class='am-nav am-nav-pills am-topbar-nav']/li[2]");
			webtest.click("xpath=//ul[@class='am-nav am-nav-pills am-topbar-nav']/li[1]");
			webtest.leaveFrame();
			
		}
		@Test(description = "应用商店点击支付",priority = 39)
		public void test46() {
			webtest.enterFrame("ifcontent");

			//System.out.println(webtest.isDisplayed("xpath=//html/body/iframe"));
			webtest.enterFrame1("xpath=//html/body/iframe");
			System.out.println(webtest.isDisplayed("xpath=//ul[@class='am-nav am-nav-pills am-topbar-nav']"));
			webtest.click("xpath=//ul[@class='am-nav am-nav-pills am-topbar-nav']/li[3]");
			webtest.click("xpath=//ul[@class='am-nav am-nav-pills am-topbar-nav']/li[1]");
			webtest.leaveFrame();
		}
		@Test(description = "应用商店点击主题支付",priority = 40)
		public void test47(){
			webtest.enterFrame("ifcontent");

			//System.out.println(webtest.isDisplayed("xpath=//html/body/iframe"));
			webtest.enterFrame1("xpath=//html/body/iframe");
			System.out.println(webtest.isDisplayed("xpath=//ul[@class='am-nav am-nav-pills am-topbar-nav']"));
			webtest.click("xpath=//ul[@class='am-nav am-nav-pills am-topbar-nav']/li[2]");
			webtest.click("xpath=//ul[@class='am-nav am-nav-pills am-topbar-nav']/li[3]");
			webtest.click("xpath=//ul[@class='am-nav am-nav-pills am-topbar-nav']/li[1]");
			webtest.leaveFrame();
		}
		@Test(description = "缓存管理",priority = 41)
		public void test33() {
			webtest.click("xpath=//span[text()='工具']");
			webtest.click("xpath=//ul[@id='power-menu-118']/li[1]/a");
		}
	@Test(description = "更新1",priority = 42)
		public void test34() throws InterruptedException {
			webtest.enterFrame("ifcontent");
			webtest.click("xpath=//div[@class='content']/div[1]/a/button");
			Thread.sleep(2000);
			webtest.leaveFrame();
		}
		@Test(description = "更新2",priority = 43)
		public void test35()  {
			webtest.enterFrame("ifcontent");
			webtest.click("xpath=//div[@class='content']/div[2]/a/button");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				Reporter.log(e.getMessage());
			}
			webtest.leaveFrame();
		}
		@Test(description = "更新3",priority = 44)
		public void test36()  {
			webtest.enterFrame("ifcontent");
			webtest.click("xpath=//div[@class='content']/div[3]/a/button");
			webtest.leaveFrame();
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				Reporter.log(e.getMessage());
			}
			
		}
		@Test(description = "SQL控制台",priority = 45)
		public void test37() {
			//webtest.click("xpath=//span[text()='工具']");
			webtest.click("xpath=//ul[@id='power-menu-118']/li[2]/a");
		}
		@Test(description = "SQL控制台",priority = 46)
		public void test38() throws InterruptedException {
			webtest.enterFrame("ifcontent");
			webtest.click("xpath=div[@class='content']/form/div[2]/button");
			webtest.leaveFrame();
		}
		@Test(description = "文章管理按钮",priority = 47)
		public void test40() throws InterruptedException {
			webtest.click("xpath=//span[text()='文章管理']");
			webtest.click("xpath=//span[text()='文章管理']");//点击文章管理
			Thread.sleep(2000);
		}
		@Test(description = "数据管理按钮",priority = 48)
		public void test41() throws InterruptedException {
			webtest.click("xpath=//span[text()='数据管理']");
			webtest.click("xpath=//span[text()='数据管理']");//点击文章管理
			Thread.sleep(2000);
		}
		@Test(description = "应用中心按钮",priority = 49)
		public void test42() throws InterruptedException {
			webtest.click("xpath=//span[text()='应用中心']");
			webtest.click("xpath=//span[text()='应用中心']");//点击文章管理
			Thread.sleep(2000);
		}
		@Test(description = "工具按钮",priority = 50)
		public void test43() throws InterruptedException {
			webtest.click("xpath=//span[text()='工具']");
			webtest.click("xpath=//span[text()='工具']");//点击文章管理
			Thread.sleep(2000);
		}
		
		

}












