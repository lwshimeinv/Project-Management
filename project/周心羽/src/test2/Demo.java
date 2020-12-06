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
		webtest.click("xpath=//button[text()='��¼']");
		Thread.sleep(1000);
	}
	
	@Test
	public void test2() throws InterruptedException{
		webtest.click("xpath=//span[text()='��վ����']");
		webtest.click("xpath=//span[text()='��������']");
		Thread.sleep(1000);
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='�༭']");
		Thread.sleep(1000);	
//		webtest.click("xpath=/html/body/div[2]/div/div[1]/div/div[2]/form/div[6]/div/label[2]/span/i[2]");
		webtest.click("xpath=//button[text()='����']");
		Thread.sleep(1000);	
	}
	@Test
	public void test3() throws InterruptedException{
		webtest.click("xpath=//span[text()='��վ����']");
		webtest.click("xpath=//span[text()='��������']");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//button");
		webtest.click("xpath=//button[@class='am-btn am-btn-link am-btn-xs am-btn-block am-text-left am-padding-horizontal-sm am-icon-plus submit-add']");
		webtest.click("xpath=//li[@class='active-result result-selected']");
		webtest.click("name=name");
		webtest.type("name=name", "test01");
		webtest.click("name=url");
		webtest.type("name=url", "https://www.baidu.com");
		webtest.click("xpath=//button[text()='����']");
	}
	
	@Test
	public void test4() throws InterruptedException{
		webtest.click("xpath=//span[text()='��վ����']");
		webtest.click("xpath=//span[text()='��������']");
		Thread.sleep(1000);
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='ɾ��']");
     	webtest.click("xpath=//span[text()='ȷ��']");
		Thread.sleep(1000);	
	}
		
	@Test
	public void test5() throws InterruptedException{
		webtest.click("xpath=//span[text()='��վ����']");
		webtest.click("xpath=//span[text()='��������']");
		Thread.sleep(1000);
		webtest.enterFrame("ifcontent");
		webtest.click("name=f1p");
		webtest.type("name=f1p", "��Ʒ����");
		webtest.click("xpath=//button[@class='am-btn am-btn-primary am-radius am-btn-xs btn-loading-example am-icon-search']");
		Thread.sleep(1000);	
	}
	
	@Test
	public void test6() throws InterruptedException{
		webtest.click("xpath=//span[text()='��վ����']");
		webtest.click("xpath=//span[text()='�Զ���ҳ��']");
		Thread.sleep(1000);
		webtest.enterFrame("ifcontent");
		webtest.click("name=f1p");
		webtest.type("name=f1p", "add");
		webtest.click("xpath=//button[@class='am-btn am-btn-primary am-radius am-btn-xs btn-loading-example am-icon-search']");
		Thread.sleep(1000);	
	}
	
	@Test
	public void test7() throws InterruptedException{
		webtest.click("xpath=//span[text()='��վ����']");
		webtest.click("xpath=//span[text()='�Զ���ҳ��']");
		Thread.sleep(1000);
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='ɾ��']");
		webtest.click("xpath=//span[text()='ȷ��']");
		Thread.sleep(1000);	
	}
	
	@Test
	public void test8() throws InterruptedException{
		webtest.click("xpath=//span[text()='��վ����']");
		webtest.click("xpath=//span[text()='�Զ���ҳ��']");
		Thread.sleep(1000);
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//a[text()='�༭']");
		webtest.click("xpath=//button[text()='����']");
		Thread.sleep(1000);	
	}


	@Test
	public void test10() throws InterruptedException{
		webtest.click("xpath=//span[text()='��վ����']");
		webtest.click("xpath=//span[text()='�Զ���ҳ��']");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//a[@class='am-btn am-btn-secondary am-radius am-btn-xs am-icon-plus']");
		webtest.click("name=title");
		webtest.type("name=title", "test01");
		webtest.enterFrame("ueditor_1");
		webtest.click("xpath=/html/body");
		webtest.type("xpath=/html/body", "���Բ��Բ��Բ��Բ��Բ���");
		Thread.sleep(1000);	
		webtest.click("xpath=//button[text()='����']");
	}
	
	@Test
	public void test9() throws InterruptedException{
		webtest.click("xpath=//span[text()='��վ����']");
		webtest.click("xpath=//span[text()='�Զ���ҳ��']");
		Thread.sleep(1000);
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='����']");
	    webtest.click("xpath=//span[@class='am-close am-close-alt am-icon-times am-close-spin']");
	}
	

	@Test
	public void test11() throws InterruptedException{
		webtest.click("xpath=//span[text()='��վ����']");
		webtest.click("xpath=//span[text()='��������']");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//button[@class='am-btn am-btn-secondary am-radius am-btn-xs am-icon-plus submit-add']");
		webtest.click("name=name");
		webtest.type("name=name", "test01");
		webtest.click("name=url");
		webtest.type("name=url", "https://www.baidu.com");
		webtest.click("xpath=//button[text()='����']");
	}
	
	@Test
	public void test12() throws InterruptedException{
		webtest.click("xpath=//span[text()='��վ����']");
		webtest.click("xpath=//span[text()='��������']");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='ɾ��']");
		webtest.click("xpath=//span[text()='ȷ��']");
	}

	@Test
	public void test13() throws InterruptedException{
		webtest.click("xpath=//span[text()='��վ����']");
		webtest.click("xpath=//span[text()='��������']");
		Thread.sleep(1000);
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='����']");
		webtest.click("xpath=//span[@class='am-close am-close-alt am-icon-times am-close-spin']");
	}
	
	@Test
	public void test14() throws InterruptedException{
		webtest.click("xpath=//span[text()='��վ����']");
		webtest.click("xpath=//span[text()='��������']");
		Thread.sleep(1000);
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//a[text()='�༭']");
		webtest.click("xpath=//button[text()='����']");
	}
	
	@Test
	public void test15() throws InterruptedException{
		webtest.click("xpath=//span[text()='��վ����']");
		webtest.click("xpath=//span[text()='��������']");
		Thread.sleep(1000);
		webtest.enterFrame("ifcontent");
		webtest.click("name=f1p");
		webtest.type("name=f1p", "����");
		webtest.click("xpath=//button[@class='am-btn am-btn-primary am-radius am-btn-xs btn-loading-example am-icon-search']");
		Thread.sleep(1000);	
	}
	
	@Test
	public void test16() throws InterruptedException{
		webtest.click("xpath=//span[text()='��վ����']");
		webtest.click("xpath=//span[text()='��ҳ�ֲ�']");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='ɾ��']");
		webtest.click("xpath=//span[text()='ȷ��']");
	}
	
	@Test
	public void test17() throws InterruptedException{
		webtest.click("xpath=//span[text()='��վ����']");
		webtest.click("xpath=//span[text()='��ҳ�ֲ�']");
		Thread.sleep(1000);
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='����']");
		webtest.click("xpath=//span[@class='am-close am-close-alt am-icon-times am-close-spin']");
	}
	
	@Test
	public void test18() throws InterruptedException{
		webtest.click("xpath=//span[text()='��վ����']");
		webtest.click("xpath=//span[text()='��ҳ�ֲ�']");
		Thread.sleep(1000);
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//a[text()='�༭']");
		webtest.click("xpath=//button[text()='����']");
	}
	
	@Test
	public void test19() throws InterruptedException{
		webtest.click("xpath=//span[text()='��վ����']");
		webtest.click("xpath=//span[text()='��ҳ�ֲ�']");
		Thread.sleep(1000);
		webtest.enterFrame("ifcontent");
		webtest.click("name=f1p");
		webtest.type("name=f1p", "�����δ��");
		webtest.click("xpath=//button[@class='am-btn am-btn-primary am-radius am-btn-xs btn-loading-example am-icon-search']");
	}
	
	@Test
	public void test20() throws InterruptedException{
		webtest.click("xpath=//span[text()='��վ����']");
		webtest.click("xpath=//span[text()='ɸѡ�۸�']");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//button[@class='am-btn am-btn-danger am-btn-xs am-radius am-icon-trash-o c-p m-l-10 submit-delete']");
		webtest.click("xpath=//span[text()='ȷ��']");
	}
	
	@Test
	public void test21() throws InterruptedException{
		webtest.click("xpath=//span[text()='��վ����']");
		webtest.click("xpath=//span[text()='ɸѡ�۸�']");
		Thread.sleep(1000);
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//button[@class='am-btn am-btn-secondary am-btn-xs am-radius am-icon-edit c-p submit-edit']");
		webtest.click("xpath=//button[text()='����']");
	}
	
	@Test
	public void test22() throws InterruptedException{
		webtest.click("xpath=//span[text()='��վ����']");
		webtest.click("xpath=//span[text()='ɸѡ�۸�']");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//button[@class='am-btn am-btn-secondary am-radius am-btn-xs am-icon-plus tree-submit-add']");
		webtest.click("name=name");
		webtest.type("name=name", "50-100");
		webtest.click("xpath=//button[text()='����']");
	}
	
