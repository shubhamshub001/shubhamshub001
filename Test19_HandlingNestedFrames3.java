package mydemoProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test19_HandlingNestedFrames3 {

	public static void main(String[] args) throws InterruptedException {
		
//TC-01:Launch chrome browser
		System.setProperty("webdriver.driver.chrome","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//TC-02:Goto test URL https://demoqa.com/nestedframes
		driver.get("https://demoqa.com/nestedframes");
		//wait time 3 secs
		Thread.sleep(3000);

//TC-03:Manage the browser window to maximize 
		driver.manage().window().maximize();
		//wait time 3 secs
		Thread.sleep(3000);
		
//switch to Parent frame frame
		driver.switchTo().frame("frame1");
		Thread.sleep(3000);
		
//TC-04:Get text of the 'Parent frame'
		String ptext1 = driver.findElement(By.xpath("//*[text()='Parent frame']")).getText();
		System.out.println(ptext1);
		Thread.sleep(3000);
		
		//Back to top window- Default content
	    driver.switchTo().frame(0);
	    
//TC-07: Get text from child frame
	    String ptext2 = driver.findElement(By.xpath("//*[text()='Child Iframe']")).getText();
	    System.out.println(ptext2);
		Thread.sleep(3000);
	    
		
		
		
		
		
//TC-07: Close the browser
		driver.close();
		
		
		

	}

}
