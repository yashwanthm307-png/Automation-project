package com.automation.vinusha;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class YouTubeMusic {
	public static void main(String[] args) throws InterruptedException {
		 WebDriver  driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.get("https://chromewebstore.google.com/?utm_source=ext_app_menu&pli=1");
			driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
			driver.switchTo().frame("app");
			Actions a=new Actions(driver);
			WebElement account=driver.findElement(By.xpath("//span[text()='Account']"));
			a.moveToElement(account);
			WebElement ele2=driver.findElement(By.xpath("//span[text()='YouTube Music']"));
			a.scrollToElement(ele2);Thread.sleep(2000);
			a.moveToElement(ele2).click();Thread.sleep(2000);
			//driver.quit();
	        		
	}

}
