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
		//��¼
			webtest.open(URL);
			webtest.click("xpath=//a[@class='am-btn-primary btn am-fl']");
			webtest.type("name=accounts", "admin");
			webtest.type("name=pwd", "yj123456");
			webtest.type("name=verify", "ssss");
			webtest.click("xpath=//button[@class='am-btn am-btn-primary am-radius am-btn-sm btn-loading-example']");
		
	}

	@Test(description = "�鿴ҳ������",priority = 2)
	public void test2() throws InterruptedException {
		// �����������-��������-����ģʽ
			webtest.click("xpath=//span[text()='��������']");
			webtest.click("class=am-icon-th-list");
			webtest.type("name=f1p",
					"����");
			Boolean flag = webtest.isElementPresent("���� ");
			assertFalse(flag);
	}

	@Test(description = "�鿴ҳ������",priority = 3)
	public void test3() throws InterruptedException {
		// �����������-��������-�µ�ƽ̨
			webtest.click("xpath=//span[text()='��������']");
			webtest.click("class=am-icon-th-list");
			webtest.click("xpath=/html/body/div[4]/div[3]/div/div/form/div[3]/table/thead/tr[2]/td[9]/div/ul/li/input");
			webtest.type("xpath=/html/body/div[4]/div[3]/div/div/form/div[3]/table/thead/tr[2]/td[9]/div/ul/li/input",
					"ƻ��APP");
			Boolean flag = webtest.isElementPresent("ƻ��APP");
			assertFalse(flag);
	}

	@Test(description = "�鿴ҳ������",priority = 4)
	public void test4() throws InterruptedException {
		// �����������-��������-��ַ��Ϣ
			webtest.click("xpath=//span[text()='��������']");
			webtest.click("class=am-icon-th-list");
			webtest.type("name=f9p", "�ӱ�ʡʯ��ׯ�кӱ�ʦ����ѧ");
			Boolean flag = webtest.isElementPresent("�ӱ�ʡʯ��ׯ�кӱ�ʦ����ѧ");
			assertFalse(flag);
	       
	}

	@Test(description = "�鿴ҳ������",priority = 5)
	public void test5() throws InterruptedException {
		// �����������-��������-ȡ������Ϣ
			webtest.click("xpath=//span[text()='��������']");
			webtest.click("class=am-icon-th-list");
			webtest.type("name=f10p", "���ջ�-�����ѧԺ");
			Boolean flag = webtest.isElementPresent("���ջ�-�����ѧԺ");
			assertFalse(flag);
	}

	@Test(description = "�鿴ҳ������",priority = 6)
	public void test6() throws InterruptedException {
		// �����������-��������-֧����ʽ��
			webtest.click("xpath=//span[text()='��������']");
			webtest.click("class=am-icon-th-list");
			webtest.click(
					"xpath=/html/body/div[4]/div[3]/div/div/form/div[3]/table/thead/tr[2]/td[17]/div/ul/li/input");
			webtest.type("xpath=/html/body/div[4]/div[3]/div/div/form/div[3]/table/thead/tr[2]/td[17]/div/ul/li/input",
					"֧����");
			Boolean flag = webtest.isElementPresent("֧����");
			assertFalse(flag);	
	}

	@Test(description = "�鿴ҳ������",priority = 18)
	public void test18() throws InterruptedException {
		// �����������-��������-����֧��
			webtest.click("xpath=//span[text()='��������']");
			webtest.click("class=am-icon-th-list");
			webtest.click(
					"xpath=//button[@class='am-btn am-btn-secondary am-radius am-btn-xs am-icon-paypal batch-pay-submit']");
			Boolean flag = webtest.isElementPresent("����֧��");
			assertFalse(flag);
	}

	@Test(description = "�鿴ҳ������",priority = 7)
	public void test7() throws InterruptedException {
		// �����������-�����ۺ�-������Ϣ
			webtest.click("xpath=//span[text()='��������']");
			webtest.click("class=am-icon-puzzle-piece");
			webtest.type("name=f0p", "10987654321");
			Boolean flag = webtest.isElementPresent("10987654321");
			assertFalse(flag);
	}

	@Test(description = "�鿴ҳ������",priority = 8)
	public void test8() throws InterruptedException {
		// �����������-�����ۺ�-����״̬
			webtest.click("xpath=//span[text()='��������']");
			webtest.click("class=am-icon-puzzle-piece");
			webtest.click("xpath=/html/body/div[4]/div[3]/div/div/form/div[3]/table/thead/tr[2]/td[2]/div/ul/li/input");
			webtest.type("xpath=/html/body/div[4]/div[3]/div/div/form/div[3]/table/thead/tr[2]/td[2]/div/ul/li/input",
					"��ȷ��");
			Boolean flag = webtest.isElementPresent("��ȷ��");
			assertFalse(flag);
	}

	@Test(description = "�鿴ҳ������",priority = 9)
	public void test9() throws InterruptedException {
		// �����������-�����ۺ�-��������
			webtest.click("xpath=//span[text()='��������']");
			webtest.click("class=am-icon-puzzle-piece");
			webtest.click("xpath=/html/body/div[4]/div[3]/div/div/form/div[3]/table/thead/tr[2]/td[3]/div/ul/li/input");
			webtest.type("xpath=/html/body/div[4]/div[3]/div/div/form/div[3]/table/thead/tr[2]/td[3]/div/ul/li/input",
					"���˿�");
			Boolean flag = webtest.isElementPresent("���˿�");
			assertFalse(flag);
	}

	@Test(description = "�鿴ҳ������",priority = 10)
	public void test10() throws InterruptedException {
		// �����������-�����ۺ�-ԭ��
			webtest.click("xpath=//span[text()='��������']");
			webtest.click("class=am-icon-puzzle-piece");
			webtest.type("name=f3p", "����Ҫ��");
			Boolean flag = webtest.isElementPresent("����Ҫ��");
			assertFalse(flag);
	}

	@Test(description = "�鿴ҳ������",priority = 11)
	public void test11() throws InterruptedException {
		// �����������-�����ۺ�-�˿���
			webtest.click("xpath=//span[text()='��������']");
			webtest.click("class=am-icon-puzzle-piece");
			webtest.type("name=f4p_min", "100");
			webtest.type("name=f4p_max", "1000");
			Boolean flag = webtest.isElementPresent("1000");
			assertFalse(flag);
	}
	

	@Test(description = "�鿴ҳ������",priority = 12)
	public void test12() throws InterruptedException {
		// �����������-�����ۺ�-�˿�˵��

			webtest.click("xpath=//span[text()='��������']");
			webtest.click("class=am-icon-puzzle-piece");
			webtest.type("name=f6p", "�·���������");
			Boolean flag = webtest.isElementPresent("�·���������");
			assertFalse(flag);
	}

	@Test(description = "�鿴ҳ������",priority = 13)
	public void test13() throws InterruptedException {
		// �����������-�ҵ��ղ�-ԭ��
	
			webtest.click("xpath=//span[text()='��������']");
			webtest.click("class=am-icon-heart-o");
			webtest.type("name=f3p_min", "20");
			webtest.type("name=f3p_max", "200");
			Boolean flag = webtest.isElementPresent("200");
			assertFalse(flag);
	}

	@Test(description = "�鿴ҳ������",priority = 14)
	public void test14() throws InterruptedException {
		// �����������-�ҵ��ղ�-����ʱ��
			webtest.click("xpath=//span[text()='��������']");
			webtest.click("class=am-icon-heart-o");
			webtest.type("name=f4p_start", "2020/11/11");
			webtest.type("name=f4p_end", "2020/22/22");
			Boolean flag = webtest.isElementPresent("2020/22/22");
			assertFalse(flag);
	}
	

	@Test (description = "�鿴ҳ������",priority = 15)
	public void test15() throws InterruptedException {
		// �����������-�ҵ��ղ�-ȫѡ-ɾ��
		webtest.click("xpath=//span[text()='��������']");

		webtest.click("class=am-icon-heart-o");
		webtest.click(
				"xpath=//button[@class='am-btn am-btn-danger am-radius am-btn-xs am-icon-trash-o form-table-operate-top-delete-submit']");
		Thread.sleep(2000);
		Boolean flag = webtest.isElementPresent("ɾ��");
		assertFalse(flag);
	}
	

	@Test(description = "�鿴ҳ������",priority = 16)
	public void test16() throws InterruptedException {
		// �����������-�ҵ��ղ�-ȫѡ-����
		webtest.click("xpath=//span[text()='��������']");
		webtest.click("class=am-icon-heart-o");
		webtest.click("xpath=//a[@class='am-btn am-btn-warning am-radius am-btn-sm am-icon-filter']");
		Boolean flag = webtest.isElementPresent("����");
		assertFalse(flag);
	}

	@Test(description = "�鿴ҳ������",priority = 17)
	public void test17() throws InterruptedException {
		// �����������-�ҵ��ղ�-ȫѡ-����
		webtest.click("xpath=//span[text()='��������']");
		webtest.click("class=am-icon-heart-o");
		webtest.click(
				"xpath=//button[@class='am-btn am-btn-primary am-radius am-btn-xs btn-loading-example am-icon-search']");
		Boolean flag = webtest.isElementPresent("����");
		assertFalse(flag);
	}

	@Test(description = "�鿴ҳ������",priority = 19)
	public void test19() throws InterruptedException {
		// �����������-�ҵĻ���-�������͡�������
			webtest.click("xpath=//span[text()='��������']");
			webtest.click("class=am-icon-fire");
			webtest.click("class=default");
			webtest.type("class=default", "����");
			Boolean flag = webtest.isElementPresent("����");
			assertFalse(flag);
	}
		
		
	

	@Test(description = "�鿴ҳ������",priority = 20)
	public void test20() throws InterruptedException {
		// �����������-�ҵĻ���-��������
			webtest.click("xpath=//span[text()='��������']");
			webtest.click("class=am-icon-fire");
			webtest.click("name=f1p_min");
			webtest.type("name=f1p_min", "33");
			webtest.click("name=f1p_max");
			webtest.type("name=f1p_max", "333");
			Boolean flag = webtest.isElementPresent("333");
			assertFalse(flag);
	}

	@Test(description = "�鿴ҳ������",priority = 21)
	public void test21() throws InterruptedException {
		// �����������-�ҵĻ���-��������
			webtest.click("xpath=//span[text()='��������']");
			webtest.click("class=am-icon-fire");
			webtest.click("name=f1p_min");
			webtest.type("name=f1p_min", "33");
			webtest.click("name=f1p_max");
			webtest.type("name=f1p_max", "333");
			Boolean flag = webtest.isElementPresent("333");
			assertFalse(flag);
	}
		
		
	

	@Test(description = "�鿴ҳ������",priority = 22)
	public void test22() throws InterruptedException {
		// �����������-�ҵĻ���-����
		webtest.click("xpath=//span[text()='��������']");
		webtest.click("class=am-icon-fire");
		webtest.click("name=f1p_min");
		webtest.type("name=f1p_min", "33");
		webtest.click("name=f1p_max");
		webtest.type("name=f1p_max", "333");
		webtest.click("xpath=//a[@class='am-btn am-btn-warning am-radius am-btn-sm am-icon-filter']");
		Boolean flag = webtest.isElementPresent("333");
		assertFalse(flag);
	}

	@Test(description = "�鿴ҳ������",priority = 23)
	public void test23() throws InterruptedException {
		// �����������-�ҵĻ���-����
			webtest.click("xpath=//span[text()='��������']");
			webtest.click("class=am-icon-fire");
			webtest.click("name=f4p");
			webtest.type("name=f4p", "���ֵ���");
			Boolean flag = webtest.isElementPresent("���ֵ���");
			assertFalse(flag);
	}
	

	@Test(description = "�鿴ҳ������",priority = 24)
	public void test24() throws InterruptedException {
		// �����������-�ҵĻ���-����
		webtest.click("xpath=//span[text()='��������']");
		webtest.click("class=am-icon-fire");
		webtest.click(
				"xpath=//button[@class='am-btn am-btn-primary am-radius am-btn-xs btn-loading-example am-icon-search']");
		Boolean flag = webtest.isElementPresent("����");
		assertFalse(flag);
	}

	@Test(description = "�鿴ҳ������",priority = 25)
	public void test25() throws InterruptedException {
		// �����������-���Ϲ���-��������-ͼ��-true
			webtest.click("xpath=//span[text()='��������']");
			webtest.click("class=am-icon-gear");
			webtest.click("class=span-edit");
			webtest.click(
					"xpath=//button[@class='am-btn am-btn-primary am-btn-sm am-radius head-submit btn-loading-example']");
			webtest.click("class=am-close");
			Boolean flag = webtest.isElementPresent("class=am-close");
			assertTrue(flag);
	}

	@Test(description = "�鿴ҳ������",priority = 26)
	public void test26() throws InterruptedException {
		// �����������-���Ϲ���-��������-�ǳ�
			webtest.click("xpath=//span[text()='��������']");
			webtest.click("class=am-icon-gear");
			webtest.click("xpath=//a[@class='am-fr']");
			webtest.click("name=nickname");
			webtest.type("name=nickname", "�����");
			webtest.click(
					"xpath=//button[@class='am-btn am-btn-primary am-radius btn-loading-example am-btn-sm am-btn-block']");
			Boolean flag = webtest.isElementPresent("�����");
			assertFalse(flag);
			
	}

	@Test(description = "�鿴ҳ������",priority = 27)
	public void test27() throws InterruptedException {
		// �����������-���Ϲ���-��������-����
			webtest.click("xpath=//span[text()='��������']");
			webtest.click("class=am-icon-gear");
			webtest.click("xpath=//a[@class='am-fr']");
			webtest.click("name=birthday");
			webtest.type("name=birthday", "2020222");
			webtest.click(
					"xpath=//button[@class='am-btn am-btn-primary am-radius btn-loading-example am-btn-sm am-btn-block']");
			Boolean flag = webtest.isElementPresent("2020222");
			assertFalse(flag);
	}

	@Test(description = "�鿴ҳ������",priority = 28)
	public void test28() throws InterruptedException{
		//�����������-���Ϲ���-��������-�ֻ�����
		     webtest.click("xpath=//span[text()='��������']");
		     webtest.click("class=am-icon-gear");
		     webtest.click("xpath=//a[@href='http://localhost:98/index.php?s=/index/safety/mobileinfo.html']");
	         webtest.click("name=accounts");
	         webtest.type("name=accounts","18391520783" );
	         webtest.click("name=verify");
	         webtest.click("xpath=//button[@class='am-btn am-btn-primary am-radius btn-loading-example am-btn-sm am-btn-block']");
	     	Boolean flag = webtest.isElementPresent("18391520783");
			assertFalse(flag);
	}

	@Test(description = "�鿴ҳ������",priority = 29)
	public void test29() throws InterruptedException {
		// �����������-���Ϲ���-��������-�ֻ�����-��֤��
			webtest.click("xpath=//span[text()='��������']");
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

	@Test(description = "�鿴ҳ������",priority = 30)
	public void test30() throws InterruptedException {
		// �����������-���Ϲ���-��������-��������
			webtest.click("xpath=//span[text()='��������']");
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

	@Test(description = "�鿴ҳ������",priority = 31)
	public void test31() throws InterruptedException {
		// �����������-�ҵĵ�ַ-������ַ
			webtest.click("xpath=//span[text()='��������']");
			webtest.click("class=am-icon-street-view");
			webtest.click("xpath=//button[@class='am-btn am-btn-primary am-btn-xs am-icon-plus address-submit-save']");
			webtest.enterFrame("xpath=/html/body/div[8]/div/div[2]/iframe");
			webtest.click("xpath=/html/body/div[1]/form/div[1]/input");
			webtest.type("xpath=/html/body/div[1]/form/div[1]/input", "���ջ�");
			webtest.click("name=tel");
			webtest.type("name=tel", "18831176586");
			webtest.click("xpath=//span[text()='ʡ��']");
			webtest.type("xpath=//span[text()='ʡ��']", "�ӱ�ʡ");
			webtest.click("xpath=//span[text()='����']");
			webtest.type("xpath=//span[text()='����']", "ʯ��ׯ��");
			webtest.click("xpath=//span[text()='��/��']");
			webtest.type("xpath=//span[text()='��/��']", "ԣ����");
			webtest.click("id=form-address");
			webtest.type("id=form-address", "�ӱ�ʦ����ѧ����԰3��");
			webtest.click("name=alias");
			webtest.type("name=alias", "��С��");
			webtest.click("xpath=//span[@class='am-switch-handle-on am-switch-success']");
			webtest.click(
					"xpath=//button[@class='am-btn am-btn-primary am-radius btn-loading-exmple am-btn-sm am-btn-block']");
			Boolean flag = webtest.isElementPresent("��С��");
			assertTrue(flag);

	}

	@Test(description = "�鿴ҳ������",priority = 32)
	public void test32() throws InterruptedException {
		//��������-�����ۺ�-ԭ��
		webtest.click("xpath=//span[text()='��������']");
        webtest.click("xpath=//a[@href='http://localhost:98/index.php?s=/index/usergoodsbrowse/index.html']");
        webtest.click(
			"xpath=//button[@class='am-btn am-btn-secondary am-radius am-btn-xs form-table-operate-checkbox-submit']");
        webtest.click(
			"xpath=//button[@class='am-btn am-btn-primary am-radius am-btn-xs btn-loading-example am-icon-search']");
    	Boolean flag = webtest.isElementPresent("xpath=//button[@class='am-btn am-btn-primary am-radius am-btn-xs btn-loading-example am-icon-search']");
        assertTrue(flag);
	}

	@Test(description = "�鿴ҳ������",priority = 33)
	public void test33() throws InterruptedException {
		//��������
		webtest.click("xpath=//span[text()='��������']");
		webtest.click("xpath=//span[@class='am-fr icon-tips']");
		webtest.click(
				"xpath=//span[@class='am-btn am-btn-secondary am-radius am-btn-xs form-table-operate-checkbox-submit']");
		webtest.click(
				"xpath=//button[@class='am-btn am-btn-secondary am-radius am-btn-xs am-icon-paypal batch-pay-submit']");
    	Boolean flag = webtest.isElementPresent("xpath=//button[@class='am-btn am-btn-secondary am-radius am-btn-xs am-icon-paypal batch-pay-submit']");
        assertTrue(flag);
	}

	@Test(description = "�鿴ҳ������",priority = 34)
	public void test34() throws InterruptedException {
		// �����������-��Ϣ-����
		webtest.click("xpath=//span[text()='��������']");
		webtest.click("xpath=//a[@href='http://localhost:98/index.php?s=/index/message/index.html']");
		Boolean flag = webtest.isElementPresent("xpath=//a[@href='http://localhost:98/index.php?s=/index/message/index.html']");
        assertTrue(flag);

	}

	@Test(description = "�鿴ҳ������",priority = 35)
	public void test35() throws InterruptedException {
		// �����������-��ȫ��ַ-�޸ĵ�¼����

		        webtest.click("xpath=//span[text()='��������']");
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

	@Test(description = "�鿴ҳ������",priority = 36)
	public void test36() throws InterruptedException {
		// �����������-��ȫ��ַ-���ֻ�����
			webtest.click("xpath=//span[text()='��������']");
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

	@Test(description = "�鿴ҳ������",priority = 37)
	public void test37() throws InterruptedException {
		// �����������-��ȫ��ַ-�󶨵�������
			webtest.click("xpath=//span[text()='��������']");
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

	@Test(description = "�鿴ҳ������",priority = 38)
	public void test38() throws InterruptedException {
		// �����������-�ҵ���Ϣ-��Ϣ����-����
		webtest.click("xpath=//span[text()='��������']");
		webtest.click("xpath=//a[@href='http://localhost:98/index.php?s=/index/message/index.html']");
		webtest.click("class=default");
		webtest.type("class=default", "�޻ظ�");
		webtest.click("xpath=//a[@class='am-btn am-btn-warning am-radius am-btn-sm am-icon-filter']");
		Boolean flag = webtest.isElementPresent("�޻ظ�");
		assertFalse(flag);
	}

	@Test(description = "�鿴ҳ������",priority = 39)
	public void test39() throws InterruptedException {
		// �����������-�ҵ���Ϣ-��Ϣ����-ҵ������-����
		webtest.click("xpath=//span[text()='��������']");
		webtest.click("xpath=//a[@href='http://localhost:98/index.php?s=/index/message/index.html']");
		webtest.click("class=default");
		webtest.type("class=default", "�޻ظ�");
		webtest.click("xpath=/html/body/div[4]/div[3]/div/div/form/div[3]/table/thead/tr[2]/td[2]/div/ul/li/input");
		webtest.type("xpath=/html/body/div[4]/div[3]/div/div/form/div[3]/table/thead/tr[2]/td[2]/div/ul/li/input",
				"�˹�����");
		webtest.click("xpath=//a[@class='am-btn am-btn-warning am-radius am-btn-sm am-icon-filter']");
		Boolean flag = webtest.isElementPresent("�˹�����");
		assertFalse(flag);

	}

	@Test(description = "�鿴ҳ������",priority = 40)
	public void test40() throws InterruptedException {
		// �����������-�ҵ���Ϣ-��Ϣ����-ҵ������-����-����
		webtest.click("xpath=//span[text()='��������']");
		webtest.click("xpath=//a[@href='http://localhost:98/index.php?s=/index/message/index.html']");
		webtest.click("class=default");
		webtest.type("class=default", "�޻ظ�");
		webtest.click("xpath=/html/body/div[4]/div[3]/div/div/form/div[3]/table/thead/tr[2]/td[2]/div/ul/li/input");
		webtest.type("xpath=/html/body/div[4]/div[3]/div/div/form/div[3]/table/thead/tr[2]/td[2]/div/ul/li/input",
				"�˹�����");
		webtest.click("name=f2p");
		webtest.type("name=f2p", "�����Ʒ");
		webtest.click("xpath=//a[@class='am-btn am-btn-warning am-radius am-btn-sm am-icon-filter']");
		Boolean flag = webtest.isElementPresent("�����Ʒ");
		assertFalse(flag);
		

	}

	@Test(description = "�鿴ҳ������",priority = 41)
	public void test41() throws InterruptedException {
		// �����������-�ҵ���Ϣ-��Ϣ����-ҵ������-����-����-����
		webtest.click("xpath=//span[text()='��������']");
		webtest.click("xpath=//a[@href='http://localhost:98/index.php?s=/index/message/index.html']");
		webtest.click("class=default");
		webtest.type("class=default", "�޻ظ�");
		webtest.click("xpath=/html/body/div[4]/div[3]/div/div/form/div[3]/table/thead/tr[2]/td[2]/div/ul/li/input");
		webtest.type("xpath=/html/body/div[4]/div[3]/div/div/form/div[3]/table/thead/tr[2]/td[2]/div/ul/li/input",
				"�˹�����");
		webtest.click("name=f2p");
		webtest.type("name=f2p", "�����Ʒ");
		webtest.click("name=f3p");
		webtest.type("name=f3p", "Ĭ��");
		webtest.click("xpath=//a[@class='am-btn am-btn-warning am-radius am-btn-sm am-icon-filter']");
		Boolean flag1 = webtest.isElementPresent("Ĭ��");
		assertFalse(flag1);

	}

	@Test(description = "�鿴ҳ������",priority = 42)
	public void test42() throws InterruptedException {
		// �����������-�ҵ���Ϣ-��Ϣ����-ҵ������-����-����-״̬-����-����
		webtest.click("xpath=//span[text()='��������']");
		webtest.click("xpath=//a[@href='http://localhost:98/index.php?s=/index/message/index.html']");
		webtest.click("class=default");
		webtest.type("class=default", "�޻ظ�");
		webtest.click("xpath=/html/body/div[4]/div[3]/div/div/form/div[3]/table/thead/tr[2]/td[2]/div/ul/li/input");
		webtest.type("xpath=/html/body/div[4]/div[3]/div/div/form/div[3]/table/thead/tr[2]/td[2]/div/ul/li/input",
				"�˹�����");
		webtest.click("name=f2p");
		webtest.type("name=f2p", "�����Ʒ");
		webtest.click("name=f3p");
		webtest.type("name=f3p", "Ĭ��");
		webtest.click("xpath=/html/body/div[4]/div[3]/div/div/form/div[3]/table/thead/tr[2]/td[5]/div/ul/li/input");
		webtest.type("xpath=/html/body/div[4]/div[3]/div/div/form/div[3]/table/thead/tr[2]/td[5]/div/ul/li/input",
				"δ��");
		webtest.click(
				"xpath=//button[@class='am-btn am-btn-primary am-radius am-btn-xs btn-loading-example am-icon-search']");
		webtest.click("xpath=//a[@class='am-btn am-btn-warning am-radius am-btn-sm am-icon-filter']");
		Boolean flag = webtest.isElementPresent("δ��");
		assertFalse(flag);
	}

	@Test(description = "�鿴ҳ������",priority = 43)
	public void test43() throws InterruptedException {
		// �����������-�ҵ��㼣-����
		
		webtest.click("xpath=//span[text()='��������']");
		webtest.click("xpath=//a[@href='http://localhost:98/index.php?s=/index/usergoodsbrowse/index.html']");
		webtest.click("xpath=/html/body/div[4]/div[3]/div/div/form/div[3]/table/tbody/tr[1]/td[6]/button[1]/span");
		webtest.click("class=am-close am-close-alt am-icon-times am-close-spin");
	}

	@Test(description = "�鿴ҳ������",priority = 44)
	public void test44() throws InterruptedException {
		// �����������-�ҵ��㼣-����
		webtest.click("xpath=//span[text()='��������']");
		webtest.click("xpath=//a[@href='http://localhost:98/index.php?s=/index/usergoodsbrowse/index.html']");
		webtest.click("xpath=/html/body/div[4]/div[3]/div/div/form/div[3]/table/tbody/tr[1]/td[1]/div/label/span/i[2]");
		webtest.click(
				"xpath=//button[@class='am-btn am-btn-danger am-radius am-btn-xs am-icon-trash-o form-table-operate-top-delete-submit']");
		webtest.click("class=am-modal-btn");
		Boolean flag = webtest.isElementPresent("class=am-modal-btn");
		assertFalse(flag);

	}

	@Test(description = "�鿴ҳ������",priority = 45)
	public void test45() throws InterruptedException {
		// �����������-�ҵ��㼣-ȫѡ-����
		webtest.click("xpath=//span[text()='��������']");
		webtest.click("xpath=//a[@href='http://localhost:98/index.php?s=/index/usergoodsbrowse/index.html']");
		webtest.click(
				"xpath=//button[@class='am-btn am-btn-secondary am-radius am-btn-xs form-table-operate-checkbox-submit']");
		webtest.click("xpath=/html/body/div[4]/div[3]/div/div/form/div[2]/a");
		Boolean flag = webtest.isElementPresent("xpath=//button[@class='am-btn am-btn-secondary am-radius am-btn-xs form-table-operate-checkbox-submit']");
		assertTrue(flag);
	}

	@Test(description = "�鿴ҳ������",priority = 46)
	public void test46() throws InterruptedException {
		// �����������-�ҵ��㼣-ȫѡ-����-����
		webtest.click("xpath=//span[text()='��������']");
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
		// �����������-�ҵ��㼣-ȫѡ-��ѡ-ɾ��
		webtest.click("xpath=//span[text()='��������']");
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

	@Test(description = "�鿴ҳ������",priority = 48)
	public void test48() throws InterruptedException {
		// ���������-�ʴ�/����-����
		webtest.click("xpath=//span[text()='��������']");
		webtest.click("xpath=//a[@href='http://localhost:98/index.php?s=/index/answer/index.html']");
		webtest.click("xpath=//a[@class='am-btn am-btn-success am-radius am-btn-xs am-icon-plus']");
		webtest.click("xpath=/html/body/div[4]/div[3]/div/div/div/div/div[2]/form/div[1]/input");
		webtest.type("xpath=/html/body/div[4]/div[3]/div/div/div/div/div[2]/form/div[1]/input", "��С��");
		webtest.click("xpath=/html/body/div[4]/div[3]/div/div/div/div/div[2]/form/div[2]/input");
		webtest.type("xpath=/html/body/div[4]/div[3]/div/div/div/div/div[2]/form/div[2]/input", "18391520783");
		webtest.click("name=title");
		webtest.type("name=title", "��Ҫ���");
		webtest.click("name=content");
		webtest.type("name=content", "������������");
		webtest.click(
				"xpath=//button[@class='am-btn am-btn-primary am-radius btn-loading-example am-btn-sm am-btn-block']");
		Boolean flag = webtest.isElementPresent("��Ҫ���");
		assertFalse(flag);
	}

	@Test(description = "�鿴ҳ������",priority = 49)
	public void test49() throws InterruptedException {
		// ���������-�ʴ�/����-����-����
		webtest.click("xpath=//span[text()='��������']");
		webtest.click("xpath=//a[@href='http://localhost:98/index.php?s=/index/answer/index.html']");
		webtest.click("xpath=//a[@class='am-btn am-btn-success am-radius am-btn-xs am-icon-plus']");
		webtest.click("xpath=/html/body/div[4]/div[3]/div/div/div/div/div[2]/form/div[1]/input");
		webtest.type("xpath=/html/body/div[4]/div[3]/div/div/div/div/div[2]/form/div[1]/input", "��С��");
		webtest.click("xpath=/html/body/div[4]/div[3]/div/div/div/div/div[2]/form/div[2]/input");
		webtest.type("xpath=/html/body/div[4]/div[3]/div/div/div/div/div[2]/form/div[2]/input", "18391520783");
		webtest.click("name=title");
		webtest.type("name=title", "��Ҫ���");
		webtest.click("name=content");
		webtest.type("name=content", "������������");
		webtest.click(
				"xpath=//button[@class='am-btn am-btn-primary am-radius btn-loading-example am-btn-sm am-btn-block']");
		webtest.click("xpath=//a[@class='am-btn am-btn-warning am-radius am-btn-sm am-icon-filter']");
		webtest.click(
				"xpath=//button[@class='am-btn am-btn-primary am-radius am-btn-xs btn-loading-example am-icon-search']");
		Boolean flag = webtest.isElementPresent("������������");
		assertFalse(flag);
	}

	@Test(description = "�鿴ҳ������",priority = 50)
	public void test50() throws InterruptedException {
		// ���������-�ʴ�/����-����-����
		webtest.click("xpath=//span[text()='��������']");
		webtest.click("xpath=//a[@href='http://localhost:98/index.php?s=/index/answer/index.html']");
		webtest.click("xpath=//a[@class='am-btn am-btn-success am-radius am-btn-xs am-icon-plus']");
		webtest.click("xpath=/html/body/div[4]/div[3]/div/div/div/div/div[2]/form/div[1]/input");
		webtest.type("xpath=/html/body/div[4]/div[3]/div/div/div/div/div[2]/form/div[1]/input", "��С��");
		webtest.click("xpath=/html/body/div[4]/div[3]/div/div/div/div/div[2]/form/div[2]/input");
		webtest.type("xpath=/html/body/div[4]/div[3]/div/div/div/div/div[2]/form/div[2]/input", "18391520783");
		webtest.click("name=title");
		webtest.type("name=title", "��Ҫ���");
		webtest.click("name=content");
		webtest.type("name=content", "������������");
		webtest.click(
				"xpath=//button[@class='am-btn am-btn-primary am-radius btn-loading-example am-btn-sm am-btn-block']");
		webtest.click(
				"xpath=//button[@class='am-btn am-btn-primary am-radius am-btn-xs btn-loading-example am-icon-search']");
		Boolean flag = webtest.isElementPresent("xpath=//button[@class='am-btn am-btn-primary am-radius btn-loading-example am-btn-sm am-btn-block']");
		assertTrue(flag);
	}

	@Test(description = "�鿴ҳ������",priority = 51)
	public void test51() throws InterruptedException {
		// ��������-��ȫ�˳��������Ľ���
		webtest.click("xpath=//span[text()='��������']");
		webtest.click("xpath=//a[@href='http://localhost:98/index.php?s=/index/user/logout.html']");
		Boolean flag = webtest.isElementPresent("xpath=//a[@href='http://localhost:98/index.php?s=/index/user/logout.html']");
		assertFalse(flag);
	}
	



}