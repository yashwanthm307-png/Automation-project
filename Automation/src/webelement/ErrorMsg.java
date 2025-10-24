package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ErrorMsg {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.name("login")).click();
	WebElement errorMsg = driver.findElement(By.xpath("//div[contains(text(),'mobile')]"));
	String text = errorMsg.getText();
	String color = errorMsg.getCssValue("color");
	System.out.println(text);
	System.out.println(color);
	WebElement ele = driver.findElement(By.xpath("//a[@title='Kannada']"));
	String tooltip = ele.getAttribute("title");
	System.out.println(tooltip);
	driver.quit();
}
}
