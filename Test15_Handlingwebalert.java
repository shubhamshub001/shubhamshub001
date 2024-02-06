package mydemoProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test15_Handlingwebalert {

	public static void main(String[] args) throws InterruptedException {



//TS01:Launch chrome browser
		//System.setProperty("Webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//TS02: Goto Test URL https://www.jquery-az.com/javascript/demo.php?ex=151.1_1
		driver.get("https://www.jquery-az.com/javascript/demo.php?ex=151.1_1");
		//wait time
		Thread.sleep(3000);
		
//TS03: manage the browser window to Maximize
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
//TS04: Click on the button alert
		driver.findElement(By.xpath("(//*[contains(text(),'Click')])[2]")).click();
		Thread.sleep(3000);
		
//Get the plain text from alert into console
		String ptext1 = driver.switchTo().alert().getText();
		System.out.println(ptext1);
		Thread.sleep(3000);
		//accept the alert
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		
		
		
		
//Close active Browser window
		driver.close();
		

		
		
		
	}

}
