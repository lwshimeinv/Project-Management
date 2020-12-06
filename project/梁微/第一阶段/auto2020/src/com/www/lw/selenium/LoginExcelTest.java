package com.www.lw.selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
 
public class LoginExcelTest {
	
	@Test
	public void test1() throws IOException {
		String filepath = "C:\\Users\\GAO\\Desktop\\project-exercise\\loginin.xlsx";
		System.setProperty("webdriver.firefox.bin", "C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://im.qq.com/"); //获取URL
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//开始获取Excel文件内的登录信息
		FileInputStream in = new FileInputStream(filepath);
		XSSFWorkbook workbook = new XSSFWorkbook(in);
		XSSFSheet sheet = workbook.getSheetAt(0);
		XSSFRow row = sheet.getRow(1);
		int i = 0;
			XSSFCell cell = row.getCell(i);
		//设置单元格类型
			cell.setCellType(CellType.STRING);
		i++;
		String userName = cell.getStringCellValue();
		XSSFCell cell2 = row.getCell(i);
		cell2.setCellType(CellType.STRING);
		String passWord =  cell2.getStringCellValue();
		
		System.out.println(userName + "," + passWord);
		in.close();
		//传递参数用户名和密码文本框
		driver.findElement(By.id("login")).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		driver.findElement(By.xpath("//a[@id=\"switcher_plogin\"]")).click();
//		driver.switchTo().frame("login_frame");
		driver.switchTo().frame("//*[@id=\"login_frame\"]");
		driver.findElement(By.linkText("帐号密码登录")).click();
		
		
		driver.findElement(By.id("u")).sendKeys(userName);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.findElement(By.id("p")).sendKeys(passWord);
		driver.findElement(By.id("login_button")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String url = driver.getCurrentUrl();
		String result = null;
		//写入测试结果
		if ("https://im.qq.com/".equals(url)) {
			result = "pass";
		}else {
			result = "fail";
		};
		XSSFCell newCell = row.createCell(2);
		newCell.setCellValue(result);
		FileOutputStream out = new FileOutputStream(filepath);
		workbook.write(out);
		workbook.close();
		out.close();
		driver.quit();
		System.out.println("Down!");
	}
 
}
