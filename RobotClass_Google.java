package selenium_code1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RobotClass_Google
{
	  public static void main(String[] args) throws AWTException, InterruptedException
	  {
		  ChromeDriver driver= new ChromeDriver();
		      driver.manage().window().maximize();

		         driver.get("https://www.google.com/");

		       WebElement gmailclick= driver.findElement(By.linkText("Gmail"));

		          Actions a1= new Actions(driver);
		              a1.contextClick(gmailclick).perform();

		          Robot r1= new Robot();
		             r1.keyPress(KeyEvent.VK_DOWN);
		                  Thread.sleep(2000);

		             r1.keyPress(KeyEvent.VK_DOWN);
		                  Thread.sleep(2000);

		             r1.keyPress(KeyEvent.VK_DOWN);
		                  Thread.sleep(2000);

		             r1.keyPress(KeyEvent.VK_ENTER);


	}

}
