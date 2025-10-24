package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateCustomer {
public static void main(String[] args) {
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("http://localhost/login.do");
	driver.findElement(By.id("username")).sendKeys("admin");
	driver.findElement(By.name("pwd")).sendKeys("manager");
	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	driver.findElement(By.linkText("TASKS")).click();
	driver.findElement(By.xpath("//div[text()='Add New']")).click();
	driver.findElement(By.xpath("//div[text()='+ New Customer']")).click();
	driver.findElement(By.id("customerLightBox_nameField")).sendKeys("ICICI-001");
	driver.findElement(By.id("customerLightBox_descriptionField")).sendKeys("banking");
	driver.findElement(By.id("customerLightBox_customerSelectorPlaceholder")).click();
	driver.findElement(By.linkText("Our Company")).click();
	driver.findElement(By.xpath("//span[text()='Create Customer']")).click();
	String text = driver.findElement(By.className("innerHtml")).getText();
	System.out.println(text);
	driver.findElement(By.id("logoutLink")).click();
	driver.quit();
}
}
