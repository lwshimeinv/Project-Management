package com.webtest.demo1;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestContext;
import org.testng.TestRunner;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.webtest.demo2.Log1;
import com.webtest.demo2.Read1;



public class Base1 {

	public  WebDriver1 webtest;
	private WebDriver driver;
	public String driverType;

	
	

	private WebDriver newWebDriver(String driverType) throws IOException {
		WebDriver driver = null;
	 if (driverType.equalsIgnoreCase("firefox")) {
		    String firefox_driver =Read1.getPropertyValue("gecko_driver");
			String firefox_path = Read1.getPropertyValue("firefox_path");
			System.setProperty("webdriver.gecko.driver", firefox_driver);
			System.setProperty("webdriver.firefox.bin", firefox_path);
			driver = new FirefoxDriver();
	
			Log1.info("Using Firefox");
		}  else if (driverType.equalsIgnoreCase("chrome")) {
			String chrome_path = Read1.getPropertyValue("chrome_path");
			System.setProperty("webdriver.chrome.driver",chrome_path);
			driver = new ChromeDriver();
			Log1.info("Using Chrome");
			
		}else{
			return null;
		}

		
		return driver;

	
	}

	@BeforeClass
	public void doBeforeClass() throws Exception {

		driverType=Read1.getPropertyValue("driverType");
		driver = this.newWebDriver(driverType);
		driver.manage().window().maximize();
		Log1.info(driverType);
		webtest = new WebDriver1(driver);
	
	
	
	}


	@AfterClass
	public void doAfterMethod() {
		if(this.driver != null){
			this.driver.quit();
			}
		Log1.info("Quitted Browser");
	}
	


	
	
	public WebDriver getDriver() {
        return driver;
    }


	

}
