package topic_TestNG_example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test7_VP4 {
	
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

public void type_Username() throws InterruptedException
{
		
//TC-03: fill user name text box with input
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		Thread.sleep(5000);
}		
@Test(priority=3)
public void type_password() throws InterruptedException
{
//TC-04: Fill the Password text
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("scret_sauce");
		Thread.sleep(5000);
}
@Test(priority=4)
public void click_login() throws InterruptedException
{
		
//TC-04: Click on login button
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		Thread.sleep(5000);
}
@Test(priority=5)
public void verifyErrmsg()
{
		
//TC-06: Verify login
	String Expterrmsg = "Epic sadface";
	String ActErrMsg =driver.findElement(By.xpath("//h3[contains(text(),'Epic sadface')]")).getText();
	System.out.println(ActErrMsg);

	
		if(ActErrMsg.contains(Expterrmsg))  
		{
			System.out.println("Test passed - Valid Error Message Displayed");
		}
		else
		{
			System.out.println("Test Failed - Invalid error message displayed");
		}
		
		//Assert.assertEquals(ActualURL, ExpectedURL);
		
}
@Test(dependsOnMethods="verify_login",alwaysRun=true)
public void teardown()
{
				
//TC-07: Close the browser
		driver.close();
		
		
		
		


	}

}
