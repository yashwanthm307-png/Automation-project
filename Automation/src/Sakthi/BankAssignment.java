package Sakthi;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BankAssignment {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");Thread.sleep(2000);
		WebDriver driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		driver.get("https://www.hdfcbank.com/");
		WebElement ele = driver.findElement(By.xpath("(//*[text()='Login'])[1]"));
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
		driver.findElement(By.linkText("NetBanking")).click();
		Set<String> allWind = driver.getWindowHandles();
		for (String childWind : allWind) {
			driver.switchTo().window(childWind);
		}
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("(//a[contains(text(),'Know')])[2]")).click();
		Set<String> secondWind = driver.getWindowHandles();
		for (String newWind : secondWind) {
			driver.switchTo().window(newWind);
		}
		WebElement lang = driver.findElement(By.className("selectCSS"));
		Select s = new Select(lang);
		List<WebElement> allOpt = s.getOptions();
		for(int i=1;i<allOpt.size();i++) {
			String text = allOpt.get(i).getText();
			System.out.println(text);
		}
		
	}

}
