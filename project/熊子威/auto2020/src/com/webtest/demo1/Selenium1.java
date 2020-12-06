package com.webtest.demo1;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class Selenium1 {
    public WebDriver driver;
 
    public Selenium1(WebDriver driver) {
        this.driver = driver;
    }
   
    public void screenShot() throws IOException {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd-HHmmss");
		String nowDateTime = sdf.format(new Date());

		File s_file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		Files.copy(s_file, new File("F:\\demo\\" + nowDateTime + ".jpg"));
	
	}

}