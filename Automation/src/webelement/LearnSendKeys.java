package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSendKeys {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://fb.com");
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("Virat@18");
		email.sendKeys(Keys.CONTROL+"A");
		email.sendKeys(Keys.CONTROL+"c");
		//	email.sendKeys("Virat@18"+Keys.CONTROL+"ac");
		driver.findElement(By.id("pass")).sendKeys(Keys.CONTROL+"v");
		driver.findElement(By.name("login")).submit();
	}
}
