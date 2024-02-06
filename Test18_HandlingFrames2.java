package mydemoProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test18_HandlingFrames2 {

	public static void main(String[] args) throws InterruptedException {
		
//TC-01:Launch chrome browser
		System.setProperty("webdriver.driver.chrome","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//TC-02:Goto test URL https://netbanking.hdfcbank.com/netbanking/
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		//wait time 3 secs
		Thread.sleep(3000);

//TC-03:Manage the browser window to maximize 
		driver.manage().window().maximize();
		//wait time 3 secs
		Thread.sleep(3000);
		
//switch to 0th frame
		driver.switchTo().frame(0);
		Thread.sleep(3000);
//TC-04:Fill the customer iD inside text box
		driver.findElement(By.xpath("//input[@name='fldLoginUserId']")).sendKeys("shubham Herwade");
		Thread.sleep(3000);
		
//click on 'know more' link
		driver.findElement(By.xpath("(//a[contains(text(),'Know')])[2]")).click();
		Thread.sleep(3000);
		

		

		

		
		
		
//TC-07: Close the browser
		driver.close();
		
		
		

	}

}
