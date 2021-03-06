package com.www.lw.selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;
 
public class Chandao  {
	
	@Test
	public void test1() throws IOException, InterruptedException {
		String filepath = "C:\\Users\\GAO\\Desktop\\project-exercise\\自动化测试\\冒烟测试.xlsx";
		System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		WebDriver driver = new FirefoxDriver();
//		允许浏览器执行js代码
		DesiredCapabilities sCaps = new DesiredCapabilities();
		sCaps.setJavascriptEnabled(true);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//打开网页
		driver.get("https://2018testing.zentaopm.com/testcase-batchCreate-2-0-0.html"); 
		
//输入用户名密码
		driver.findElement(By.id("account")).sendKeys("liangwei2020");
		driver.findElement(By.name("password")).sendKeys("liangwei2020");
		driver.findElement(By.id("submit")).click();
		
	

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//开始获取Excel文件内的登录信息
		FileInputStream in = new FileInputStream(filepath);
		XSSFWorkbook workbook = new XSSFWorkbook(in);
		XSSFSheet sheet = workbook.getSheetAt(0);
		
		for(int j=2;j<12;j++ ) {
			XSSFRow row = sheet.getRow(j);
			
			XSSFCell cell = row.getCell(3);
			//设置单元格类型
			cell.setCellType(CellType.STRING);
			String userName = cell.getStringCellValue();
			
			System.out.println(userName );
			in.close();
//填入数据
			driver.findElement(By.id("title["+(j-2)+"]")).sendKeys(userName);	
			driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			
		}
		Thread.sleep(1000);
		driver.findElement(By.id("submit")).click();
		Thread.sleep(3000);
		driver.close();

	}
 
}
