package Homework;

import org.apache.poi.ss.formula.functions.T;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.google.common.base.Function;
import com.google.inject.PrivateBinder;
import com.webtest.core.BaseTest;

public class Demo extends BaseTest{
	
	String URL = "http://localhost:98/";
	
	@BeforeMethod
	public void test1() throws InterruptedException {
		webtest.open(URL);
		webtest.click("xpath=//a[@class='am-btn-primary btn am-fl']");
		webtest.type("name=accounts", "admin");
		webtest.type("name=pwd", "yj123456");
		webtest.type("name=verify", "ssss");
		Thread.sleep(2000);
		webtest.click("xpath=//button[@class='am-btn am-btn-primary am-radius am-btn-sm btn-loading-example']");
		Thread.sleep(1000);
		}
	
	
	
	@Test
	public void test2() throws InterruptedException {
		//点击个人中心-订单管理-订单模式
		webtest.click("xpath=//span[text()='个人中心']");
		Thread.sleep(1000);
        webtest.click("class=am-icon-th-list");
        Thread.sleep(3000);
        webtest.click("xpath=/html/body/div[4]/div[3]/div/div/form/div[3]/table/thead/tr[2]/td[8]/div/ul/li/input");
        webtest.type("xpath=/html/body/div[4]/div[3]/div/div/form/div[3]/table/thead/tr[2]/td[8]/div/ul/li/input","销售");
        Thread.sleep(2000);
	 }
	
	@Test
	public void test3() throws InterruptedException {
		//点击个人中心-订单管理-下单平台
		webtest.click("xpath=//span[text()='个人中心']");
		Thread.sleep(1000);
        webtest.click("class=am-icon-th-list");
        Thread.sleep(3000);
        webtest.click("xpath=/html/body/div[4]/div[3]/div/div/form/div[3]/table/thead/tr[2]/td[9]/div/ul/li/input");
        webtest.type("xpath=/html/body/div[4]/div[3]/div/div/form/div[3]/table/thead/tr[2]/td[9]/div/ul/li/input","苹果app");
        Thread.sleep(2000);
	 }
	
	@Test
	public void test4() throws InterruptedException {
		//点击个人中心-订单管理-地址信息
		webtest.click("xpath=//span[text()='个人中心']");
		Thread.sleep(1000);
        webtest.click("class=am-icon-th-list");
        Thread.sleep(3000);
        webtest.type("name=f9p","河北省石家庄市河北师范大学");
        Thread.sleep(2000);
	 }
	
	@Test
	public void test5() throws InterruptedException {
		//点击个人中心-订单管理-取货人信息
		webtest.click("xpath=//span[text()='个人中心']");
		Thread.sleep(1000);
        webtest.click("class=am-icon-th-list");
        Thread.sleep(3000);
        webtest.type("name=f10p","丁日华-计算机学院");
        Thread.sleep(2000);
	 }
	
	@Test
	public void test6() throws InterruptedException {
		//点击个人中心-订单管理-支付方式
		webtest.click("xpath=//span[text()='个人中心']");
		Thread.sleep(1000);
        webtest.click("class=am-icon-th-list");
        Thread.sleep(3000);
        webtest.click("xpath=/html/body/div[4]/div[3]/div/div/form/div[3]/table/thead/tr[2]/td[17]/div/ul/li/input");
        webtest.type("xpath=/html/body/div[4]/div[3]/div/div/form/div[3]/table/thead/tr[2]/td[17]/div/ul/li/input","支付宝");
        Thread.sleep(2000);
	 }
	
	@Test
	public void test18() throws InterruptedException {
		//点击个人中心-订单管理-批量支付
		webtest.click("xpath=//span[text()='个人中心']");
		Thread.sleep(1000);
        webtest.click("class=am-icon-th-list");
        Thread.sleep(3000);
        webtest.click("xpath=//button[@class='am-btn am-btn-secondary am-radius am-btn-xs am-icon-paypal batch-pay-submit']");
        Thread.sleep(2000);
	 }
	
	
	
	
	@Test
	public void test7() throws InterruptedException{
       //点击个人中心-订单售后-基础信息
       webtest.click("xpath=//span[text()='个人中心']");
       Thread.sleep(1000);
       webtest.click("class=am-icon-puzzle-piece");
       Thread.sleep(3000);
       webtest.type("name=f0p","10987654321");
       Thread.sleep(2000);
	}
	
