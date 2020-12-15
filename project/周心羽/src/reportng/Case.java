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
        Reporter.log("测试1通过");

    }


    @Test
    public void Open1() throws InterruptedException 
    {

    	 webtest.open("http://www.baidu.com");
         webtest.type("id=kw", "testerhome");
        Reporter.log("测试2通过");

    }


    @Test
    public void Open2() throws InterruptedException 
    {

    	 webtest.open("http://www.baidu.com");
         webtest.type("id=kw", "testerhome");
        Reporter.log("测试3通过");

    }


   


}