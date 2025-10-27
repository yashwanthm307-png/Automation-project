package likhith;

import java.time.Duration;
import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookAssignment {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Month");//enter only 3 letter of month ex: apr
		String str=sc.next();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/r.php/");
		WebElement sel=driver.findElement(By.id("month"));
		Select s=new Select(sel);
		List<WebElement>allOpt=s.getOptions();
		
		int count=0;
		for(int i=0;i<allOpt.size();i++) {
			WebElement add=allOpt.get(i);
			String val=add.getText();
			if(str.equalsIgnoreCase(val)) {
				count++;
			}
		}if(count==1) {
			System.out.println(str+"Month is found in dropdown");
		}else {
			System.out.println(str+"Month is not found");
		}
		driver.quit();
	}
}
