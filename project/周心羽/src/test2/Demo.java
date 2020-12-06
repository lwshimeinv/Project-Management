package test2;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Demo extends BaseTest{
	String url="http://localhost/admin.php?s=/admin/logininfo.html";
	
	@BeforeMethod
	public void test1() throws InterruptedException {
		webtest.open(url);
		Thread.sleep(1000);
		webtest.click("name=username");
		webtest.type("name=username", "admin");
		webtest.click("name=login_pwd");
		webtest.type("name=login_pwd", "shopxo");
		Thread.sleep(1000);
		webtest.click("xpath=//button[text()='登录']");
		Thread.sleep(1000);
	}
	
	@Test
	public void test2() throws InterruptedException{
		webtest.click("xpath=//span[text()='网站管理']");
		webtest.click("xpath=//span[text()='导航管理']");
		Thread.sleep(1000);
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='编辑']");
		Thread.sleep(1000);	
//		webtest.click("xpath=/html/body/div[2]/div/div[1]/div/div[2]/form/div[6]/div/label[2]/span/i[2]");
		webtest.click("xpath=//button[text()='保存']");
		Thread.sleep(1000);	
	}
	@Test
	public void test3() throws InterruptedException{
		webtest.click("xpath=//span[text()='网站管理']");
		webtest.click("xpath=//span[text()='导航管理']");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//button");
		webtest.click("xpath=//button[@class='am-btn am-btn-link am-btn-xs am-btn-block am-text-left am-padding-horizontal-sm am-icon-plus submit-add']");
		webtest.click("xpath=//li[@class='active-result result-selected']");
		webtest.click("name=name");
		webtest.type("name=name", "test01");
		webtest.click("name=url");
		webtest.type("name=url", "https://www.baidu.com");
		webtest.click("xpath=//button[text()='保存']");
	}
	
	@Test
	public void test4() throws InterruptedException{
		webtest.click("xpath=//span[text()='网站管理']");
		webtest.click("xpath=//span[text()='导航管理']");
		Thread.sleep(1000);
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='删除']");
     	webtest.click("xpath=//span[text()='确定']");
		Thread.sleep(1000);	
	}
		
	@Test
	public void test5() throws InterruptedException{
		webtest.click("xpath=//span[text()='网站管理']");
		webtest.click("xpath=//span[text()='导航管理']");
		Thread.sleep(1000);
		webtest.enterFrame("ifcontent");
		webtest.click("name=f1p");
		webtest.type("name=f1p", "商品分类");
		webtest.click("xpath=//button[@class='am-btn am-btn-primary am-radius am-btn-xs btn-loading-example am-icon-search']");
		Thread.sleep(1000);	
	}
	
	@Test
	public void test6() throws InterruptedException{
		webtest.click("xpath=//span[text()='网站管理']");
		webtest.click("xpath=//span[text()='自定义页面']");
		Thread.sleep(1000);
		webtest.enterFrame("ifcontent");
		webtest.click("name=f1p");
		webtest.type("name=f1p", "add");
		webtest.click("xpath=//button[@class='am-btn am-btn-primary am-radius am-btn-xs btn-loading-example am-icon-search']");
		Thread.sleep(1000);	
	}
	
	@Test
	public void test7() throws InterruptedException{
		webtest.click("xpath=//span[text()='网站管理']");
		webtest.click("xpath=//span[text()='自定义页面']");
		Thread.sleep(1000);
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='删除']");
		webtest.click("xpath=//span[text()='确定']");
		Thread.sleep(1000);	
	}
	
	@Test
	public void test8() throws InterruptedException{
		webtest.click("xpath=//span[text()='网站管理']");
		webtest.click("xpath=//span[text()='自定义页面']");
		Thread.sleep(1000);
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//a[text()='编辑']");
		webtest.click("xpath=//button[text()='保存']");
		Thread.sleep(1000);	
	}


	@Test
	public void test10() throws InterruptedException{
		webtest.click("xpath=//span[text()='网站管理']");
		webtest.click("xpath=//span[text()='自定义页面']");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//a[@class='am-btn am-btn-secondary am-radius am-btn-xs am-icon-plus']");
		webtest.click("name=title");
		webtest.type("name=title", "test01");
		webtest.enterFrame("ueditor_1");
		webtest.click("xpath=/html/body");
		webtest.type("xpath=/html/body", "测试测试测试测试测试测试");
		Thread.sleep(1000);	
		webtest.click("xpath=//button[text()='保存']");
	}
	
	@Test
	public void test9() throws InterruptedException{
		webtest.click("xpath=//span[text()='网站管理']");
		webtest.click("xpath=//span[text()='自定义页面']");
		Thread.sleep(1000);
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='详情']");
	    webtest.click("xpath=//span[@class='am-close am-close-alt am-icon-times am-close-spin']");
	}
	

	@Test
	public void test11() throws InterruptedException{
		webtest.click("xpath=//span[text()='网站管理']");
		webtest.click("xpath=//span[text()='友情链接']");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//button[@class='am-btn am-btn-secondary am-radius am-btn-xs am-icon-plus submit-add']");
		webtest.click("name=name");
		webtest.type("name=name", "test01");
		webtest.click("name=url");
		webtest.type("name=url", "https://www.baidu.com");
		webtest.click("xpath=//button[text()='保存']");
	}
	
	@Test
	public void test12() throws InterruptedException{
		webtest.click("xpath=//span[text()='网站管理']");
		webtest.click("xpath=//span[text()='友情链接']");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='删除']");
		webtest.click("xpath=//span[text()='确定']");
	}

	@Test
	public void test13() throws InterruptedException{
		webtest.click("xpath=//span[text()='网站管理']");
		webtest.click("xpath=//span[text()='友情链接']");
		Thread.sleep(1000);
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='详情']");
		webtest.click("xpath=//span[@class='am-close am-close-alt am-icon-times am-close-spin']");
	}
	
	@Test
	public void test14() throws InterruptedException{
		webtest.click("xpath=//span[text()='网站管理']");
		webtest.click("xpath=//span[text()='友情链接']");
		Thread.sleep(1000);
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//a[text()='编辑']");
		webtest.click("xpath=//button[text()='保存']");
	}
	
	@Test
	public void test15() throws InterruptedException{
		webtest.click("xpath=//span[text()='网站管理']");
		webtest.click("xpath=//span[text()='友情链接']");
		Thread.sleep(1000);
		webtest.enterFrame("ifcontent");
		webtest.click("name=f1p");
		webtest.type("name=f1p", "测试");
		webtest.click("xpath=//button[@class='am-btn am-btn-primary am-radius am-btn-xs btn-loading-example am-icon-search']");
		Thread.sleep(1000);	
	}
	
	@Test
	public void test16() throws InterruptedException{
		webtest.click("xpath=//span[text()='网站管理']");
		webtest.click("xpath=//span[text()='首页轮播']");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='删除']");
		webtest.click("xpath=//span[text()='确定']");
	}
	
	@Test
	public void test17() throws InterruptedException{
		webtest.click("xpath=//span[text()='网站管理']");
		webtest.click("xpath=//span[text()='首页轮播']");
		Thread.sleep(1000);
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='详情']");
		webtest.click("xpath=//span[@class='am-close am-close-alt am-icon-times am-close-spin']");
	}
	
	@Test
	public void test18() throws InterruptedException{
		webtest.click("xpath=//span[text()='网站管理']");
		webtest.click("xpath=//span[text()='首页轮播']");
		Thread.sleep(1000);
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//a[text()='编辑']");
		webtest.click("xpath=//button[text()='保存']");
	}
	
	@Test
	public void test19() throws InterruptedException{
		webtest.click("xpath=//span[text()='网站管理']");
		webtest.click("xpath=//span[text()='首页轮播']");
		Thread.sleep(1000);
		webtest.enterFrame("ifcontent");
		webtest.click("name=f1p");
		webtest.type("name=f1p", "海洋的未来");
		webtest.click("xpath=//button[@class='am-btn am-btn-primary am-radius am-btn-xs btn-loading-example am-icon-search']");
	}
	
	@Test
	public void test20() throws InterruptedException{
		webtest.click("xpath=//span[text()='网站管理']");
		webtest.click("xpath=//span[text()='筛选价格']");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//button[@class='am-btn am-btn-danger am-btn-xs am-radius am-icon-trash-o c-p m-l-10 submit-delete']");
		webtest.click("xpath=//span[text()='确定']");
	}
	
	@Test
	public void test21() throws InterruptedException{
		webtest.click("xpath=//span[text()='网站管理']");
		webtest.click("xpath=//span[text()='筛选价格']");
		Thread.sleep(1000);
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//button[@class='am-btn am-btn-secondary am-btn-xs am-radius am-icon-edit c-p submit-edit']");
		webtest.click("xpath=//button[text()='保存']");
	}
	
	@Test
	public void test22() throws InterruptedException{
		webtest.click("xpath=//span[text()='网站管理']");
		webtest.click("xpath=//span[text()='筛选价格']");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//button[@class='am-btn am-btn-secondary am-radius am-btn-xs am-icon-plus tree-submit-add']");
		webtest.click("name=name");
		webtest.type("name=name", "50-100");
		webtest.click("xpath=//button[text()='保存']");
	}
	
