package mydemoProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test22_ActionsEx4 {

	public static void main(String[] args) throws InterruptedException {
		
//TC-01:Launch chrome browser
		System.setProperty("webdriver.driver.chrome","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//TC-02:Goto test URL http://only-testing-blog.blogspot.com/2014/09/selectable.html
		driver.get("http://only-testing-blog.blogspot.com/2014/09/selectable.html");
		//wait time 3 sec
		Thread.sleep(3000);
		
//TC-03:Manage the browser window to maximize 
		driver.manage().window().maximize();
		//wait time 3 sec
		Thread.sleep(3000);
		
//TC-04: Drag and drop of slider
		WebElement slider = driver.findElement(By.xpath("//div[@id='slider']"));
		Actions a = new Actions(driver);
		a.dragAndDropBy(slider, 60, 0).build().perform();
		Thread.sleep(3000);

		
//TC-07: Close the browser
		driver.close();
		
		
		

	}

}