	@Test 
	public void test8() throws InterruptedException{
       //点击个人中心-订单售后-订单状态
       webtest.click("xpath=//span[text()='个人中心']");
       Thread.sleep(1000);
       webtest.click("class=am-icon-puzzle-piece");
       Thread.sleep(3000);
       webtest.click("xpath=/html/body/div[4]/div[3]/div/div/form/div[3]/table/thead/tr[2]/td[2]/div/ul/li/input");
       webtest.type("xpath=/html/body/div[4]/div[3]/div/div/form/div[3]/table/thead/tr[2]/td[2]/div/ul/li/input","待确认");
       Thread.sleep(2000);
	}
	
	@Test 
	public void test9() throws InterruptedException{
       //点击个人中心-订单售后-申请类型
       webtest.click("xpath=//span[text()='个人中心']");
       Thread.sleep(1000);
       webtest.click("class=am-icon-puzzle-piece");
       Thread.sleep(3000);
       webtest.click("xpath=/html/body/div[4]/div[3]/div/div/form/div[3]/table/thead/tr[2]/td[3]/div/ul/li/input");
       webtest.type("xpath=/html/body/div[4]/div[3]/div/div/form/div[3]/table/thead/tr[2]/td[3]/div/ul/li/input","仅退款");
       Thread.sleep(2000);
	}
	
	@Test
	public void test10() throws InterruptedException{
       //点击个人中心-订单售后-原因
       webtest.click("xpath=//span[text()='个人中心']");
       Thread.sleep(1000);
       webtest.click("class=am-icon-puzzle-piece");
       Thread.sleep(3000);
       webtest.type("name=f3p","不想要了");
       Thread.sleep(2000);
	}
	@Test
	public void test11() throws InterruptedException{
       //点击个人中心-订单售后-退款金额
       webtest.click("xpath=//span[text()='个人中心']");
       Thread.sleep(1000);
       webtest.click("class=am-icon-puzzle-piece");
       Thread.sleep(3000);
       webtest.type("name=f4p_min","100");
       Thread.sleep(2000);
       webtest.type("name=f4p_max", "1000");
       Thread.sleep(2000);
	}
	
	@Test
	public void test12() throws InterruptedException{
       //点击个人中心-订单售后-退款说明
       webtest.click("xpath=//span[text()='个人中心']");
       Thread.sleep(1000);
       webtest.click("class=am-icon-puzzle-piece");
       Thread.sleep(3000);
       webtest.type("name=f6p","衣服质量问题");
       Thread.sleep(2000);
	}
	
	@Test
	public void test13() throws InterruptedException {
		//点击个人中心-我的收藏-原价
		webtest.click("xpath=//span[text()='个人中心']");
		Thread.sleep(1000);
        webtest.click("class=am-icon-heart-o");
        Thread.sleep(3000);
        webtest.type("name=f3p_min","20");
        Thread.sleep(2000);
        webtest.type("name=f3p_max","200");
        Thread.sleep(2000);
	 }
	
	@Test
	public void test14() throws InterruptedException {
		//点击个人中心-我的收藏-创建时间
		webtest.click("xpath=//span[text()='个人中心']");
		Thread.sleep(1000);
        webtest.click("class=am-icon-heart-o");
        Thread.sleep(3000);
        webtest.type("name=f4p_start","2020/11/11");
        Thread.sleep(2000);
        webtest.type("name=f4p_end","2020/22/22");
        Thread.sleep(2000);
	 }
	
	@Test
	public void test15() throws InterruptedException {
		//点击个人中心-我的收藏-全选-删除
		webtest.click("xpath=//span[text()='个人中心']");
		Thread.sleep(1000);
        webtest.click("class=am-icon-heart-o");
        Thread.sleep(3000);
        webtest.click("xpath=//button[@class='am-btn am-btn-danger am-radius am-btn-xs am-icon-trash-o form-table-operate-top-delete-submit']");
	    Thread.sleep(2000);
	}
	
