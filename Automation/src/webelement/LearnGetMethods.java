package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnGetMethods {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://fb.com/");
	WebElement link = driver.findElement(By.linkText("Forgotten password?"));
//getTagName() is used to get the tagName of an element
	String tagName = link.getTagName();
//getText() is used to get the tagText or visible text of an element
//If the element is not having tagText it will return empty space
	String text = link.getText();
//getAttribute(String attName) will get the attribute value of an element like href, src, title
//Since we have multiple attributes for 1 element we need to mention the attribute name 
	String value = link.getAttribute("href");
//getCssValue(String propName) will get the css property  of an element like color, font size,
//bg color, Since we have multiple properties for 1 element we need to mention the property name 
	String prop = link.getCssValue("font-size");
	System.out.println("Tagname of link "+tagName);
	System.out.println("Tag text of the link "+text);
	System.out.println("Attribute value of link "+value);
	System.out.println("Css Value of link "+prop);
	driver.quit();
}
}
