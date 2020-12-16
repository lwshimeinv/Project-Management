package Homework;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.apache.poi.ss.formula.functions.T;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.common.base.Function;
import com.google.inject.PrivateBinder;
import com.webtest.core.BaseTest;

public class Demo extends BaseTest {

	String URL = "http://localhost:98/";

	@BeforeMethod
	public void test1() throws InterruptedException {
		//登录
			webtest.open(URL);
			webtest.click("xpath=//a[@class='am-btn-primary btn am-fl']");
			webtest.type("name=accounts", "admin");
			webtest.type("name=pwd", "yj123456");
			webtest.type("name=verify", "ssss");
			webtest.click("xpath=//button[@class='am-btn am-btn-primary am-radius am-btn-sm btn-loading-example']");
		
	}

	@Test(description = "查看页面详情",priority = 2)
	public void test2() throws InterruptedException {
		// 点击个人中心-订单管理-订单模式
			webtest.click("xpath=//span[text()='个人中心']");
			webtest.click("class=am-icon-th-list");
			webtest.type("name=f1p",
					"销售");
			Boolean flag = webtest.isElementPresent("销售 ");
			assertFalse(flag);
	}

	@Test(description = "查看页面详情",priority = 3)
	public void test3() throws InterruptedException {
		// 点击个人中心-订单管理-下单平台
			webtest.click("xpath=//span[text()='个人中心']");
			webtest.click("class=am-icon-th-list");
			webtest.click("xpath=/html/body/div[4]/div[3]/div/div/form/div[3]/table/thead/tr[2]/td[9]/div/ul/li/input");
			webtest.type("xpath=/html/body/div[4]/div[3]/div/div/form/div[3]/table/thead/tr[2]/td[9]/div/ul/li/input",
					"苹果APP");
			Boolean flag = webtest.isElementPresent("苹果APP");
			assertFalse(flag);
	}

	@Test(description = "查看页面详情",priority = 4)
	public void test4() throws InterruptedException {
		// 点击个人中心-订单管理-地址信息
			webtest.click("xpath=//span[text()='个人中心']");
			webtest.click("class=am-icon-th-list");
			webtest.type("name=f9p", "河北省石家庄市河北师范大学");
			Boolean flag = webtest.isElementPresent("河北省石家庄市河北师范大学");
			assertFalse(flag);
	       
	}

	@Test(description = "查看页面详情",priority = 5)
	public void test5() throws InterruptedException {
		// 点击个人中心-订单管理-取货人信息
			webtest.click("xpath=//span[text()='个人中心']");
			webtest.click("class=am-icon-th-list");
			webtest.type("name=f10p", "丁日华-计算机学院");
			Boolean flag = webtest.isElementPresent("丁日华-计算机学院");
			assertFalse(flag);
	}

	@Test(description = "查看页面详情",priority = 6)
	public void test6() throws InterruptedException {
		// 点击个人中心-订单管理-支付方式、
			webtest.click("xpath=//span[text()='个人中心']");
			webtest.click("class=am-icon-th-list");
			webtest.click(
					"xpath=/html/body/div[4]/div[3]/div/div/form/div[3]/table/thead/tr[2]/td[17]/div/ul/li/input");
			webtest.type("xpath=/html/body/div[4]/div[3]/div/div/form/div[3]/table/thead/tr[2]/td[17]/div/ul/li/input",
					"支付宝");
			Boolean flag = webtest.isElementPresent("支付宝");
			assertFalse(flag);	
	}

	@Test(description = "查看页面详情",priority = 18)
	public void test18() throws InterruptedException {
		// 点击个人中心-订单管理-批量支付
			webtest.click("xpath=//span[text()='个人中心']");
			webtest.click("class=am-icon-th-list");
			webtest.click(
					"xpath=//button[@class='am-btn am-btn-secondary am-radius am-btn-xs am-icon-paypal batch-pay-submit']");
			Boolean flag = webtest.isElementPresent("批量支付");
			assertFalse(flag);
	}

	@Test(description = "查看页面详情",priority = 7)
	public void test7() throws InterruptedException {
		// 点击个人中心-订单售后-基础信息
			webtest.click("xpath=//span[text()='个人中心']");
			webtest.click("class=am-icon-puzzle-piece");
			webtest.type("name=f0p", "10987654321");
			Boolean flag = webtest.isElementPresent("10987654321");
			assertFalse(flag);
	}

	@Test(description = "查看页面详情",priority = 8)
	public void test8() throws InterruptedException {
		// 点击个人中心-订单售后-订单状态
			webtest.click("xpath=//span[text()='个人中心']");
			webtest.click("class=am-icon-puzzle-piece");
			webtest.click("xpath=/html/body/div[4]/div[3]/div/div/form/div[3]/table/thead/tr[2]/td[2]/div/ul/li/input");
			webtest.type("xpath=/html/body/div[4]/div[3]/div/div/form/div[3]/table/thead/tr[2]/td[2]/div/ul/li/input",
					"待确认");
			Boolean flag = webtest.isElementPresent("待确认");
			assertFalse(flag);
	}

