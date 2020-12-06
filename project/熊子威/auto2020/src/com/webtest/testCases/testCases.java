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
		webtest.click("xpath=//a[contains(text(),'MARNI Trunk Ůʿ �к�ƴɫʮ����СţƤ б����ٰ�')]");
		webtest.type("xpath = //*[@id=\"text_box\"]","0");
		webtest.click("xpath=//button[contains(text(),'��������')]");
		Thread.sleep(1000);
	}
	
	@Test(priority = 2)
	public void test2() throws InterruptedException {
		webtest.click("xpath=//a[contains(text(),'MARNI Trunk Ůʿ �к�ƴɫʮ����СţƤ б����ٰ�')]");
		webtest.type("xpath = //*[@id=\"text_box\"]","1");
		webtest.click("xpath=//button[contains(text(),'��������')]");
		Thread.sleep(1000);
	}
	
	@Test(priority = 3)
	public void test3() throws InterruptedException {
		webtest.click("xpath=//a[contains(text(),'MARNI Trunk Ůʿ �к�ƴɫʮ����СţƤ б����ٰ�')]");
		webtest.type("xpath = //*[@id=\"text_box\"]","2");
		webtest.click("xpath=//button[contains(text(),'��������')]");
		Thread.sleep(1000);
	}
	
	@Test(priority = 4)
	public void test4() throws InterruptedException {
		webtest.click("xpath=//a[contains(text(),'MARNI Trunk Ůʿ �к�ƴɫʮ����СţƤ б����ٰ�')]");
		webtest.type("xpath = //*[@id=\"text_box\"]","3");
		webtest.click("xpath=//button[contains(text(),'��������')]");
		Thread.sleep(1000);
	}
	
	@Test(priority = 5)
	public void test5() throws InterruptedException {
		webtest.click("xpath=//a[contains(text(),'MARNI Trunk Ůʿ �к�ƴɫʮ����СţƤ б����ٰ�')]");
		webtest.type("xpath = //*[@id=\"text_box\"]","4");
		webtest.click("xpath=//button[contains(text(),'��������')]");
		Thread.sleep(1000);
	}
	
	@Test(priority = 6)
	public void test6() throws InterruptedException {
		webtest.click("xpath=//a[contains(text(),'MARNI Trunk Ůʿ �к�ƴɫʮ����СţƤ б����ٰ�')]");
		webtest.type("xpath = //*[@id=\"text_box\"]","0");
		webtest.click("xpath=//button[contains(text(),'���빺�ﳵ')]");
		Thread.sleep(1000);
	}
	
	@Test(priority = 7)
	public void test7() throws InterruptedException {
		webtest.click("xpath=//a[contains(text(),'MARNI Trunk Ůʿ �к�ƴɫʮ����СţƤ б����ٰ�')]");
		webtest.type("xpath = //*[@id=\"text_box\"]","1");
		webtest.click("xpath=//button[contains(text(),'���빺�ﳵ')]");
		Thread.sleep(1000);
	}
	
	@Test(priority = 8)
	public void test8() throws InterruptedException {
		webtest.click("xpath=//a[contains(text(),'MARNI Trunk Ůʿ �к�ƴɫʮ����СţƤ б����ٰ�')]");
		webtest.type("xpath = //*[@id=\"text_box\"]","2");
		webtest.click("xpath=//button[contains(text(),'���빺�ﳵ')]");
		Thread.sleep(1000);
	}
	
	@Test(priority = 9)
	public void test9() throws InterruptedException {
		webtest.click("xpath=//a[contains(text(),'MARNI Trunk Ůʿ �к�ƴɫʮ����СţƤ б����ٰ�')]");
		webtest.type("xpath = //*[@id=\"text_box\"]","3");
		webtest.click("xpath=//button[contains(text(),'���빺�ﳵ')]");
		Thread.sleep(1000);
	}
	
	@Test(priority = 10)
	public void test10() throws InterruptedException {
		webtest.click("xpath=//a[contains(text(),'MARNI Trunk Ůʿ �к�ƴɫʮ����СţƤ б����ٰ�')]");
		webtest.type("xpath = //*[@id=\"text_box\"]","4");
		webtest.click("xpath=//button[contains(text(),'���빺�ﳵ')]");
		Thread.sleep(1000);
	}
    
	@Test(priority = 11)
	public void test11() throws InterruptedException {
		webtest.click("xpath=//a[contains(text(),'Ŧ֥������Ůʿ2018�¿�ٴ��ʱ�е���б�����ŮС�������')]");
		webtest.type("xpath = //*[@id=\"text_box\"]","0");
		webtest.click("xpath=//button[contains(text(),'��������')]");
		Thread.sleep(1000);
	}
	
	@Test(priority = 12)
	public void test12() throws InterruptedException {
		webtest.click("xpath=//a[contains(text(),'Ŧ֥������Ůʿ2018�¿�ٴ��ʱ�е���б�����ŮС�������')]");
		webtest.type("xpath = //*[@id=\"text_box\"]","1");
		webtest.click("xpath=//button[contains(text(),'��������')]");
		Thread.sleep(1000);
	}
	
	@Test(priority = 13)
	public void test13() throws InterruptedException {
		webtest.click("xpath=//a[contains(text(),'Ŧ֥������Ůʿ2018�¿�ٴ��ʱ�е���б�����ŮС�������')]");
		webtest.type("xpath = //*[@id=\"text_box\"]","10");
		webtest.click("xpath=//button[contains(text(),'��������')]");
		Thread.sleep(1000);
	}
	
	@Test(priority = 14)
	public void test14() throws InterruptedException {
		webtest.click("xpath=//a[contains(text(),'Ŧ֥������Ůʿ2018�¿�ٴ��ʱ�е���б�����ŮС�������')]");
		webtest.type("xpath = //*[@id=\"text_box\"]","11");
		webtest.click("xpath=//button[contains(text(),'��������')]");
		Thread.sleep(1000);
	}
	
	@Test(priority = 15)
	public void test15() throws InterruptedException {
		webtest.click("xpath=//a[contains(text(),'Ŧ֥������Ůʿ2018�¿�ٴ��ʱ�е���б�����ŮС�������')]");
		webtest.type("xpath = //*[@id=\"text_box\"]","12");
		webtest.click("xpath=//button[contains(text(),'��������')]");
		Thread.sleep(1000);
	}
	
	@Test(priority = 16)
	public void test16() throws InterruptedException {
		webtest.click("xpath=//a[contains(text(),'Ŧ֥������Ůʿ2018�¿�ٴ��ʱ�е���б�����ŮС�������')]");
		webtest.type("xpath = //*[@id=\"text_box\"]","0");
		webtest.click("xpath=//button[contains(text(),'���빺�ﳵ')]");
		Thread.sleep(1000);
	}
	
	@Test(priority = 17)
	public void test17() throws InterruptedException {
		webtest.click("xpath=//a[contains(text(),'Ŧ֥������Ůʿ2018�¿�ٴ��ʱ�е���б�����ŮС�������')]");
		webtest.type("xpath = //*[@id=\"text_box\"]","1");
		webtest.click("xpath=//button[contains(text(),'���빺�ﳵ')]");
		Thread.sleep(1000);
	}
	
	@Test(priority = 18)
	public void test18() throws InterruptedException {
		webtest.click("xpath=//a[contains(text(),'Ŧ֥������Ůʿ2018�¿�ٴ��ʱ�е���б�����ŮС�������')]");
		webtest.type("xpath = //*[@id=\"text_box\"]","10");
		webtest.click("xpath=//button[contains(text(),'���빺�ﳵ')]");
		Thread.sleep(1000);
	}
	
	@Test(priority = 19)
	public void test19() throws InterruptedException {
		webtest.click("xpath=//a[contains(text(),'Ŧ֥������Ůʿ2018�¿�ٴ��ʱ�е���б�����ŮС�������')]");
		webtest.type("xpath = //*[@id=\"text_box\"]","11");
		webtest.click("xpath=//button[contains(text(),'���빺�ﳵ')]");
		Thread.sleep(1000);
	}
	
	@Test(priority = 20)
	public void test20() throws InterruptedException {
		webtest.click("xpath=//a[contains(text(),'Ŧ֥������Ůʿ2018�¿�ٴ��ʱ�е���б�����ŮС�������')]");
		webtest.type("xpath = //*[@id=\"text_box\"]","12");
		webtest.click("xpath=//button[contains(text(),'���빺�ﳵ')]");
		Thread.sleep(1000);
	}
	@Test(priority = 21)
	public void test21() throws InterruptedException {
		webtest.click("xpath=//a[contains(text(),'vivo X5MAX L �ƶ�4G �˺˳�������5.5��˫���ֻ�vivoX5max')]");
		Thread.sleep(1000);
	}
	
	@Test(priority = 22)
	public void test22() throws InterruptedException {
		webtest.click("xpath=//a[contains(text(),'Meizu/���� MX4 Pro�ƶ��� �˺˴��������ֻ� ��ɫ 16G')]");
		Thread.sleep(1000);
	}
	
	@Test(priority = 23)
	public void test23() throws InterruptedException {
		webtest.click("xpath=//a[contains(text(),'Huawei/��Ϊ H60-L01 ��ҫ6 �ƶ�4G�������ֻ� ��׿')]");
		Thread.sleep(1000);
	}
	
	@Test(priority = 24)
	public void test24() throws InterruptedException {
		webtest.click("xpath=//a[contains(text(),'Samsung/���� SM-G8508S GALAXY Alpha�ĺ������ֻ� ��Ʒ ��ҫ��')]");
		Thread.sleep(1000);
	}
	
	@Test(priority = 25)
	public void test25() throws InterruptedException {
		webtest.click("xpath=//a[contains(text(),'�ļ�����ins�������SPͬ�� �����Բ������ɫ��˿�廨��������ȹ')]");
		Thread.sleep(1000);
	}
	
	@Test(priority = 26)
	public void test26() throws InterruptedException {
		webtest.click("xpath=//a[contains(text(),'˯��Ů���䴺�＾���޺���Ůʿ���뱡��ļ�ȫ�޼Ҿӷ�������װ')]");
		Thread.sleep(1000);
	}
	
	@Test(priority = 27)
	public void test27() {
		webtest.click("xpath = //span[contains(text(),'����칫')]");
		webtest.click("xpath=//a[contains(text(),'ǿ��')]");
		webtest.click("xpath=//a[contains(text(),'�ֻ�ͨѶ')]");
		webtest.click("xpath=//a[contains(text(),'100����')]");
	}
	
	@Test(priority = 28)
	public void test28() {
		webtest.click("xpath = //span[contains(text(),'����칫')]");
		webtest.click("xpath=//a[contains(text(),'����')]");
		webtest.click("xpath=//a[contains(text(),'����')]");
		webtest.click("xpath=//a[contains(text(),'����')]");
	}
	
	@Test(priority = 29)
	public void test29() {
		webtest.click("xpath = //span[contains(text(),'����칫')]");
		webtest.click("xpath=//a[contains(text(),'�ѽ�ʿ')]");
		webtest.click("xpath=//a[contains(text(),'�ֻ����')]");
		webtest.click("xpath=//a[contains(text(),'100-300')]");
	}
	
	@Test(priority = 30)
	public void test30() {
		webtest.click("xpath = //span[contains(text(),'����칫')]");
		webtest.click("xpath=//a[contains(text(),'����')]");
		webtest.click("xpath=//a[contains(text(),'�칫��ӡ')]");
		webtest.click("xpath=//a[contains(text(),'100����')]");
	}
	
	@Test(priority = 31)
	public void test31() {
		webtest.click("xpath = //span[contains(text(),'����Ь��')]");
		webtest.click("xpath=//a[contains(text(),'ǿ��')]");
		webtest.click("xpath=//a[contains(text(),'Ůװ')]");
		webtest.click("xpath=//a[contains(text(),'100����')]");
	}
	
	@Test(priority = 32)
	public void test32() {
		webtest.click("xpath = //span[contains(text(),'����Ь��')]");
		webtest.click("xpath=//a[contains(text(),'����')]");
		webtest.click("xpath=//a[contains(text(),'����')]");
		webtest.click("xpath=//a[contains(text(),'����')]");
	}
	
	@Test(priority = 33)
	public void test33() {
		webtest.click("xpath = //span[contains(text(),'����Ь��')]");
		webtest.click("xpath=//a[contains(text(),'�ѽ�ʿ')]");
		webtest.click("xpath=//a[contains(text(),'Ůװ')]");
		webtest.click("xpath=//a[contains(text(),'100-300')]");
	}
	
	@Test(priority = 34)
	public void test34() {
		webtest.click("xpath = //span[contains(text(),'����Ь��')]");
		webtest.click("xpath=//a[contains(text(),'ǿ��')]");
		webtest.click("xpath=//a[contains(text(),'����')]");
		webtest.click("xpath=//a[contains(text(),'100����')]");
	}
	
	@Test(priority = 35)
	public void test35() {
		webtest.click("xpath = //span[contains(text(),'����Ь��')]");
		webtest.click("xpath=//a[contains(text(),'����')]");
		webtest.click("xpath=//a[contains(text(),'�˶�')]");
		webtest.click("xpath=//a[contains(text(),'600-1000')]");
	}
	
	@Test(priority = 36)
	public void test36() {
		webtest.click("xpath = //span[contains(text(),'ʳƷ����')]");
		webtest.click("xpath=//a[contains(text(),'����')]");
		webtest.click("xpath=//a[contains(text(),'����ʳƷ')]");
		webtest.click("xpath=//a[contains(text(),'100����')]");
	}
	
	@Test(priority = 37)
	public void test37() {
		webtest.click("xpath = //span[contains(text(),'ʳƷ����')]");
		webtest.click("xpath=//a[contains(text(),'����')]");
		webtest.click("xpath=//a[contains(text(),'����')]");
		webtest.click("xpath=//a[contains(text(),'����')]");
	}
	
	@Test(priority = 38)
	public void test38() {
		webtest.click("xpath = //span[contains(text(),'ʳƷ����')]");
		webtest.click("xpath=//a[contains(text(),'����')]");
		webtest.click("xpath=//a[contains(text(),'�ط��ز�')]");
		webtest.click("xpath=//a[contains(text(),'100-300')]");
	}
	
	@Test(priority = 39)
	public void test39() {
		webtest.click("xpath = //span[contains(text(),'ʳƷ����')]");
		webtest.click("xpath=//a[contains(text(),'����')]");
		webtest.click("xpath=//a[contains(text(),'����ʳƷ')]");
		webtest.click("xpath=//a[contains(text(),'300-600')]");
	}
	
	@Test(priority = 40)
	public void test40() {
		webtest.click("xpath = //span[contains(text(),'ʳƷ����')]");
		webtest.click("xpath=//a[contains(text(),'����')]");
		webtest.click("xpath=//a[contains(text(),'���͵�ζ')]");
		webtest.click("xpath=//a[contains(text(),'600-1000')]");
	}
	
	@Test(priority = 41)
	public void test41() {
		webtest.click("xpath = //span[contains(text(),'������ױ')]");
		webtest.click("xpath=//a[contains(text(),'����')]");
		webtest.click("xpath=//a[contains(text(),'�沿����')]");
		webtest.click("xpath=//a[contains(text(),'100����')]");
	}
	
	@Test(priority = 42)
	public void test42() {
		webtest.click("xpath = //span[contains(text(),'������ױ')]");
		webtest.click("xpath=//a[contains(text(),'����')]");
		webtest.click("xpath=//a[contains(text(),'����')]");
		webtest.click("xpath=//a[contains(text(),'����')]");
	}
	
	@Test(priority = 43)
	public void test43() {
		webtest.click("xpath = //span[contains(text(),'������ױ')]");
		webtest.click("xpath=//a[contains(text(),'����')]");
		webtest.click("xpath=//a[contains(text(),'���廤��')]");
		webtest.click("xpath=//a[contains(text(),'100-300')]");
	}
	
	@Test(priority = 44)
	public void test44() {
		webtest.click("xpath = //span[contains(text(),'������ױ')]");
		webtest.click("xpath=//a[contains(text(),'����')]");
		webtest.click("xpath=//a[contains(text(),'��ǻ����')]");
		webtest.click("xpath=//a[contains(text(),'300-600')]");
	}
	
	@Test(priority = 45)
	public void test45() {
		webtest.click("xpath = //span[contains(text(),'������ױ')]");
		webtest.click("xpath=//a[contains(text(),'����')]");
		webtest.click("xpath=//a[contains(text(),'Ů�Ի���')]");
		webtest.click("xpath=//a[contains(text(),'600-1000')]");
	}
	
	@Test(priority = 46)
	public void test46() {
		webtest.click("xpath = //span[contains(text(),'�鱦�ֱ�')]");
		webtest.click("xpath=//a[contains(text(),'����')]");
		webtest.click("xpath=//a[contains(text(),'����K����Ʒ')]");
		webtest.click("xpath=//a[contains(text(),'100����')]");
	}
	
	@Test(priority = 47)
	public void test47() {
		webtest.click("xpath = //span[contains(text(),'�鱦�ֱ�')]");
		webtest.click("xpath=//a[contains(text(),'����')]");
		webtest.click("xpath=//a[contains(text(),'����')]");
		webtest.click("xpath=//a[contains(text(),'����')]");
	}
	
	@Test(priority = 48)
	public void test48() {
		webtest.click("xpath = //span[contains(text(),'�鱦�ֱ�')]");
		webtest.click("xpath=//a[contains(text(),'����')]");
		webtest.click("xpath=//a[contains(text(),'����Ͷ��')]");
		webtest.click("xpath=//a[contains(text(),'100-300')]");
	}
	
	@Test(priority = 49)
	public void test49() {
		webtest.click("xpath = //span[contains(text(),'�鱦�ֱ�')]");
		webtest.click("xpath=//a[contains(text(),'����')]");
		webtest.click("xpath=//a[contains(text(),'����')]");
		webtest.click("xpath=//a[contains(text(),'300-600')]");
	}
	
	@Test(priority = 50)
	public void test50() {
		webtest.click("xpath = //span[contains(text(),'�鱦�ֱ�')]");
		webtest.click("xpath=//a[contains(text(),'����')]");
		webtest.click("xpath=//a[contains(text(),'��ʯ��Ʒ')]");
		webtest.click("xpath=//a[contains(text(),'600-1000')]");
	}
	
}
