package topic_TestNG_example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test7_VP6 {
	
	public WebDriver driver; //globalising it

	//public static void main(String[] args) throws InterruptedException {
@Test(priority=0)
public void setup() throws InterruptedException
{
	//TC-01:Launch chrome browser
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
}
@Test(priority=1)
	
public void gotoURL() throws InterruptedException
{
//TC-02: Go to the test URL https://www.selenium.dev/
		driver.get("https://www.selenium.dev/");
		Thread.sleep(5000);
}

@Test(priority=2)
public void verifySelpage()
{
		
//TC-06: Verify Login
		String ExpectedText="Selenium automates browsers. That's it!";
		String ActualText = driver.findElement(By.xpath("//h1[contains(text(),'Selenium automates')]")).getText();
		System.out.println(ActualText);
		
		if(ActualText.equals(ExpectedText))
		{
			System.out.println("Test passed - Launched Selenium page");
		}
		else
		{
			System.out.println("Test Failed - Launched some other page");
		}
		
}
@Test(priority=6)
public void teardown()
{
				
//TC-07: Close the browser
		driver.close();
		
		
		
		


	}

}
