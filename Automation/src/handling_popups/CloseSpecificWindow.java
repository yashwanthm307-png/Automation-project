package handling_popups;

import java.time.Duration;
import java.util.Scanner;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseSpecificWindow {
public static void main(String[] args) throws InterruptedException {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the title");
	String title = s.next();//Google
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://secure.indeed.com/");
	driver.findElement(By.id("login-google-button")).click();
	driver.findElement(By.id("apple-signin-button")).click();
	Thread.sleep(2000);
	Set<String> allWid = driver.getWindowHandles();
	for(String wid:allWid) {
		driver.switchTo().window(wid);
		String actualTitle = driver.getTitle();
		if(actualTitle.contains(title)) {
//		driver.close();//It will close the specific window
			break;//It will transfer the control to the specific window
		}
	}
	System.out.println(driver.getTitle());
//	driver.quit();
}
}
