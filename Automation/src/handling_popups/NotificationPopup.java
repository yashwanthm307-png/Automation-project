package handling_popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopup {
public static void main(String[] args) {
	ChromeOptions opt=new ChromeOptions();
	opt.addArguments("--disable-notifications","--start-maximized","-incognito","--headless");
//	opt.addArguments("--start-maximized");//It will launch the browser in maximized mode
//	opt.addArguments("-incognito");//It will open the browser in Incognito mode
//	opt.addArguments("--headless");//It will launch the browser in headless mode
//	opt.addArguments("--disable-notifications");//It will disable the notification popup
//	WebDriver driver=new ChromeDriver();//Will launch browser in default settings
	WebDriver driver=new ChromeDriver(opt);//Will launch browser in modified settings
	driver.get("https://www.yatra.com");
	System.out.println(driver.getTitle());
}
}
