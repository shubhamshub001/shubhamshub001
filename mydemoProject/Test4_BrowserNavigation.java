package mydemoProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4_BrowserNavigation {

	public static void main(String[] args) throws InterruptedException {
		
/*
 * Test case - Automate browser navih=gation
 * TS1: Launch chrome browser
 * TS2: Goto Test URL https://www.amazon.in
 * TS3: Navigate to URL https://www.flipkart.com
 * TS4: Navigate one step back to amazon website
 * TS5: Navigate one step forward to flipkart website
 * TS6: Reload current active page
 * TS7: Close the active browser window
 */

//TS1: Launch chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//TS2: Goto Test URL https://www.amazon.in
		driver.get("https://www.amazon.in");
		//wait time 3 sec
		Thread.sleep(3000);
		
//TS3: Navigate to URL https://www.flipkart.com
		driver.navigate().to("https://www.flipkart.com");
		//wait time 3 sec
		Thread.sleep(3000);

//TS4: Navigate one step back to amazon website
		driver.navigate().back();
		//wait time 3 sec
		Thread.sleep(3000);
		
//TS5: Navigate one step forward to flipkart website
		driver.navigate().forward();
		//wait time 3 sec
		Thread.sleep(3000);
		
//TS6: Reload current active page
		driver.navigate().refresh();
		//wait time 3 sec
		Thread.sleep(3000);
		
// TS7: Close the active browser window
		driver.close();
		
	
		
		
		
	}

}
