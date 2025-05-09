package selenium_code1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotClass_RegsForm_GTM 
{
	public static void main(String[] args) throws InterruptedException, AWTException 
	{
		ChromeDriver driver= new ChromeDriver();
		    driver.manage().window().maximize();
		      
		      driver.get("https://grotechminds.com/registeration-form/");
		      
		      WebElement usr=  driver.findElement(By.name("your-name"));
		      
		         usr.sendKeys("Ajit Choudhary");
		             Thread.sleep(2000);
		             
		              usr.sendKeys(Keys.CONTROL+"a");
		              usr.sendKeys(Keys.CONTROL+"c");
		              
		      WebElement pstnxt= driver.findElement(By.name("your-email"));
		      
		          Actions a1= new Actions(driver);
		               a1.contextClick(pstnxt).perform();
		               
		           Robot r1= new Robot(); 
		              r1.keyPress(KeyEvent.VK_DOWN);
		                  Thread.sleep(2000);
		                  
		              r1.keyPress(KeyEvent.VK_DOWN);
		                  Thread.sleep(2000);
		                  
		              r1.keyPress(KeyEvent.VK_DOWN);
		                   Thread.sleep(2000);
		                   
		               r1.keyPress(KeyEvent.VK_ENTER);    
		               
		                     Thread.sleep(5000);
		                 driver.close();
		
	}

}
