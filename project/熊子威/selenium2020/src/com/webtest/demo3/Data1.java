package com.webtest.demo3;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data1 {

	
	@DataProvider(name="zl_shop")
	public  Object[][] getTxtData() throws IOException{
		return new  TxtData1().getTxtUser("data/user.txt");
	}
	@DataProvider(name="movie")
	public  Object[][] getMovieData() throws IOException{
		return new  Excel1().getTestDataByExcel("data/movie.xlxs","Sheet1");
	}
	@Test(dataProvider="txt")
	public void getData(String a,String b) {
		System.out.println(a+" "+b);
		
	}

	@DataProvider(name="excel")
	public Object[][] getExcelDada() throws IOException{
		return new Excel1().getTestDataByExcel("data/user.xlsx","Sheet1");
	}
	
	@DataProvider(name="mysql")
	public Object[][] getMysqlDada() throws IOException{
		return new Mysql1().getTestDataByMysql("SELECT filmname, petname\r\n" + 
				"FROM `mm_movie` ");
	}
	
	@Test(dataProvider="mysql")
	public void testDB(String a,String b) {
		System.out.println(a+" "+b);
	}
	
}
