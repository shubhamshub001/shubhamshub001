package mydemoProject;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test12_partiallinktext {

	public static void main(String[] args) throws InterruptedException {


//TS01:Launch chrome browser
		System.setProperty("Webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		

//TS-02:Goto test URL/ test Data https://demoqa.com/browser-windows
		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(3000);
		
//maximize browser window
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
//Click on new button
		driver.findElement(By.id("tabButton")).click();
		Thread.sleep(3000);
		
//handle tabs
		ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		System.out.println(tabs);
		Thread.sleep(3000);
		
//Switch from 0th tab to 1st tab
		driver.switchTo().window(tabs.get(1));
		Thread.sleep(3000);
		
//get the plain text into console--> which is present in the 1st tab
		String ptext = driver.findElement(By.id("sampleHeading")).getText();
		System.out.println(ptext);
		
		
//Close the 1st tab
		driver.close();
		Thread.sleep(3000);
		
// switch from 1st tab to 0th tab
		driver.switchTo().window(tabs.get(0));
		
//Close the 0th Tab
		driver.close();
		

		
		
		
	}

}
