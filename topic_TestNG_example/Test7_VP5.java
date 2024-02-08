package topic_TestNG_example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test7_VP5 {
	
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
//TC-02: Go to the test URL https://www.saucedemo.com/
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(5000);
}

@Test(priority=2)
public void verifySDpage()
{
		
//TC-06: Verify Login
		String ExpectedTitle="Swag Labs";
		String ActualTitle = driver.getTitle();
		System.out.println(ActualTitle);
		
		if(ActualTitle.equals(ExpectedTitle))
		{
			System.out.println("Test passed - Launched SD page");
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
