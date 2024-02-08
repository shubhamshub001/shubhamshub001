package topic_sikuli;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public class Test3_Sikuli {

	public static void main(String[] args) throws InterruptedException, FindFailed {
		
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
		
//TC-05:Implimenting Sikuli
				Screen s = new Screen();
				
		//Move the mouse towrds Login
				s.hover("C:\\Users\\HP\\eclipse-workspace\\myAutomationProject\\Sikuli_Locators\\LoginButton.png");
				Thread.sleep(4000);
				
//TC-07: Close the browser
		driver.close();
		
		
		

	}

}
