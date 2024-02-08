package topic_sikuli;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.sikuli.script.ScreenImage;

public class Test2_Sikuli {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException, AWTException, FindFailed, IOException {

//TC-01:Launch Chrome browser
		System.setProperty("webdriver.driver.chrome", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
//TC-02:Goto test URL https://smallpdf.com/pdf-to-word
		driver.get("https://www.saucedemo.com/");
		// wait time 3 sec
		Thread.sleep(3000);
//TC-03:Manage the browser window to maximize 
		driver.manage().window().maximize();
		// wait time 3 sec
		Thread.sleep(3000);

//TC-04:Implimenting Sikuli
		Screen s = new Screen();
//TC-04:Type username textbox with input
		s.type("C:\\Users\\HP\\eclipse-workspace\\myAutomationProject\\Sikuli_Locators\\type_username.PNG","standard_user");
		Thread.sleep(4000);
		
		//Take screenshots
		
		ScreenImage si=s.capture();
		BufferedImage bi=si.getImage();
		File f1=new File("C:\\Users\\HP\\eclipse-workspace\\myAutomationProject\\Sikuli_Locators\\FullScreenshot.PNG");
		ImageIO.write(bi, "PNG", f1);
		Thread.sleep(4000);
		
		//Closing the browser
		driver.close();

		
	}

}
