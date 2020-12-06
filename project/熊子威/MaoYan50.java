package com.webtest.MaoYan;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class MaoYan50 extends BaseTest{
	
	@BeforeMethod
	public void test0(){
		webtest.open("http://localhost:100/");
		webtest.click("xpath=//a[@class='am-btn-primary btn am-fl']");
		webtest.type("name=accounts", "xzw123");
		webtest.type("name=pwd", "xzw123456");
		webtest.type("name=verify", "1111");
		webtest.click("xpath=//button[@class='am-btn am-btn-primary am-radius am-btn-sm btn-loading-example']");
		}
	
	@Test(priority = 1)
	public void test1() {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		webtest.click("xpath=//a[contains(text(),'不限')]");
		webtest.click("xpath=//a[contains(text(),'办公打印')]");
		webtest.click("xpath=//a[contains(text(),'100-300')]");
	}
	
	@Test(priority = 2)
	public void test2() {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		webtest.click("xpath=//a[contains(text(),'不限')]");
		webtest.click("xpath=//a[contains(text(),'办公打印')]");
		webtest.click("xpath=//a[contains(text(),'300-600')]");
	}
	
	@Test(priority = 3)
	public void test3() {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		webtest.click("xpath=//a[contains(text(),'不限')]");
		webtest.click("xpath=//a[contains(text(),'办公打印')]");
		webtest.click("xpath=//a[contains(text(),'600-1000')]");
	}
	
	@Test(priority = 4)
	public void test4() {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		webtest.click("xpath=//a[contains(text(),'不限')]");
		webtest.click("xpath=//a[contains(text(),'办公打印')]");
		webtest.click("xpath=//a[contains(text(),'1000-1500')]");
	}
	
	@Test(priority = 5)
	public void test5() {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		webtest.click("xpath=//a[contains(text(),'不限')]");
		webtest.click("xpath=//a[contains(text(),'办公打印')]");
		webtest.click("xpath=//a[contains(text(),'1500-2000')]");
	}
	
	@Test(priority = 6)
	public void test6() {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		webtest.click("xpath=//a[contains(text(),'不限')]");
		webtest.click("xpath=//a[contains(text(),'办公打印')]");
		webtest.click("xpath=//a[contains(text(),'2000-3000')]");
	}
	
	@Test(priority = 7)
	public void test7() {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		webtest.click("xpath=//a[contains(text(),'不限')]");
		webtest.click("xpath=//a[contains(text(),'办公打印')]");
		webtest.click("xpath=//a[contains(text(),'3000-5000')]");
	}
	
	@Test(priority = 8)
	public void test8() {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		webtest.click("xpath=//a[contains(text(),'不限')]");
		webtest.click("xpath=//a[contains(text(),'办公打印')]");
		webtest.click("xpath=//a[contains(text(),'1500-2000')]");
	}
	
	@Test(priority = 9)
	public void test9() {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		webtest.click("xpath=//a[contains(text(),'不限')]");
		webtest.click("xpath=//a[contains(text(),'办公打印')]");
		webtest.click("xpath=//a[contains(text(),'5000-8000')]");
	}
	
	@Test(priority = 10)
	public void test10() {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		webtest.click("xpath=//a[contains(text(),'不限')]");
		webtest.click("xpath=//a[contains(text(),'办公打印')]");
		webtest.click("xpath=//a[contains(text(),'12000-16000')]");
	}
	
	@Test(priority = 11)
	public void test11() {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		webtest.click("xpath=//a[contains(text(),'不限')]");
		webtest.click("xpath=//a[contains(text(),'办公打印')]");
		webtest.click("xpath=//a[contains(text(),'16000-20000')]");
	}
	
	@Test(priority = 12)
	public void test12() {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		webtest.click("xpath=//a[contains(text(),'不限')]");
		webtest.click("xpath=//a[contains(text(),'办公打印')]");
		webtest.click("xpath=//a[contains(text(),'20000以上')]");
	}
	
	@Test(priority = 13)
	public void test13() {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		webtest.click("xpath=//a[contains(text(),'佳洁士')]");
		webtest.click("xpath=//a[contains(text(),'手机配件')]");
		webtest.click("xpath=//a[contains(text(),'100以下')]");
	}
	
	@Test(priority = 14)
	public void test14() {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		webtest.click("xpath=//a[contains(text(),'佳洁士')]");
		webtest.click("xpath=//a[contains(text(),'手机配件')]");
		webtest.click("xpath=//a[contains(text(),'600-1000')]");
	}
	
	@Test(priority = 15)
	public void test15() {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		webtest.click("xpath=//a[contains(text(),'佳洁士')]");
		webtest.click("xpath=//a[contains(text(),'手机配件')]");
		webtest.click("xpath=//a[contains(text(),'1000-1500')]");
	}
	
	@Test(priority = 16)
	public void test16() {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		webtest.click("xpath=//a[contains(text(),'佳洁士')]");
		webtest.click("xpath=//a[contains(text(),'手机配件')]");
		webtest.click("xpath=//a[contains(text(),'1500-2000')]");
	}
	
	@Test(priority = 17)
	public void test17() {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		webtest.click("xpath=//a[contains(text(),'佳洁士')]");
		webtest.click("xpath=//a[contains(text(),'手机配件')]");
		webtest.click("xpath=//a[contains(text(),'2000-3000')]");
	}
	
	@Test(priority = 18)
	public void test18() {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		webtest.click("xpath=//a[contains(text(),'佳洁士')]");
		webtest.click("xpath=//a[contains(text(),'手机配件')]");
		webtest.click("xpath=//a[contains(text(),'3000-5000')]");
	}
	
	@Test(priority = 19)
	public void test19() {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		webtest.click("xpath=//a[contains(text(),'佳洁士')]");
		webtest.click("xpath=//a[contains(text(),'手机配件')]");
		webtest.click("xpath=//a[contains(text(),'5000-8000')]");
	}
	
	@Test(priority = 20)
	public void test20() {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		webtest.click("xpath=//a[contains(text(),'佳洁士')]");
		webtest.click("xpath=//a[contains(text(),'手机配件')]");
		webtest.click("xpath=//a[contains(text(),'8000-12000')]");
	}
	
	@Test(priority = 21)
	public void test22() {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		webtest.click("xpath=//a[contains(text(),'佳洁士')]");
		webtest.click("xpath=//a[contains(text(),'手机配件')]");
		webtest.click("xpath=//a[contains(text(),'12000-16000')]");
	}
	
	@Test(priority = 23)
	public void test23() {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		webtest.click("xpath=//a[contains(text(),'佳洁士')]");
		webtest.click("xpath=//a[contains(text(),'手机配件')]");
		webtest.click("xpath=//a[contains(text(),'16000-20000')]");
	}
	
	@Test(priority = 24)
	public void test24() {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		webtest.click("xpath=//a[contains(text(),'佳洁士')]");
		webtest.click("xpath=//a[contains(text(),'手机配件')]");
		webtest.click("xpath=//a[contains(text(),'20000以上')]");
	}
	
	@Test(priority = 25)
	public void test25() {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		webtest.click("xpath=//a[contains(text(),'强生')]");
		webtest.click("xpath=//a[contains(text(),'手机通讯')]");
		webtest.click("xpath=//a[contains(text(),'100-300')]");
	}
	
	@Test(priority = 26)
	public void test26() {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		webtest.click("xpath=//a[contains(text(),'强生')]");
		webtest.click("xpath=//a[contains(text(),'手机通讯')]");
		webtest.click("xpath=//a[contains(text(),'300-600')]");
	}
	
	@Test(priority = 27)
	public void test27() {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		webtest.click("xpath=//a[contains(text(),'强生')]");
		webtest.click("xpath=//a[contains(text(),'手机通讯')]");
		webtest.click("xpath=//a[contains(text(),'600-1000')]");
	}
	
	@Test(priority = 28)
	public void test28() {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		webtest.click("xpath=//a[contains(text(),'强生')]");
		webtest.click("xpath=//a[contains(text(),'手机通讯')]");
		webtest.click("xpath=//a[contains(text(),'1000-1500')]");
	}
	
	@Test(priority = 29)
	public void test29() {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		webtest.click("xpath=//a[contains(text(),'强生')]");
		webtest.click("xpath=//a[contains(text(),'手机通讯')]");
		webtest.click("xpath=//a[contains(text(),'1500-2000')]");
	}
	
	@Test(priority = 30)
	public void test30() {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		webtest.click("xpath=//a[contains(text(),'强生')]");
		webtest.click("xpath=//a[contains(text(),'手机通讯')]");
		webtest.click("xpath=//a[contains(text(),'2000-3000')]");
	}
	
	@Test(priority = 31)
	public void test31() {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		webtest.click("xpath=//a[contains(text(),'强生')]");
		webtest.click("xpath=//a[contains(text(),'手机通讯')]");
		webtest.click("xpath=//a[contains(text(),'3000-5000')]");
	}
	
	@Test(priority = 32)
	public void test32() {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		webtest.click("xpath=//a[contains(text(),'强生')]");
		webtest.click("xpath=//a[contains(text(),'手机通讯')]");
		webtest.click("xpath=//a[contains(text(),'5000-8000')]");
	}
	
	@Test(priority = 33)
	public void test33() {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		webtest.click("xpath=//a[contains(text(),'强生')]");
		webtest.click("xpath=//a[contains(text(),'手机通讯')]");
		webtest.click("xpath=//a[contains(text(),'8000-12000')]");
	}
	
	@Test(priority = 34)
	public void test34() {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		webtest.click("xpath=//a[contains(text(),'强生')]");
		webtest.click("xpath=//a[contains(text(),'手机通讯')]");
		webtest.click("xpath=//a[contains(text(),'12000-16000')]");
	}
	
	@Test(priority = 35)
	public void test35() {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		webtest.click("xpath=//a[contains(text(),'强生')]");
		webtest.click("xpath=//a[contains(text(),'手机通讯')]");
		webtest.click("xpath=//a[contains(text(),'16000-20000')]");
	}
	
	@Test(priority = 36)
	public void test36() {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		webtest.click("xpath=//a[contains(text(),'强生')]");
		webtest.click("xpath=//a[contains(text(),'手机通讯')]");
		webtest.click("xpath=//a[contains(text(),'20000以上')]");
	}
	
	@Test(priority = 37)
	public void test37() {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		webtest.click("xpath=//a[contains(text(),'佳洁士')]");
		webtest.click("xpath=//a[contains(text(),'手机通讯')]");
		webtest.click("xpath=//a[contains(text(),'100以下')]");
	}
	
	@Test(priority = 38)
	public void test38() {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		webtest.click("xpath=//a[contains(text(),'佳洁士')]");
		webtest.click("xpath=//a[contains(text(),'手机通讯')]");
		webtest.click("xpath=//a[contains(text(),'100-300')]");
	}
	
	@Test(priority = 39)
	public void test39() {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		webtest.click("xpath=//a[contains(text(),'佳洁士')]");
		webtest.click("xpath=//a[contains(text(),'手机通讯')]");
		webtest.click("xpath=//a[contains(text(),'300-600')]");
	}
	
	@Test(priority = 40)
	public void test40() {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		webtest.click("xpath=//a[contains(text(),'佳洁士')]");
		webtest.click("xpath=//a[contains(text(),'手机通讯')]");
		webtest.click("xpath=//a[contains(text(),'600-1000')]");
	}
	
	@Test(priority = 41)
	public void test41() {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		webtest.click("xpath=//a[contains(text(),'佳洁士')]");
		webtest.click("xpath=//a[contains(text(),'手机通讯')]");
		webtest.click("xpath=//a[contains(text(),'1000-1500')]");
	}
	
	@Test(priority = 42)
	public void test42() {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		webtest.click("xpath=//a[contains(text(),'佳洁士')]");
		webtest.click("xpath=//a[contains(text(),'手机通讯')]");
		webtest.click("xpath=//a[contains(text(),'1500-2000')]");
	}
	
	@Test(priority = 43)
	public void test43() {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		webtest.click("xpath=//a[contains(text(),'佳洁士')]");
		webtest.click("xpath=//a[contains(text(),'手机通讯')]");
		webtest.click("xpath=//a[contains(text(),'2000-3000')]");
	}
	
	@Test(priority = 44)
	public void test44() {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		webtest.click("xpath=//a[contains(text(),'佳洁士')]");
		webtest.click("xpath=//a[contains(text(),'手机通讯')]");
		webtest.click("xpath=//a[contains(text(),'3000-5000')]");
	}
	
	@Test(priority = 45)
	public void test45() {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		webtest.click("xpath=//a[contains(text(),'佳洁士')]");
		webtest.click("xpath=//a[contains(text(),'手机通讯')]");
		webtest.click("xpath=//a[contains(text(),'5000-8000')]");
	}
	
	@Test(priority = 96)
	public void test46() {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		webtest.click("xpath=//a[contains(text(),'佳洁士')]");
		webtest.click("xpath=//a[contains(text(),'手机通讯')]");
		webtest.click("xpath=//a[contains(text(),'8000-12000')]");
	}
	
	@Test(priority = 47)
	public void test47() {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		webtest.click("xpath=//a[contains(text(),'佳洁士')]");
		webtest.click("xpath=//a[contains(text(),'手机通讯')]");
		webtest.click("xpath=//a[contains(text(),'12000-16000')]");
	}
	
	@Test(priority = 48)
	public void test48() {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		webtest.click("xpath=//a[contains(text(),'佳洁士')]");
		webtest.click("xpath=//a[contains(text(),'手机通讯')]");
		webtest.click("xpath=//a[contains(text(),'16000-20000')]");
	}
	
	@Test(priority = 49)
	public void test49() {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		webtest.click("xpath=//a[contains(text(),'佳洁士')]");
		webtest.click("xpath=//a[contains(text(),'手机通讯')]");
		webtest.click("xpath=//a[contains(text(),'20000以上')]");
	}
	
	@Test(priority = 50)
	public void test50() {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		webtest.click("xpath=//a[contains(text(),'数码相机')]");
		webtest.click("xpath=//a[contains(text(),'摄影摄像')]");
		webtest.click("xpath=//a[contains(text(),'20000以上')]");
	}	

}
