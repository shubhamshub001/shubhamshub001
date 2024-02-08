package mydemoProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test13_partiallinktext {

	public static void main(String[] args) throws InterruptedException {


/* Test Case- Automate  Creating a New window
 * TS01:Launch chrome browser
 * TS1: Goto test URL https://www.amazon.in
 * TS2:Managed the browser window to be maximized
 * TS3:Create New tab
 * TS4:Close active Browser window
 */

//TS01:Launch chrome browser
		System.setProperty("Webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//TS1: Goto test URL https://www.facebook.com/ 
		driver.get("https://www.facebook.com/");
		//wait time 3 secs
		Thread.sleep(3000);
		
//TS2: Click on 'Create new account' button
// In place of 'driver' we will use partialLinkText
	//driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.partialLinkText("Create new")).click();
	
	
	//object.method(Class.method("value")).method;
	//wait time 5 secs
	//Thread.sleep(5000);
	
//Fill first name text box with input
	//driver.findElement(By.name("firstname")).sendKeys("Shubham");
    Thread.sleep(3000);
    

    
    
		
		
		
//Close active Browser window
		driver.close();
		

		
		
		
	}

}
