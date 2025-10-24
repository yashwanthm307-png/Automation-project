package basics;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class VerifyTitle {
	@Test
public void demoA() {
	WebDriver driver=new ChromeDriver();
	driver.get("https://google.com/");
	String actualTitle = driver.getTitle();
	String expectedTitle="Googly";
//	Assert.assertEquals(actualTitle, expectedTitle); 
	SoftAssert s=new SoftAssert();
	s.assertEquals(actualTitle,expectedTitle);
	driver.quit();
	s.assertAll();
}
}
