package Balaji;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAppsAlert {
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//section[text()='Javascript']")).click();
		Thread.sleep(1000);
		List<WebElement> checkBoxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(WebElement check : checkBoxes) 
		{
			if(!check.isSelected()) 
			{
				check.click();	
			}Thread.sleep(500);
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button)[2]")).click();
		Thread.sleep(1000);
		Alert alert = driver.switchTo().alert();
		Thread.sleep(1000);
		alert.accept();
		driver.quit();
	}


}
