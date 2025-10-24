package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLoc {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.fb.com");
	WebElement email = driver.findElement(By.id("email"));
	WebElement pwd = driver.findElement(By.id("passContainer"));
	Dimension d1 = email.getSize();
	int height1 = d1.getHeight();
	int width1 = d1.getWidth();
	int height2 = pwd.getRect().getHeight();
	int width2 = pwd.getSize().getWidth();
	if(height1==height2&&width1==width2) {
		System.out.println("Both are same size");
	}else {
		System.out.println("Both are not same size");	}
	Point p1 = email.getLocation();
	int xAxis1 = p1.getX();
	int xAxis2 = pwd.getLocation().getX();
	int yAxis1 = email.getRect().getY();
	int yAxis2 = pwd.getLocation().getY();
	if(xAxis1==xAxis2) {
		System.out.println("Both are aligned properly");
	}else {
		System.out.println("Both are not aligned properly");
	}
	driver.quit();
}
}
