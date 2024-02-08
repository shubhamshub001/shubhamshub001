package topic_TestNG_example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test7_VP1 {
	
	public WebDriver driver; //globalising it

	//public static void main(String[] args) throws InterruptedException {
@Test(priority=0)
public void setup() throws InterruptedException
{
	//TC-01:Launch chrome browser
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
}
@Test(dependsOnMethods="setup")
	
public void gotoURL() throws InterruptedException
{
//TC-02: Go to the test URL https://www.saucedemo.com/
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(5000);
}
@Test(dependsOnMethods="gotoURL")

public void type_Username() throws InterruptedException
{
		
//TC-03: fill user name text box with input
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		Thread.sleep(5000);
}		
@Test(dependsOnMethods="type_Username")
public void type_password() throws InterruptedException
{
//TC-04: Fill the Password text
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		Thread.sleep(5000);
}
@Test(dependsOnMethods="type_password")
public void click_login() throws InterruptedException
{
		
//TC-04: Click on login button
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		Thread.sleep(5000);
}
@Test(dependsOnMethods="click_login")
public void verify_login()
{
		
//TC-06: Verify Login (Assertion)
		String ExpectedURL="inventory.html";
		String ActualURL = driver.getCurrentUrl();
		if(ActualURL.contains(ExpectedURL))     //contains method
		{
			System.out.println("Test passed - Login Success");
		}
		else
		{
			System.out.println("Test Failed - Login Failed");
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