	@Test
	public void test16() throws InterruptedException {
		//点击个人中心-我的收藏-全选-重置
		webtest.click("xpath=//span[text()='个人中心']");
		Thread.sleep(1000);
        webtest.click("class=am-icon-heart-o");
        Thread.sleep(3000);
        webtest.click("xpath=//a[@class='am-btn am-btn-warning am-radius am-btn-sm am-icon-filter']");
	    Thread.sleep(2000);
	}
	@Test
	public void test17() throws InterruptedException {
		//点击个人中心-我的收藏-全选-搜索
		webtest.click("xpath=//span[text()='个人中心']");
		Thread.sleep(1000);
        webtest.click("class=am-icon-heart-o");
        Thread.sleep(3000);
        webtest.click("xpath=//button[@class='am-btn am-btn-primary am-radius am-btn-xs btn-loading-example am-icon-search']");
	    Thread.sleep(2000);
	}
	
	@Test
	public void test19() throws InterruptedException{
		//点击个人中心-我的积分-操作类型——减少
		webtest.click("xpath=//span[text()='个人中心']");
		Thread.sleep(1000);
		webtest.click("class=am-icon-fire");
		Thread.sleep(3000);
		webtest.click("class=default");
		webtest.type("class=default","减少" );
		Thread.sleep(2000);
	}
	
	@Test
	public void test20() throws InterruptedException{
		//点击个人中心-我的积分-操作积分
		webtest.click("xpath=//span[text()='个人中心']");
		Thread.sleep(1000);
		webtest.click("class=am-icon-fire");
		Thread.sleep(1000);
		webtest.click("name=f1p_min");
		webtest.type("name=f1p_min","33" );
		Thread.sleep(1000);
		webtest.click("name=f1p_max");
		webtest.type("name=f1p_max","333");
		Thread.sleep(1000);
	}
	
	@Test
	public void test21() throws InterruptedException{
		//点击个人中心-我的积分-操作积分
		webtest.click("xpath=//span[text()='个人中心']");
		Thread.sleep(1000);
		webtest.click("class=am-icon-fire");
		Thread.sleep(1000);
		webtest.click("name=f1p_min");
		webtest.type("name=f1p_min","33" );
		Thread.sleep(1000);
		webtest.click("name=f1p_max");
		webtest.type("name=f1p_max","333");
		Thread.sleep(1000);
	}
	
	@Test
	public void test22() throws InterruptedException{
		//点击个人中心-我的积分-重置
		webtest.click("xpath=//span[text()='个人中心']");
		Thread.sleep(1000);
		webtest.click("class=am-icon-fire");
		Thread.sleep(1000);
		webtest.click("name=f1p_min");
		webtest.type("name=f1p_min","33" );
		Thread.sleep(1000);
		webtest.click("name=f1p_max");
		webtest.type("name=f1p_max","333");
		Thread.sleep(1000);
		webtest.click("xpath=//a[@class='am-btn am-btn-warning am-radius am-btn-sm am-icon-filter']");
		Thread.sleep(1000);
	}
	
	@Test
	public void test23() throws InterruptedException{
		//点击个人中心-我的积分-描述
		webtest.click("xpath=//span[text()='个人中心']");
		Thread.sleep(1000);
		webtest.click("class=am-icon-fire");
		Thread.sleep(1000);
		webtest.click("name=f4p");
	    Thread.sleep(1000);
	    webtest.type("name=f4p", "积分抵消");
	    Thread.sleep(1000);
	}
	

	@Test
	public void test24() throws InterruptedException{
		//点击个人中心-我的积分-搜索
		webtest.click("xpath=//span[text()='个人中心']");
		Thread.sleep(1000);
		webtest.click("class=am-icon-fire");
		Thread.sleep(1000);
		webtest.click("xpath=//button[@class='am-btn am-btn-primary am-radius am-btn-xs btn-loading-example am-icon-search']");
	    Thread.sleep(1000);
	}
	
