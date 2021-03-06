package com.webtest.testCases;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class testCases extends BaseTest{
	
	@BeforeMethod
	public void test0(){
		webtest.open("http://localhost/");
		webtest.click("xpath=//a[@class='am-btn-primary btn am-fl']");
		webtest.type("name=accounts", "shengbin");
		webtest.type("name=pwd", "shengbin");
		webtest.type("name=verify", "1111");
		webtest.click("xpath=//button[@class='am-btn am-btn-primary am-radius am-btn-sm btn-loading-example']");
		}
	
	@Test(priority = 1)
	public void test1() throws InterruptedException {
		webtest.click("xpath=//a[contains(text(),'MARNI Trunk 女士 中号拼色十字纹小牛皮 斜挎风琴包')]");
		webtest.type("xpath = //*[@id=\"text_box\"]","0");
		webtest.click("xpath=//button[contains(text(),'立即购买')]");
		Thread.sleep(1000);
	}
	
	@Test(priority = 2)
	public void test2() throws InterruptedException {
		webtest.click("xpath=//a[contains(text(),'MARNI Trunk 女士 中号拼色十字纹小牛皮 斜挎风琴包')]");
		webtest.type("xpath = //*[@id=\"text_box\"]","1");
		webtest.click("xpath=//button[contains(text(),'立即购买')]");
		Thread.sleep(1000);
	}
	
	@Test(priority = 3)
	public void test3() throws InterruptedException {
		webtest.click("xpath=//a[contains(text(),'MARNI Trunk 女士 中号拼色十字纹小牛皮 斜挎风琴包')]");
		webtest.type("xpath = //*[@id=\"text_box\"]","2");
		webtest.click("xpath=//button[contains(text(),'立即购买')]");
		Thread.sleep(1000);
	}
	
	@Test(priority = 4)
	public void test4() throws InterruptedException {
		webtest.click("xpath=//a[contains(text(),'MARNI Trunk 女士 中号拼色十字纹小牛皮 斜挎风琴包')]");
		webtest.type("xpath = //*[@id=\"text_box\"]","3");
		webtest.click("xpath=//button[contains(text(),'立即购买')]");
		Thread.sleep(1000);
	}
	
	@Test(priority = 5)
	public void test5() throws InterruptedException {
		webtest.click("xpath=//a[contains(text(),'MARNI Trunk 女士 中号拼色十字纹小牛皮 斜挎风琴包')]");
		webtest.type("xpath = //*[@id=\"text_box\"]","4");
		webtest.click("xpath=//button[contains(text(),'立即购买')]");
		Thread.sleep(1000);
	}
	
	@Test(priority = 6)
	public void test6() throws InterruptedException {
		webtest.click("xpath=//a[contains(text(),'MARNI Trunk 女士 中号拼色十字纹小牛皮 斜挎风琴包')]");
		webtest.type("xpath = //*[@id=\"text_box\"]","0");
		webtest.click("xpath=//button[contains(text(),'加入购物车')]");
		Thread.sleep(1000);
	}
	
	@Test(priority = 7)
	public void test7() throws InterruptedException {
		webtest.click("xpath=//a[contains(text(),'MARNI Trunk 女士 中号拼色十字纹小牛皮 斜挎风琴包')]");
		webtest.type("xpath = //*[@id=\"text_box\"]","1");
		webtest.click("xpath=//button[contains(text(),'加入购物车')]");
		Thread.sleep(1000);
	}
	
	@Test(priority = 8)
	public void test8() throws InterruptedException {
		webtest.click("xpath=//a[contains(text(),'MARNI Trunk 女士 中号拼色十字纹小牛皮 斜挎风琴包')]");
		webtest.type("xpath = //*[@id=\"text_box\"]","2");
		webtest.click("xpath=//button[contains(text(),'加入购物车')]");
		Thread.sleep(1000);
	}
	
	@Test(priority = 9)
	public void test9() throws InterruptedException {
		webtest.click("xpath=//a[contains(text(),'MARNI Trunk 女士 中号拼色十字纹小牛皮 斜挎风琴包')]");
		webtest.type("xpath = //*[@id=\"text_box\"]","3");
		webtest.click("xpath=//button[contains(text(),'加入购物车')]");
		Thread.sleep(1000);
	}
	
	@Test(priority = 10)
	public void test10() throws InterruptedException {
		webtest.click("xpath=//a[contains(text(),'MARNI Trunk 女士 中号拼色十字纹小牛皮 斜挎风琴包')]");
		webtest.type("xpath = //*[@id=\"text_box\"]","4");
		webtest.click("xpath=//button[contains(text(),'加入购物车')]");
		Thread.sleep(1000);
	}
    
	@Test(priority = 11)
	public void test11() throws InterruptedException {
		webtest.click("xpath=//a[contains(text(),'纽芝兰包包女士2018新款潮百搭韩版时尚单肩斜挎包少女小挎包链条')]");
		webtest.type("xpath = //*[@id=\"text_box\"]","0");
		webtest.click("xpath=//button[contains(text(),'立即购买')]");
		Thread.sleep(1000);
	}
	
	@Test(priority = 12)
	public void test12() throws InterruptedException {
		webtest.click("xpath=//a[contains(text(),'纽芝兰包包女士2018新款潮百搭韩版时尚单肩斜挎包少女小挎包链条')]");
		webtest.type("xpath = //*[@id=\"text_box\"]","1");
		webtest.click("xpath=//button[contains(text(),'立即购买')]");
		Thread.sleep(1000);
	}
	
	@Test(priority = 13)
	public void test13() throws InterruptedException {
		webtest.click("xpath=//a[contains(text(),'纽芝兰包包女士2018新款潮百搭韩版时尚单肩斜挎包少女小挎包链条')]");
		webtest.type("xpath = //*[@id=\"text_box\"]","10");
		webtest.click("xpath=//button[contains(text(),'立即购买')]");
		Thread.sleep(1000);
	}
	
	@Test(priority = 14)
	public void test14() throws InterruptedException {
		webtest.click("xpath=//a[contains(text(),'纽芝兰包包女士2018新款潮百搭韩版时尚单肩斜挎包少女小挎包链条')]");
		webtest.type("xpath = //*[@id=\"text_box\"]","11");
		webtest.click("xpath=//button[contains(text(),'立即购买')]");
		Thread.sleep(1000);
	}
	
	@Test(priority = 15)
	public void test15() throws InterruptedException {
		webtest.click("xpath=//a[contains(text(),'纽芝兰包包女士2018新款潮百搭韩版时尚单肩斜挎包少女小挎包链条')]");
		webtest.type("xpath = //*[@id=\"text_box\"]","12");
		webtest.click("xpath=//button[contains(text(),'立即购买')]");
		Thread.sleep(1000);
	}
	
	@Test(priority = 16)
	public void test16() throws InterruptedException {
		webtest.click("xpath=//a[contains(text(),'纽芝兰包包女士2018新款潮百搭韩版时尚单肩斜挎包少女小挎包链条')]");
		webtest.type("xpath = //*[@id=\"text_box\"]","0");
		webtest.click("xpath=//button[contains(text(),'加入购物车')]");
		Thread.sleep(1000);
	}
	
	@Test(priority = 17)
	public void test17() throws InterruptedException {
		webtest.click("xpath=//a[contains(text(),'纽芝兰包包女士2018新款潮百搭韩版时尚单肩斜挎包少女小挎包链条')]");
		webtest.type("xpath = //*[@id=\"text_box\"]","1");
		webtest.click("xpath=//button[contains(text(),'加入购物车')]");
		Thread.sleep(1000);
	}
	
	@Test(priority = 18)
	public void test18() throws InterruptedException {
		webtest.click("xpath=//a[contains(text(),'纽芝兰包包女士2018新款潮百搭韩版时尚单肩斜挎包少女小挎包链条')]");
		webtest.type("xpath = //*[@id=\"text_box\"]","10");
		webtest.click("xpath=//button[contains(text(),'加入购物车')]");
		Thread.sleep(1000);
	}
	
	@Test(priority = 19)
	public void test19() throws InterruptedException {
		webtest.click("xpath=//a[contains(text(),'纽芝兰包包女士2018新款潮百搭韩版时尚单肩斜挎包少女小挎包链条')]");
		webtest.type("xpath = //*[@id=\"text_box\"]","11");
		webtest.click("xpath=//button[contains(text(),'加入购物车')]");
		Thread.sleep(1000);
	}
	
	@Test(priority = 20)
	public void test20() throws InterruptedException {
		webtest.click("xpath=//a[contains(text(),'纽芝兰包包女士2018新款潮百搭韩版时尚单肩斜挎包少女小挎包链条')]");
		webtest.type("xpath = //*[@id=\"text_box\"]","12");
		webtest.click("xpath=//button[contains(text(),'加入购物车')]");
		Thread.sleep(1000);
	}
	@Test(priority = 21)
	public void test21() throws InterruptedException {
		webtest.click("xpath=//a[contains(text(),'vivo X5MAX L 移动4G 八核超薄大屏5.5吋双卡手机vivoX5max')]");
		Thread.sleep(1000);
	}
	
	@Test(priority = 22)
	public void test22() throws InterruptedException {
		webtest.click("xpath=//a[contains(text(),'Meizu/魅族 MX4 Pro移动版 八核大屏智能手机 黑色 16G')]");
		Thread.sleep(1000);
	}
	
	@Test(priority = 23)
	public void test23() throws InterruptedException {
		webtest.click("xpath=//a[contains(text(),'Huawei/华为 H60-L01 荣耀6 移动4G版智能手机 安卓')]");
		Thread.sleep(1000);
	}
	
	@Test(priority = 24)
	public void test24() throws InterruptedException {
		webtest.click("xpath=//a[contains(text(),'Samsung/三星 SM-G8508S GALAXY Alpha四核智能手机 新品 闪耀白')]");
		Thread.sleep(1000);
	}
	
	@Test(priority = 25)
	public void test25() throws InterruptedException {
		webtest.click("xpath=//a[contains(text(),'夏季复古ins风格网红SP同款 短袖大圆领香槟色蕾丝绣花钉珠连衣裙')]");
		Thread.sleep(1000);
	}
	
	@Test(priority = 26)
	public void test26() throws InterruptedException {
		webtest.click("xpath=//a[contains(text(),'睡衣女长袖春秋季纯棉韩版女士大码薄款春夏季全棉家居服两件套装')]");
		Thread.sleep(1000);
	}
	
	@Test(priority = 27)
	public void test27() {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		webtest.click("xpath=//a[contains(text(),'强生')]");
		webtest.click("xpath=//a[contains(text(),'手机通讯')]");
		webtest.click("xpath=//a[contains(text(),'100以下')]");
	}
	
	@Test(priority = 28)
	public void test28() {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		webtest.click("xpath=//a[contains(text(),'不限')]");
		webtest.click("xpath=//a[contains(text(),'不限')]");
		webtest.click("xpath=//a[contains(text(),'不限')]");
	}
	
	@Test(priority = 29)
	public void test29() {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		webtest.click("xpath=//a[contains(text(),'佳洁士')]");
		webtest.click("xpath=//a[contains(text(),'手机配件')]");
		webtest.click("xpath=//a[contains(text(),'100-300')]");
	}
	
	@Test(priority = 30)
	public void test30() {
		webtest.click("xpath = //span[contains(text(),'数码办公')]");
		webtest.click("xpath=//a[contains(text(),'不限')]");
		webtest.click("xpath=//a[contains(text(),'办公打印')]");
		webtest.click("xpath=//a[contains(text(),'100以下')]");
	}
	
	@Test(priority = 31)
	public void test31() {
		webtest.click("xpath = //span[contains(text(),'服饰鞋包')]");
		webtest.click("xpath=//a[contains(text(),'强生')]");
		webtest.click("xpath=//a[contains(text(),'女装')]");
		webtest.click("xpath=//a[contains(text(),'100以下')]");
	}
	
	@Test(priority = 32)
	public void test32() {
		webtest.click("xpath = //span[contains(text(),'服饰鞋包')]");
		webtest.click("xpath=//a[contains(text(),'不限')]");
		webtest.click("xpath=//a[contains(text(),'不限')]");
		webtest.click("xpath=//a[contains(text(),'不限')]");
	}
	
	@Test(priority = 33)
	public void test33() {
		webtest.click("xpath = //span[contains(text(),'服饰鞋包')]");
		webtest.click("xpath=//a[contains(text(),'佳洁士')]");
		webtest.click("xpath=//a[contains(text(),'女装')]");
		webtest.click("xpath=//a[contains(text(),'100-300')]");
	}
	
	@Test(priority = 34)
	public void test34() {
		webtest.click("xpath = //span[contains(text(),'服饰鞋包')]");
		webtest.click("xpath=//a[contains(text(),'强生')]");
		webtest.click("xpath=//a[contains(text(),'内衣')]");
		webtest.click("xpath=//a[contains(text(),'100以下')]");
	}
	
	@Test(priority = 35)
	public void test35() {
		webtest.click("xpath = //span[contains(text(),'服饰鞋包')]");
		webtest.click("xpath=//a[contains(text(),'不限')]");
		webtest.click("xpath=//a[contains(text(),'运动')]");
		webtest.click("xpath=//a[contains(text(),'600-1000')]");
	}
	
	@Test(priority = 36)
	public void test36() {
		webtest.click("xpath = //span[contains(text(),'食品饮料')]");
		webtest.click("xpath=//a[contains(text(),'不限')]");
		webtest.click("xpath=//a[contains(text(),'进口食品')]");
		webtest.click("xpath=//a[contains(text(),'100以下')]");
	}
	
	@Test(priority = 37)
	public void test37() {
		webtest.click("xpath = //span[contains(text(),'食品饮料')]");
		webtest.click("xpath=//a[contains(text(),'不限')]");
		webtest.click("xpath=//a[contains(text(),'不限')]");
		webtest.click("xpath=//a[contains(text(),'不限')]");
	}
	
	@Test(priority = 38)
	public void test38() {
		webtest.click("xpath = //span[contains(text(),'食品饮料')]");
		webtest.click("xpath=//a[contains(text(),'不限')]");
		webtest.click("xpath=//a[contains(text(),'地方特产')]");
		webtest.click("xpath=//a[contains(text(),'100-300')]");
	}
	
	@Test(priority = 39)
	public void test39() {
		webtest.click("xpath = //span[contains(text(),'食品饮料')]");
		webtest.click("xpath=//a[contains(text(),'不限')]");
		webtest.click("xpath=//a[contains(text(),'休闲食品')]");
		webtest.click("xpath=//a[contains(text(),'300-600')]");
	}
	
	@Test(priority = 40)
	public void test40() {
		webtest.click("xpath = //span[contains(text(),'食品饮料')]");
		webtest.click("xpath=//a[contains(text(),'不限')]");
		webtest.click("xpath=//a[contains(text(),'粮油调味')]");
		webtest.click("xpath=//a[contains(text(),'600-1000')]");
	}
	
	@Test(priority = 41)
	public void test41() {
		webtest.click("xpath = //span[contains(text(),'个护化妆')]");
		webtest.click("xpath=//a[contains(text(),'不限')]");
		webtest.click("xpath=//a[contains(text(),'面部护理')]");
		webtest.click("xpath=//a[contains(text(),'100以下')]");
	}
	
	@Test(priority = 42)
	public void test42() {
		webtest.click("xpath = //span[contains(text(),'个护化妆')]");
		webtest.click("xpath=//a[contains(text(),'不限')]");
		webtest.click("xpath=//a[contains(text(),'不限')]");
		webtest.click("xpath=//a[contains(text(),'不限')]");
	}
	
	@Test(priority = 43)
	public void test43() {
		webtest.click("xpath = //span[contains(text(),'个护化妆')]");
		webtest.click("xpath=//a[contains(text(),'不限')]");
		webtest.click("xpath=//a[contains(text(),'身体护理')]");
		webtest.click("xpath=//a[contains(text(),'100-300')]");
	}
	
	@Test(priority = 44)
	public void test44() {
		webtest.click("xpath = //span[contains(text(),'个护化妆')]");
		webtest.click("xpath=//a[contains(text(),'不限')]");
		webtest.click("xpath=//a[contains(text(),'口腔护理')]");
		webtest.click("xpath=//a[contains(text(),'300-600')]");
	}
	
	@Test(priority = 45)
	public void test45() {
		webtest.click("xpath = //span[contains(text(),'个护化妆')]");
		webtest.click("xpath=//a[contains(text(),'不限')]");
		webtest.click("xpath=//a[contains(text(),'女性护理')]");
		webtest.click("xpath=//a[contains(text(),'600-1000')]");
	}
	
	@Test(priority = 46)
	public void test46() {
		webtest.click("xpath = //span[contains(text(),'珠宝手表')]");
		webtest.click("xpath=//a[contains(text(),'不限')]");
		webtest.click("xpath=//a[contains(text(),'纯金K金饰品')]");
		webtest.click("xpath=//a[contains(text(),'100以下')]");
	}
	
	@Test(priority = 47)
	public void test47() {
		webtest.click("xpath = //span[contains(text(),'珠宝手表')]");
		webtest.click("xpath=//a[contains(text(),'不限')]");
		webtest.click("xpath=//a[contains(text(),'不限')]");
		webtest.click("xpath=//a[contains(text(),'不限')]");
	}
	
	@Test(priority = 48)
	public void test48() {
		webtest.click("xpath = //span[contains(text(),'珠宝手表')]");
		webtest.click("xpath=//a[contains(text(),'不限')]");
		webtest.click("xpath=//a[contains(text(),'金银投资')]");
		webtest.click("xpath=//a[contains(text(),'100-300')]");
	}
	
	@Test(priority = 49)
	public void test49() {
		webtest.click("xpath = //span[contains(text(),'珠宝手表')]");
		webtest.click("xpath=//a[contains(text(),'不限')]");
		webtest.click("xpath=//a[contains(text(),'银饰')]");
		webtest.click("xpath=//a[contains(text(),'300-600')]");
	}
	
	@Test(priority = 50)
	public void test50() {
		webtest.click("xpath = //span[contains(text(),'珠宝手表')]");
		webtest.click("xpath=//a[contains(text(),'不限')]");
		webtest.click("xpath=//a[contains(text(),'钻石饰品')]");
		webtest.click("xpath=//a[contains(text(),'600-1000')]");
	}
	
}
