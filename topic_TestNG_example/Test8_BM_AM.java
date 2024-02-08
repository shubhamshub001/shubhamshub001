package topic_TestNG_example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test8_BM_AM {
	public WebDriver driver;
  @BeforeMethod
  public void setup() {
	  driver = new ChromeDriver();
  }
  @AfterMethod
  public void teradown()
  {
	  driver.close();
  }
  
  @Test(priority=1)
  public void verifySDPage() throws InterruptedException
  {
	  driver.get("https://www.saucedemo.com/");
	  Thread.sleep(5000);
	  String ExpectedTitle = "Swag Labs";
	  String ActaulaTitle = driver.getTitle();
	  Assert.assertEquals(ActaulaTitle, ExpectedTitle);
  }
  
  @Test(priority=2)
  public void verifyGooglePage() throws InterruptedException
  {
	  driver.get("https://www.google.co.in/");
	  Thread.sleep(5000);
	  String ExpectedTitle = "Google";
	  String ActaulaTitle = driver.getTitle();
	  Assert.assertEquals(ActaulaTitle, ExpectedTitle);
 
  }
  
  @Test(priority=2)
  public void verifyBhanusaiPage() throws InterruptedException
  {
	  driver.get("https://bhanusaii.wordpress.com/");
	  Thread.sleep(5000);
	  String ExpectedTitle = "Bhanu Sai-“Learning gives creativity Creativity leads to thinking Thinking provides knowledge Knowledge makes you great.”";
	  String ActaulaTitle = driver.getTitle();
	  Assert.assertEquals(ActaulaTitle, ExpectedTitle);
 
  }
  
}
