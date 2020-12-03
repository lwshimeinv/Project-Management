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
		//�����������-��������-����ģʽ
		webtest.click("xpath=//span[text()='��������']");
		Thread.sleep(1000);
        webtest.click("class=am-icon-th-list");
        Thread.sleep(3000);
        webtest.click("xpath=/html/body/div[4]/div[3]/div/div/form/div[3]/table/thead/tr[2]/td[8]/div/ul/li/input");
        webtest.type("xpath=/html/body/div[4]/div[3]/div/div/form/div[3]/table/thead/tr[2]/td[8]/div/ul/li/input","����");
        Thread.sleep(2000);
	 }
	
	@Test
	public void test3() throws InterruptedException {
		//�����������-��������-�µ�ƽ̨
		webtest.click("xpath=//span[text()='��������']");
		Thread.sleep(1000);
        webtest.click("class=am-icon-th-list");
        Thread.sleep(3000);
        webtest.click("xpath=/html/body/div[4]/div[3]/div/div/form/div[3]/table/thead/tr[2]/td[9]/div/ul/li/input");
        webtest.type("xpath=/html/body/div[4]/div[3]/div/div/form/div[3]/table/thead/tr[2]/td[9]/div/ul/li/input","ƻ��app");
        Thread.sleep(2000);
	 }
	
	@Test
	public void test4() throws InterruptedException {
		//�����������-��������-��ַ��Ϣ
		webtest.click("xpath=//span[text()='��������']");
		Thread.sleep(1000);
        webtest.click("class=am-icon-th-list");
        Thread.sleep(3000);
        webtest.type("name=f9p","�ӱ�ʡʯ��ׯ�кӱ�ʦ����ѧ");
        Thread.sleep(2000);
	 }
	
	@Test
	public void test5() throws InterruptedException {
		//�����������-��������-ȡ������Ϣ
		webtest.click("xpath=//span[text()='��������']");
		Thread.sleep(1000);
        webtest.click("class=am-icon-th-list");
        Thread.sleep(3000);
        webtest.type("name=f10p","���ջ�-�����ѧԺ");
        Thread.sleep(2000);
	 }
	
	@Test
	public void test6() throws InterruptedException {
		//�����������-��������-֧����ʽ
		webtest.click("xpath=//span[text()='��������']");
		Thread.sleep(1000);
        webtest.click("class=am-icon-th-list");
        Thread.sleep(3000);
        webtest.click("xpath=/html/body/div[4]/div[3]/div/div/form/div[3]/table/thead/tr[2]/td[17]/div/ul/li/input");
        webtest.type("xpath=/html/body/div[4]/div[3]/div/div/form/div[3]/table/thead/tr[2]/td[17]/div/ul/li/input","֧����");
        Thread.sleep(2000);
	 }
	
	@Test
	public void test18() throws InterruptedException {
		//�����������-��������-����֧��
		webtest.click("xpath=//span[text()='��������']");
		Thread.sleep(1000);
        webtest.click("class=am-icon-th-list");
        Thread.sleep(3000);
        webtest.click("xpath=//button[@class='am-btn am-btn-secondary am-radius am-btn-xs am-icon-paypal batch-pay-submit']");
        Thread.sleep(2000);
	 }
	
	
	
	
	@Test
	public void test7() throws InterruptedException{
       //�����������-�����ۺ�-������Ϣ
       webtest.click("xpath=//span[text()='��������']");
       Thread.sleep(1000);
       webtest.click("class=am-icon-puzzle-piece");
       Thread.sleep(3000);
       webtest.type("name=f0p","10987654321");
       Thread.sleep(2000);
	}
	
	@Test 
	public void test8() throws InterruptedException{
       //�����������-�����ۺ�-����״̬
       webtest.click("xpath=//span[text()='��������']");
       Thread.sleep(1000);
       webtest.click("class=am-icon-puzzle-piece");
       Thread.sleep(3000);
       webtest.click("xpath=/html/body/div[4]/div[3]/div/div/form/div[3]/table/thead/tr[2]/td[2]/div/ul/li/input");
       webtest.type("xpath=/html/body/div[4]/div[3]/div/div/form/div[3]/table/thead/tr[2]/td[2]/div/ul/li/input","��ȷ��");
       Thread.sleep(2000);
	}
	
	@Test 
	public void test9() throws InterruptedException{
       //�����������-�����ۺ�-��������
       webtest.click("xpath=//span[text()='��������']");
       Thread.sleep(1000);
       webtest.click("class=am-icon-puzzle-piece");
       Thread.sleep(3000);
       webtest.click("xpath=/html/body/div[4]/div[3]/div/div/form/div[3]/table/thead/tr[2]/td[3]/div/ul/li/input");
       webtest.type("xpath=/html/body/div[4]/div[3]/div/div/form/div[3]/table/thead/tr[2]/td[3]/div/ul/li/input","���˿�");
       Thread.sleep(2000);
	}
	
	@Test
	public void test10() throws InterruptedException{
       //�����������-�����ۺ�-ԭ��
       webtest.click("xpath=//span[text()='��������']");
       Thread.sleep(1000);
       webtest.click("class=am-icon-puzzle-piece");
       Thread.sleep(3000);
       webtest.type("name=f3p","����Ҫ��");
       Thread.sleep(2000);
	}
	@Test
	public void test11() throws InterruptedException{
       //�����������-�����ۺ�-�˿���
       webtest.click("xpath=//span[text()='��������']");
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
       //�����������-�����ۺ�-�˿�˵��
       webtest.click("xpath=//span[text()='��������']");
       Thread.sleep(1000);
       webtest.click("class=am-icon-puzzle-piece");
       Thread.sleep(3000);
       webtest.type("name=f6p","�·���������");
       Thread.sleep(2000);
	}
	
	@Test
	public void test13() throws InterruptedException {
		//�����������-�ҵ��ղ�-ԭ��
		webtest.click("xpath=//span[text()='��������']");
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
		//�����������-�ҵ��ղ�-����ʱ��
		webtest.click("xpath=//span[text()='��������']");
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
		//�����������-�ҵ��ղ�-ȫѡ-ɾ��
		webtest.click("xpath=//span[text()='��������']");
		Thread.sleep(1000);
        webtest.click("class=am-icon-heart-o");
        Thread.sleep(3000);
        webtest.click("xpath=//button[@class='am-btn am-btn-danger am-radius am-btn-xs am-icon-trash-o form-table-operate-top-delete-submit']");
	    Thread.sleep(2000);
	}
	
	@Test
	public void test16() throws InterruptedException {
		//�����������-�ҵ��ղ�-ȫѡ-����
		webtest.click("xpath=//span[text()='��������']");
		Thread.sleep(1000);
        webtest.click("class=am-icon-heart-o");
        Thread.sleep(3000);
        webtest.click("xpath=//a[@class='am-btn am-btn-warning am-radius am-btn-sm am-icon-filter']");
	    Thread.sleep(2000);
	}
	@Test
	public void test17() throws InterruptedException {
		//�����������-�ҵ��ղ�-ȫѡ-����
		webtest.click("xpath=//span[text()='��������']");
		Thread.sleep(1000);
        webtest.click("class=am-icon-heart-o");
        Thread.sleep(3000);
        webtest.click("xpath=//button[@class='am-btn am-btn-primary am-radius am-btn-xs btn-loading-example am-icon-search']");
	    Thread.sleep(2000);
	}
	
	@Test
	public void test19() throws InterruptedException{
		//�����������-�ҵĻ���-�������͡�������
		webtest.click("xpath=//span[text()='��������']");
		Thread.sleep(1000);
		webtest.click("class=am-icon-fire");
		Thread.sleep(3000);
		webtest.click("class=default");
		webtest.type("class=default","����" );
		Thread.sleep(2000);
	}
	
	@Test
	public void test20() throws InterruptedException{
		//�����������-�ҵĻ���-��������
		webtest.click("xpath=//span[text()='��������']");
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
		//�����������-�ҵĻ���-��������
		webtest.click("xpath=//span[text()='��������']");
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
		//�����������-�ҵĻ���-����
		webtest.click("xpath=//span[text()='��������']");
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
		//�����������-�ҵĻ���-����
		webtest.click("xpath=//span[text()='��������']");
		Thread.sleep(1000);
		webtest.click("class=am-icon-fire");
		Thread.sleep(1000);
		webtest.click("name=f4p");
	    Thread.sleep(1000);
	    webtest.type("name=f4p", "���ֵ���");
	    Thread.sleep(1000);
	}
	

	@Test
	public void test24() throws InterruptedException{
		//�����������-�ҵĻ���-����
		webtest.click("xpath=//span[text()='��������']");
		Thread.sleep(1000);
		webtest.click("class=am-icon-fire");
		Thread.sleep(1000);
		webtest.click("xpath=//button[@class='am-btn am-btn-primary am-radius am-btn-xs btn-loading-example am-icon-search']");
	    Thread.sleep(1000);
	}
	
	@Test
	public void test25() throws InterruptedException{
		//�����������-���Ϲ���-��������-ͼ��
		webtest.click("xpath=//span[text()='��������']");
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
		//�����������-���Ϲ���-��������-�ǳ�
		webtest.click("xpath=//span[text()='��������']");
		Thread.sleep(1000);
		webtest.click("class=am-icon-gear");
		Thread.sleep(1000);
		webtest.click("xpath=//a[@class='am-fr']");
	    Thread.sleep(1000);
	    webtest.click("name=nickname");
	    webtest.type("name=nickname","�����" );
	    Thread.sleep(2000);
	    webtest.click("xpath=//button[@class='am-btn am-btn-primary am-radius btn-loading-example am-btn-sm am-btn-block']");
	    Thread.sleep(1000);
	}
	
	@Test
	public void test27() throws InterruptedException{
		//�����������-���Ϲ���-��������-����
		webtest.click("xpath=//span[text()='��������']");
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
		//�����������-���Ϲ���-��������-�ֻ�����
		webtest.click("xpath=//span[text()='��������']");
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
		//�����������-���Ϲ���-��������-�ֻ�����
		webtest.click("xpath=//span[text()='��������']");
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
		//�����������-���Ϲ���-��������-��������
		webtest.click("xpath=//span[text()='��������']");
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
		//�����������-�ҵĵ�ַ-������ַ
		webtest.click("xpath=//span[text()='��������']");
		webtest.click("class=am-icon-street-view");
		webtest.click("xpath=//button[@class='am-btn am-btn-primary am-btn-xs am-icon-plus address-submit-save']");
		webtest.enterFrame("xpath=/html/body/div[8]/div/div[2]/iframe");
	    webtest.click("xpath=/html/body/div[1]/form/div[1]/input");
	    webtest.type("xpath=/html/body/div[1]/form/div[1]/input","���ջ�" );
	    webtest.click("name=tel");
	    webtest.type("name=tel","18831176586");
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
	    webtest.click("xpath=//button[@class='am-btn am-btn-primary am-radius btn-loading-exmple am-btn-sm am-btn-block']");
	    Thread.sleep(2000);
	    
	}
	
	@Test
	public void test32() throws InterruptedException{
		//�����������-�ҵ��㼣-����
		webtest.click("xpath=//span[text()='��������']");
		webtest.click("xpath=//a[@href='http://localhost:98/index.php?s=/index/usergoodsbrowse/index.html']");
		webtest.click("xpath=//button[@class='am-btn am-btn-secondary am-radius am-btn-xs form-table-operate-checkbox-submit']");
	    webtest.click("xpath=//button[@class='am-btn am-btn-primary am-radius am-btn-xs btn-loading-example am-icon-search']");
	} 
	
	@Test
	public void test33() throws InterruptedException{
		//�����������-�鿴ȫ������
		webtest.click("xpath=//span[text()='��������']");
		webtest.click("xpath=//span[@class='am-fr icon-tips']");
		webtest.click("xpath=//span[@class='am-btn am-btn-secondary am-radius am-btn-xs form-table-operate-checkbox-submit']");
	    webtest.click("xpath=//button[@class='am-btn am-btn-secondary am-radius am-btn-xs am-icon-paypal batch-pay-submit']");
	}
	
	@Test
	public void test34() throws InterruptedException{
		//�����������-��Ϣ-����
		webtest.click("xpath=//span[text()='��������']");
		webtest.click("xpath=//a[@href='http://localhost:98/index.php?s=/index/message/index.html']");
		
	    
	}
	
	@Test
	public void test35() throws InterruptedException{
		//�����������-��ȫ��ַ-�޸ĵ�¼����
		webtest.click("xpath=//span[text()='��������']");
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
		//�����������-��ȫ��ַ-���ֻ�����
		webtest.click("xpath=//span[text()='��������']");
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
		//�����������-��ȫ��ַ-�󶨵�������
		webtest.click("xpath=//span[text()='��������']");
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
		//�����������-�ҵ���Ϣ-��Ϣ����-����
		webtest.click("xpath=//span[text()='��������']");
		webtest.click("xpath=//a[@href='http://localhost:98/index.php?s=/index/message/index.html']");
		Thread.sleep(2000);
		webtest.click("class=default");
		webtest.type("class=default", "�޻ظ�");
		webtest.click("xpath=//a[@class='am-btn am-btn-warning am-radius am-btn-sm am-icon-filter']");
		
	}
	

	@Test
	public void test39() throws InterruptedException{
		//�����������-�ҵ���Ϣ-��Ϣ����-ҵ������-����
		webtest.click("xpath=//span[text()='��������']");
		webtest.click("xpath=//a[@href='http://localhost:98/index.php?s=/index/message/index.html']");
		Thread.sleep(2000);
		webtest.click("class=default");
		webtest.type("class=default", "�޻ظ�");
		Thread.sleep(2000);
		webtest.click("xpath=/html/body/div[4]/div[3]/div/div/form/div[3]/table/thead/tr[2]/td[2]/div/ul/li/input");
		webtest.type("xpath=/html/body/div[4]/div[3]/div/div/form/div[3]/table/thead/tr[2]/td[2]/div/ul/li/input","�˹�����");
		Thread.sleep(2000);
		webtest.click("xpath=//a[@class='am-btn am-btn-warning am-radius am-btn-sm am-icon-filter']");
		
	}
	
	@Test
	public void test40() throws InterruptedException{
		//�����������-�ҵ���Ϣ-��Ϣ����-ҵ������-����-����
		webtest.click("xpath=//span[text()='��������']");
		webtest.click("xpath=//a[@href='http://localhost:98/index.php?s=/index/message/index.html']");
		Thread.sleep(2000);
		webtest.click("class=default");
		webtest.type("class=default", "�޻ظ�");
		Thread.sleep(2000);
		webtest.click("xpath=/html/body/div[4]/div[3]/div/div/form/div[3]/table/thead/tr[2]/td[2]/div/ul/li/input");
		webtest.type("xpath=/html/body/div[4]/div[3]/div/div/form/div[3]/table/thead/tr[2]/td[2]/div/ul/li/input","�˹�����");
		Thread.sleep(2000);
		webtest.click("name=f2p");
		webtest.type("name=f2p", "�����Ʒ");
		Thread.sleep(2000);
		webtest.click("xpath=//a[@class='am-btn am-btn-warning am-radius am-btn-sm am-icon-filter']");
		
	}
	
	@Test
	public void test41() throws InterruptedException{
		//�����������-�ҵ���Ϣ-��Ϣ����-ҵ������-����-����-����
		webtest.click("xpath=//span[text()='��������']");
		webtest.click("xpath=//a[@href='http://localhost:98/index.php?s=/index/message/index.html']");
		Thread.sleep(2000);
		webtest.click("class=default");
		webtest.type("class=default", "�޻ظ�");
		Thread.sleep(2000);
		webtest.click("xpath=/html/body/div[4]/div[3]/div/div/form/div[3]/table/thead/tr[2]/td[2]/div/ul/li/input");
		webtest.type("xpath=/html/body/div[4]/div[3]/div/div/form/div[3]/table/thead/tr[2]/td[2]/div/ul/li/input","�˹�����");
		Thread.sleep(2000);
		webtest.click("name=f2p");
		webtest.type("name=f2p", "�����Ʒ");
		Thread.sleep(2000);
		webtest.click("name=f3p");
		webtest.type("name=f3p", "Ĭ��");
		Thread.sleep(2000);
		webtest.click("xpath=//a[@class='am-btn am-btn-warning am-radius am-btn-sm am-icon-filter']");
		
	}
	
	@Test
	public void test42() throws InterruptedException{
		//�����������-�ҵ���Ϣ-��Ϣ����-ҵ������-����-����-״̬-����-����
		webtest.click("xpath=//span[text()='��������']");
		webtest.click("xpath=//a[@href='http://localhost:98/index.php?s=/index/message/index.html']");
		Thread.sleep(2000);
		webtest.click("class=default");
		webtest.type("class=default", "�޻ظ�");
		Thread.sleep(2000);
		webtest.click("xpath=/html/body/div[4]/div[3]/div/div/form/div[3]/table/thead/tr[2]/td[2]/div/ul/li/input");
		webtest.type("xpath=/html/body/div[4]/div[3]/div/div/form/div[3]/table/thead/tr[2]/td[2]/div/ul/li/input","�˹�����");
		Thread.sleep(2000);
		webtest.click("name=f2p");
		webtest.type("name=f2p", "�����Ʒ");
		Thread.sleep(2000);
		webtest.click("name=f3p");
		webtest.type("name=f3p", "Ĭ��");
		Thread.sleep(2000);
		webtest.click("xpath=/html/body/div[4]/div[3]/div/div/form/div[3]/table/thead/tr[2]/td[5]/div/ul/li/input");
		webtest.type("xpath=/html/body/div[4]/div[3]/div/div/form/div[3]/table/thead/tr[2]/td[5]/div/ul/li/input", "δ��");
		Thread.sleep(2000);
		webtest.click("xpath=//button[@class='am-btn am-btn-primary am-radius am-btn-xs btn-loading-example am-icon-search']");
		Thread.sleep(2000);
		webtest.click("xpath=//a[@class='am-btn am-btn-warning am-radius am-btn-sm am-icon-filter']");
	}
	
	@Test
	public void  test43() throws InterruptedException{
		//�����������-�ҵ��㼣-����
		webtest.click("xpath=//span[text()='��������']");
		webtest.click("xpath=//a[@href='http://localhost:98/index.php?s=/index/usergoodsbrowse/index.html']");
		webtest.click("xpath=/html/body/div[4]/div[3]/div/div/form/div[3]/table/tbody/tr[1]/td[6]/button[1]/span");
		webtest.click("class=am-close am-close-alt am-icon-times am-close-spin");
		
	}
	
	@Test
	public void  test44() throws InterruptedException{
		//�����������-�ҵ��㼣-����
		webtest.click("xpath=//span[text()='��������']");
		webtest.click("xpath=//a[@href='http://localhost:98/index.php?s=/index/usergoodsbrowse/index.html']");
		webtest.click("xpath=/html/body/div[4]/div[3]/div/div/form/div[3]/table/tbody/tr[1]/td[1]/div/label/span/i[2]");
		webtest.click("xpath=//button[@class='am-btn am-btn-danger am-radius am-btn-xs am-icon-trash-o form-table-operate-top-delete-submit']");
		webtest.click("class=am-modal-btn");
	
	}
	
	@Test
	public void  test45() throws InterruptedException{
		//�����������-�ҵ��㼣-ȫѡ-����
		webtest.click("xpath=//span[text()='��������']");
		webtest.click("xpath=//a[@href='http://localhost:98/index.php?s=/index/usergoodsbrowse/index.html']");
		webtest.click("xpath=//button[@class='am-btn am-btn-secondary am-radius am-btn-xs form-table-operate-checkbox-submit']");
		webtest.click("xpath=/html/body/div[4]/div[3]/div/div/form/div[2]/a");
		Thread.sleep(2000);
	}
	
	
	@Test
	public void  test46() throws InterruptedException{
		//�����������-�ҵ��㼣-ȫѡ-����-����
		webtest.click("xpath=//span[text()='��������']");
		webtest.click("xpath=//a[@href='http://localhost:98/index.php?s=/index/usergoodsbrowse/index.html']");
		webtest.click("xpath=//button[@class='am-btn am-btn-secondary am-radius am-btn-xs form-table-operate-checkbox-submit']");
		webtest.click("xpath=/html/body/div[4]/div[3]/div/div/form/div[2]/a");
		Thread.sleep(2000);
		webtest.click("xpath=//button[@class='am-btn am-btn-primary am-radius am-btn-xs btn-loading-example am-icon-search']");
	}
	
	
	@Test
	public void  test47() throws InterruptedException{
		//�����������-�ҵ��㼣-ȫѡ-��ѡ-ɾ��
		webtest.click("xpath=//span[text()='��������']");
		webtest.click("xpath=//a[@href='http://localhost:98/index.php?s=/index/usergoodsbrowse/index.html']");
		webtest.click("xpath=//button[@class='am-btn am-btn-secondary am-radius am-btn-xs form-table-operate-checkbox-submit']");
		webtest.click("xpath=//button[@class='am-btn am-btn-secondary am-radius am-btn-xs form-table-operate-checkbox-submit']");
		Thread.sleep(2000);
		webtest.click("xpath=//button[@class='am-btn am-btn-danger am-radius am-btn-xs am-icon-trash-o form-table-operate-top-delete-submit']");
	}
	
	@Test
	public void  test48() throws InterruptedException{
		//���������-�ʴ�/����-����
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
		webtest.type("name=content","������������" );
		Thread.sleep(2000);
		webtest.click("xpath=//button[@class='am-btn am-btn-primary am-radius btn-loading-example am-btn-sm am-btn-block']");
	}
	
	
	@Test
	public void  test49() throws InterruptedException{
		//���������-�ʴ�/����-����-����
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
		webtest.type("name=content","������������" );
		Thread.sleep(2000);
		webtest.click("xpath=//button[@class='am-btn am-btn-primary am-radius btn-loading-example am-btn-sm am-btn-block']");
	    webtest.click("xpath=//a[@class='am-btn am-btn-warning am-radius am-btn-sm am-icon-filter']");
	    Thread.sleep(2000);
	    webtest.click("xpath=//button[@class='am-btn am-btn-primary am-radius am-btn-xs btn-loading-example am-icon-search']");
	    Thread.sleep(2000);
	}
	
	@Test
	public void  test50() throws InterruptedException{
		//���������-�ʴ�/����-����-����
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
		webtest.type("name=content","������������" );
		Thread.sleep(2000);
		webtest.click("xpath=//button[@class='am-btn am-btn-primary am-radius btn-loading-example am-btn-sm am-btn-block']");
		webtest.click("xpath=//button[@class='am-btn am-btn-primary am-radius am-btn-xs btn-loading-example am-icon-search']");
	    Thread.sleep(2000);
	    
	}
	
	
	@Test
	public void test51() throws InterruptedException{
		//��������-��ȫ�˳��������Ľ���
		webtest.click("xpath=//span[text()='��������']");
		webtest.click("xpath=//a[@href='http://localhost:98/index.php?s=/index/user/logout.html']");
	}
	
		
	
}