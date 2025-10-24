package methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A {
public static void demo(WebDriver driver) {
	driver.get("https://www.google.com");
	String title = driver.getTitle();
	System.out.println(title);
//	driver.close();
}
}
