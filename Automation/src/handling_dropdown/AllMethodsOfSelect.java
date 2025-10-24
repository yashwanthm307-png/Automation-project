package handling_dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllMethodsOfSelect {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		driver.findElement(By.linkText("Multi Select")).click();
		WebElement mult = driver.findElement(By.id("select-multiple-native"));
		Select s=new Select(mult);
		s.selectByIndex(0);
//		s.selectByValue("Mens Casual Premium Slim Fit T-Shirts ");
//		s.selectByVisibleText("Mens Cotton Jacket...");
//		s.selectByContainsVisibleText("Casual Slim");
//		s.deselectByIndex(3);
//		s.deselectByValue("Mens Cotton Jacket");
//		s.deselectByVisibleText("Mens Casual Premium ...");
//		s.deSelectByContainsVisibleText("Foldsac");
//		s.deselectAll();
		WebElement firstOpt = s.getFirstSelectedOption();
//		System.out.println(firstOpt.getText());
		List<WebElement> allSelOpt = s.getAllSelectedOptions();
		for(int i=0;i<allSelOpt.size();i++) {
			String text = allSelOpt.get(i).getText();
//			System.out.println(text);
		}
		List<WebElement> allOpts = s.getOptions();
		for (WebElement ele : allOpts) {
			String text = ele.getText();
//			System.out.println(text);
		}
		boolean res = s.isMultiple();
		if(res==true) {
			System.out.println("It is multi select dropdown");
		}else {
			System.out.println("it is single select dropdown");
		}
		WebElement ele = s.getWrappedElement();
		System.out.println(ele.getText());
		driver.quit();
	}
}
