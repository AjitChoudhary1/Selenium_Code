package selenium_code;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ID_Lctr_FindElmnt 
{
	    public static void main(String[] args) 
	    {
	    	  EdgeDriver driver= new EdgeDriver();
	    	       driver.get("https://www.amazon.in/");
	    	       
	    	      WebElement e1=  driver.findElement(By.id("twotabsearchtextbox"));
	    	                e1.sendKeys("Dell Laptops"+Keys.ENTER);
	    	               // e1.sendKeys(Keys.ENTER);
	    	                
	    	
	    	
	    	
	    	
	    	
			
		}

}
