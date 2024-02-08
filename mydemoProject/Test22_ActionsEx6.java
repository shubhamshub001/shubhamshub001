package mydemoProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test22_ActionsEx6 {

	public static void main(String[] args) throws InterruptedException {
		
//TC-01:Launch chrome browser
		System.setProperty("webdriver.driver.chrome","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//TC-02:Goto test URL https://www.flipkart.com/
		driver.get("https://www.flipkart.com/");
		//wait time 3 sec
		Thread.sleep(3000);
		
//TC-03:Manage the browser window to maximize 
		driver.manage().window().maximize();
		//wait time 3 sec
		Thread.sleep(5000);
		
		//TC-04:Close log in
		driver.findElement(By.xpath("//label[contains(text(),'Enter Email')]/preceding::*[6]")).click();
	    Thread.sleep(3000);
		
		//automate cache element
		WebElement sbox = driver.findElement(By.xpath("//input[@name='q']"));
		Actions a = new Actions(driver);
		a.click(sbox).sendKeys("smartphones").build().perform();
		Thread.sleep(3000);
		a.click(sbox).sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(3000);
		a.click(sbox).sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(3000);
		a.click(sbox).sendKeys(Keys.DOWN).build().perform();
		Thread.sleep(3000);
		a.click(sbox).sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(5000);
		
		
		
//TC-07: Close the browser
		driver.close();
		
		
		

	}

}
