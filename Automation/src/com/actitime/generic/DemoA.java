package com.actitime.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DemoA {
	@Test(enabled = false)
	public void demo() throws IOException {
	FileLib f=new FileLib();
	String url = f.readPropertyData("url");
	String un = f.readPropertyData("username");
	String pwd = f.readPropertyData("password");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get(url);
	driver.findElement(By.id("username")).sendKeys(un);
	driver.findElement(By.name("pwd")).sendKeys(pwd);}
	@Test
	public void demoA() throws IOException {
	FileLib f=new FileLib();
	String data1 = f.readExcelData("createUser",1,3);
	System.out.println(data1);
	String data2 = f.readExcelData("invalidData",10,0);
	System.out.println(data2);
	String data3 = f.readExcelData("invalidLogin",7,1);
	System.out.println(data3);
	f.writeDataIntoExcel("createUser", 1, 3, "Devil");
	f.writeDataIntoExcel("invalidData", 10, 0, "Iphone 17 pro max");
	f.writeDataIntoExcel("invalidLogin", 0, 0, "Trump");
	}
}
