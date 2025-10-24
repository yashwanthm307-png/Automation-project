package com.actitime.generic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseClass {
	public  WebDriver driver;
	@Parameters("browser")
	@BeforeTest(groups = {"SmokeTest","RegressionTest"})
public void openBrowser(String browser) {
	switch(browser) {
	case "Chrome":driver=new ChromeDriver();break;
	case "Edge":driver=new EdgeDriver();break;
	case "Firefox":driver=new FirefoxDriver();break;
	default: driver=new ChromeDriver();
	}
//	if(browser.equalsIgnoreCase("Chrome")) {
//		driver=new ChromeDriver();
//	}else if(browser.equalsIgnoreCase("Edge")) {
//		driver=new EdgeDriver();
//	}else if(browser.equalsIgnoreCase("Firefox")) {
//		driver=new FirefoxDriver();
//	}
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("http://localhost/login.do");
	Reporter.log("openBrowser",true);}
	@BeforeMethod(groups = {"SmokeTest","RegressionTest"})
public void login() {
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	Reporter.log("login",true);}
	@AfterMethod(groups = {"SmokeTest","RegressionTest"})
public void logout() {
	driver.findElement(By.id("logoutLink")).click();
	Reporter.log("logout",true);}
	@AfterTest(groups = {"SmokeTest","RegressionTest"})
public void closeBrowser() {
	driver.quit();
	Reporter.log("closeBrowser",true);
}
}
