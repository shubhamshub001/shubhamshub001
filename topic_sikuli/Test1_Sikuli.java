package topic_sikuli;

import java.awt.AWTException;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Test1_Sikuli {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, AWTException, FindFailed {

//TC-01:Launch Chrome browser
		System.setProperty("webdriver.driver.chrome", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//TC-02:Goto test URL https://smallpdf.com/pdf-to-word
		driver.get("https://smallpdf.com/pdf-to-word");
		// wait time 3 sec
		Thread.sleep(3000);
//TC-03:Manage the browser window to maximize 
		driver.manage().window().maximize();
		// wait time 3 sec
		Thread.sleep(3000);

//TC-04:Implimenting Sikuli
		Screen s = new Screen();
//TC-04:Click on choose file button		
		s.click("C:\\Users\\HP\\eclipse-workspace\\myAutomationProject\\Sikuli_Locators\\Click_choose_file_button.PNG");
		Thread.sleep(4000);
		Pattern fileinput = new Pattern(
				"C:\\Users\\HP\\eclipse-workspace\\myAutomationProject\\Sikuli_Locators\\type_PathOfFile.PNG");
		Thread.sleep(4000);
		// send the path of the file into the text box
		s.type(fileinput, "C:\\Users\\HP\\eclipse-workspace\\myAutomationProject\\Sikuli_Locators\\Test.docx");
		// Click on open button
		s.click("C:\\Users\\HP\\eclipse-workspace\\myAutomationProject\\Sikuli_Locators\\Open_Button.PNG");
		Thread.sleep(4000);
		
		//WebDriver wait to complete the file conversion

		WebElement clickdownload= new WebDriverWait(driver,Duration.ofSeconds(30)).until(ExpectedConditions.
				  presenceOfElementLocated(By.xpath("//span[contains(text(),'Download')]")));
		 
		//click on download button
		s.click("C:\\Users\\HP\\eclipse-workspace\\myAutomationProject\\Sikuli_Locators\\downloadButton.png");
		Thread.sleep(4000);
		
		//Closing the browser
		driver.close();

		
	}

}
