package com.webtest.MaoYan;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class MaoYan50 extends BaseTest{
	
	@BeforeMethod
	public void test0() throws InterruptedException{
		webtest.open("http://localhost:100/");
		webtest.click("xpath=//a[@class='am-btn-primary btn am-fl']");
		webtest.type("name=accounts", "xzw123");
		webtest.type("name=pwd", "xzw123456");
		webtest.type("name=verify", "1111");
		Thread.sleep(1000);
		webtest.click("xpath=//button[@class='am-btn am-btn-primary am-radius am-btn-sm btn-loading-example']");
		Thread.sleep(1000);
		Assert.assertTrue(webtest.isTextPresent("登录"));
	}
	
	@Test(priority = 1)
	public void test1() throws InterruptedException {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(text(),'不限')]");
		webtest.click("xpath=//a[contains(text(),'办公打印')]");
		webtest.click("xpath=//a[contains(text(),'100-300')]");
		Thread.sleep(1000);
		Assert.assertTrue(webtest.isTextPresent("筛选的数据为"));
	}
	
	@Test(priority = 2)
	public void test2() throws InterruptedException {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(text(),'不限')]");
		webtest.click("xpath=//a[contains(text(),'办公打印')]");
		webtest.click("xpath=//a[contains(text(),'300-600')]");
		Thread.sleep(1000);
		Assert.assertTrue(webtest.isTextPresent("筛选的数据为"));
	}
	
	@Test(priority = 3)
	public void test3() throws InterruptedException {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(text(),'不限')]");
		webtest.click("xpath=//a[contains(text(),'办公打印')]");
		webtest.click("xpath=//a[contains(text(),'600-1000')]");
		Thread.sleep(1000);
		Assert.assertTrue(webtest.isTextPresent("筛选的数据为"));
	}
	
	@Test(priority = 4)
	public void test4() throws InterruptedException {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(text(),'不限')]");
		webtest.click("xpath=//a[contains(text(),'办公打印')]");
		webtest.click("xpath=//a[contains(text(),'1000-1500')]");
		Thread.sleep(1000);
		Assert.assertTrue(webtest.isTextPresent("筛选的数据为"));
	}
	
	@Test(priority = 5)
	public void test5() throws InterruptedException {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(text(),'不限')]");
		webtest.click("xpath=//a[contains(text(),'办公打印')]");
		webtest.click("xpath=//a[contains(text(),'1500-2000')]");
		Thread.sleep(1000);
		Assert.assertTrue(webtest.isTextPresent("筛选的数据为"));
	}
	
	@Test(priority = 6)
	public void test6() throws InterruptedException {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(text(),'不限')]");
		webtest.click("xpath=//a[contains(text(),'办公打印')]");
		webtest.click("xpath=//a[contains(text(),'2000-3000')]");
		Thread.sleep(1000);
		Assert.assertTrue(webtest.isTextPresent("筛选的数据为"));
	}
	
	@Test(priority = 7)
	public void test7() throws InterruptedException {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(text(),'不限')]");
		webtest.click("xpath=//a[contains(text(),'办公打印')]");
		webtest.click("xpath=//a[contains(text(),'3000-5000')]");
		Thread.sleep(1000);
		Assert.assertTrue(webtest.isTextPresent("筛选的数据为"));
	}
	
	@Test(priority = 8)
	public void test8() throws InterruptedException {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(text(),'不限')]");
		webtest.click("xpath=//a[contains(text(),'办公打印')]");
		webtest.click("xpath=//a[contains(text(),'1500-2000')]");
		Thread.sleep(1000);
		Assert.assertTrue(webtest.isTextPresent("筛选的数据为"));
	}
	
	@Test(priority = 9)
	public void test9() throws InterruptedException {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(text(),'不限')]");
		webtest.click("xpath=//a[contains(text(),'办公打印')]");
		webtest.click("xpath=//a[contains(text(),'5000-8000')]");
		Thread.sleep(1000);
		Assert.assertTrue(webtest.isTextPresent("筛选的数据为"));
	}
	
	@Test(priority = 10)
	public void test10() throws InterruptedException {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(text(),'不限')]");
		webtest.click("xpath=//a[contains(text(),'办公打印')]");
		webtest.click("xpath=//a[contains(text(),'12000-16000')]");
		Thread.sleep(1000);
		Assert.assertTrue(webtest.isTextPresent("筛选的数据为"));
	}
	
	@Test(priority = 11)
	public void test11() throws InterruptedException {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(text(),'不限')]");
		webtest.click("xpath=//a[contains(text(),'办公打印')]");
		webtest.click("xpath=//a[contains(text(),'16000-20000')]");
		Thread.sleep(1000);
		Assert.assertTrue(webtest.isTextPresent("筛选的数据为"));
	}
	
	@Test(priority = 12)
	public void test12() throws InterruptedException {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(text(),'不限')]");
		webtest.click("xpath=//a[contains(text(),'办公打印')]");
		webtest.click("xpath=//a[contains(text(),'20000以上')]");
		Thread.sleep(1000);
		Assert.assertTrue(webtest.isTextPresent("筛选的数据为"));
	}
	
	@Test(priority = 13)
	public void test13() throws InterruptedException {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(text(),'佳洁士')]");
		webtest.click("xpath=//a[contains(text(),'手机配件')]");
		webtest.click("xpath=//a[contains(text(),'100以下')]");
		Thread.sleep(1000);
		Assert.assertTrue(webtest.isTextPresent("筛选的数据为"));
	}
	
	@Test(priority = 14)
	public void test14() throws InterruptedException {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(text(),'佳洁士')]");
		webtest.click("xpath=//a[contains(text(),'手机配件')]");
		webtest.click("xpath=//a[contains(text(),'600-1000')]");
		Thread.sleep(1000);
		Assert.assertTrue(webtest.isTextPresent("筛选的数据为"));
	}
	
	@Test(priority = 15)
	public void test15() throws InterruptedException {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(text(),'佳洁士')]");
		webtest.click("xpath=//a[contains(text(),'手机配件')]");
		webtest.click("xpath=//a[contains(text(),'1000-1500')]");
		Thread.sleep(1000);
		Assert.assertTrue(webtest.isTextPresent("筛选的数据为"));
	}
	
	@Test(priority = 16)
	public void test16() throws InterruptedException {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(text(),'佳洁士')]");
		webtest.click("xpath=//a[contains(text(),'手机配件')]");
		webtest.click("xpath=//a[contains(text(),'1500-2000')]");
		Thread.sleep(1000);
		Assert.assertTrue(webtest.isTextPresent("筛选的数据为"));
	}
	
	@Test(priority = 17)
	public void test17() throws InterruptedException {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(text(),'佳洁士')]");
		webtest.click("xpath=//a[contains(text(),'手机配件')]");
		webtest.click("xpath=//a[contains(text(),'2000-3000')]");
		Thread.sleep(1000);
		Assert.assertTrue(webtest.isTextPresent("筛选的数据为"));
	}
	
	@Test(priority = 18)
	public void test18() throws InterruptedException {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(text(),'佳洁士')]");
		webtest.click("xpath=//a[contains(text(),'手机配件')]");
		webtest.click("xpath=//a[contains(text(),'3000-5000')]");
		Thread.sleep(1000);
		Assert.assertTrue(webtest.isTextPresent("筛选的数据为"));
	}
	
	@Test(priority = 19)
	public void test19() throws InterruptedException {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(text(),'佳洁士')]");
		webtest.click("xpath=//a[contains(text(),'手机配件')]");
		webtest.click("xpath=//a[contains(text(),'5000-8000')]");
		Thread.sleep(1000);
		Assert.assertTrue(webtest.isTextPresent("筛选的数据为"));
	}
	
	@Test(priority = 20)
	public void test20() throws InterruptedException {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(text(),'佳洁士')]");
		webtest.click("xpath=//a[contains(text(),'手机配件')]");
		webtest.click("xpath=//a[contains(text(),'8000-12000')]");
		Thread.sleep(1000);
		Assert.assertTrue(webtest.isTextPresent("筛选的数据为"));
	}
	
	@Test(priority = 21)
	public void test22() throws InterruptedException {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(text(),'佳洁士')]");
		webtest.click("xpath=//a[contains(text(),'手机配件')]");
		webtest.click("xpath=//a[contains(text(),'12000-16000')]");
		Thread.sleep(1000);
		Assert.assertTrue(webtest.isTextPresent("筛选的数据为"));
	}
	
	@Test(priority = 23)
	public void test23() throws InterruptedException {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(text(),'佳洁士')]");
		webtest.click("xpath=//a[contains(text(),'手机配件')]");
		webtest.click("xpath=//a[contains(text(),'16000-20000')]");
		Thread.sleep(1000);
		Assert.assertTrue(webtest.isTextPresent("筛选的数据为"));
	}
	
	@Test(priority = 24)
	public void test24() throws InterruptedException {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(text(),'佳洁士')]");
		webtest.click("xpath=//a[contains(text(),'手机配件')]");
		webtest.click("xpath=//a[contains(text(),'20000以上')]");
		Thread.sleep(1000);
		Assert.assertTrue(webtest.isTextPresent("筛选的数据为"));
	}
	
	@Test(priority = 25)
	public void test25() throws InterruptedException {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(text(),'强生')]");
		webtest.click("xpath=//a[contains(text(),'手机通讯')]");
		webtest.click("xpath=//a[contains(text(),'100-300')]");
		Thread.sleep(1000);
		Assert.assertTrue(webtest.isTextPresent("筛选的数据为"));
	}
	
	@Test(priority = 26)
	public void test26() throws InterruptedException {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(text(),'强生')]");
		webtest.click("xpath=//a[contains(text(),'手机通讯')]");
		webtest.click("xpath=//a[contains(text(),'300-600')]");
		Thread.sleep(1000);
		Assert.assertTrue(webtest.isTextPresent("筛选的数据为"));
	}
	
	@Test(priority = 27)
	public void test27() throws InterruptedException {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(text(),'强生')]");
		webtest.click("xpath=//a[contains(text(),'手机通讯')]");
		webtest.click("xpath=//a[contains(text(),'600-1000')]");
		Thread.sleep(1000);
		Assert.assertTrue(webtest.isTextPresent("筛选的数据为"));
	}
	
	@Test(priority = 28)
	public void test28() throws InterruptedException {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(text(),'强生')]");
		webtest.click("xpath=//a[contains(text(),'手机通讯')]");
		webtest.click("xpath=//a[contains(text(),'1000-1500')]");
		Thread.sleep(1000);
		Assert.assertTrue(webtest.isTextPresent("筛选的数据为"));
	}
	
	@Test(priority = 29)
	public void test29() throws InterruptedException {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(text(),'强生')]");
		webtest.click("xpath=//a[contains(text(),'手机通讯')]");
		webtest.click("xpath=//a[contains(text(),'1500-2000')]");
		Thread.sleep(1000);
		Assert.assertTrue(webtest.isTextPresent("筛选的数据为"));
	}
	
	@Test(priority = 30)
	public void test30() throws InterruptedException {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(text(),'强生')]");
		webtest.click("xpath=//a[contains(text(),'手机通讯')]");
		webtest.click("xpath=//a[contains(text(),'2000-3000')]");
		Thread.sleep(1000);
		Assert.assertTrue(webtest.isTextPresent("筛选的数据为"));
	}
	
	@Test(priority = 31)
	public void test31() throws InterruptedException {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(text(),'强生')]");
		webtest.click("xpath=//a[contains(text(),'手机通讯')]");
		webtest.click("xpath=//a[contains(text(),'3000-5000')]");
		Thread.sleep(1000);
		Assert.assertTrue(webtest.isTextPresent("筛选的数据为"));
	}
	
	@Test(priority = 32)
	public void test32() throws InterruptedException {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(text(),'强生')]");
		webtest.click("xpath=//a[contains(text(),'手机通讯')]");
		webtest.click("xpath=//a[contains(text(),'5000-8000')]");
		Thread.sleep(1000);
		Assert.assertTrue(webtest.isTextPresent("筛选的数据为"));
	}
	
	@Test(priority = 33)
	public void test33() throws InterruptedException {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(text(),'强生')]");
		webtest.click("xpath=//a[contains(text(),'手机通讯')]");
		webtest.click("xpath=//a[contains(text(),'8000-12000')]");
		Thread.sleep(1000);
		Assert.assertTrue(webtest.isTextPresent("筛选的数据为"));
	}
	
	@Test(priority = 34)
	public void test34() throws InterruptedException {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(text(),'强生')]");
		webtest.click("xpath=//a[contains(text(),'手机通讯')]");
		webtest.click("xpath=//a[contains(text(),'12000-16000')]");
		Thread.sleep(1000);
		Assert.assertTrue(webtest.isTextPresent("筛选的数据为"));
	}
	
	@Test(priority = 35)
	public void test35() throws InterruptedException {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(text(),'强生')]");
		webtest.click("xpath=//a[contains(text(),'手机通讯')]");
		webtest.click("xpath=//a[contains(text(),'16000-20000')]");
		Thread.sleep(1000);
		Assert.assertTrue(webtest.isTextPresent("筛选的数据为"));
	}
	
	@Test(priority = 36)
	public void test36() throws InterruptedException {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(text(),'强生')]");
		webtest.click("xpath=//a[contains(text(),'手机通讯')]");
		webtest.click("xpath=//a[contains(text(),'20000以上')]");
		Thread.sleep(1000);
		Assert.assertTrue(webtest.isTextPresent("筛选的数据为"));
	}
	
	@Test(priority = 37)
	public void test37() throws InterruptedException {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(text(),'佳洁士')]");
		webtest.click("xpath=//a[contains(text(),'手机通讯')]");
		webtest.click("xpath=//a[contains(text(),'100以下')]");
		Thread.sleep(1000);
		Assert.assertTrue(webtest.isTextPresent("筛选的数据为"));
	}
	
	@Test(priority = 38)
	public void test38() throws InterruptedException {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(text(),'佳洁士')]");
		webtest.click("xpath=//a[contains(text(),'手机通讯')]");
		webtest.click("xpath=//a[contains(text(),'100-300')]");
		Thread.sleep(1000);
		Assert.assertTrue(webtest.isTextPresent("筛选的数据为"));
	}
	
	@Test(priority = 39)
	public void test39() throws InterruptedException {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(text(),'佳洁士')]");
		webtest.click("xpath=//a[contains(text(),'手机通讯')]");
		webtest.click("xpath=//a[contains(text(),'300-600')]");
		Thread.sleep(1000);
		Assert.assertTrue(webtest.isTextPresent("筛选的数据为"));
	}
	
	@Test(priority = 40)
	public void test40() throws InterruptedException {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(text(),'佳洁士')]");
		webtest.click("xpath=//a[contains(text(),'手机通讯')]");
		webtest.click("xpath=//a[contains(text(),'600-1000')]");
		Thread.sleep(1000);
		Assert.assertTrue(webtest.isTextPresent("筛选的数据为"));
	}
	
	@Test(priority = 41)
	public void test41() throws InterruptedException {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(text(),'佳洁士')]");
		webtest.click("xpath=//a[contains(text(),'手机通讯')]");
		webtest.click("xpath=//a[contains(text(),'1000-1500')]");
		Thread.sleep(1000);
		Assert.assertTrue(webtest.isTextPresent("筛选的数据为"));
	}
	
	@Test(priority = 42)
	public void test42() throws InterruptedException {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(text(),'佳洁士')]");
		webtest.click("xpath=//a[contains(text(),'手机通讯')]");
		webtest.click("xpath=//a[contains(text(),'1500-2000')]");
		Thread.sleep(1000);
		Assert.assertTrue(webtest.isTextPresent("筛选的数据为"));
	}
	
	@Test(priority = 43)
	public void test43() throws InterruptedException {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(text(),'佳洁士')]");
		webtest.click("xpath=//a[contains(text(),'手机通讯')]");
		webtest.click("xpath=//a[contains(text(),'2000-3000')]");
		Thread.sleep(1000);
		Assert.assertTrue(webtest.isTextPresent("筛选的数据为"));
	}
	
	@Test(priority = 44)
	public void test44() throws InterruptedException {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(text(),'佳洁士')]");
		webtest.click("xpath=//a[contains(text(),'手机通讯')]");
		webtest.click("xpath=//a[contains(text(),'3000-5000')]");
		Thread.sleep(1000);
		Assert.assertTrue(webtest.isTextPresent("筛选的数据为"));
	}
	
	@Test(priority = 45)
	public void test45() throws InterruptedException {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(text(),'佳洁士')]");
		webtest.click("xpath=//a[contains(text(),'手机通讯')]");
		webtest.click("xpath=//a[contains(text(),'5000-8000')]");
		Thread.sleep(1000);
		Assert.assertTrue(webtest.isTextPresent("筛选的数据为"));
	}
	
	@Test(priority = 46)
	public void test46() throws InterruptedException {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(text(),'佳洁士')]");
		webtest.click("xpath=//a[contains(text(),'手机通讯')]");
		webtest.click("xpath=//a[contains(text(),'8000-12000')]");
		Thread.sleep(1000);
		Assert.assertTrue(webtest.isTextPresent("筛选的数据为"));
	}
	
	@Test(priority = 47)
	public void test47() throws InterruptedException {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(text(),'佳洁士')]");
		webtest.click("xpath=//a[contains(text(),'手机通讯')]");
		webtest.click("xpath=//a[contains(text(),'12000-16000')]");
		Thread.sleep(1000);
		Assert.assertTrue(webtest.isTextPresent("筛选的数据为"));
	}
	
	@Test(priority = 48)
	public void test48() throws InterruptedException {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(text(),'佳洁士')]");
		webtest.click("xpath=//a[contains(text(),'手机通讯')]");
		webtest.click("xpath=//a[contains(text(),'16000-20000')]");
		Thread.sleep(1000);
		Assert.assertTrue(webtest.isTextPresent("筛选的数据为"));
	}
	
	@Test(priority = 49)
	public void test49() throws InterruptedException {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(text(),'佳洁士')]");
		webtest.click("xpath=//a[contains(text(),'手机通讯')]");
		webtest.click("xpath=//a[contains(text(),'20000以上')]");
		Thread.sleep(1000);
		Assert.assertTrue(webtest.isTextPresent("筛选的数据为"));
	}
	
	@Test(priority = 50)
	public void test50() throws InterruptedException {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		Thread.sleep(1000);
		webtest.click("xpath=//a[contains(text(),'数码相机')]");
		webtest.click("xpath=//a[contains(text(),'摄影摄像')]");
		webtest.click("xpath=//a[contains(text(),'20000以上')]");
		Thread.sleep(1000);
		Assert.assertTrue(webtest.isTextPresent("筛选的数据为"));
	}	

}