	@Test
	public void test25() throws InterruptedException{
		//点击个人中心-资料管理-个人资料-图像
		webtest.click("xpath=//span[text()='个人中心']");
		Thread.sleep(1000);
		webtest.click("class=am-icon-gear");
		Thread.sleep(1000);
		webtest.click("class=span-edit");
	    Thread.sleep(1000);
	    webtest.click("xpath=//button[@class='am-btn am-btn-primary am-btn-sm am-radius head-submit btn-loading-example']");
	    Thread.sleep(1000);
	    webtest.click("class=am-close");
	    Thread.sleep(1000);
	}
	
	@Test
	public void test26() throws InterruptedException{
		//点击个人中心-资料管理-个人资料-昵称
		webtest.click("xpath=//span[text()='个人中心']");
		Thread.sleep(1000);
		webtest.click("class=am-icon-gear");
		Thread.sleep(1000);
		webtest.click("xpath=//a[@class='am-fr']");
	    Thread.sleep(1000);
	    webtest.click("name=nickname");
	    webtest.type("name=nickname","你很美" );
	    Thread.sleep(2000);
	    webtest.click("xpath=//button[@class='am-btn am-btn-primary am-radius btn-loading-example am-btn-sm am-btn-block']");
	    Thread.sleep(1000);
	}
	
	@Test
	public void test27() throws InterruptedException{
		//点击个人中心-资料管理-个人资料-生日
		webtest.click("xpath=//span[text()='个人中心']");
		Thread.sleep(1000);
		webtest.click("class=am-icon-gear");
		Thread.sleep(1000);
		webtest.click("xpath=//a[@class='am-fr']");
	    Thread.sleep(1000);
	    webtest.click("name=birthday");
	    webtest.type("name=birthday","2020222" );
	    Thread.sleep(2000);
	    webtest.click("xpath=//button[@class='am-btn am-btn-primary am-radius btn-loading-example am-btn-sm am-btn-block']");
	    Thread.sleep(1000);
	}
	
	@Test
	public void test28() throws InterruptedException{
		//点击个人中心-资料管理-个人资料-手机号码
		webtest.click("xpath=//span[text()='个人中心']");
		Thread.sleep(1000);
		webtest.click("class=am-icon-gear");
		Thread.sleep(1000);
		webtest.click("xpath=//a[@href='http://localhost:98/index.php?s=/index/safety/mobileinfo.html']");
	    Thread.sleep(1000);
	    webtest.click("name=accounts");
	    webtest.type("name=accounts","18391520783" );
	    Thread.sleep(2000);
	    webtest.click("name=verify");
	    Thread.sleep(2000);
	    webtest.type("name=verify","aaaa" );
	    Thread.sleep(2000);
	    webtest.click("xpath=//button[@class='am-btn am-btn-primary am-radius btn-loading-example am-btn-sm am-btn-block']");
	    Thread.sleep(2000);
	}
	
	@Test
	public void test29() throws InterruptedException{
		//点击个人中心-资料管理-个人资料-手机号码
		webtest.click("xpath=//span[text()='个人中心']");
		Thread.sleep(1000);
		webtest.click("class=am-icon-gear");
		Thread.sleep(1000);
		webtest.click("xpath=//a[@href='http://localhost:98/index.php?s=/index/safety/mobileinfo.html']");
	    Thread.sleep(1000);
	    webtest.click("name=accounts");
	    webtest.type("name=accounts","18391520783" );
	    Thread.sleep(2000);
	    webtest.click("name=verify");
	    Thread.sleep(2000);
	    webtest.type("name=verify","aaaa" );
	    Thread.sleep(2000);
	    webtest.click("xpath=//button[@class='am-btn am-btn-primary am-radius btn-loading-example am-btn-sm am-btn-block']");
	    Thread.sleep(2000);
	}
	
