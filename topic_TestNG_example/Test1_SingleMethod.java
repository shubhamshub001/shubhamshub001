package topic_TestNG_example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1_SingleMethod {

	//public static void main(String[] args) throws InterruptedException {
@Test
public void verifySauceDemologin() throws InterruptedException

{

//TC-01:Launch chrome browser
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
//TC-02: Go to the test URL https://www.saucedemo.com/
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(5000);
		
//TC-03: fill user name text box with input
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
		Thread.sleep(5000);
		
//TC-04: Fill the Password text
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
		Thread.sleep(5000);
		
//TC-05: Click on login button
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		Thread.sleep(5000);
		
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
				
//TC-07: Close the browser
		driver.close();
		
		
		
		


	}

}