	@Test(description = "查看页面详情",priority = 9)
	public void test9() throws InterruptedException {
		// 点击个人中心-订单售后-申请类型
			webtest.click("xpath=//span[text()='个人中心']");
			webtest.click("class=am-icon-puzzle-piece");
			webtest.click("xpath=/html/body/div[4]/div[3]/div/div/form/div[3]/table/thead/tr[2]/td[3]/div/ul/li/input");
			webtest.type("xpath=/html/body/div[4]/div[3]/div/div/form/div[3]/table/thead/tr[2]/td[3]/div/ul/li/input",
					"仅退款");
			Boolean flag = webtest.isElementPresent("仅退款");
			assertFalse(flag);
	}

	@Test(description = "查看页面详情",priority = 10)
	public void test10() throws InterruptedException {
		// 点击个人中心-订单售后-原因
			webtest.click("xpath=//span[text()='个人中心']");
			webtest.click("class=am-icon-puzzle-piece");
			webtest.type("name=f3p", "不想要了");
			Boolean flag = webtest.isElementPresent("不想要了");
			assertFalse(flag);
	}

	@Test(description = "查看页面详情",priority = 11)
	public void test11() throws InterruptedException {
		// 点击个人中心-订单售后-退款金额
			webtest.click("xpath=//span[text()='个人中心']");
			webtest.click("class=am-icon-puzzle-piece");
			webtest.type("name=f4p_min", "100");
			webtest.type("name=f4p_max", "1000");
			Boolean flag = webtest.isElementPresent("1000");
			assertFalse(flag);
	}
	

	@Test(description = "查看页面详情",priority = 12)
	public void test12() throws InterruptedException {
		// 点击个人中心-订单售后-退款说明

			webtest.click("xpath=//span[text()='个人中心']");
			webtest.click("class=am-icon-puzzle-piece");
			webtest.type("name=f6p", "衣服质量问题");
			Boolean flag = webtest.isElementPresent("衣服质量问题");
			assertFalse(flag);
	}

	@Test(description = "查看页面详情",priority = 13)
	public void test13() throws InterruptedException {
		// 点击个人中心-我的收藏-原价
	
			webtest.click("xpath=//span[text()='个人中心']");
			webtest.click("class=am-icon-heart-o");
			webtest.type("name=f3p_min", "20");
			webtest.type("name=f3p_max", "200");
			Boolean flag = webtest.isElementPresent("200");
			assertFalse(flag);
	}

	@Test(description = "查看页面详情",priority = 14)
	public void test14() throws InterruptedException {
		// 点击个人中心-我的收藏-创建时间
			webtest.click("xpath=//span[text()='个人中心']");
			webtest.click("class=am-icon-heart-o");
			webtest.type("name=f4p_start", "2020/11/11");
			webtest.type("name=f4p_end", "2020/22/22");
			Boolean flag = webtest.isElementPresent("2020/22/22");
			assertFalse(flag);
	}
	

	@Test (description = "查看页面详情",priority = 15)
	public void test15() throws InterruptedException {
		// 点击个人中心-我的收藏-全选-删除
		webtest.click("xpath=//span[text()='个人中心']");

		webtest.click("class=am-icon-heart-o");
		webtest.click(
				"xpath=//button[@class='am-btn am-btn-danger am-radius am-btn-xs am-icon-trash-o form-table-operate-top-delete-submit']");
		Thread.sleep(2000);
		Boolean flag = webtest.isElementPresent("删除");
		assertFalse(flag);
	}
	

	@Test(description = "查看页面详情",priority = 16)
	public void test16() throws InterruptedException {
		// 点击个人中心-我的收藏-全选-重置
		webtest.click("xpath=//span[text()='个人中心']");
		webtest.click("class=am-icon-heart-o");
		webtest.click("xpath=//a[@class='am-btn am-btn-warning am-radius am-btn-sm am-icon-filter']");
		Boolean flag = webtest.isElementPresent("重置");
		assertFalse(flag);
	}

	@Test(description = "查看页面详情",priority = 17)
	public void test17() throws InterruptedException {
		// 点击个人中心-我的收藏-全选-搜索
		webtest.click("xpath=//span[text()='个人中心']");
		webtest.click("class=am-icon-heart-o");
		webtest.click(
				"xpath=//button[@class='am-btn am-btn-primary am-radius am-btn-xs btn-loading-example am-icon-search']");
		Boolean flag = webtest.isElementPresent("搜索");
		assertFalse(flag);
	}

