package sync;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomWait {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://online.actitime.com/tyss/login.do");
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	for(int i=0;i<1000;i++) {
		try {
			driver.findElement(By.id("logoutLink")).click();
			break;
		}
		catch (NoSuchElementException e) {
			System.out.println(i);
		}
	}
	
	
//	System.out.println("Outside try catch");
}
}
