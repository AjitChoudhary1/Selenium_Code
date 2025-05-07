package meeting_selenium;

import java.io.File;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Sate_Screenshots_AllMethods 
{

	public static void main(String[] args) throws Exception 
	{
		// Step 1: Open Chrome browser
        ChromeDriver driver = new ChromeDriver();
        
        // Step 2: Navigate to Amazon website
        driver.get("https://www.amazon.com/");
        
        // Step 3: Maximize the window
        driver.manage().window().maximize();
        
        // Step 4: Take Screenshot
        TakesScreenshot ts = driver;  // Upcasting ChromeDriver to TakesScreenshot
        File source = ts.getScreenshotAs(OutputType.FILE); // Capture screenshot as a File
        
        // ==========================
        // METHOD 1: Unique screenshot using Math.random()
        // ==========================
        File destination1 = new File("C:\\Users\\saten\\eclipse-workspace\\AutomationTesting52\\screenshots\\Screenshot_MathRandom" + Math.random() + ".png");
        FileHandler.copy(source, destination1);

        // ==========================
        // METHOD 2: Unique screenshot using Class Name
        // ==========================
        String className = Sate_Screenshots_AllMethods.class.getSimpleName(); // Get current class name
        File destination2 = new File("C:\\Users\\saten\\eclipse-workspace\\AutomationTesting52\\screenshots\\Screenshot_" + className + ".png");
        FileHandler.copy(source, destination2);

        // ==========================
        // METHOD 3: Unique screenshot using Date and Time
        // ==========================
        Date d = new Date();
        String timeStamp = d.toString().replace(":", "").replace(" ", ""); // Remove illegal characters from date
        File destination3 = new File("C:\\Users\\saten\\eclipse-workspace\\AutomationTesting52\\screenshots\\Screenshot_" + timeStamp + ".png");
        FileHandler.copy(source, destination3);

        // Step 5: Close the browser
        driver.quit();
	
      }
}