	@Test(description = "查看页面详情",priority = 19)
	public void test19() throws InterruptedException {
		// 点击个人中心-我的积分-操作类型——减少
			webtest.click("xpath=//span[text()='个人中心']");
			webtest.click("class=am-icon-fire");
			webtest.click("class=default");
			webtest.type("class=default", "减少");
			Boolean flag = webtest.isElementPresent("减少");
			assertFalse(flag);
	}
		
		
	

	@Test(description = "查看页面详情",priority = 20)
	public void test20() throws InterruptedException {
		// 点击个人中心-我的积分-操作积分
			webtest.click("xpath=//span[text()='个人中心']");
			webtest.click("class=am-icon-fire");
			webtest.click("name=f1p_min");
			webtest.type("name=f1p_min", "33");
			webtest.click("name=f1p_max");
			webtest.type("name=f1p_max", "333");
			Boolean flag = webtest.isElementPresent("333");
			assertFalse(flag);
	}

	@Test(description = "查看页面详情",priority = 21)
	public void test21() throws InterruptedException {
		// 点击个人中心-我的积分-操作积分
			webtest.click("xpath=//span[text()='个人中心']");
			webtest.click("class=am-icon-fire");
			webtest.click("name=f1p_min");
			webtest.type("name=f1p_min", "33");
			webtest.click("name=f1p_max");
			webtest.type("name=f1p_max", "333");
			Boolean flag = webtest.isElementPresent("333");
			assertFalse(flag);
	}
		
		
	

	@Test(description = "查看页面详情",priority = 22)
	public void test22() throws InterruptedException {
		// 点击个人中心-我的积分-重置
		webtest.click("xpath=//span[text()='个人中心']");
		webtest.click("class=am-icon-fire");
		webtest.click("name=f1p_min");
		webtest.type("name=f1p_min", "33");
		webtest.click("name=f1p_max");
		webtest.type("name=f1p_max", "333");
		webtest.click("xpath=//a[@class='am-btn am-btn-warning am-radius am-btn-sm am-icon-filter']");
		Boolean flag = webtest.isElementPresent("333");
		assertFalse(flag);
	}

	@Test(description = "查看页面详情",priority = 23)
	public void test23() throws InterruptedException {
		// 点击个人中心-我的积分-描述
			webtest.click("xpath=//span[text()='个人中心']");
			webtest.click("class=am-icon-fire");
			webtest.click("name=f4p");
			webtest.type("name=f4p", "积分抵消");
			Boolean flag = webtest.isElementPresent("积分抵消");
			assertFalse(flag);
	}
	

	@Test(description = "查看页面详情",priority = 24)
	public void test24() throws InterruptedException {
		// 点击个人中心-我的积分-搜索
		webtest.click("xpath=//span[text()='个人中心']");
		webtest.click("class=am-icon-fire");
		webtest.click(
				"xpath=//button[@class='am-btn am-btn-primary am-radius am-btn-xs btn-loading-example am-icon-search']");
		Boolean flag = webtest.isElementPresent("搜索");
		assertFalse(flag);
	}

	@Test(description = "查看页面详情",priority = 25)
	public void test25() throws InterruptedException {
		// 点击个人中心-资料管理-个人资料-图像-true
			webtest.click("xpath=//span[text()='个人中心']");
			webtest.click("class=am-icon-gear");
			webtest.click("class=span-edit");
			webtest.click(
					"xpath=//button[@class='am-btn am-btn-primary am-btn-sm am-radius head-submit btn-loading-example']");
			webtest.click("class=am-close");
			Boolean flag = webtest.isElementPresent("class=am-close");
			assertTrue(flag);
	}

	@Test(description = "查看页面详情",priority = 26)
	public void test26() throws InterruptedException {
		// 点击个人中心-资料管理-个人资料-昵称
			webtest.click("xpath=//span[text()='个人中心']");
			webtest.click("class=am-icon-gear");
			webtest.click("xpath=//a[@class='am-fr']");
			webtest.click("name=nickname");
			webtest.type("name=nickname", "你很美");
			webtest.click(
					"xpath=//button[@class='am-btn am-btn-primary am-radius btn-loading-example am-btn-sm am-btn-block']");
			Boolean flag = webtest.isElementPresent("你很美");
			assertFalse(flag);
			
	}

	@Test(description = "查看页面详情",priority = 27)
	public void test27() throws InterruptedException {
		// 点击个人中心-资料管理-个人资料-生日
			webtest.click("xpath=//span[text()='个人中心']");
			webtest.click("class=am-icon-gear");
			webtest.click("xpath=//a[@class='am-fr']");
			webtest.click("name=birthday");
			webtest.type("name=birthday", "2020222");
			webtest.click(
					"xpath=//button[@class='am-btn am-btn-primary am-radius btn-loading-example am-btn-sm am-btn-block']");
			Boolean flag = webtest.isElementPresent("2020222");
			assertFalse(flag);
	}

