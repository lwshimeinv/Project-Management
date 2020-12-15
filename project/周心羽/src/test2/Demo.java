package test2;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Demo extends BaseTest{
	String url="http://localhost/admin.php?s=/admin/logininfo.html";
	
	@BeforeMethod(description = "登录后台")
	public void test1() throws InterruptedException {
		try {
			webtest.open(url);
			Thread.sleep(1000);
			webtest.click("name=username");
			webtest.type("name=username", "admin");
			webtest.click("name=login_pwd");
			webtest.type("name=login_pwd", "shopxo");
			Thread.sleep(1000);
			webtest.click("xpath=//button[text()='登录']");
			Thread.sleep(1000);
		}catch (InterruptedException e) {
			e.printStackTrace();
			Reporter.log(e.getMessage());
		}		
	}
	
	@Test(description = "编辑导航",priority = 1)
	public void test2() throws InterruptedException{
		webtest.click("xpath=//span[text()='网站管理']");
		webtest.click("xpath=//span[text()='导航管理']");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='编辑']");
//		webtest.click("xpath=/html/body/div[2]/div/div[1]/div/div[2]/form/div[6]/div/label[2]/span/i[2]");
		webtest.click("xpath=//button[text()='保存']");
		boolean flag =webtest.isDisplayed("xpath=//button[text()='保存']");
		assertFalse(flag);	
	}
	
	@Test(description = "新增导航",priority = 2)
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
		boolean flag =webtest.isDisplayed("xpath=//button[text()='保存']");
		assertFalse(flag);	
		}
	
	@Test(description = "删除导航",priority = 3)
	public void test4() throws InterruptedException{
		webtest.click("xpath=//span[text()='网站管理']");
		webtest.click("xpath=//span[text()='导航管理']");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='删除']");
     	webtest.click("xpath=//span[text()='确定']");
     	boolean flag =webtest.isDisplayed("xpath=//span[text()='确定']");
		assertFalse(flag);	
	}
		
	@Test(description = "搜索导航",priority = 4)
	public void test5() throws InterruptedException{
		webtest.click("xpath=//span[text()='网站管理']");
		webtest.click("xpath=//span[text()='导航管理']");
		webtest.enterFrame("ifcontent");
		webtest.click("name=f1p");
		webtest.type("name=f1p", "商品分类");
		webtest.click("xpath=//button[@class='am-btn am-btn-primary am-radius am-btn-xs btn-loading-example am-icon-search']");
		boolean flag =webtest.isDisplayed("xpath=//button[@class='am-btn am-btn-primary am-radius am-btn-xs btn-loading-example am-icon-search']");
		assertTrue(flag);	
	}
	
	@Test(description = "搜索页面",priority = 5)
	public void test6() throws InterruptedException{
		webtest.click("xpath=//span[text()='网站管理']");
		webtest.click("xpath=//span[text()='自定义页面']");
		Thread.sleep(1000);
		webtest.enterFrame("ifcontent");
		webtest.click("name=f1p");
		webtest.type("name=f1p", "add");
		webtest.click("xpath=//button[@class='am-btn am-btn-primary am-radius am-btn-xs btn-loading-example am-icon-search']");
		boolean flag =webtest.isDisplayed("xpath=//button[@class='am-btn am-btn-primary am-radius am-btn-xs btn-loading-example am-icon-search']");
		assertTrue(flag);	
	}
	
	@Test(description = "删除页面",priority = 6)
	public void test7() throws InterruptedException{
		webtest.click("xpath=//span[text()='网站管理']");
		webtest.click("xpath=//span[text()='自定义页面']");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='删除']");
		webtest.click("xpath=//span[text()='确定']");
		boolean flag =webtest.isDisplayed("xpath=//span[text()='确定']");
		assertFalse(flag);
	}
	
	@Test(description = "编辑页面",priority = 7)
	public void test8() throws InterruptedException{
		webtest.click("xpath=//span[text()='网站管理']");
		webtest.click("xpath=//span[text()='自定义页面']");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//a[text()='编辑']");
		webtest.click("xpath=//button[text()='保存']");
		boolean flag =webtest.isDisplayed("xpath=//button[text()='保存']");
		assertFalse(flag);
	}


	@Test(description = "新增页面",priority = 8)
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
		webtest.click("xpath=//button[text()='保存']");
		boolean flag =webtest.isDisplayed("xpath=//button[text()='保存']");
		assertFalse(flag);
	}
	
	@Test(description = "查看页面详情",priority = 9)
	public void test9() throws InterruptedException{
		webtest.click("xpath=//span[text()='网站管理']");
		webtest.click("xpath=//span[text()='自定义页面']");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='详情']");
	    webtest.click("xpath=//span[@class='am-close am-close-alt am-icon-times am-close-spin']");
	    boolean flag =webtest.isDisplayed("xpath=//span[@class='am-close am-close-alt am-icon-times am-close-spin']");
		assertFalse(flag);
	}
	

	@Test(description = "新增链接",priority = 10)
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
		boolean flag =webtest.isDisplayed("xpath=//button[text()='保存']");
		assertFalse(flag);
	}
	
	@Test(description = "删除链接",priority = 11)
	public void test12() throws InterruptedException{
		webtest.click("xpath=//span[text()='网站管理']");
		webtest.click("xpath=//span[text()='友情链接']");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='删除']");
		webtest.click("xpath=//span[text()='确定']");
		boolean flag =webtest.isDisplayed("xpath=//span[text()='确定']");
		assertFalse(flag);
	}

	@Test(description = "查看链接详情",priority = 12)
	public void test13() throws InterruptedException{
		webtest.click("xpath=//span[text()='网站管理']");
		webtest.click("xpath=//span[text()='友情链接']");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='详情']");
		webtest.click("xpath=//span[@class='am-close am-close-alt am-icon-times am-close-spin']");
		boolean flag =webtest.isDisplayed("xpath=//span[@class='am-close am-close-alt am-icon-times am-close-spin']");
		assertFalse(flag);
	}
	
	@Test(description = "编辑链接",priority = 13)
	public void test14() throws InterruptedException{
		webtest.click("xpath=//span[text()='网站管理']");
		webtest.click("xpath=//span[text()='友情链接']");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='编辑']");
		webtest.click("xpath=//button[text()='保存']");
		boolean flag =webtest.isDisplayed("xpath=//button[text()='保存']");
		assertFalse(flag);
	}
	
	@Test(description = "搜索链接",priority = 14)
	public void test15() throws InterruptedException{
		webtest.click("xpath=//span[text()='网站管理']");
		webtest.click("xpath=//span[text()='友情链接']");
		Thread.sleep(1000);
		webtest.enterFrame("ifcontent");
		webtest.click("name=f1p");
		webtest.type("name=f1p", "测试");
		webtest.click("xpath=//button[@class='am-btn am-btn-primary am-radius am-btn-xs btn-loading-example am-icon-search']");
		boolean flag =webtest.isDisplayed("xpath=//button[@class='am-btn am-btn-primary am-radius am-btn-xs btn-loading-example am-icon-search']");
		assertTrue(flag);
	}
	
	@Test(description = "删除轮播",priority = 15)
	public void test16() throws InterruptedException{
		webtest.click("xpath=//span[text()='网站管理']");
		webtest.click("xpath=//span[text()='首页轮播']");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='删除']");
		webtest.click("xpath=//span[text()='确定']");
		boolean flag =webtest.isDisplayed("xpath=//span[text()='确定']");
		assertFalse(flag);
	}
	
	@Test(description = "查看轮播详情",priority = 16)
	public void test17() throws InterruptedException{
		webtest.click("xpath=//span[text()='网站管理']");
		webtest.click("xpath=//span[text()='首页轮播']");
		Thread.sleep(1000);
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='详情']");
		webtest.click("xpath=//span[@class='am-close am-close-alt am-icon-times am-close-spin']");
		boolean flag =webtest.isDisplayed("xpath=//span[@class='am-close am-close-alt am-icon-times am-close-spin']");
		assertFalse(flag);
	}
	
	@Test(description = "编辑轮播",priority = 17)
	public void test18() throws InterruptedException{
		webtest.click("xpath=//span[text()='网站管理']");
		webtest.click("xpath=//span[text()='首页轮播']");
		Thread.sleep(1000);
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//a[text()='编辑']");
		webtest.click("xpath=//button[text()='保存']");
		boolean flag =webtest.isDisplayed("xpath=//button[text()='保存']");
		assertFalse(flag);
	}
	
	@Test(description = "搜索轮播",priority = 18)
	public void test19() throws InterruptedException{
		webtest.click("xpath=//span[text()='网站管理']");
		webtest.click("xpath=//span[text()='首页轮播']");
		Thread.sleep(1000);
		webtest.enterFrame("ifcontent");
		webtest.click("name=f1p");
		webtest.type("name=f1p", "海洋的未来");
		webtest.click("xpath=//button[@class='am-btn am-btn-primary am-radius am-btn-xs btn-loading-example am-icon-search']");
		boolean flag =webtest.isDisplayed("xpath=//button[@class='am-btn am-btn-primary am-radius am-btn-xs btn-loading-example am-icon-search']");
		assertTrue(flag);
	}
	
	@Test(description = "删除操作",priority = 19)
	public void test20() throws InterruptedException{
		webtest.click("xpath=//span[text()='网站管理']");
		webtest.click("xpath=//span[text()='筛选价格']");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//button[text()='删除']");
		webtest.click("xpath=//span[text()='确定']");
		boolean flag =webtest.isDisplayed("xpath=//span[text()='确定']");
		assertFalse(flag);
	}
	
