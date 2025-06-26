package selenium_code;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot_getclsMthd_Facebook                                           //Using Classname mth.getclass Screenshot
{
	public static void main(String[] args) throws InterruptedException, IOException
	{
		 ChromeDriver driver= new ChromeDriver();
	     driver.manage().window().maximize();

	       driver.get("https://www.facebook.com/");

	       WebElement e1=  driver.findElement(By.name("email"));

	           Actions a1= new Actions(driver);
	                 a1.moveToElement(e1).perform();

	         Thread.sleep(2000);

	         TakesScreenshot ts= driver;
	            File source=  ts.getScreenshotAs(OutputType.FILE);
	              File destination= new File("C:\\Users\\ajitc\\eclipse-workspace\\Selenium_Programs\\screenshots\\FBLoginPage"+new ScreenShot_getclsMthd_Facebook().getClass() +".png");

	           FileHandler.copy(source, destination);


	}

}