	@Test(description = "查看页面详情",priority = 28)
	public void test28() throws InterruptedException{
		//点击个人中心-资料管理-个人资料-手机号码
		     webtest.click("xpath=//span[text()='个人中心']");
		     webtest.click("class=am-icon-gear");
		     webtest.click("xpath=//a[@href='http://localhost:98/index.php?s=/index/safety/mobileinfo.html']");
	         webtest.click("name=accounts");
	         webtest.type("name=accounts","18391520783" );
	         webtest.click("name=verify");
	         webtest.click("xpath=//button[@class='am-btn am-btn-primary am-radius btn-loading-example am-btn-sm am-btn-block']");
	     	Boolean flag = webtest.isElementPresent("18391520783");
			assertFalse(flag);
	}

	@Test(description = "查看页面详情",priority = 29)
	public void test29() throws InterruptedException {
		// 点击个人中心-资料管理-个人资料-手机号码-验证码
			webtest.click("xpath=//span[text()='个人中心']");
			webtest.click("class=am-icon-gear");
			webtest.click("xpath=//a[@href='http://localhost:98/index.php?s=/index/safety/mobileinfo.html']");
			webtest.click("name=accounts");
			webtest.type("name=accounts", "18391520783");
			webtest.click("name=verify");
			webtest.type("name=verify", "aaaa");
			webtest.click(
					"xpath=//button[@class='am-btn am-btn-primary am-radius btn-loading-example am-btn-sm am-btn-block']");
			Boolean flag = webtest.isElementPresent("aaaa");
			assertFalse(flag);
	}

	@Test(description = "查看页面详情",priority = 30)
	public void test30() throws InterruptedException {
		// 点击个人中心-资料管理-个人资料-电子邮箱
			webtest.click("xpath=//span[text()='个人中心']");
			webtest.click("class=am-icon-gear");
			webtest.click("xpath=//a[@href='http://localhost:98/index.php?s=/index/safety/emailinfo.html']");
			webtest.click("id=accounts");
			webtest.type("id=accounts", "2132569421@qq.com");
			webtest.click("name=verify");
			webtest.type("name=verify", "1111");
			webtest.click(
					"xpath=//button[@class='am-btn am-btn-primary am-radius btn-loading-example am-btn-sm am-btn-block']");
			Thread.sleep(2000);
			webtest.click("xpath=//a[@href='http://localhost:98/index.php?s=/index/safety/index.html']");
			Boolean flag = webtest.isElementPresent("1111");
			assertFalse(flag);
	}

	@Test(description = "查看页面详情",priority = 31)
	public void test31() throws InterruptedException {
		// 点击个人中心-我的地址-新增地址
			webtest.click("xpath=//span[text()='个人中心']");
			webtest.click("class=am-icon-street-view");
			webtest.click("xpath=//button[@class='am-btn am-btn-primary am-btn-xs am-icon-plus address-submit-save']");
			webtest.enterFrame("xpath=/html/body/div[8]/div/div[2]/iframe");
			webtest.click("xpath=/html/body/div[1]/form/div[1]/input");
			webtest.type("xpath=/html/body/div[1]/form/div[1]/input", "丁日华");
			webtest.click("name=tel");
			webtest.type("name=tel", "18831176586");
			webtest.click("xpath=//span[text()='省份']");
			webtest.type("xpath=//span[text()='省份']", "河北省");
			webtest.click("xpath=//span[text()='城市']");
			webtest.type("xpath=//span[text()='城市']", "石家庄市");
			webtest.click("xpath=//span[text()='区/县']");
			webtest.type("xpath=//span[text()='区/县']", "裕华区");
			webtest.click("id=form-address");
			webtest.type("id=form-address", "河北师范大学诚朴园3号");
			webtest.click("name=alias");
			webtest.type("name=alias", "丁小花");
			webtest.click("xpath=//span[@class='am-switch-handle-on am-switch-success']");
			webtest.click(
					"xpath=//button[@class='am-btn am-btn-primary am-radius btn-loading-exmple am-btn-sm am-btn-block']");
			Boolean flag = webtest.isElementPresent("丁小花");
			assertTrue(flag);

	}

	@Test(description = "查看页面详情",priority = 32)
	public void test32() throws InterruptedException {
		//个人中心-订单售后-原因
		webtest.click("xpath=//span[text()='个人中心']");
        webtest.click("xpath=//a[@href='http://localhost:98/index.php?s=/index/usergoodsbrowse/index.html']");
        webtest.click(
			"xpath=//button[@class='am-btn am-btn-secondary am-radius am-btn-xs form-table-operate-checkbox-submit']");
        webtest.click(
			"xpath=//button[@class='am-btn am-btn-primary am-radius am-btn-xs btn-loading-example am-icon-search']");
    	Boolean flag = webtest.isElementPresent("xpath=//button[@class='am-btn am-btn-primary am-radius am-btn-xs btn-loading-example am-icon-search']");
        assertTrue(flag);
	}

