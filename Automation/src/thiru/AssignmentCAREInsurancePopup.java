package thiru;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentCAREInsurancePopup {
	public static void main(String[] args) throws InterruptedException {
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://www.careinsurance.com/");
	   // driver.findElement(By.id("exitpopup_close")).click();
	    driver.findElement(By.id("renew_tile")).click();
	    
	    Set<String> allwid = driver.getWindowHandles();
	    Iterator<String> i=allwid.iterator();
	    String pwid = i.next();
	    String cwid = i.next();
	    driver.switchTo().window(cwid);
	    
	    driver.findElement(By.id("policynumber")).sendKeys("123");
	    driver.findElement(By.id("dob")).click();
	   WebElement mon = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
	    
	     Select s=new Select(mon);
	     s.selectByIndex(1);
	     
	     WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
	     Select s1=new Select(year);
	     s1.selectByValue("1998");
	      driver.findElement(By.linkText("14")).click();
	     driver.findElement(By.id("alternative_number")).sendKeys("9876543210");
	     driver.findElement(By.id("renew_policy_submit")).click();
	     WebElement errormsg = driver.findElement(By.id("policynumberError"));
	     String text = errormsg.getText();
		System.out.println(text);
		
		driver.quit();
		}

	}