//	@Test(description = "编辑价格",priority = 20)
//	public void test21() throws InterruptedException{
//		webtest.click("xpath=//span[text()='网站管理']");
//		webtest.click("xpath=//span[text()='筛选价格']");
//		webtest.enterFrame("ifcontent");
//		webtest.click("xpath=//button[text()='编辑']");
//		webtest.click("xpath=//button[text()='保存']");
//		boolean flag =webtest.isDisplayed("xpath=//button[text()='保存']");
//		assertFalse(flag);
//	}
	
	@Test(description = "新增筛选价格",priority = 21)
	public void test22() throws InterruptedException{
		webtest.click("xpath=//span[text()='网站管理']");
		webtest.click("xpath=//span[text()='筛选价格']");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//button[@class='am-btn am-btn-secondary am-radius am-btn-xs am-icon-plus tree-submit-add']");
		webtest.click("name=name");
		webtest.type("name=name", "50-100");
		webtest.click("xpath=//button[text()='保存']");
		boolean flag =webtest.isDisplayed("xpath=//button[text()='保存']");
		assertFalse(flag);
	}
	
//	@Test
//	public void test23() throws InterruptedException{
//		webtest.click("xpath=//span[text()='网站管理']");
//		webtest.click("xpath=//span[text()='地区管理']");
//		webtest.enterFrame("ifcontent");
//		webtest.click("xpath=//button[@class='am-btn am-btn-secondary am-btn-xs am-radius am-icon-edit c-p submit-edit']");
//		webtest.click("xpath=//button[text()='保存']");
//	}
	
	@Test(description = "新增地区",priority = 22)
	public void test24() throws InterruptedException{
		webtest.click("xpath=//span[text()='网站管理']");
		webtest.click("xpath=//span[text()='地区管理']");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//button[@class='am-btn am-btn-secondary am-radius am-btn-xs am-icon-plus tree-submit-add']");
		webtest.click("name=name");
		webtest.type("name=name", "江苏省");
		webtest.click("xpath=//button[text()='保存']");
		boolean flag =webtest.isDisplayed("xpath=//button[text()='保存']");
		assertFalse(flag);
	}
	

	@Test(description = "编辑快递信息",priority = 23)
	public void test25() throws InterruptedException{
		webtest.click("xpath=//span[text()='网站管理']");
		webtest.click("xpath=//span[text()='快递管理']");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//button[@class='am-btn am-btn-secondary am-btn-xs am-radius am-icon-edit c-p submit-edit']");
		webtest.click("xpath=//button[text()='保存']");
		boolean flag =webtest.isDisplayed("xpath=//button[text()='保存']");
		assertFalse(flag);
	}
	
	@Test(description = "删除快递",priority = 24)
	public void test26() throws InterruptedException{
		webtest.click("xpath=//span[text()='网站管理']");
		webtest.click("xpath=//span[text()='快递管理']");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//button[text()='删除']");
		webtest.click("xpath=//span[text()='确定']");
		boolean flag =webtest.isDisplayed("xpath=//span[text()='确定']");
		assertFalse(flag);
	}
	
	@Test(description = "新增快递",priority = 25)
	public void test27() throws InterruptedException{
		webtest.click("xpath=//span[text()='网站管理']");
		webtest.click("xpath=//span[text()='快递管理']");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//button[@class='am-btn am-btn-secondary am-radius am-btn-xs am-icon-plus tree-submit-add']");
		webtest.click("name=name");
		webtest.type("name=name", "test快递");
		webtest.click("xpath=//button[text()='保存']");
		boolean flag =webtest.isDisplayed("xpath=//button[text()='保存']");
		assertFalse(flag);
	}
	
	@Test(description = "安装支付方式",priority = 26)
	public void test28() throws InterruptedException{
		webtest.click("xpath=//span[text()='网站管理']");
		webtest.click("xpath=//span[text()='支付方式']");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='安装']");
		webtest.click("xpath=//span[text()='确定']");
		boolean flag =webtest.isDisplayed("xpath=//span[text()='确定']");
		assertFalse(flag);
	}
	
	@Test(description = "编辑支付方式",priority = 27)
	public void test29() throws InterruptedException{
		webtest.click("xpath=//span[text()='网站管理']");
		webtest.click("xpath=//span[text()='支付方式']");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='编辑']");
		webtest.click("xpath=//button[text()='保存']");
		boolean flag =webtest.isDisplayed("xpath=//button[text()='保存']");
		assertFalse(flag);
	}
	
	@Test(description = "卸载已有支付方式",priority = 28)
	public void test30() throws InterruptedException{
		webtest.click("xpath=//span[text()='网站管理']");
		webtest.click("xpath=//span[text()='支付方式']");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='卸载']");
		webtest.click("xpath=//span[text()='确定']");
		boolean flag =webtest.isDisplayed("xpath=//span[text()='确定']");
		assertFalse(flag);
	}
	
	@Test(description = "删除支付方式",priority = 29)
	public void test31() throws InterruptedException{
		webtest.click("xpath=//span[text()='网站管理']");
		webtest.click("xpath=//span[text()='支付方式']");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='删除']");
		webtest.click("xpath=//span[text()='确定']");
		boolean flag =webtest.isDisplayed("xpath=//span[text()='确定']");
		assertFalse(flag);
	}
	
	@Test(description = "编辑品牌管理",priority = 31)
	public void test33() throws InterruptedException{
		webtest.click("xpath=//span[text()='品牌管理']");
		webtest.click("xpath=/html/body/div[1]/div[1]/div/ul/li[9]/ul/li[1]/a/span");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='编辑']");
		webtest.click("xpath=//button[text()='保存']");
		boolean flag =webtest.isDisplayed("xpath=//button[text()='保存']");
		assertFalse(flag);
	}
	
	@Test(description = "查看品牌详情",priority = 30)
	public void test32() throws InterruptedException{
		webtest.click("xpath=//span[text()='品牌管理']");
		webtest.click("xpath=/html/body/div[1]/div[1]/div/ul/li[9]/ul/li[1]/a/span");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='详情']");
		webtest.click("xpath=//span[@class='am-close am-close-alt am-icon-times am-close-spin']");
		boolean flag =webtest.isDisplayed("xpath=//span[@class='am-close am-close-alt am-icon-times am-close-spin']");
		assertFalse(flag);
	}
	
	@Test(description = "删除品牌",priority = 32)
	public void test34() throws InterruptedException{
		webtest.click("xpath=//span[text()='品牌管理']");
		webtest.click("xpath=/html/body/div[1]/div[1]/div/ul/li[9]/ul/li[1]/a/span");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='删除']");
     	webtest.click("xpath=//span[text()='确定']");
     	boolean flag =webtest.isDisplayed("xpath=//span[text()='确定']");
		assertFalse(flag);
	}
		
	@Test(description = "搜索品牌",priority = 33)
	public void test35() throws InterruptedException{
		webtest.click("xpath=//span[text()='品牌管理']");
		webtest.click("xpath=/html/body/div[1]/div[1]/div/ul/li[9]/ul/li[1]/a/span");
		webtest.enterFrame("ifcontent");
		webtest.click("name=f1p");
		webtest.type("name=f1p", "强生");
		webtest.click("xpath=//button[@class='am-btn am-btn-primary am-radius am-btn-xs btn-loading-example am-icon-search']");
		boolean flag =webtest.isDisplayed("xpath=//button[@class='am-btn am-btn-primary am-radius am-btn-xs btn-loading-example am-icon-search']");
		assertTrue(flag);
	}
	
	@Test(description = "新增品牌分类",priority = 34)
	public void test36() throws InterruptedException{
		webtest.click("xpath=//span[text()='品牌管理']");
		webtest.click("xpath=//span[text()='品牌分类']");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//button[@class='am-btn am-btn-secondary am-radius am-btn-xs am-icon-plus tree-submit-add']");
		webtest.click("name=name");
		webtest.type("name=name", "test01");
		webtest.click("xpath=//button[text()='保存']");
		boolean flag =webtest.isDisplayed("xpath=//button[text()='保存']");
		assertFalse(flag);	
		}
	
	@Test(description = "删除品牌分类",priority = 35)
	public void test37() throws InterruptedException{
		webtest.click("xpath=//span[text()='品牌管理']");
		webtest.click("xpath=//span[text()='品牌分类']");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//button[text()='删除']");
		webtest.click("xpath=//span[text()='确定']");
		boolean flag =webtest.isDisplayed("xpath=//span[text()='确定']");
		assertFalse(flag);
	}
	
	@Test(description = "编辑品牌分类",priority = 36)
	public void test38() throws InterruptedException{
		webtest.click("xpath=//span[text()='品牌管理']");
		webtest.click("xpath=//span[text()='品牌分类']");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//button[text()='编辑']");
		webtest.click("xpath=//button[text()='保存']");	
		boolean flag =webtest.isDisplayed("xpath=//button[text()='保存']");
		assertFalse(flag);
	}
	
	@Test(description = "查看仓库详情",priority = 37)
	public void test39() throws InterruptedException{
		webtest.click("xpath=//span[text()='仓库管理']");
		webtest.click("xpath=/html/body/div[1]/div[1]/div/ul/li[10]/ul/li[1]/a/span");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='详情']");
		webtest.click("xpath=//span[@class='am-close am-close-alt am-icon-times am-close-spin']");
		boolean flag =webtest.isDisplayed("xpath=//span[@class='am-close am-close-alt am-icon-times am-close-spin']");
		assertFalse(flag);
	}
	
	@Test(description = "编辑仓库",priority = 38)
	public void test40() throws InterruptedException{
		webtest.click("xpath=//span[text()='仓库管理']");
		webtest.click("xpath=/html/body/div[1]/div[1]/div/ul/li[10]/ul/li[1]/a/span");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='编辑']");
		webtest.click("xpath=//button[text()='保存']");
		boolean flag =webtest.isDisplayed("xpath=//button[text()='保存']");
		assertFalse(flag);
	}
	
	@Test(description = "删除仓库",priority = 39)
	public void test41() throws InterruptedException{
		webtest.click("xpath=//span[text()='仓库管理']");
		webtest.click("xpath=/html/body/div[1]/div[1]/div/ul/li[10]/ul/li[1]/a/span");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='删除']");
		webtest.click("xpath=//span[text()='确定']");
		boolean flag =webtest.isDisplayed("xpath=//span[text()='确定']");
		assertFalse(flag);
	}
	
	@Test(description = "搜索仓库",priority = 40)
	public void test42() throws InterruptedException{
		webtest.click("xpath=//span[text()='仓库管理']");
		webtest.click("xpath=/html/body/div[1]/div[1]/div/ul/li[10]/ul/li[1]/a/span");
		webtest.enterFrame("ifcontent");
		webtest.click("name=f1p");
		webtest.type("name=f1p", "上海仓库");
		webtest.click("xpath=//button[@class='am-btn am-btn-primary am-radius am-btn-xs btn-loading-example am-icon-search']");
		boolean flag =webtest.isDisplayed("xpath=//button[@class='am-btn am-btn-primary am-radius am-btn-xs btn-loading-example am-icon-search']");
		assertTrue(flag);
	}
	
	@Test(description = "查看仓库商品详情",priority = 41)
	public void test43() throws InterruptedException{
		webtest.click("xpath=//span[text()='仓库管理']");
		webtest.click("xpath=//span[text()='仓库商品管理']");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='详情']");
		webtest.click("xpath=//span[@class='am-close am-close-alt am-icon-times am-close-spin']");
		boolean flag =webtest.isDisplayed("xpath=//span[@class='am-close am-close-alt am-icon-times am-close-spin']");
		assertFalse(flag);
	}
	
	@Test(description = "编辑仓库商品",priority = 42)
	public void test44() throws InterruptedException{
		webtest.click("xpath=//span[text()='仓库管理']");
		webtest.click("xpath=//span[text()='仓库商品管理']");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='库存']");
		webtest.click("xpath=//button[text()='保存']");
		boolean flag =webtest.isDisplayed("xpath=//button[text()='保存']");
		assertFalse(flag);
	}
	
	@Test(description = "删除仓库商品",priority = 43)
	public void test45() throws InterruptedException{
		webtest.click("xpath=//span[text()='仓库管理']");
		webtest.click("xpath=//span[text()='仓库商品管理']");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='删除']");
		webtest.click("xpath=//span[text()='确定']");
		boolean flag =webtest.isDisplayed("xpath=//span[text()='确定']");
		assertFalse(flag);
	}
	
	@Test(description = "搜索仓库商品",priority = 44)
	public void test46() throws InterruptedException{
		webtest.click("xpath=//span[text()='仓库管理']");
		webtest.click("xpath=//span[text()='仓库商品管理']");
		webtest.enterFrame("ifcontent");
		webtest.click("name=f1p");
		webtest.type("name=f1p", "苹果（Apple）iPhone 6 Plus (A1524)移动联通电信4G手机 金色 16G ");
		webtest.click("xpath=//button[@class='am-btn am-btn-primary am-radius am-btn-xs btn-loading-example am-icon-search']");
		boolean flag =webtest.isDisplayed("xpath=//button[@class='am-btn am-btn-primary am-radius am-btn-xs btn-loading-example am-icon-search']");
		assertTrue(flag);
	}
	
	@Test(description = "查看首页导航详情",priority = 45)
	public void test47() throws InterruptedException{
		webtest.click("xpath=//span[text()='手机管理']");
		webtest.click("xpath=//span[text()='首页导航']");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='详情']");
		webtest.click("xpath=//span[@class='am-close am-close-alt am-icon-times am-close-spin']");
		boolean flag =webtest.isDisplayed("xpath=//span[@class='am-close am-close-alt am-icon-times am-close-spin']");
		assertFalse(flag);
	}
	
	@Test(description = "编辑首页导航",priority = 46)
	public void test48() throws InterruptedException{
		webtest.click("xpath=//span[text()='手机管理']");
		webtest.click("xpath=//span[text()='首页导航']");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='编辑']");
		webtest.click("xpath=//button[text()='保存']");
