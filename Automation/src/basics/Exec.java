package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class Exec {
	@Test
	public void demo() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		DemoLoginPage d = new DemoLoginPage();
		PageFactory.initElements(driver, d);
		d.login("admin123", "manager123");
//	Thread.sleep(5000);
//	d.login("admin", "manager");
	}
}
