package reportng;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class Case extends BaseTest{
	
	

    @Test
    public void Open() throws InterruptedException 
    {

        webtest.open("http://www.baidu.com");
        webtest.type("id=kw", "testerhome");
        Reporter.log("����1ͨ��");

    }


    @Test
    public void Open1() throws InterruptedException 
    {

    	 webtest.open("http://www.baidu.com");
         webtest.type("id=kw", "testerhome");
        Reporter.log("����2ͨ��");

    }


    @Test
    public void Open2() throws InterruptedException 
    {

    	 webtest.open("http://www.baidu.com");
         webtest.type("id=kw", "testerhome");
        Reporter.log("����3ͨ��");

    }


   


}