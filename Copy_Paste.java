package selenium_code;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Copy_Paste 
{
	    public static void main(String[] args) throws InterruptedException 
	    {
	    	  ChromeDriver driver= new ChromeDriver();
	    	       driver.get("https://grotechminds.com/registeration-form/");
	    	       
	    	     WebElement name=  driver.findElement(By.name("your-name"));
	    	          name.sendKeys("Ajit Choudhary");
	    	          
	    	          name.sendKeys(Keys.CONTROL+"a");
	    	          name.sendKeys(Keys.CONTROL+"c");
	    	       
	    	     WebElement name1=     driver.findElement(By.name("your-email"));
	    	          name1.sendKeys(Keys.CONTROL+"v");
	    	          
	    	          Thread.sleep(4000);
	    	          
	    	          name.sendKeys(Keys.CONTROL+"a");
	    	             name.sendKeys(Keys.DELETE);
	    	          
	    	             Thread.sleep(3000);
	    	             
	    	          name1.sendKeys(Keys.CONTROL+"a");
	    	              name1.sendKeys(Keys.BACK_SPACE); 
	    	          
	    	         
	    	          
			
		}

}
