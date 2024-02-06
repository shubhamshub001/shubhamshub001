package mydemoProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5_creatNewTab {

	public static void main(String[] args) throws InterruptedException {


/* Test Case- Automate  Creating a New Tab
 * TS01:Launch chrome browser
 * TS1: Goto test URL https://www.amazon.in
 * TS2:Managed the browser window to be maximized
 * TS3:Create New tab
 * TS4:Close active Browser window
 */

//TS01:Launch chrome browser
		System.setProperty("Webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver gcdriver = new ChromeDriver();
		
//TS1: Goto test URL https://www.amazon.in
		gcdriver.get("https://www.amazon.in");
		//wait time 3 secs
		Thread.sleep(3000);
		
//TS2:Managed the browser window to be maximized
		gcdriver.manage().window().maximize();
		//wait time 3 secs
		Thread.sleep(3000);

//TS3:Create New tab
		gcdriver.switchTo().newWindow(WindowType.TAB);
		//wait time 3 secs
		Thread.sleep(3000);
		
//TS4:Close active Browser window
		gcdriver.close();

		
		
		
		
		
		
	}

}
