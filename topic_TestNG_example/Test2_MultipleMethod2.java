package topic_TestNG_example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2_MultipleMethod2 {
	
	public WebDriver driver; //globalising it

	//public static void main(String[] args) throws InterruptedException {
@Test
public void asetup() throws InterruptedException
{
	//TC-01:Launch chrome browser
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
}
@Test
	
public void bgotoURL() throws InterruptedException
{
//TC-02: Go to the test URL https://www.saucedemo.com/
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(5000);
}
@Test

public void ctype_Username() throws InterruptedException
{
		
//TC-03: fill user name text box with input
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		Thread.sleep(5000);
}		
@Test
public void dtype_password() throws InterruptedException
{
//TC-04: Fill the Password text
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		Thread.sleep(5000);
}
@Test
public void eclick_login() throws InterruptedException
{
		
//TC-04: Click on login button
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		Thread.sleep(5000);
}
@Test
public void fverify_login()
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
@Test
public void gclose_brwoser()
{
				
//TC-07: Close the browser
		driver.close();
		
		
		
		


	}

}
