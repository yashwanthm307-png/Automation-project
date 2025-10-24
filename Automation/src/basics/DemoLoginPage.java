package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoLoginPage {
	@FindBy(id="username")
	WebElement unTbx;
	@FindBy(name="pwd")
	private WebElement pwdTbx;
	@FindBy(xpath = "//div[text()='Login ']")			//Declaration
	private WebElement loginBtn;

	
	public void login(String un,String pwd) {
		unTbx.sendKeys(un);
		pwdTbx.sendKeys(pwd);						//Utilization
		loginBtn.click();
	}
}
