package mydemoProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test16_Handlingwebalert2 {

	public static void main(String[] args) throws InterruptedException {



//TS01:Launch chrome browser
		//System.setProperty("Webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//TS02: Goto Test URL https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		//wait time
		Thread.sleep(3000);
		
//TS03: manage the browser window to Maximize
		driver.manage().window().maximize();
		Thread.sleep(3000);
// To perform operation on element which is inside a frame, we have to switch into that that frame
		driver.switchTo().frame(1);
//TS04: Click on the button alert
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Thread.sleep(3000);
		
//Now send data into the alert
		driver.switchTo().alert().sendKeys("Shubu");
		Thread.sleep(3000);
//Accept alert
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		

		
		
		
		
//Close active Browser window
		driver.close();
		

		
		
		
	}

}
