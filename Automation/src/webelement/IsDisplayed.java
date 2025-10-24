package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.fb.com");
//	driver.get("https://www.flipkart.com/");
	boolean res = driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed();
//	boolean res = driver.findElement(By.xpath("//li[text()='My Profile']")).isDisplayed();
	if(res==true) {
		System.out.println("Logo is displayed");
	}else {
		System.out.println("Logo is not displayed");
	}
	driver.quit();
}
}
