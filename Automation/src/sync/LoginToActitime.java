package sync;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginToActitime {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
	Wait<WebDriver> wait=new FluentWait<>(driver)
	.withTimeout(Duration.ofSeconds(10))//Here we should mention the duration it should wait
	.pollingEvery(Duration.ofSeconds(1))//Here we should mention the duration for polling period
	.ignoring(NoSuchElementException.class);//Using fluent wait we can also ignore the exceptions.
	driver.get("http://online.actitime.com/tyss/login.do");
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	wait.until(ExpectedConditions.titleIs("actiTIME - Enter Time-Track"));
	String title = driver.getTitle();
	System.out.println(title);
}
}
//https://www.saucedemo.com/v1/index.html