	@Test
	public void test30() throws InterruptedException{
		//点击个人中心-资料管理-个人资料-电子邮箱
		webtest.click("xpath=//span[text()='个人中心']");
		Thread.sleep(1000);
		webtest.click("class=am-icon-gear");
		Thread.sleep(1000);
		webtest.click("xpath=//a[@href='http://localhost:98/index.php?s=/index/safety/emailinfo.html']");
	    Thread.sleep(1000);
	    webtest.click("id=accounts");
	    webtest.type("id=accounts","2132569421@qq.com" );
	    Thread.sleep(2000);
	    webtest.click("name=verify");
	    Thread.sleep(2000);
	    webtest.type("name=verify","1111" );
	    Thread.sleep(2000);
	    webtest.click("xpath=//button[@class='am-btn am-btn-primary am-radius btn-loading-example am-btn-sm am-btn-block']");
	    Thread.sleep(2000);
	    webtest.click("xpath=//a[@href='http://localhost:98/index.php?s=/index/safety/index.html']");
	}
	
	@Test
	public void test31() throws InterruptedException{
		//点击个人中心-我的地址-新增地址
		webtest.click("xpath=//span[text()='个人中心']");
		webtest.click("class=am-icon-street-view");
		webtest.click("xpath=//button[@class='am-btn am-btn-primary am-btn-xs am-icon-plus address-submit-save']");
		webtest.enterFrame("xpath=/html/body/div[8]/div/div[2]/iframe");
	    webtest.click("xpath=/html/body/div[1]/form/div[1]/input");
	    webtest.type("xpath=/html/body/div[1]/form/div[1]/input","丁日华" );
	    webtest.click("name=tel");
	    webtest.type("name=tel","18831176586");
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
	    webtest.click("xpath=//button[@class='am-btn am-btn-primary am-radius btn-loading-exmple am-btn-sm am-btn-block']");
	    Thread.sleep(2000);
	    
	}
	
	@Test
	public void test32() throws InterruptedException{
		//点击个人中心-我的足迹-更多
		webtest.click("xpath=//span[text()='个人中心']");
		webtest.click("xpath=//a[@href='http://localhost:98/index.php?s=/index/usergoodsbrowse/index.html']");
		webtest.click("xpath=//button[@class='am-btn am-btn-secondary am-radius am-btn-xs form-table-operate-checkbox-submit']");
	    webtest.click("xpath=//button[@class='am-btn am-btn-primary am-radius am-btn-xs btn-loading-example am-icon-search']");
	} 
	
	@Test
	public void test33() throws InterruptedException{
		//点击个人中心-查看全部订单
		webtest.click("xpath=//span[text()='个人中心']");
		webtest.click("xpath=//span[@class='am-fr icon-tips']");
		webtest.click("xpath=//span[@class='am-btn am-btn-secondary am-radius am-btn-xs form-table-operate-checkbox-submit']");
	    webtest.click("xpath=//button[@class='am-btn am-btn-secondary am-radius am-btn-xs am-icon-paypal batch-pay-submit']");
	}
	
	@Test
	public void test34() throws InterruptedException{
		//点击个人中心-消息-重置
		webtest.click("xpath=//span[text()='个人中心']");
		webtest.click("xpath=//a[@href='http://localhost:98/index.php?s=/index/message/index.html']");
		
	    
	}
	
	@Test
	public void test35() throws InterruptedException{
		//点击个人中心-安全地址-修改登录密码
		webtest.click("xpath=//span[text()='个人中心']");
		webtest.click("xpath=//a[@href='http://localhost:98/index.php?s=/index/safety/index.html']");
		webtest.click("xpath=//a[@href='http://localhost:98/index.php?s=/index/safety/loginpwdinfo.html']");
		webtest.click("name=my_pwd");
		webtest.type("name=my_pwd", "zxy123456");
		webtest.click("id=new-loginpwd");
		webtest.type("id=new-loginpwd", "yj123456");
		webtest.click("name=confirm_new_pwd");
		webtest.type("name=confirm_new_pwd","yj123456");
		Thread.sleep(2000);
		webtest.click("xpath=//button[@class='am-btn am-btn-primary am-radius btn-loading-example am-btn-sm am-btn-block']");
		Thread.sleep(2000);
	}
	
