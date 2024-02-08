package mydemoProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test3_FF {

	public static void main(String[] args) throws InterruptedException {
		//TC-01:Launch Firefox browser
		System.setProperty("webdriver.gecko.driver", "C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		//TC-02:Goto test URL https://bhanusaii.wordpress.com/
		driver.get("https://bhanusaii.wordpress.com//");
		//wait time 3 sec
		Thread.sleep(3000);
		
//TC-03: Manage the browser window to minimize
		driver.manage().window().minimize();
		//wait time 3 sec
		Thread.sleep(3000);
		
//TC-04:Manage the browser window to maximize 
		driver.manage().window().maximize();
		//wait time 3 sec
		Thread.sleep(3000);
		
//TC-05:Get the Title of the page
		String pageurl = driver.getTitle();
		System.out.println(pageurl);
		System.out.println("pageurl");
		//wait time 3 sec
		Thread.sleep(3000);
		
//TC-06:Get the Current URL of the page
		String curpgurl= driver.getCurrentUrl();
		System.out.println(curpgurl);
		System.out.println("curpgurl");
		//wait time 3 sec
		Thread.sleep(3000);
		
//TC-07: Close the browser
		driver.close();


	}

}
