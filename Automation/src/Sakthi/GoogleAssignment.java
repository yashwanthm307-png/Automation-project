package Sakthi;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
// import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
// import org.openqa.selenium.interactions.Actions;

public class GoogleAssignment {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.google.co.in/index.html");Thread.sleep(2000);
		driver.findElement(By.id("gbwa")).click();
		driver.switchTo().frame(0);
		WebElement ele = driver.findElement(By.xpath("//*[text()='YouTube Music']"));
		Actions a = new Actions(driver);
		a.scrollToElement(ele).perform();
		ele.click();
		
	}

}
