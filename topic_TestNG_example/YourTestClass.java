package topic_TestNG_example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class YourTestClass  {
  
  private WebDriver driver;

  @Parameters("browser")
  @BeforeTest
  public void setUp(String browser) {
      if (browser.equalsIgnoreCase("chrome")) {
          driver = new ChromeDriver();
      } else if (browser.equalsIgnoreCase("firefox")) {
          driver = new FirefoxDriver();
      } else if (browser.equalsIgnoreCase("edge")) {
          driver = new EdgeDriver();
      } else {
          throw new IllegalArgumentException("Invalid browser parameter: " + browser);
      }
  }

  @Test
  public void yourTestMethod() {
      // Your test logic here
      // Use 'driver' to interact with the browser
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.get("www.yahoo.com");
  }
}
