package handling_frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingSingleFrame {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("file:///C:/Users/ADMIN/Desktop/T1.html");
	Thread.sleep(2000);
	driver.findElement(By.id("un")).sendKeys("Modi");
//frame(String id/name) will transfer the control to the frame which is having the mentioned id/Name in <iframe>
	driver.switchTo().frame("SingleFrame");Thread.sleep(2000);
	driver.findElement(By.id("email")).sendKeys("PM@INDIA");
//frame(int index) will transfer the control to the frame using the mentioned index. The indexing will start from 0
//For each first frame in a HTML
	driver.switchTo().frame(0);Thread.sleep(2000);
	driver.findElement(By.id("setPwd")).sendKeys("Rahul Gandhi");
//parentFrame() is used to transfer the control to the previous frame or the parent frame
	driver.switchTo().parentFrame();
	driver.findElement(By.id("contact")).sendKeys("9876678900");
	WebElement frameAddress = driver.findElement(By.name("Frame 2"));
//frame(WebElement frameAddress) will transfer the control to the frame using mentioned frame address. We need to 
//find the <iframe> tag and pass it as webEle reference
	driver.switchTo().frame(frameAddress);
	driver.findElement(By.id("confirmPwd")).sendKeys("Rahul Gandhi");
//defaultContent() will transfer the control to the main webPage
	driver.switchTo().defaultContent();
	driver.findElement(By.id("pwd")).sendKeys("Rahul Gandhi");
}
}
