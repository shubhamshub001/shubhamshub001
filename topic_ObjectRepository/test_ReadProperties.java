package topic_ObjectRepository;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class test_ReadProperties {
	WebDriver driver;
  @Test
  public void SDLogin() throws IOException, FileNotFoundException, InterruptedException {
	  Properties prop=new Properties();
	  FileInputStream ip=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\myAutomationProject\\src\\test\\java\\topic_ObjectRepository\\config.properties");
	  prop.load(ip);
	  
	  
	  //How to load the properties file-How to retrieve the value of the key
	  //Name
	  String name=prop.getProperty("name");
	  System.out.println(name);
	  //Age
	  String age=prop.getProperty("age");
	  System.out.println(age);
	  //uRL
	  String URL=prop.getProperty("url");
	  System.out.println(URL);
	  //browser
	  String Browser=prop.getProperty("browser");
	  System.out.println(Browser);
	  
	  if (Browser.equalsIgnoreCase("chrome")) //"equalsIgnoreCase" to ignore the case sensitivity in XML file to class file:
	  {
		  driver=new ChromeDriver();
	  }
	  else if(Browser.equals("edge"))
	  {
		  driver=new EdgeDriver();
	  }
	  else if(Browser.equals("ff"))
	  {
		  driver=new FirefoxDriver();
	  }
	  
	  //Go to Test URL
	  driver.get(URL);
	  Thread.sleep(5000);
	  //Fill user name text box with input
	  driver.findElement(By.xpath(prop.getProperty("UserNameField"))).sendKeys(prop.getProperty("username"));
	  Thread.sleep(5000);
	  //Fill the password text box with input
	  driver.findElement(By.xpath(prop.getProperty("Passwordpge"))).sendKeys(prop.getProperty("password"));
	  Thread.sleep(5000);
	  //Click on Login button
	  driver.findElement(By.xpath(prop.getProperty("Loginbutton"))).click();
	  Thread.sleep(5000);
	  //Close the browser
	  driver.close();
	  
		  
	  
  }
}
