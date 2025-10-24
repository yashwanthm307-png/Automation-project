package handling_popups;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign2 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://demoapps.qspiders.com/");
	driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
	driver.findElement(By.xpath("//section[text()='Popups']")).click();
	driver.findElement(By.xpath("//section[text()='Browser Windows']")).click();
	driver.findElement(By.xpath("//a[text()='New Tab']")).click();Thread.sleep(2000);
	driver.findElement(By.xpath("//button[text()='view more']")).click();
	Set<String> allWid = driver.getWindowHandles();
	Iterator<String> i = allWid.iterator();
	String pwid = i.next();
	String cWid = i.next();Thread.sleep(5000);
	driver.switchTo().window(cWid);
	driver.close();Thread.sleep(5000);
	driver.switchTo().window(pwid);
	driver.close();
}
}