//	@Test
//	public void test23() throws InterruptedException{
//		webtest.click("xpath=//span[text()='网站管理']");
//		webtest.click("xpath=//span[text()='地区管理']");
//		webtest.enterFrame("ifcontent");
//		webtest.click("xpath=//button[@class='am-btn am-btn-secondary am-btn-xs am-radius am-icon-edit c-p submit-edit']");
//		webtest.click("xpath=//button[text()='保存']");
//	}
	
	@Test
	public void test24() throws InterruptedException{
		webtest.click("xpath=//span[text()='网站管理']");
		webtest.click("xpath=//span[text()='地区管理']");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//button[@class='am-btn am-btn-secondary am-radius am-btn-xs am-icon-plus tree-submit-add']");
		webtest.click("name=name");
		webtest.type("name=name", "江苏省");
		webtest.click("xpath=//button[text()='保存']");
	}
	

	@Test
	public void test25() throws InterruptedException{
		webtest.click("xpath=//span[text()='网站管理']");
		webtest.click("xpath=//span[text()='快递管理']");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//button[@class='am-btn am-btn-secondary am-btn-xs am-radius am-icon-edit c-p submit-edit']");
		webtest.click("xpath=//button[text()='保存']");
	}
	
	@Test
	public void test26() throws InterruptedException{
		webtest.click("xpath=//span[text()='网站管理']");
		webtest.click("xpath=//span[text()='快递管理']");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//button[@class='am-btn am-btn-danger am-btn-xs am-radius am-icon-trash-o c-p m-l-10 submit-delete']");
		webtest.click("xpath=//span[text()='确定']");
	}
	
	@Test
	public void test27() throws InterruptedException{
		webtest.click("xpath=//span[text()='网站管理']");
		webtest.click("xpath=//span[text()='快递管理']");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//button[@class='am-btn am-btn-secondary am-radius am-btn-xs am-icon-plus tree-submit-add']");
		webtest.click("name=name");
		webtest.type("name=name", "test快递");
		webtest.click("xpath=//button[text()='保存']");
	}
	
	@Test
	public void test28() throws InterruptedException{
		webtest.click("xpath=//span[text()='网站管理']");
		webtest.click("xpath=//span[text()='支付方式']");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='安装']");
		webtest.click("xpath=//span[text()='确定']");
	}
	
	@Test
	public void test29() throws InterruptedException{
		webtest.click("xpath=//span[text()='网站管理']");
		webtest.click("xpath=//span[text()='支付方式']");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='编辑']");
		webtest.click("xpath=//button[text()='保存']");
	}
	
	@Test
	public void test30() throws InterruptedException{
		webtest.click("xpath=//span[text()='网站管理']");
		webtest.click("xpath=//span[text()='支付方式']");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='卸载']");
		webtest.click("xpath=//span[text()='确定']");
	}
	
	@Test
	public void test31() throws InterruptedException{
		webtest.click("xpath=//span[text()='网站管理']");
		webtest.click("xpath=//span[text()='支付方式']");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='删除']");
		webtest.click("xpath=//span[text()='确定']");
	}
	
	@Test
	public void test33() throws InterruptedException{
		webtest.click("xpath=//span[text()='品牌管理']");
		webtest.click("xpath=/html/body/div[1]/div[1]/div/ul/li[9]/ul/li[1]/a/span");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='编辑']");
		webtest.click("xpath=//button[text()='保存']");
		Thread.sleep(1000);	
	}
	
	@Test
	public void test32() throws InterruptedException{
		webtest.click("xpath=//span[text()='品牌管理']");
		webtest.click("xpath=/html/body/div[1]/div[1]/div/ul/li[9]/ul/li[1]/a/span");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='详情']");
		webtest.click("xpath=//span[@class='am-close am-close-alt am-icon-times am-close-spin']");
	}
	
	@Test
	public void test34() throws InterruptedException{
		webtest.click("xpath=//span[text()='品牌管理']");
		webtest.click("xpath=/html/body/div[1]/div[1]/div/ul/li[9]/ul/li[1]/a/span");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='删除']");
     	webtest.click("xpath=//span[text()='确定']");
	}
		
	@Test
	public void test35() throws InterruptedException{
		webtest.click("xpath=//span[text()='品牌管理']");
		webtest.click("xpath=/html/body/div[1]/div[1]/div/ul/li[9]/ul/li[1]/a/span");
		webtest.enterFrame("ifcontent");
		webtest.click("name=f1p");
		webtest.type("name=f1p", "强生");
		webtest.click("xpath=//button[@class='am-btn am-btn-primary am-radius am-btn-xs btn-loading-example am-icon-search']");
	}
	
	@Test
	public void test36() throws InterruptedException{
		webtest.click("xpath=//span[text()='品牌管理']");
		webtest.click("xpath=//span[text()='品牌分类']");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//button[@class='am-btn am-btn-secondary am-radius am-btn-xs am-icon-plus tree-submit-add']");
		webtest.click("name=name");
		webtest.type("name=name", "test01");
		webtest.click("xpath=//button[text()='保存']");
	}
	
	@Test
	public void test37() throws InterruptedException{
		webtest.click("xpath=//span[text()='品牌管理']");
		webtest.click("xpath=//span[text()='品牌分类']");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//button[@class='am-btn am-btn-danger am-btn-xs am-radius am-icon-trash-o c-p m-l-10 submit-delete']");
		webtest.click("xpath=//span[text()='确定']");
	}
	
	@Test
	public void test38() throws InterruptedException{
		webtest.click("xpath=//span[text()='品牌管理']");
		webtest.click("xpath=//span[text()='品牌分类']");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//button[@class='am-btn am-btn-secondary am-btn-xs am-radius am-icon-edit c-p submit-edit']");
		webtest.click("xpath=//button[text()='保存']");
		Thread.sleep(1000);	
	}
	
	@Test
	public void test39() throws InterruptedException{
		webtest.click("xpath=//span[text()='仓库管理']");
		webtest.click("xpath=/html/body/div[1]/div[1]/div/ul/li[10]/ul/li[1]/a/span");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='详情']");
		webtest.click("xpath=//span[@class='am-close am-close-alt am-icon-times am-close-spin']");
	}
	
	@Test
	public void test40() throws InterruptedException{
		webtest.click("xpath=//span[text()='仓库管理']");
		webtest.click("xpath=/html/body/div[1]/div[1]/div/ul/li[10]/ul/li[1]/a/span");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='编辑']");
		webtest.click("xpath=//button[text()='保存']");
	}
	
	@Test
	public void test41() throws InterruptedException{
		webtest.click("xpath=//span[text()='仓库管理']");
		webtest.click("xpath=/html/body/div[1]/div[1]/div/ul/li[10]/ul/li[1]/a/span");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='删除']");
		webtest.click("xpath=//span[text()='确定']");
	}
	
	@Test
	public void test42() throws InterruptedException{
		webtest.click("xpath=//span[text()='仓库管理']");
		webtest.click("xpath=/html/body/div[1]/div[1]/div/ul/li[10]/ul/li[1]/a/span");
		webtest.enterFrame("ifcontent");
		webtest.click("name=f1p");
		webtest.type("name=f1p", "上海仓库");
		webtest.click("xpath=//button[@class='am-btn am-btn-primary am-radius am-btn-xs btn-loading-example am-icon-search']");
	}
	
	@Test
	public void test43() throws InterruptedException{
		webtest.click("xpath=//span[text()='仓库管理']");
		webtest.click("xpath=//span[text()='仓库商品管理']");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='详情']");
		webtest.click("xpath=//span[@class='am-close am-close-alt am-icon-times am-close-spin']");
	}
	
	@Test
	public void test44() throws InterruptedException{
		webtest.click("xpath=//span[text()='仓库管理']");
		webtest.click("xpath=//span[text()='仓库商品管理']");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='库存']");
		webtest.click("xpath=//button[text()='保存']");
	}
	
	@Test
	public void test45() throws InterruptedException{
		webtest.click("xpath=//span[text()='仓库管理']");
		webtest.click("xpath=//span[text()='仓库商品管理']");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='删除']");
		webtest.click("xpath=//span[text()='确定']");
	}
	
	@Test
	public void test46() throws InterruptedException{
		webtest.click("xpath=//span[text()='仓库管理']");
		webtest.click("xpath=//span[text()='仓库商品管理']");
		webtest.enterFrame("ifcontent");
		webtest.click("name=f1p");
		webtest.type("name=f1p", "苹果（Apple）iPhone 6 Plus (A1524)移动联通电信4G手机 金色 16G ");
		webtest.click("xpath=//button[@class='am-btn am-btn-primary am-radius am-btn-xs btn-loading-example am-icon-search']");
	}
	
	@Test
	public void test47() throws InterruptedException{
		webtest.click("xpath=//span[text()='手机管理']");
		webtest.click("xpath=//span[text()='首页导航']");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='详情']");
		webtest.click("xpath=//span[@class='am-close am-close-alt am-icon-times am-close-spin']");
	}
	
	@Test
	public void test48() throws InterruptedException{
		webtest.click("xpath=//span[text()='手机管理']");
		webtest.click("xpath=//span[text()='首页导航']");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='编辑']");
		webtest.click("xpath=//button[text()='保存']");
	}
	
	@Test
	public void test49() throws InterruptedException{
		webtest.click("xpath=//span[text()='手机管理']");
		webtest.click("xpath=//span[text()='首页导航']");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='删除']");
		webtest.click("xpath=//span[text()='确定']");
	}
	
	@Test
	public void test50() throws InterruptedException{
		webtest.click("xpath=//span[text()='手机管理']");
		webtest.click("xpath=//span[text()='用户中心导航']");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='详情']");
		webtest.click("xpath=//span[@class='am-close am-close-alt am-icon-times am-close-spin']");
	}
	
	@Test
	public void test51() throws InterruptedException{
		webtest.click("xpath=//span[text()='手机管理']");
		webtest.click("xpath=//span[text()='用户中心导航']");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='编辑']");
		webtest.click("xpath=//button[text()='保存']");
	}
	
	@Test
	public void test52() throws InterruptedException{
		webtest.click("xpath=//span[text()='手机管理']");
		webtest.click("xpath=//span[text()='用户中心导航']");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='删除']");
		webtest.click("xpath=//span[text()='确定']");
	}
}
