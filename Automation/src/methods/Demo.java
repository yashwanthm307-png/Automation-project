package methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Demo {
public static void main(String[] args) {
	  WebDriver driver = new ChromeDriver();
	  A.demo(driver);
	  WebDriver driver2=new FirefoxDriver();
	  A.demo(driver2);
}
}