//	@Test
//	public void test23() throws InterruptedException{
//		webtest.click("xpath=//span[text()='��վ����']");
//		webtest.click("xpath=//span[text()='��������']");
//		webtest.enterFrame("ifcontent");
//		webtest.click("xpath=//button[@class='am-btn am-btn-secondary am-btn-xs am-radius am-icon-edit c-p submit-edit']");
//		webtest.click("xpath=//button[text()='����']");
//	}
	
	@Test
	public void test24() throws InterruptedException{
		webtest.click("xpath=//span[text()='��վ����']");
		webtest.click("xpath=//span[text()='��������']");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//button[@class='am-btn am-btn-secondary am-radius am-btn-xs am-icon-plus tree-submit-add']");
		webtest.click("name=name");
		webtest.type("name=name", "����ʡ");
		webtest.click("xpath=//button[text()='����']");
	}
	

	@Test
	public void test25() throws InterruptedException{
		webtest.click("xpath=//span[text()='��վ����']");
		webtest.click("xpath=//span[text()='��ݹ���']");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//button[@class='am-btn am-btn-secondary am-btn-xs am-radius am-icon-edit c-p submit-edit']");
		webtest.click("xpath=//button[text()='����']");
	}
	
	@Test
	public void test26() throws InterruptedException{
		webtest.click("xpath=//span[text()='��վ����']");
		webtest.click("xpath=//span[text()='��ݹ���']");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//button[@class='am-btn am-btn-danger am-btn-xs am-radius am-icon-trash-o c-p m-l-10 submit-delete']");
		webtest.click("xpath=//span[text()='ȷ��']");
	}
	
	@Test
	public void test27() throws InterruptedException{
		webtest.click("xpath=//span[text()='��վ����']");
		webtest.click("xpath=//span[text()='��ݹ���']");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//button[@class='am-btn am-btn-secondary am-radius am-btn-xs am-icon-plus tree-submit-add']");
		webtest.click("name=name");
		webtest.type("name=name", "test���");
		webtest.click("xpath=//button[text()='����']");
	}
	
	@Test
	public void test28() throws InterruptedException{
		webtest.click("xpath=//span[text()='��վ����']");
		webtest.click("xpath=//span[text()='֧����ʽ']");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='��װ']");
		webtest.click("xpath=//span[text()='ȷ��']");
	}
	
	@Test
	public void test29() throws InterruptedException{
		webtest.click("xpath=//span[text()='��վ����']");
		webtest.click("xpath=//span[text()='֧����ʽ']");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='�༭']");
		webtest.click("xpath=//button[text()='����']");
	}
	
	@Test
	public void test30() throws InterruptedException{
		webtest.click("xpath=//span[text()='��վ����']");
		webtest.click("xpath=//span[text()='֧����ʽ']");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='ж��']");
		webtest.click("xpath=//span[text()='ȷ��']");
	}
	
	@Test
	public void test31() throws InterruptedException{
		webtest.click("xpath=//span[text()='��վ����']");
		webtest.click("xpath=//span[text()='֧����ʽ']");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='ɾ��']");
		webtest.click("xpath=//span[text()='ȷ��']");
	}
	
	@Test
	public void test33() throws InterruptedException{
		webtest.click("xpath=//span[text()='Ʒ�ƹ���']");
		webtest.click("xpath=/html/body/div[1]/div[1]/div/ul/li[9]/ul/li[1]/a/span");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='�༭']");
		webtest.click("xpath=//button[text()='����']");
		Thread.sleep(1000);	
	}
	
	@Test
	public void test32() throws InterruptedException{
		webtest.click("xpath=//span[text()='Ʒ�ƹ���']");
		webtest.click("xpath=/html/body/div[1]/div[1]/div/ul/li[9]/ul/li[1]/a/span");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='����']");
		webtest.click("xpath=//span[@class='am-close am-close-alt am-icon-times am-close-spin']");
	}
	
	@Test
	public void test34() throws InterruptedException{
		webtest.click("xpath=//span[text()='Ʒ�ƹ���']");
		webtest.click("xpath=/html/body/div[1]/div[1]/div/ul/li[9]/ul/li[1]/a/span");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='ɾ��']");
     	webtest.click("xpath=//span[text()='ȷ��']");
	}
		
	@Test
	public void test35() throws InterruptedException{
		webtest.click("xpath=//span[text()='Ʒ�ƹ���']");
		webtest.click("xpath=/html/body/div[1]/div[1]/div/ul/li[9]/ul/li[1]/a/span");
		webtest.enterFrame("ifcontent");
		webtest.click("name=f1p");
		webtest.type("name=f1p", "ǿ��");
		webtest.click("xpath=//button[@class='am-btn am-btn-primary am-radius am-btn-xs btn-loading-example am-icon-search']");
	}
	
	@Test
	public void test36() throws InterruptedException{
		webtest.click("xpath=//span[text()='Ʒ�ƹ���']");
		webtest.click("xpath=//span[text()='Ʒ�Ʒ���']");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//button[@class='am-btn am-btn-secondary am-radius am-btn-xs am-icon-plus tree-submit-add']");
		webtest.click("name=name");
		webtest.type("name=name", "test01");
		webtest.click("xpath=//button[text()='����']");
	}
	
	@Test
	public void test37() throws InterruptedException{
		webtest.click("xpath=//span[text()='Ʒ�ƹ���']");
		webtest.click("xpath=//span[text()='Ʒ�Ʒ���']");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//button[@class='am-btn am-btn-danger am-btn-xs am-radius am-icon-trash-o c-p m-l-10 submit-delete']");
		webtest.click("xpath=//span[text()='ȷ��']");
	}
	
	@Test
	public void test38() throws InterruptedException{
		webtest.click("xpath=//span[text()='Ʒ�ƹ���']");
		webtest.click("xpath=//span[text()='Ʒ�Ʒ���']");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//button[@class='am-btn am-btn-secondary am-btn-xs am-radius am-icon-edit c-p submit-edit']");
		webtest.click("xpath=//button[text()='����']");
		Thread.sleep(1000);	
	}
	
	@Test
	public void test39() throws InterruptedException{
		webtest.click("xpath=//span[text()='�ֿ����']");
		webtest.click("xpath=/html/body/div[1]/div[1]/div/ul/li[10]/ul/li[1]/a/span");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='����']");
		webtest.click("xpath=//span[@class='am-close am-close-alt am-icon-times am-close-spin']");
	}
	
	@Test
	public void test40() throws InterruptedException{
		webtest.click("xpath=//span[text()='�ֿ����']");
		webtest.click("xpath=/html/body/div[1]/div[1]/div/ul/li[10]/ul/li[1]/a/span");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='�༭']");
		webtest.click("xpath=//button[text()='����']");
	}
	
	@Test
	public void test41() throws InterruptedException{
		webtest.click("xpath=//span[text()='�ֿ����']");
		webtest.click("xpath=/html/body/div[1]/div[1]/div/ul/li[10]/ul/li[1]/a/span");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='ɾ��']");
		webtest.click("xpath=//span[text()='ȷ��']");
	}
	
	@Test
	public void test42() throws InterruptedException{
		webtest.click("xpath=//span[text()='�ֿ����']");
		webtest.click("xpath=/html/body/div[1]/div[1]/div/ul/li[10]/ul/li[1]/a/span");
		webtest.enterFrame("ifcontent");
		webtest.click("name=f1p");
		webtest.type("name=f1p", "�Ϻ��ֿ�");
		webtest.click("xpath=//button[@class='am-btn am-btn-primary am-radius am-btn-xs btn-loading-example am-icon-search']");
	}
	
	@Test
	public void test43() throws InterruptedException{
		webtest.click("xpath=//span[text()='�ֿ����']");
		webtest.click("xpath=//span[text()='�ֿ���Ʒ����']");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='����']");
		webtest.click("xpath=//span[@class='am-close am-close-alt am-icon-times am-close-spin']");
	}
	
	@Test
	public void test44() throws InterruptedException{
		webtest.click("xpath=//span[text()='�ֿ����']");
		webtest.click("xpath=//span[text()='�ֿ���Ʒ����']");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='���']");
		webtest.click("xpath=//button[text()='����']");
	}
	
	@Test
	public void test45() throws InterruptedException{
		webtest.click("xpath=//span[text()='�ֿ����']");
		webtest.click("xpath=//span[text()='�ֿ���Ʒ����']");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='ɾ��']");
		webtest.click("xpath=//span[text()='ȷ��']");
	}
	
	@Test
	public void test46() throws InterruptedException{
		webtest.click("xpath=//span[text()='�ֿ����']");
		webtest.click("xpath=//span[text()='�ֿ���Ʒ����']");
		webtest.enterFrame("ifcontent");
		webtest.click("name=f1p");
		webtest.type("name=f1p", "ƻ����Apple��iPhone 6 Plus (A1524)�ƶ���ͨ����4G�ֻ� ��ɫ 16G ");
		webtest.click("xpath=//button[@class='am-btn am-btn-primary am-radius am-btn-xs btn-loading-example am-icon-search']");
	}
	
	@Test
	public void test47() throws InterruptedException{
		webtest.click("xpath=//span[text()='�ֻ�����']");
		webtest.click("xpath=//span[text()='��ҳ����']");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='����']");
		webtest.click("xpath=//span[@class='am-close am-close-alt am-icon-times am-close-spin']");
	}
	
	@Test
	public void test48() throws InterruptedException{
		webtest.click("xpath=//span[text()='�ֻ�����']");
		webtest.click("xpath=//span[text()='��ҳ����']");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='�༭']");
		webtest.click("xpath=//button[text()='����']");
	}
	
	@Test
	public void test49() throws InterruptedException{
		webtest.click("xpath=//span[text()='�ֻ�����']");
		webtest.click("xpath=//span[text()='��ҳ����']");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='ɾ��']");
		webtest.click("xpath=//span[text()='ȷ��']");
	}
	
	@Test
	public void test50() throws InterruptedException{
		webtest.click("xpath=//span[text()='�ֻ�����']");
		webtest.click("xpath=//span[text()='�û����ĵ���']");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='����']");
		webtest.click("xpath=//span[@class='am-close am-close-alt am-icon-times am-close-spin']");
	}
	
	@Test
	public void test51() throws InterruptedException{
		webtest.click("xpath=//span[text()='�ֻ�����']");
		webtest.click("xpath=//span[text()='�û����ĵ���']");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='�༭']");
		webtest.click("xpath=//button[text()='����']");
	}
	
	@Test
	public void test52() throws InterruptedException{
		webtest.click("xpath=//span[text()='�ֻ�����']");
		webtest.click("xpath=//span[text()='�û����ĵ���']");
		webtest.enterFrame("ifcontent");
		webtest.click("xpath=//span[text()='ɾ��']");
		webtest.click("xpath=//span[text()='ȷ��']");
	}
}
