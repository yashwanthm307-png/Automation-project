package com.automation.vinusha;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MonthDropdown {
	 public static void main(String[] args) throws InterruptedException {
		  WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.get("https://www.facebook.com");
			driver.findElement(By.linkText("Create new account")).click();
			WebElement month=driver.findElement(By.id("month"));Thread.sleep(2000);
			Select s2=new Select(month);
			Scanner scn=new Scanner(System.in);
			System.out.println("Enter the month");
			boolean optionfound=false;
			
			String expectedText=scn.next();
			List<WebElement> ele=s2.getOptions();
			 /*for(int i=0;i<ele.size();i++)
			{
				WebElement sel=ele.get(i);
				if(sel.getText().equals(expectedText))
				{
					optionfound=true;
					
				}
				
			}*/
			for(WebElement sel:ele)
			{
			  if(sel.getText().contains(expectedText))
			  optionfound=true;
			}
			
			if(optionfound==true)
			{
				System.out.println("the given option is present");
			}
			else
			{
				System.out.println("The given option is not present");
			}
			
			driver.quit();
			
	 }

}
