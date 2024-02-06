package mydemoProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test22_ActionsEx1 {

	public static void main(String[] args) throws InterruptedException {
		
//TC-01:Launch chrome browser
		System.setProperty("webdriver.driver.chrome","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//TC-02:Goto test URL https://www.flipkart.com/
		driver.get("https://www.flipkart.com/");
		//wait time 3 sec
		Thread.sleep(3000);
		
//TC-03: maximize the browser window
		driver.manage().window().maximize();
		
//TC-04: Close the login pop up
		driver.findElement(By.xpath("//label[contains(text(),'Enter Email')]/preceding::*[6]")).click();
		Thread.sleep(3000);
				
		
//TC-05:Move mouse towards fashion
		WebElement fashion = driver.findElement(By.xpath("//span[text()='Fashion']"));
		Actions a = new Actions(driver);
		a.moveToElement(fashion).build().perform();
		Thread.sleep(3000);
		
//TC-06:Move mouse towards women ethnic
		WebElement womenethnic = driver.findElement(By.xpath("//a[contains(text(),'Women Ethnic')]"));
		a.moveToElement(womenethnic).build().perform();
		Thread.sleep(3000);
		
//TC-07:CLick on women saree
		driver.findElement(By.xpath("//a[contains(text(),'Women Sarees')]")).click();
		Thread.sleep(3000);
		
		
		
		
		

		
//TC-07: Close the browser
		driver.close();
		
		
		

	}

}
