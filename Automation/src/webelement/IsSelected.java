package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://online.actitime.com/tyss/login.do");
	WebElement checkbox = driver.findElement(By.id("keepLoggedInCheckBox"));
	checkbox.click();
	boolean res = checkbox.isSelected();
	if(res==true) {
		System.out.println("Checkbox is selected");
	}else {
		System.out.println("Checkbox is not selected");
	}
	driver.quit();
}
}
