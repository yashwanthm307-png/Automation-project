package handling_disabled_elements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class HandlingScrollBar {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.navigate().to("https://www.netflix.com/in/");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");//It will scroll for 500 pixels
		js.executeScript("window.scrollTo(0,300)");//It will scroll for 300 pixels from initial position
		Point location = driver.findElement(By.xpath("//h2[text()='Frequently Asked Questions']")).getLocation();
		int yAxis = location.getY();
		//	js.executeScript("window.scrollTo(0,"+yAxis+")");
		js.executeScript("window.scrollTo"+location);
	}
}