	@Test
	public void test36() throws InterruptedException{
		//点击个人中心-安全地址-绑定手机号码
		webtest.click("xpath=//span[text()='个人中心']");
		webtest.click("xpath=//a[@href='http://localhost:98/index.php?s=/index/safety/index.html']");
		webtest.click("xpath=//a[@href='http://localhost:98/index.php?s=/index/safety/mobileinfo.html']");
		webtest.click("id=accounts");
		webtest.type("id=accounts", "18391520783");
		webtest.click("name=verify");
		webtest.type("name=verify", "1111");
		Thread.sleep(2000);
		webtest.click("xpath=//button[@class='am-btn am-btn-primary am-radius btn-loading-example am-btn-sm am-btn-block']");
		Thread.sleep(2000);
	}
	
	
	@Test
	public void test37() throws InterruptedException{
		//点击个人中心-安全地址-绑定电子邮箱
		webtest.click("xpath=//span[text()='个人中心']");
		webtest.click("xpath=//a[@href='http://localhost:98/index.php?s=/index/safety/index.html']");
		webtest.click("xpath=//a[@href='http://localhost:98/index.php?s=/index/safety/emailinfo.html']");
		webtest.click("iid=accounts");
		webtest.type("id=accounts", "18391520783@163.com");
		webtest.click("name=verify");
		webtest.type("name=verify", "1111");
		Thread.sleep(2000);
		webtest.click("xpath=//button[@class='am-btn am-btn-primary am-radius btn-loading-example am-btn-sm am-btn-block']");
		Thread.sleep(2000);
	}
	
	@Test
	public void test38() throws InterruptedException{
		//点击个人中心-我的消息-消息类型-重置
		webtest.click("xpath=//span[text()='个人中心']");
		webtest.click("xpath=//a[@href='http://localhost:98/index.php?s=/index/message/index.html']");
		Thread.sleep(2000);
		webtest.click("class=default");
		webtest.type("class=default", "无回复");
		webtest.click("xpath=//a[@class='am-btn am-btn-warning am-radius am-btn-sm am-icon-filter']");
		
	}
	

	@Test
	public void test39() throws InterruptedException{
		//点击个人中心-我的消息-消息类型-业务类型-重置
		webtest.click("xpath=//span[text()='个人中心']");
		webtest.click("xpath=//a[@href='http://localhost:98/index.php?s=/index/message/index.html']");
		Thread.sleep(2000);
		webtest.click("class=default");
		webtest.type("class=default", "无回复");
		Thread.sleep(2000);
		webtest.click("xpath=/html/body/div[4]/div[3]/div/div/form/div[3]/table/thead/tr[2]/td[2]/div/ul/li/input");
		webtest.type("xpath=/html/body/div[4]/div[3]/div/div/form/div[3]/table/thead/tr[2]/td[2]/div/ul/li/input","人工服务");
		Thread.sleep(2000);
		webtest.click("xpath=//a[@class='am-btn am-btn-warning am-radius am-btn-sm am-icon-filter']");
		
	}
	
	@Test
	public void test40() throws InterruptedException{
		//点击个人中心-我的消息-消息类型-业务类型-标题-重置
		webtest.click("xpath=//span[text()='个人中心']");
		webtest.click("xpath=//a[@href='http://localhost:98/index.php?s=/index/message/index.html']");
		Thread.sleep(2000);
		webtest.click("class=default");
		webtest.type("class=default", "无回复");
		Thread.sleep(2000);
		webtest.click("xpath=/html/body/div[4]/div[3]/div/div/form/div[3]/table/thead/tr[2]/td[2]/div/ul/li/input");
		webtest.type("xpath=/html/body/div[4]/div[3]/div/div/form/div[3]/table/thead/tr[2]/td[2]/div/ul/li/input","人工服务");
		Thread.sleep(2000);
		webtest.click("name=f2p");
		webtest.type("name=f2p", "买错商品");
		Thread.sleep(2000);
		webtest.click("xpath=//a[@class='am-btn am-btn-warning am-radius am-btn-sm am-icon-filter']");
		
	}
	
