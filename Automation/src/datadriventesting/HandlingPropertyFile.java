package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPropertyFile {
public static void main(String[] args) throws IOException {
//In order to convert High level data into low level or stream of binaries
	FileInputStream fis=new FileInputStream("./data/commondata.properties");
//In order to access NSM of properties class we need to create an object
	Properties p=new Properties();
//load(InputStream fis) will load the binaries into the property object
	p.load(fis);
//getProperty(String key) will get the value of the mentioned key name
	String url = p.getProperty("url");
	String un = p.getProperty("username");
	String pwd = p.getProperty("password");
	System.out.println(url);
	System.out.println(un);
	System.out.println(pwd);
}
}
