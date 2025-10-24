package handling_frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://demoapps.qspiders.com/");
	driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
	driver.findElement(By.xpath("//*[text()='Frames']")).click();
	driver.findElement(By.xpath("//*[text()='iframes']")).click();
	driver.findElement(By.linkText("Nested with Multiple iframe")).click();
	Thread.sleep(2000);
	driver.switchTo().frame(0);
	String email = driver.findElement(By.xpath("//p[text()='Default Email']/following-sibling::p")).getText();
	String pwd = driver.findElement(By.xpath("//p[text()='Default Password']/following-sibling::p")).getText();
String conPwd = driver.findElement(By.xpath("//p[contains(text(),'Confirm Password')]/following-sibling::p")).getText();
	driver.switchTo().frame(0);
	driver.switchTo().frame(0);
	driver.findElement(By.id("email")).sendKeys(email);
	driver.switchTo().parentFrame();
	driver.switchTo().frame(1);
	driver.findElement(By.id("password")).sendKeys(pwd);
	driver.switchTo().parentFrame();
	driver.switchTo().frame(2);
	driver.findElement(By.id("confirm")).sendKeys(conPwd);
	driver.switchTo().parentFrame();
	driver.switchTo().frame(3);
	driver.findElement(By.id("submitButton")).click();
}
}
