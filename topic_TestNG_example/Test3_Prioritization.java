package topic_TestNG_example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test3_Prioritization {
	
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
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
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
public void verify_login()
{
		
//TC-06: Verify Login
		String ExpectedURL="https://www.saucedemo.com/inventory.html";
		String ActualURL = driver.getCurrentUrl();
		if(ActualURL.equals(ExpectedURL))
		{
			System.out.println("Test passed - Login Success");
		}
		else
		{
			System.out.println("Test Failed - Login Failed");
		}
		
}
@Test(priority=6)
public void close_brwoser()
{
				
//TC-07: Close the browser
		driver.close();
		
		
		
		


	}

}
