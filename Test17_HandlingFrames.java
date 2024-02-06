package mydemoProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test17_HandlingFrames {

	public static void main(String[] args) throws InterruptedException {
		
//TC-01:Launch chrome browser
		System.setProperty("webdriver.driver.chrome","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
//TC-02:Goto test URL https://demoqa.com/frames                         --> {TOP WINDOW}
		driver.get("https://demoqa.com/frames");
		//wait time 3 secs
		Thread.sleep(3000);

//TC-03:Manage the browser window to maximize 
		driver.manage().window().maximize();
		//wait time 3 secs
		Thread.sleep(3000);
		
//TC-04 switch into frame from the top window                           --> {Oth WINDOW}
		driver.switchTo().frame("frame1"); //-->we can do it by frame also.
		//driver.switchTo().frame(0); //index also.
		Thread.sleep(3000);
		

//TC-05 Get the text from frame into console
		String getext = driver.findElement(By.xpath("(//h1[@id='sampleHeading'])[1]")).getText();
		System.out.println(getext);
		Thread.sleep(3000);
		
//TC-06 Get text from first frame
		//switch 0th frame to the 1st frame                            --> {1st WINDOW}
		//To switch from one frame to another frame first we have to switch to default content
		driver.switchTo().defaultContent();
		//switch 0th frame to the 1st frame
		driver.switchTo().frame(2);
		
//TC-07 Get text from 1st frame into console
		String ptext = driver.findElement(By.xpath("(//h1[text()='This is a sample page'])[1]")).getText();
		System.out.println(ptext);
		Thread.sleep(3000);
		
		

		

		
		
		
//TC-07: Close the browser
		driver.close();
		
		
		

	}

}
