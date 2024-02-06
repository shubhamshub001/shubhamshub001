package mydemoProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.Select;

public class Test8_RelativeLocators2 {

	public static void main(String[] args) throws InterruptedException {


/* Test Case- Automate  Creating a New window
 * TS01:Launch chrome browser
 * TS1: Goto test URL https://www.amazon.in
 * TS2:Managed the browser window to be maximized
 * TS3:Create New tab
 * TS4:Close active Browser window
 */

//TS01:Launch chrome browser
		System.setProperty("Webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//TS1: Goto test URL https://www.facebook.com/ 
		driver.get("https://www.facebook.com/");
		//wait time 3 secs
		Thread.sleep(3000);
		
//TS2: Click on 'Create new account' button
	driver.findElement(By.linkText("Create new account")).click();
	//object.method(Class.method("value")).method;
	//wait time 5 secs
	Thread.sleep(5000);
	
//Fill first name text box with input
	driver.findElement(By.name("firstname")).sendKeys("Shubham");
    Thread.sleep(3000);
    
//Fill last name text box with input
    driver.findElement(By.name("lastname")).sendKeys("Herwade");
    Thread.sleep(3000);
    
//Select the day from day drop down
    Select day = new Select(driver.findElement(By.name("birthday_day")));
    day.selectByValue("15"); 
    //day.selectByIndex(14);
    Thread.sleep(3000);
    
//Select the Month from month drop down
    Select month = new Select(driver.findElement(By.id("month")));
    month.selectByIndex(0);
    Thread.sleep(3000);
    
//Select the year from year drop down
    Select year = new Select(driver.findElement(By.name("birthday_year")));
    year.selectByValue("1994");
    Thread.sleep(3000);
    
    
 //Click on male radio button
//By password locator = Relativelocator.with(By.tagname("input").below(By.id("email"));
    
    //below
    By maleRB = RelativeLocator.with(By.tagName("input")).below(By.id("month"));
    driver.findElement(maleRB).click(); 
    Thread.sleep(3000);
    
    //above
    By pwdtextbox = RelativeLocator.with(By.tagName("input")).above(By.id("month"));
    driver.findElement(pwdtextbox).sendKeys("abc1234");
    Thread.sleep(3000);
    
    //ToleftOF
    By fmRB = RelativeLocator.with(By.tagName("input")).toLeftOf(maleRB);
    driver.findElement(fmRB).click();
    Thread.sleep(3000);
    
    //TrightOf
    By custRB = RelativeLocator.with(By.tagName("input")).toRightOf(maleRB);
    driver.findElement(custRB).click();
    Thread.sleep(3000);
    
    
    
    
    
    
    
    
		
		
		
//Close active Browser window
		driver.close();
		

		
		
		
	}

}
