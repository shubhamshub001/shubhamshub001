package mydemoProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test22_ActionsEx5 {

	public static void main(String[] args) throws InterruptedException {
		
//TC-01:Launch chrome browser
		System.setProperty("webdriver.driver.chrome","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//TC-02:Goto test URL https://demoqa.com/droppable
		driver.get("https://demoqa.com/droppable");
		//wait time 3 sec
		Thread.sleep(3000);
		
//TC-03:Manage the browser window to maximize 
		driver.manage().window().maximize();
		//wait time 3 sec
		Thread.sleep(5000);
		
//TC-04: Drag and dropped
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));
		Actions a = new Actions(driver);
		a.dragAndDrop(drag, drop).build().perform();
		Thread.sleep(5000);

		
//TC-07: Close the browser
		driver.close();
		
		
		

	}

}