//		boolean flag =webtest.isDisplayed("xpath=//button[text()='保存']");
//		assertFalse(flag);
	}
	
	@Test(description = "删除首页导航",priority = 47)
	public void test49() throws InterruptedException{
		webtest.click("xpath=//span[text()='手机管理']");
		webtest.click("xpath=//span[text()='首页导航']");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='删除']");
		webtest.click("xpath=//span[text()='确定']");
		boolean flag =webtest.isDisplayed("xpath=//span[text()='确定']");
		assertFalse(flag);
	}
	
	@Test(description = "查看用户中心导航详情",priority = 48)
	public void test50() throws InterruptedException{
		webtest.click("xpath=//span[text()='手机管理']");
		webtest.click("xpath=//span[text()='用户中心导航']");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='详情']");
		webtest.click("xpath=//span[@class='am-close am-close-alt am-icon-times am-close-spin']");
		boolean flag =webtest.isDisplayed("xpath=//span[@class='am-close am-close-alt am-icon-times am-close-spin']");
		assertFalse(flag);
	}
	
	@Test(description = "编辑用户中心导航",priority = 49)
	public void test51() throws InterruptedException{
		webtest.click("xpath=//span[text()='手机管理']");
		webtest.click("xpath=//span[text()='用户中心导航']");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='编辑']");
		webtest.click("xpath=//button[text()='保存']");
		boolean flag =webtest.isDisplayed("xpath=//button[text()='保存']");
		assertFalse(flag);
	}
	
	@Test(description = "删除用户中心导航",priority = 50)
	public void test52() throws InterruptedException{
		webtest.click("xpath=//span[text()='手机管理']");
		webtest.click("xpath=//span[text()='用户中心导航']");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='删除']");
		webtest.click("xpath=//span[text()='确定']");
		boolean flag =webtest.isDisplayed("xpath=//span[text()='确定']");
		assertFalse(flag);
	}
}