	@Test(description = "查看页面详情",priority = 33)
	public void test33() throws InterruptedException {
		//个人中心
		webtest.click("xpath=//span[text()='个人中心']");
		webtest.click("xpath=//span[@class='am-fr icon-tips']");
		webtest.click(
				"xpath=//span[@class='am-btn am-btn-secondary am-radius am-btn-xs form-table-operate-checkbox-submit']");
		webtest.click(
				"xpath=//button[@class='am-btn am-btn-secondary am-radius am-btn-xs am-icon-paypal batch-pay-submit']");
    	Boolean flag = webtest.isElementPresent("xpath=//button[@class='am-btn am-btn-secondary am-radius am-btn-xs am-icon-paypal batch-pay-submit']");
        assertTrue(flag);
	}

	@Test(description = "查看页面详情",priority = 34)
	public void test34() throws InterruptedException {
		// 点击个人中心-消息-重置
		webtest.click("xpath=//span[text()='个人中心']");
		webtest.click("xpath=//a[@href='http://localhost:98/index.php?s=/index/message/index.html']");
		Boolean flag = webtest.isElementPresent("xpath=//a[@href='http://localhost:98/index.php?s=/index/message/index.html']");
        assertTrue(flag);

	}

	@Test(description = "查看页面详情",priority = 35)
	public void test35() throws InterruptedException {
		// 点击个人中心-安全地址-修改登录密码

		        webtest.click("xpath=//span[text()='个人中心']");
				webtest.click("xpath=//a[@href='http://localhost:98/index.php?s=/index/safety/index.html']");
				webtest.click("xpath=//a[@href='http://localhost:98/index.php?s=/index/safety/loginpwdinfo.html']");
				webtest.click("name=my_pwd");
				webtest.type("name=my_pwd", "zxy123456");
				webtest.click("id=new-loginpwd");
				webtest.type("id=new-loginpwd", "yj123456");
				webtest.click("name=confirm_new_pwd");
				webtest.type("name=confirm_new_pwd", "yj123456");
				webtest.click(
						"xpath=//button[@class='am-btn am-btn-primary am-radius btn-loading-example am-btn-sm am-btn-block']");
				Boolean flag = webtest.isElementPresent("yj123456");
		        assertFalse(flag);
	}

	@Test(description = "查看页面详情",priority = 36)
	public void test36() throws InterruptedException {
		// 点击个人中心-安全地址-绑定手机号码
			webtest.click("xpath=//span[text()='个人中心']");
			webtest.click("xpath=//a[@href='http://localhost:98/index.php?s=/index/safety/index.html']");
			webtest.click("xpath=//a[@href='http://localhost:98/index.php?s=/index/safety/mobileinfo.html']");
			webtest.click("id=accounts");
			webtest.type("id=accounts", "18391520783");
			webtest.click("name=verify");
			webtest.type("name=verify", "1111");
			webtest.click(
					"xpath=//button[@class='am-btn am-btn-primary am-radius btn-loading-example am-btn-sm am-btn-block']");
			Boolean flag = webtest.isElementPresent("1111");
	        assertFalse(flag);
	}

	@Test(description = "查看页面详情",priority = 37)
	public void test37() throws InterruptedException {
		// 点击个人中心-安全地址-绑定电子邮箱
			webtest.click("xpath=//span[text()='个人中心']");
			webtest.click("xpath=//a[@href='http://localhost:98/index.php?s=/index/safety/index.html']");
			webtest.click("xpath=//a[@href='http://localhost:98/index.php?s=/index/safety/emailinfo.html']");
			webtest.click("iid=accounts");
			webtest.type("id=accounts", "18391520783@163.com");
			webtest.click("name=verify");
			webtest.type("name=verify", "1111");
			webtest.click(
					"xpath=//button[@class='am-btn am-btn-primary am-radius btn-loading-example am-btn-sm am-btn-block']");
			Boolean flag = webtest.isElementPresent("18391520783@163.com");
			assertFalse(flag);
	}

	@Test(description = "查看页面详情",priority = 38)
	public void test38() throws InterruptedException {
		// 点击个人中心-我的消息-消息类型-重置
		webtest.click("xpath=//span[text()='个人中心']");
		webtest.click("xpath=//a[@href='http://localhost:98/index.php?s=/index/message/index.html']");
		webtest.click("class=default");
		webtest.type("class=default", "无回复");
		webtest.click("xpath=//a[@class='am-btn am-btn-warning am-radius am-btn-sm am-icon-filter']");
		Boolean flag = webtest.isElementPresent("无回复");
		assertFalse(flag);
	}

