package selenium_code;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Drop_Down_Amazon_hndl 
{
	   public static void main(String[] args) throws InterruptedException 
	   {
		     ChromeDriver driver= new ChromeDriver();
		         driver.manage().window().maximize();
		         
		           driver.get("https://www.amazon.in/");
		           
		          WebElement e1= driver.findElement(By.name("url"));
		               e1.sendKeys(Keys.ARROW_DOWN);
		                    Thread.sleep(2000);
		               e1.sendKeys(Keys.ARROW_DOWN);
		                    Thread.sleep(2000);
		               e1.sendKeys(Keys.ARROW_UP); 
		                    Thread.sleep(3000);
		               
		               e1.click();
		                    
		               e1.sendKeys(Keys.ENTER);     
		   
		   
		   
		   
		
	}

}
