 package com.www.lw.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Demo2 extends BaseTest{
	String url = "http://localhost/admin.php?s=/admin/logininfo.html";
	
	@BeforeMethod
//	@Test
	public void test1() throws InterruptedException {
//		����ҳ
		webtest.open(url);
//		����û���
		webtest.click("name=username");
//		�����û���
		webtest.type("name=username", "admin");
		webtest.click("name=login_pwd");
		webtest.type("name=login_pwd", "shopxo");
		webtest.click("xpath=//button[text()='��¼']");
//		ͣ��1��
		Thread.sleep(1000);	}


  @Test
  public void test2() throws InterruptedException {
	    webtest.click("xpath=//span[text()='ϵͳ����']");
	    webtest.click("xpath=//span[text()='��̨����']");
	    
  }     
	    
	    
	    
  @Test
  public void test3() throws InterruptedException {
	    webtest.click("xpath=//span[text()='ϵͳ����']");
	    webtest.click("xpath=//span[text()='��̨����']");
	     
	    webtest.click("xpath=//button[text()='����'");
	    Thread.sleep(1000);	
  }      
	    
	    
  @Test
  public void test4() throws InterruptedException {
	    webtest.click("xpath=//span[text()='ϵͳ����']");
	    webtest.click("xpath=//span[text()='�̵���Ϣ']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//button[text()='����']");
	    Thread.sleep(1000);	
  }         
	    
  @Test
  public void test5() throws InterruptedException {
	    webtest.click("xpath=//span[text()='վ������']");
	    webtest.click("xpath=//span[text()='վ������']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//button[text()='����']");
	    Thread.sleep(1000);	
  }         
	    
  @Test
  public void test6() throws InterruptedException {
	  
	    webtest.click("xpath=//span[text()='վ������']");	    	
	    webtest.click("xpath=//span[text()='վ������']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//a[text()='������Ϣ']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//button[text()='����']");
	    Thread.sleep(1000);	
  }         
	    
	    
  @Test
  public void test7() throws InterruptedException {
	    webtest.click("xpath=//span[text()='վ������']");
	    webtest.click("xpath=//span[text()='վ������']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//a[text()='վ������']");
	    webtest.click("xpath=//button[text()='����']");
	    Thread.sleep(1000);	
  }         
  
  
  @Test
  public void test8() throws InterruptedException {
	    webtest.click("xpath=//span[text()='վ������']");
	    webtest.click("xpath=//span[text()='վ������']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//a[text()='�û�ע�� ']");
	    webtest.click("xpath=//button[text()='����']");
	    Thread.sleep(1000);	
  }         
  
  
  @Test
  public void test9() throws InterruptedException {
	    webtest.click("xpath=//span[text()='վ������']");
	    webtest.click("xpath=//span[text()='վ������']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//a[text()='�û���¼ ']");
	    webtest.click("xpath=//button[text()='����']");
	    Thread.sleep(1000);	
  } 
  
  @Test
  public void test10() throws InterruptedException {
	    webtest.click("xpath=//span[text()='վ������']");
	    webtest.click("xpath=//span[text()='վ������']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//a[text()='�����һ� ']");
	    webtest.click("xpath=//button[text()='����']");
	    Thread.sleep(1000);	
  } 
  
  @Test
  public void test11() throws InterruptedException {
	    webtest.click("xpath=//span[text()='վ������']");
	    webtest.click("xpath=//span[text()='վ������']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//a[text()='���� ']");
	    webtest.click("xpath=//button[text()='����']");
	    Thread.sleep(1000);	
  } 
  
  
  @Test
  public void test12() throws InterruptedException {
	    webtest.click("xpath=//span[text()='վ������']");
	    webtest.click("xpath=//span[text()='վ������']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//a[text()='��֤�� ']");
	    webtest.click("xpath=//button[text()='����']");
	    Thread.sleep(1000);	
  } 
  
  @Test
  public void test13() throws InterruptedException {
	    webtest.click("xpath=//span[text()='վ������']");
	    webtest.click("xpath=//span[text()='վ������']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//a[text()='�����ۺ� ']");
	    webtest.click("xpath=//button[text()='����']");
	    Thread.sleep(1000);	
  } 
  
  @Test
  public void test14() throws InterruptedException {
	    webtest.click("xpath=//span[text()='վ������']");
	    webtest.click("xpath=//span[text()='վ������']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//a[text()='���� ']");
	    webtest.click("xpath=//button[text()='����']");
	    Thread.sleep(1000);	
  } 
  
  
  @Test
  public void test15() throws InterruptedException {
	    webtest.click("xpath=//span[text()='վ������']");
	    webtest.click("xpath=//span[text()='վ������']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//a[text()='��Ʒ ']");
	    webtest.click("xpath=//button[text()='����']");
	    Thread.sleep(1000);	
  } 
  
  
  @Test
  public void test16() throws InterruptedException {
	    webtest.click("xpath=//span[text()='վ������']");
	    webtest.click("xpath=//span[text()='վ������']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//a[text()='��չ�� ']");
	    webtest.click("xpath=//button[text()='����']");
	    Thread.sleep(1000);	
  } 
  
  
  @Test
  public void test17() throws InterruptedException {
	    webtest.click("xpath=//span[text()='վ������']");
	    webtest.click("xpath=//span[text()='��������']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//button[text()='����']");
	    Thread.sleep(1000);	
  } 
  
  
  @Test
  public void test18() throws InterruptedException {
	    webtest.click("xpath=//span[text()='վ������']");
	    webtest.click("xpath=//span[text()='��������']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//a[text()='��Ϣģ�� ']");
	    webtest.click("xpath=//button[text()='����']");
	    Thread.sleep(2000);	
  } 
  
  
  @Test
  public void test19() throws InterruptedException {
	    webtest.click("xpath=//span[text()='վ������']");
	    webtest.click("xpath=//span[text()='��������']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//button[text()='����']");
	    Thread.sleep(1000);	
  } 
  
  
  @Test
  public void test20() throws InterruptedException {
	    webtest.click("xpath=//span[text()='վ������']");
	    webtest.click("xpath=//span[text()='��������']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//a[text()='��Ϣģ�� ']");
	    webtest.click("xpath=//button[text()='����']");
	    Thread.sleep(1000);	
  } 
  
  @Test
  public void test21() throws InterruptedException {
	    webtest.click("xpath=//span[text()='վ������']");
	    webtest.click("xpath=//span[text()='SEO����']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//button[text()='����']");
	    Thread.sleep(1000);	
  } 
  
  @Test
  public void test22() throws InterruptedException {
	    webtest.click("xpath=//span[text()='վ������']");
	    webtest.click("xpath=//span[text()='Э�����']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//button[text()='����']");
	    Thread.sleep(1000);	
  } 
  
  
  @Test
  public void test23() throws InterruptedException {
	    webtest.click("xpath=//span[text()='Ȩ�޿���']");
	    webtest.click("xpath=//span[text()='����Ա�б�']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//span[text()='����']");
	    Thread.sleep(1000);	
  } 
  
  @Test
  public void test24() throws InterruptedException {
	    webtest.click("xpath=//span[text()='Ȩ�޿���']");
	    webtest.click("xpath=//span[text()='����Ա�б�']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//span[text()='�༭']");
	    webtest.click("xpath=//button[text()='����']");
	    Thread.sleep(1000);	
  } 
  
   
  @Test
  public void test25() throws InterruptedException {
	    webtest.click("xpath=//span[text()='Ȩ�޿���']");
	    webtest.click("xpath=//span[text()='����Ա�б�']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//span[text()='ɾ��']");
	    webtest.click("xpath=//span[text()='ȷ��']");
	    Thread.sleep(1000);	
  } 
  
  
  @Test
  public void test26() throws InterruptedException {
	    webtest.click("xpath=//span[text()='Ȩ�޿���']");
	    webtest.click("xpath=//span[text()='��ɫ����']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//span[text()='����']");
	    Thread.sleep(1000);	
  } 
  
  
  @Test
  public void test27() throws InterruptedException {
	    webtest.click("xpath=//span[text()='Ȩ�޿���']");
	    webtest.click("xpath=//span[text()='��ɫ����']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//span[text()='�༭']");
	    webtest.click("xpath=//button[text()='����']");
	    Thread.sleep(1000);	
  } 
  
  
  
  @Test
  public void test28() throws InterruptedException {
	    webtest.click("xpath=//span[text()='Ȩ�޿���']");
	    webtest.click("xpath=//span[text()='��ɫ����']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//span[text()='ɾ��']");
	    webtest.click("xpath=//span[text()='ȷ��']");
	    Thread.sleep(1000);	
  } 
  
  
  @Test
  public void test29() throws InterruptedException {
	    webtest.click("xpath=//span[text()='Ȩ�޿���']");
	    webtest.click("xpath=//span[text()='Ȩ�޷���']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//button[@class='am-btn am-btn-secondary am-radius am-btn-xs am-icon-plus submit-add']");
	    webtest.click("name=name");
	    webtest.type("name=name", "syysyy");
	    Thread.sleep(1000);
	    webtest.click("name= control");
	    webtest.type("name=control","abcdefg");
	    webtest.click("name= action");
	    webtest.type("name=action", "ceshi");
	    webtest.click("xpath=//button[text()='����']");
	    Thread.sleep(1000);	
  } 
  
  
  @Test
  public void test30() throws InterruptedException {
	    webtest.click("xpath=//span[text()='Ȩ�޿���']");
	    webtest.click("xpath=//span[text()='����Ա�б�']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//a[@class='am-btn am-btn-secondary am-radius am-btn-xs am-icon-plus']");
	    webtest.click("name=username");
	    webtest.type("name=username", "syysyy");
	    Thread.sleep(1000);
	    webtest.click("name=login_pwd");
	    webtest.type("name=login_pwd","abcdefg");
	    webtest.click("name=mobile");
	    webtest.type("name=mobile", "18532135970");
	    webtest.click("xpath=//span[text()='��ѡ��...']");
	    webtest.click("xpath=//li[@class='active-result']");
	    webtest.click("xpath=//button[text()='����']");
	    Thread.sleep(1000);	
  } 
  
  
  
  
  @Test
  public void test31() throws InterruptedException {
	    webtest.click("xpath=//span[text()='Ȩ�޿���']");
	    webtest.click("xpath=//span[text()='����Ա�б�']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//a[@class='am-btn am-btn-warning am-radius am-btn-sm am-icon-filter']");   
	    Thread.sleep(1000);	
  } 
  
  
  @Test
  public void test32() throws InterruptedException {
	    webtest.click("xpath=//span[text()='Ȩ�޿���']");
	    webtest.click("xpath=//span[text()='����Ա�б�']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("name=f1p");  
	    webtest.type("name=f1p","admin");
	    Thread.sleep(1000);	
	    webtest.click("xpath=//button[@class='am-btn am-btn-primary am-radius am-btn-xs btn-loading-example am-icon-search']");
	    Thread.sleep(1000);	
  } 
  
  
  @Test
  public void test33() throws InterruptedException {
	    webtest.click("xpath=//span[text()='Ȩ�޿���']");
	    webtest.click("xpath=//span[text()='��ɫ����']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("name=f1p");  
	    webtest.type("name=f1p","����Ա");
	    Thread.sleep(1000);	
	    webtest.click("xpath=//button[@class='am-btn am-btn-primary am-radius am-btn-xs btn-loading-example am-icon-search']");
	    Thread.sleep(1000);	
  } 
  
  
  
  @Test
  public void test34() throws InterruptedException {
	    webtest.click("xpath=//span[text()='Ȩ�޿���']");
	    webtest.click("xpath=//span[text()='��ɫ����']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//a[@class='am-btn am-btn-secondary am-radius am-btn-xs am-icon-plus']");
	    webtest.click("name=name");
	    webtest.type("name=name", "1234567");
	    Thread.sleep(1000);
	    webtest.click("xpath=//button[text()='����']");
	    Thread.sleep(1000);	
  } 
      			
	    		
	    		
	    	 
  public void test35() throws InterruptedException {
	    webtest.click("xpath=//span[text()='Ȩ�޿���']");
	    webtest.click("xpath=//span[text()='��ɫ����']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//a[@class='am-btn am-btn-warning am-radius am-btn-sm am-icon-filter']");   
	    Thread.sleep(1000);	
  } 
  
  
  //��������Ա
  @Test
  public void test36() throws InterruptedException {
	    webtest.click("xpath=//span[text()='ϵͳ����']");
	    webtest.click("xpath=//span[text()='��̨����']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//span[text()='utf-8']");   
	    webtest.click("xpath=//li[@class='active-result']"); 
	    webtest.click("xpath=//span[text()='����']");
	    webtest.click("xpath=//li[@class='active-result highlighted']");
	    webtest.click("name=common_page_size");
	    webtest.type("name=common_page_size","9");
	    webtest.click("name=common_spec_add_max_number");
	    webtest.type("name=common_spec_add_max_number","1111111");
	    webtest.click("xpath=//button[text()='����']");
	    Thread.sleep(1000);	
  } 
  
  
  //����鿴��ҳ��Ϣ
  @Test
  public void test37() throws InterruptedException {
	    webtest.click("xpath=//span[text()='�鿴��ҳ']");	     
	    Thread.sleep(1000);	
  } 
  
  
  
  //ȫ����ʾ���˳�
  @Test
  public void test38() throws InterruptedException {
	    webtest.click("xpath=//span[text()='����ȫ��']");	   
	    webtest.click("xpath=//span[text()='�˳�ȫ��']");	 
	    Thread.sleep(1000);	
  } 
  
  
  
  //��ҳadmin������ת
  
  @Test
  public void test39() throws InterruptedException {
	    webtest.click("xpath=//span[text()='admin']");	   
	    webtest.click("xpath=//a[@data-url='http://localhost/admin.php?s=/admin/saveinfo/id/1.html']");	 
	    Thread.sleep(1000);	
  } 
  
  
  //��ҳadmin���˳�
   
  @Test
  public void test40() throws InterruptedException {
	    webtest.click("xpath=//span[text()='admin']");	   
	    webtest.click("xpath=//i[@class='am-icon-power-off']");	 
	    Thread.sleep(1000);	
  } 
  
  
  
   //��ҳ���ShopXO��ҵ������ϵͳ�ṩ��
  @Test
  public void test41() throws InterruptedException {
	    webtest.click("xpath=//a[@target='_blank'] ");	         
	    Thread.sleep(1000);	
  } 
  
  
  
  //��ҳ��� �����  
  @Test
  public void test42() throws InterruptedException {
	    webtest.click("xpath=//a[@target='_blank'] ");	         
	    Thread.sleep(1000);	
  }   
  
   
  //վ�������޸�
  @Test
  public void tes43() throws InterruptedException {
	    webtest.click("xpath=//span[text()='վ������']");
	    webtest.click("xpath=//span[text()='վ������']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//a[text()='վ������']");
	    webtest.click("xpath=//div[@class='chosen-drop']");
	    webtest.click("xpath=//li[@class='active-result highlighted']");
	    webtest.click("xpath=//div[@class='chosen-drop']");
	    webtest.click("xpath=//li[@class='active-result highlighted']");
	    webtest.click("xpath=//div[@class='chosen-drop']");
	    webtest.click("xpath=//li[@class='active-result highlighted']");
	    webtest.click("xpath=//button[text()='����']");
	    Thread.sleep(1000);	
  }         
  
  
  //�޸��û�ע��
  
  @Test
  public void tes44() throws InterruptedException {
	    webtest.click("xpath=//span[text()='վ������']");
	    webtest.click("xpath=//span[text()='վ������']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//a[text()='�û�ע��']");
	    webtest.click("xpath=//span[text()='����']");	   
	    webtest.click("xpath=//li[@class='active-result highlighted']");
	    webtest.click("xpath=//span[text()='��']");	   
	    webtest.click("xpath=//li[@class='active-result highlighted']");
	    webtest.click("xpath=//span[text()='����']");	   
	    webtest.click("xpath=//li[@class='active-result highlighted']");
	    webtest.click("xpath=//button[text()='����']");
	    Thread.sleep(1000);	
  }         
  
  
 //�޸��û���¼
  
  @Test
  public void tes45() throws InterruptedException {
	    webtest.click("xpath=//span[text()='վ������']");
	    webtest.click("xpath=//span[text()='վ������']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//a[text()='�û���¼']");
	    webtest.click("xpath=//span[text()='����']");	   
	    webtest.click("xpath=//li[@class='active-result highlighted']");	    
	    webtest.click("xpath=//span[text()='����']");	   
	    webtest.click("xpath=//li[@class='active-result highlighted']");
	    webtest.click("xpath=//button[text()='����']");
	    Thread.sleep(1000);	
  }         
  
  
  
  //�޸���֤��
  
  @Test
  public void tes46() throws InterruptedException {
	    webtest.click("xpath=//span[text()='վ������']");
	    webtest.click("xpath=//span[text()='վ������']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//a[text()='��֤��']");
	    webtest.click("xpath=//span[text()='����']");	   
	    webtest.click("xpath=//li[@class='active-result highlighted']");	    	    
	    webtest.click("xpath=//button[text()='����']");
	    Thread.sleep(1000);	
  }         
  
  
  
  
  //�޸Ķ����ۺ�
  
  @Test
  public void tes47() throws InterruptedException {
	    webtest.click("xpath=//span[text()='վ������']");
	    webtest.click("xpath=//span[text()='վ������']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//a[text()='�����ۺ�']");
	    webtest.click("name=home_order_aftersale_return_launch_day");
	    webtest.type("name=home_order_aftersale_return_launch_day", "100");
	    webtest.click("xpath=//button[text()='����']");
	    Thread.sleep(1000);	
  }         
  
  //�޸�����
  
  @Test
  public void tes48() throws InterruptedException {
	    webtest.click("xpath=//span[text()='վ������']");
	    webtest.click("xpath=//span[text()='վ������']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//a[text()='����']");
	    webtest.click("xpath=//span[text()='�Զ���']");	   
	    webtest.click("xpath=//li[@class='active-result']");	    	    
	    webtest.click("xpath=//button[text()='����']");
	    Thread.sleep(1000);	
  }         
  
  
  //�޸���Ʒ
  @Test
  public void tes49() throws InterruptedException {
	    webtest.click("xpath=//span[text()='վ������']");
	    webtest.click("xpath=//span[text()='վ������']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//a[text()='��Ʒ']");
	    webtest.click("xpath=//span[text()='��']");	   
	    webtest.click("xpath=//li[@class='active-result']");	    	    
	    webtest.click("xpath=//button[text()='����']");
	    Thread.sleep(1000);	
  }         
  
  
  
  //�޸���չ��
  @Test
  public void tes50() throws InterruptedException {
	    webtest.click("xpath=//span[text()='վ������']");
	    webtest.click("xpath=//span[text()='վ������']");
	    webtest.enterFrame("ifcontent");
	    webtest.click("xpath=//a[text()='��չ��']");
	    webtest.click("xpath=//span[text()='��']");	   
	    webtest.click("xpath=//li[@class='active-result']");	    	    
	    webtest.click("xpath=//button[text()='����']");
	    Thread.sleep(1000);	
  }         
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  }