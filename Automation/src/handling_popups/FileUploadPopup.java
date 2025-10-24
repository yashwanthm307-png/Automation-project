package handling_popups;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class FileUploadPopup {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("file:///C:/Users/ADMIN/Desktop/FileUpload.html");Thread.sleep(2000);
//	driver.findElement(By.id("uploadButton")).sendKeys("C:\\Users\\ADMIN\\Desktop\\online mock ans.txt");
	File f=new File("./data/online mock ans.txt");
	String absPath = f.getAbsolutePath();
	driver.findElement(By.id("uploadButton")).sendKeys(absPath);
}
}
