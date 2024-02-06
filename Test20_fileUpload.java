package mydemoProject;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test20_fileUpload {

	public static void main(String[] args) throws InterruptedException, AWTException {
		
//TC-01:Launch chrome browser
		System.setProperty("webdriver.driver.chrome","C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//TC-02:Goto test URL https://smallpdf.com/pdf-to-word
		driver.get("https://smallpdf.com/pdf-to-word");
		//wait time 3 sec
		Thread.sleep(3000);
//TC-03:Manage the browser window to maximize 
		driver.manage().window().maximize();
		//wait time 3 sec
		Thread.sleep(3000);
//TC-04:Click on choose file button
		driver.findElement(By.xpath("//span[contains(text(),'Choose Files')]")).click();
		Thread.sleep(3000);
//path of the file
//load the path of the file into clipboard
		StringSelection sc = new StringSelection("D:\\JAVA_selenium\\Eclipse_IDE\\Test.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sc, null);
//send the data from clipboard to screen
		//paste operation 'Control+v'
		//implement java robot to handle window alert
		Robot r = new Robot();
		//Paste
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		Thread.sleep(3000);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		//enter
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(12000);                   //Avoiding some extra time?
		//Click on download button(comes into selenium)
		driver.findElement(By.xpath("//span[contains(text(),'Download')]")).click();
		Thread.sleep(8000); 
		//TC-07: Close the browser
		driver.close();
		
		
		
		
		

		
		
		

	}

}
