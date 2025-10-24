package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnClear {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demo.opensourcebilling.org/en/users/sign_in");
	WebElement ele = driver.findElement(By.xpath("//label[text()='Keep me signed in']"));
//click() is used to click on the elements like (button, link, radio, checkbox etc)	
ele.click();
//clear() is used to clear the text present in the textbox
	driver.findElement(By.id("email")).clear();
}
}
