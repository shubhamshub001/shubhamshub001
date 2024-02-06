package mydemoProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_chrome {

	public static void main(String[] args) throws InterruptedException {
		
//TC-01:Launch chrome browser
		System.setProperty("webdriver.driver.chrome","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//TC-02:Goto test URL https://www.selenium.dev/
		driver.get("https://www.selenium.dev/");
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
