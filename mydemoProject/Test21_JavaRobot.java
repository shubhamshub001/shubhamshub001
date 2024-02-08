package mydemoProject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test21_JavaRobot {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
//TC-01:Launch chrome browser
		System.setProperty("webdriver.driver.chrome","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//TC-02:Goto test URL https://smallpdf.com/pdf-to-word
		driver.get("https://smallpdf.com/pdf-to-word");
		//wait time 3 sec
		Thread.sleep(3000);
		
//TC-03:Manage the browser window to maximize 
		driver.manage().window().maximize();
		//wait time 3 sec
		Thread.sleep(3000);
		
		
		//implement java robot to handle window alert
		Robot r = new Robot();
		//Scroll one step down
		r.keyPress(KeyEvent.VK_PAGE_DOWN);
		r.keyRelease(KeyEvent.VK_PAGE_DOWN);
		Thread.sleep(3000);
		//Scroll one step Up
		r.keyPress(KeyEvent.VK_PAGE_UP);
		r.keyRelease(KeyEvent.VK_PAGE_UP);
		Thread.sleep(3000);
		//scroll to Bottom
		r.keyPress(KeyEvent.VK_END);
		r.keyRelease(KeyEvent.VK_END);
		Thread.sleep(3000);
		//sccroll to Top
		r.keyPress(KeyEvent.VK_HOME);
		r.keyRelease(KeyEvent.VK_HOME);
		Thread.sleep(3000);
		//Open a new tab
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_T);
		Thread.sleep(3000);
		
		//Goto test URL
		driver.navigate().to("https://bhanusaii.wordpress.com/");
		Thread.sleep(8000);
		//Close the tab
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_W);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_W);
		Thread.sleep(8000);
		//To create New window
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_N);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_N);
		Thread.sleep(8000);
		
//TC-07: Close the browser
		driver.quit();
		
		
		
		
		

		
		
		

	}

}
