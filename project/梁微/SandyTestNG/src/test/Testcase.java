package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


public class Testcase {
	
	@BeforeMethod
	public void BeforeMethod() {
		
	}
	@Test
	public void test1() throws Exception{
		System.out.println("this is test method1.");
	}
	
	@Test
	public void test2() throws Exception{
		System.out.println("this is test method2.");
	}
	
	@Test
	public void add() throws Exception{
		int a=5;
		int b=25;
		System.out.println("j" + "= " + a + "+" + b);
	}
	
	@Test
	public void test3() throws Exception{
		System.out.println("Keydom is the best company!!");
	}
	
	@Ignore
	public void Ignore() throws Exception{
		System.out.println("this method do not run!");
	}
	
	@AfterMethod
	public void AfterMethod() {
		
	}
	
	@AfterClass
	public void tearDown() throws Exception{
		System.out.println("测试结束后还原测试环境!");

}
}
