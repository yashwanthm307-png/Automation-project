package basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSERE {
public static void main(String[] args){
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("file:///C:/Users/ADMIN/Desktop/Demo1.html");
//@01 will be store in the reference variable
	WebElement ele = driver.findElement(By.tagName("a"));
//Using @01 it will click on the link
	ele.click();
//After navigating from one webpage to another webpage, the page will get reloaded or refreshed,
//the address of element in HTML will be @02
	driver.navigate().back();
//But we perform action on ele using @01 due to which we get SERE
	ele.click();
}
}
