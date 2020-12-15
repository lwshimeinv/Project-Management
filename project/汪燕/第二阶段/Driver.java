package com.webtest.demo;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

 
public class Driver  {
	
	@Test
	public void test1() throws IOException, InterruptedException {
		String filepath = "C:\\Users\\Administrator\\Desktop\\大学资料\\软件测试\\项目实训\\冒烟测试用例.xlsx";
		System.setProperty("webdriver.firefox.bin", "D:\\Program Files (x86)\\Firefox\\firefox.exe");
		WebDriver driver = new FirefoxDriver();
//		允许浏览器执行js代码
		DesiredCapabilities sCaps = new DesiredCapabilities();
		sCaps.setJavascriptEnabled(true);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//打开网页
		driver.get("https://2018testing.zentaopm.com/testcase-batchCreate-2-0-0.html"); 
		
//输入用户名密码
		driver.findElement(By.id("account")).sendKeys("wangyan2020");
		driver.findElement(By.name("password")).sendKeys("wangyan2020");
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