	@Test
	public void test41() throws InterruptedException{
		//点击个人中心-我的消息-消息类型-业务类型-标题-详情-重置
		webtest.click("xpath=//span[text()='个人中心']");
		webtest.click("xpath=//a[@href='http://localhost:98/index.php?s=/index/message/index.html']");
		Thread.sleep(2000);
		webtest.click("class=default");
		webtest.type("class=default", "无回复");
		Thread.sleep(2000);
		webtest.click("xpath=/html/body/div[4]/div[3]/div/div/form/div[3]/table/thead/tr[2]/td[2]/div/ul/li/input");
		webtest.type("xpath=/html/body/div[4]/div[3]/div/div/form/div[3]/table/thead/tr[2]/td[2]/div/ul/li/input","人工服务");
		Thread.sleep(2000);
		webtest.click("name=f2p");
		webtest.type("name=f2p", "买错商品");
		Thread.sleep(2000);
		webtest.click("name=f3p");
		webtest.type("name=f3p", "默认");
		Thread.sleep(2000);
		webtest.click("xpath=//a[@class='am-btn am-btn-warning am-radius am-btn-sm am-icon-filter']");
		
	}
	
	@Test
	public void test42() throws InterruptedException{
		//点击个人中心-我的消息-消息类型-业务类型-标题-详情-状态-搜索-重置
		webtest.click("xpath=//span[text()='个人中心']");
		webtest.click("xpath=//a[@href='http://localhost:98/index.php?s=/index/message/index.html']");
		Thread.sleep(2000);
		webtest.click("class=default");
		webtest.type("class=default", "无回复");
		Thread.sleep(2000);
		webtest.click("xpath=/html/body/div[4]/div[3]/div/div/form/div[3]/table/thead/tr[2]/td[2]/div/ul/li/input");
		webtest.type("xpath=/html/body/div[4]/div[3]/div/div/form/div[3]/table/thead/tr[2]/td[2]/div/ul/li/input","人工服务");
		Thread.sleep(2000);
		webtest.click("name=f2p");
		webtest.type("name=f2p", "买错商品");
		Thread.sleep(2000);
		webtest.click("name=f3p");
		webtest.type("name=f3p", "默认");
		Thread.sleep(2000);
		webtest.click("xpath=/html/body/div[4]/div[3]/div/div/form/div[3]/table/thead/tr[2]/td[5]/div/ul/li/input");
		webtest.type("xpath=/html/body/div[4]/div[3]/div/div/form/div[3]/table/thead/tr[2]/td[5]/div/ul/li/input", "未读");
		Thread.sleep(2000);
		webtest.click("xpath=//button[@class='am-btn am-btn-primary am-radius am-btn-xs btn-loading-example am-icon-search']");
		Thread.sleep(2000);
		webtest.click("xpath=//a[@class='am-btn am-btn-warning am-radius am-btn-sm am-icon-filter']");
	}
	
	@Test
	public void  test43() throws InterruptedException{
		//点击个人中心-我的足迹-详情
		webtest.click("xpath=//span[text()='个人中心']");
		webtest.click("xpath=//a[@href='http://localhost:98/index.php?s=/index/usergoodsbrowse/index.html']");
		webtest.click("xpath=/html/body/div[4]/div[3]/div/div/form/div[3]/table/tbody/tr[1]/td[6]/button[1]/span");
		webtest.click("class=am-close am-close-alt am-icon-times am-close-spin");
		
	}
	
	@Test
	public void  test44() throws InterruptedException{
		//点击个人中心-我的足迹-详情
		webtest.click("xpath=//span[text()='个人中心']");
		webtest.click("xpath=//a[@href='http://localhost:98/index.php?s=/index/usergoodsbrowse/index.html']");
		webtest.click("xpath=/html/body/div[4]/div[3]/div/div/form/div[3]/table/tbody/tr[1]/td[1]/div/label/span/i[2]");
		webtest.click("xpath=//button[@class='am-btn am-btn-danger am-radius am-btn-xs am-icon-trash-o form-table-operate-top-delete-submit']");
		webtest.click("class=am-modal-btn");
	
	}
	
