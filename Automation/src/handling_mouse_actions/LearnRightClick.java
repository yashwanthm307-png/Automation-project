package handling_mouse_actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearnRightClick {
public static void main(String[] args) throws InterruptedException, AWTException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://online.actitime.com/tyss/login.do");
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager"+Keys.ENTER);Thread.sleep(2000);
	driver.findElement(By.xpath("//div[contains(@class,'button_support')]")).click();Thread.sleep(2000);
	driver.findElement(By.linkText("About your actiTIME")).click();Thread.sleep(2000);
	WebElement link = driver.findElement(By.linkText("Read Service Agreement"));
	Actions a=new Actions(driver);
	a.contextClick(link).perform();//To perform right click
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_T);
}
}
