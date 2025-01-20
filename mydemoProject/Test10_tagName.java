package mydemoProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test10_tagName {

	public static void main(String[] args) throws InterruptedException {


//TS01:Launch chrome browser
		System.setProperty("Webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		

//Ts-02:Goto test URL/ test Data https://www.selenium.dev/
		driver.get("https://www.selenium.dev/");
		//wait time 3 secs
		Thread.sleep(3000);
		
//TS-03: Get no Of links on the page and there counts
		List<WebElement> e = driver.findElements(By.tagName("a"));
		System.out.println(e.size());
		for (int i=0; i<e.size(); i++)
		{
			System.out.println(e.get(i).getText());
		}
	
		
//TS-03: Get no Of PlainText on the page and there counts and print on console 
		List<WebElement> f = driver.findElements(By.tagName("span"));
		System.out.println(f.size());
		for (int i = 0; i<f.size(); i++)
		{
			System.out.println(f.get(i).getText());
		}
//Close active Browser window
		driver.close();	
	}

}