	@Test
	public void  test45() throws InterruptedException{
		//点击个人中心-我的足迹-全选-重置
		webtest.click("xpath=//span[text()='个人中心']");
		webtest.click("xpath=//a[@href='http://localhost:98/index.php?s=/index/usergoodsbrowse/index.html']");
		webtest.click("xpath=//button[@class='am-btn am-btn-secondary am-radius am-btn-xs form-table-operate-checkbox-submit']");
		webtest.click("xpath=/html/body/div[4]/div[3]/div/div/form/div[2]/a");
		Thread.sleep(2000);
	}
	
	
	@Test
	public void  test46() throws InterruptedException{
		//点击个人中心-我的足迹-全选-重置-搜索
		webtest.click("xpath=//span[text()='个人中心']");
		webtest.click("xpath=//a[@href='http://localhost:98/index.php?s=/index/usergoodsbrowse/index.html']");
		webtest.click("xpath=//button[@class='am-btn am-btn-secondary am-radius am-btn-xs form-table-operate-checkbox-submit']");
		webtest.click("xpath=/html/body/div[4]/div[3]/div/div/form/div[2]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//button[@class='am-btn am-btn-primary am-radius am-btn-xs btn-loading-example am-icon-search']");
	}
	
	
	@Test
	public void  test47() throws InterruptedException{
		//点击个人中心-我的足迹-全选-反选-删除
		webtest.click("xpath=//span[text()='个人中心']");
		webtest.click("xpath=//a[@href='http://localhost:98/index.php?s=/index/usergoodsbrowse/index.html']");
		webtest.click("xpath=//button[@class='am-btn am-btn-secondary am-radius am-btn-xs form-table-operate-checkbox-submit']");
		webtest.click("xpath=//button[@class='am-btn am-btn-secondary am-radius am-btn-xs form-table-operate-checkbox-submit']");
		Thread.sleep(2000);
		webtest.click("xpath=//button[@class='am-btn am-btn-danger am-radius am-btn-xs am-icon-trash-o form-table-operate-top-delete-submit']");
	}
	
	@Test
	public void  test48() throws InterruptedException{
		//点击个人中-问答/留言-新增
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
		webtest.type("name=content","哈哈哈哈哈哈" );
		Thread.sleep(2000);
		webtest.click("xpath=//button[@class='am-btn am-btn-primary am-radius btn-loading-example am-btn-sm am-btn-block']");
	}
	
	
	@Test
	public void  test49() throws InterruptedException{
		//点击个人中-问答/留言-新增-重置
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
		webtest.type("name=content","哈哈哈哈哈哈" );
		Thread.sleep(2000);
		webtest.click("xpath=//button[@class='am-btn am-btn-primary am-radius btn-loading-example am-btn-sm am-btn-block']");
	    webtest.click("xpath=//a[@class='am-btn am-btn-warning am-radius am-btn-sm am-icon-filter']");
	    Thread.sleep(2000);
	    webtest.click("xpath=//button[@class='am-btn am-btn-primary am-radius am-btn-xs btn-loading-example am-icon-search']");
	    Thread.sleep(2000);
	}
	
	@Test
	public void  test50() throws InterruptedException{
		//点击个人中-问答/留言-新增-搜索
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
		webtest.type("name=content","哈哈哈哈哈哈" );
		Thread.sleep(2000);
		webtest.click("xpath=//button[@class='am-btn am-btn-primary am-radius btn-loading-example am-btn-sm am-btn-block']");
		webtest.click("xpath=//button[@class='am-btn am-btn-primary am-radius am-btn-xs btn-loading-example am-icon-search']");
	    Thread.sleep(2000);
	    
	}
	
	
	@Test
	public void test51() throws InterruptedException{
		//个人中心-安全退出个人中心界面
		webtest.click("xpath=//span[text()='个人中心']");
		webtest.click("xpath=//a[@href='http://localhost:98/index.php?s=/index/user/logout.html']");
	}
	
		
	
}