	@Test(description = "查看页面详情",priority = 39)
	public void test39() throws InterruptedException {
		// 点击个人中心-我的消息-消息类型-业务类型-重置
		webtest.click("xpath=//span[text()='个人中心']");
		webtest.click("xpath=//a[@href='http://localhost:98/index.php?s=/index/message/index.html']");
		webtest.click("class=default");
		webtest.type("class=default", "无回复");
		webtest.click("xpath=/html/body/div[4]/div[3]/div/div/form/div[3]/table/thead/tr[2]/td[2]/div/ul/li/input");
		webtest.type("xpath=/html/body/div[4]/div[3]/div/div/form/div[3]/table/thead/tr[2]/td[2]/div/ul/li/input",
				"人工服务");
		webtest.click("xpath=//a[@class='am-btn am-btn-warning am-radius am-btn-sm am-icon-filter']");
		Boolean flag = webtest.isElementPresent("人工服务");
		assertFalse(flag);

	}

	@Test(description = "查看页面详情",priority = 40)
	public void test40() throws InterruptedException {
		// 点击个人中心-我的消息-消息类型-业务类型-标题-重置
		webtest.click("xpath=//span[text()='个人中心']");
		webtest.click("xpath=//a[@href='http://localhost:98/index.php?s=/index/message/index.html']");
		webtest.click("class=default");
		webtest.type("class=default", "无回复");
		webtest.click("xpath=/html/body/div[4]/div[3]/div/div/form/div[3]/table/thead/tr[2]/td[2]/div/ul/li/input");
		webtest.type("xpath=/html/body/div[4]/div[3]/div/div/form/div[3]/table/thead/tr[2]/td[2]/div/ul/li/input",
				"人工服务");
		webtest.click("name=f2p");
		webtest.type("name=f2p", "买错商品");
		webtest.click("xpath=//a[@class='am-btn am-btn-warning am-radius am-btn-sm am-icon-filter']");
		Boolean flag = webtest.isElementPresent("买错商品");
		assertFalse(flag);
		

	}

	@Test(description = "查看页面详情",priority = 41)
	public void test41() throws InterruptedException {
		// 点击个人中心-我的消息-消息类型-业务类型-标题-详情-重置
		webtest.click("xpath=//span[text()='个人中心']");
		webtest.click("xpath=//a[@href='http://localhost:98/index.php?s=/index/message/index.html']");
		webtest.click("class=default");
		webtest.type("class=default", "无回复");
		webtest.click("xpath=/html/body/div[4]/div[3]/div/div/form/div[3]/table/thead/tr[2]/td[2]/div/ul/li/input");
		webtest.type("xpath=/html/body/div[4]/div[3]/div/div/form/div[3]/table/thead/tr[2]/td[2]/div/ul/li/input",
				"人工服务");
		webtest.click("name=f2p");
		webtest.type("name=f2p", "买错商品");
		webtest.click("name=f3p");
		webtest.type("name=f3p", "默认");
		webtest.click("xpath=//a[@class='am-btn am-btn-warning am-radius am-btn-sm am-icon-filter']");
		Boolean flag1 = webtest.isElementPresent("默认");
		assertFalse(flag1);

	}

	@Test(description = "查看页面详情",priority = 42)
	public void test42() throws InterruptedException {
		// 点击个人中心-我的消息-消息类型-业务类型-标题-详情-状态-搜索-重置
		webtest.click("xpath=//span[text()='个人中心']");
		webtest.click("xpath=//a[@href='http://localhost:98/index.php?s=/index/message/index.html']");
		webtest.click("class=default");
		webtest.type("class=default", "无回复");
		webtest.click("xpath=/html/body/div[4]/div[3]/div/div/form/div[3]/table/thead/tr[2]/td[2]/div/ul/li/input");
		webtest.type("xpath=/html/body/div[4]/div[3]/div/div/form/div[3]/table/thead/tr[2]/td[2]/div/ul/li/input",
				"人工服务");
		webtest.click("name=f2p");
		webtest.type("name=f2p", "买错商品");
		webtest.click("name=f3p");
		webtest.type("name=f3p", "默认");
		webtest.click("xpath=/html/body/div[4]/div[3]/div/div/form/div[3]/table/thead/tr[2]/td[5]/div/ul/li/input");
		webtest.type("xpath=/html/body/div[4]/div[3]/div/div/form/div[3]/table/thead/tr[2]/td[5]/div/ul/li/input",
				"未读");
		webtest.click(
				"xpath=//button[@class='am-btn am-btn-primary am-radius am-btn-xs btn-loading-example am-icon-search']");
		webtest.click("xpath=//a[@class='am-btn am-btn-warning am-radius am-btn-sm am-icon-filter']");
		Boolean flag = webtest.isElementPresent("未读");
		assertFalse(flag);
	}

