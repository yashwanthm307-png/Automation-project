package methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Verifywebpage {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com");
	String expectedtitle="GOOGLE";
	String expectedurl="google.com/";
	String actualtitle = driver.getTitle();
	String actualurl = driver.getCurrentUrl();
	if(actualtitle.equalsIgnoreCase(expectedtitle) && actualurl.contains(expectedurl))   {
		System.out.println("Pass");
	}else {
		System.out.println("Fail");
	}
	driver.quit();
}
}
