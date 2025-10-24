package multiple_elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//WAS to print all suggestions in google after entering Qspiders BTM
public class AutoSuggestions {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.google.com/");
	driver.findElement(By.name("q")).sendKeys("Qspiders BTM");
	Thread.sleep(2000);
	List<WebElement> allSuggs = driver.findElements(By.xpath("//span[contains(text(),'qspiders')]"));
	int count=allSuggs.size();
	System.out.println(count);
	for (WebElement ele : allSuggs) {
		String text = ele.getText();
		System.out.println(text);
	}
//WAS to click on last link or suggestion
	WebElement lastEle = allSuggs.get(count-1);
	lastEle.click();
//	driver.quit();
}
}