	@Test(description = "查看页面详情",priority = 43)
	public void test43() throws InterruptedException {
		// 点击个人中心-我的足迹-详情
		
		webtest.click("xpath=//span[text()='个人中心']");
		webtest.click("xpath=//a[@href='http://localhost:98/index.php?s=/index/usergoodsbrowse/index.html']");
		webtest.click("xpath=/html/body/div[4]/div[3]/div/div/form/div[3]/table/tbody/tr[1]/td[6]/button[1]/span");
		webtest.click("class=am-close am-close-alt am-icon-times am-close-spin");
	}

	@Test(description = "查看页面详情",priority = 44)
	public void test44() throws InterruptedException {
		// 点击个人中心-我的足迹-详情
		webtest.click("xpath=//span[text()='个人中心']");
		webtest.click("xpath=//a[@href='http://localhost:98/index.php?s=/index/usergoodsbrowse/index.html']");
		webtest.click("xpath=/html/body/div[4]/div[3]/div/div/form/div[3]/table/tbody/tr[1]/td[1]/div/label/span/i[2]");
		webtest.click(
				"xpath=//button[@class='am-btn am-btn-danger am-radius am-btn-xs am-icon-trash-o form-table-operate-top-delete-submit']");
		webtest.click("class=am-modal-btn");
		Boolean flag = webtest.isElementPresent("class=am-modal-btn");
		assertFalse(flag);

	}

	@Test(description = "查看页面详情",priority = 45)
	public void test45() throws InterruptedException {
		// 点击个人中心-我的足迹-全选-重置
		webtest.click("xpath=//span[text()='个人中心']");
		webtest.click("xpath=//a[@href='http://localhost:98/index.php?s=/index/usergoodsbrowse/index.html']");
		webtest.click(
				"xpath=//button[@class='am-btn am-btn-secondary am-radius am-btn-xs form-table-operate-checkbox-submit']");
		webtest.click("xpath=/html/body/div[4]/div[3]/div/div/form/div[2]/a");
		Boolean flag = webtest.isElementPresent("xpath=//button[@class='am-btn am-btn-secondary am-radius am-btn-xs form-table-operate-checkbox-submit']");
		assertTrue(flag);
	}

	@Test(description = "查看页面详情",priority = 46)
	public void test46() throws InterruptedException {
		// 点击个人中心-我的足迹-全选-重置-搜索
		webtest.click("xpath=//span[text()='个人中心']");
		webtest.click("xpath=//a[@href='http://localhost:98/index.php?s=/index/usergoodsbrowse/index.html']");
		webtest.click(
				"xpath=//button[@class='am-btn am-btn-secondary am-radius am-btn-xs form-table-operate-checkbox-submit']");
		webtest.click("xpath=/html/body/div[4]/div[3]/div/div/form/div[2]/a");
		webtest.click(
				"xpath=//button[@class='am-btn am-btn-primary am-radius am-btn-xs btn-loading-example am-icon-search']");
		Boolean flag = webtest.isElementPresent("xpath=//button[@class='am-btn am-btn-primary am-radius am-btn-xs btn-loading-example am-icon-search']");
		assertTrue(flag);
	
	}

	@Test
	public void test47() throws InterruptedException {
		// 点击个人中心-我的足迹-全选-反选-删除
		webtest.click("xpath=//span[text()='个人中心']");
		webtest.click("xpath=//a[@href='http://localhost:98/index.php?s=/index/usergoodsbrowse/index.html']");
		webtest.click(
				"xpath=//button[@class='am-btn am-btn-secondary am-radius am-btn-xs form-table-operate-checkbox-submit']");
		webtest.click(
				"xpath=//button[@class='am-btn am-btn-secondary am-radius am-btn-xs form-table-operate-checkbox-submit']");
		Thread.sleep(2000);
		webtest.click(
				"xpath=//button[@class='am-btn am-btn-danger am-radius am-btn-xs am-icon-trash-o form-table-operate-top-delete-submit']");
		Boolean flag = webtest.isElementPresent("xpath=//button[@class='am-btn am-btn-danger am-radius am-btn-xs am-icon-trash-o form-table-operate-top-delete-submit']");
		assertTrue(flag);
	}

