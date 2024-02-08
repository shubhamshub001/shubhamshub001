package mydemoProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test14_Absolute_X_path {

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
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[5]/a[1]")).click();
		
	//driver.findElement(By.linkText("Create new account")).click();
	//object.method(Class.method("value")).method;
	//wait time 5 secs
	Thread.sleep(3000);
	

		
		
//Close active Browser window
		driver.close();
		

		
		
		
	}

}
