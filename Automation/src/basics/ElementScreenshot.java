package basics;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementScreenshot {
public static void main(String[] args) throws IOException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://www.linkedin.com/");
	WebElement logo = driver.findElement(By.xpath("//a[contains(@class,'nav__logo')]"));
	File src = logo.getScreenshotAs(OutputType.FILE);
	File dest=new File("./screenshots/logo.png");
	FileUtils.copyFile(src, dest);
	driver.quit();
}
}