	@Test(description = "查看页面详情",priority = 48)
	public void test48() throws InterruptedException {
		// 点击个人中-问答/留言-新增
		webtest.click("xpath=//span[text()='个人中心']");
		webtest.click("xpath=//a[@href='http://localhost:98/index.php?s=/index/answer/index.html']");
		webtest.click("xpath=//a[@class='am-btn am-btn-success am-radius am-btn-xs am-icon-plus']");
		webtest.click("xpath=/html/body/div[4]/div[3]/div/div/div/div/div[2]/form/div[1]/input");
		webtest.type("xpath=/html/body/div[4]/div[3]/div/div/div/div/div[2]/form/div[1]/input", "丁小花");
		webtest.click("xpath=/html/body/div[4]/div[3]/div/div/div/div/div[2]/form/div[2]/input");
		webtest.type("xpath=/html/body/div[4]/div[3]/div/div/div/div/div[2]/form/div[2]/input", "18391520783");
		webtest.click("name=title");
		webtest.type("name=title", "想要许多");
		webtest.click("name=content");
		webtest.type("name=content", "哈哈哈哈哈哈");
		webtest.click(
				"xpath=//button[@class='am-btn am-btn-primary am-radius btn-loading-example am-btn-sm am-btn-block']");
		Boolean flag = webtest.isElementPresent("想要许多");
		assertFalse(flag);
	}

	@Test(description = "查看页面详情",priority = 49)
	public void test49() throws InterruptedException {
		// 点击个人中-问答/留言-新增-重置
		webtest.click("xpath=//span[text()='个人中心']");
		webtest.click("xpath=//a[@href='http://localhost:98/index.php?s=/index/answer/index.html']");
		webtest.click("xpath=//a[@class='am-btn am-btn-success am-radius am-btn-xs am-icon-plus']");
		webtest.click("xpath=/html/body/div[4]/div[3]/div/div/div/div/div[2]/form/div[1]/input");
		webtest.type("xpath=/html/body/div[4]/div[3]/div/div/div/div/div[2]/form/div[1]/input", "丁小花");
		webtest.click("xpath=/html/body/div[4]/div[3]/div/div/div/div/div[2]/form/div[2]/input");
		webtest.type("xpath=/html/body/div[4]/div[3]/div/div/div/div/div[2]/form/div[2]/input", "18391520783");
		webtest.click("name=title");
		webtest.type("name=title", "想要许多");
		webtest.click("name=content");
		webtest.type("name=content", "哈哈哈哈哈哈");
		webtest.click(
				"xpath=//button[@class='am-btn am-btn-primary am-radius btn-loading-example am-btn-sm am-btn-block']");
		webtest.click("xpath=//a[@class='am-btn am-btn-warning am-radius am-btn-sm am-icon-filter']");
		webtest.click(
				"xpath=//button[@class='am-btn am-btn-primary am-radius am-btn-xs btn-loading-example am-icon-search']");
		Boolean flag = webtest.isElementPresent("哈哈哈哈哈哈");
		assertFalse(flag);
	}

	@Test(description = "查看页面详情",priority = 50)
	public void test50() throws InterruptedException {
		// 点击个人中-问答/留言-新增-搜索
		webtest.click("xpath=//span[text()='个人中心']");
		webtest.click("xpath=//a[@href='http://localhost:98/index.php?s=/index/answer/index.html']");
		webtest.click("xpath=//a[@class='am-btn am-btn-success am-radius am-btn-xs am-icon-plus']");
		webtest.click("xpath=/html/body/div[4]/div[3]/div/div/div/div/div[2]/form/div[1]/input");
		webtest.type("xpath=/html/body/div[4]/div[3]/div/div/div/div/div[2]/form/div[1]/input", "丁小花");
		webtest.click("xpath=/html/body/div[4]/div[3]/div/div/div/div/div[2]/form/div[2]/input");
		webtest.type("xpath=/html/body/div[4]/div[3]/div/div/div/div/div[2]/form/div[2]/input", "18391520783");
		webtest.click("name=title");
		webtest.type("name=title", "想要许多");
		webtest.click("name=content");
		webtest.type("name=content", "哈哈哈哈哈哈");
		webtest.click(
				"xpath=//button[@class='am-btn am-btn-primary am-radius btn-loading-example am-btn-sm am-btn-block']");
		webtest.click(
				"xpath=//button[@class='am-btn am-btn-primary am-radius am-btn-xs btn-loading-example am-icon-search']");
		Boolean flag = webtest.isElementPresent("xpath=//button[@class='am-btn am-btn-primary am-radius btn-loading-example am-btn-sm am-btn-block']");
		assertTrue(flag);
	}

	@Test(description = "查看页面详情",priority = 51)
	public void test51() throws InterruptedException {
		// 个人中心-安全退出个人中心界面
		webtest.click("xpath=//span[text()='个人中心']");
		webtest.click("xpath=//a[@href='http://localhost:98/index.php?s=/index/user/logout.html']");
		Boolean flag = webtest.isElementPresent("xpath=//a[@href='http://localhost:98/index.php?s=/index/user/logout.html']");
		assertFalse(flag);
	}
	



}