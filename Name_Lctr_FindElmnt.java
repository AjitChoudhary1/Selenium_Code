package selenium_code;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Name_Lctr_FindElmnt 
{
	    public static void main(String[] args) 
	    {
	    	  EdgeDriver driver= new EdgeDriver();
	    	     driver.get("https://www.google.com/");
	    	     
	    	    WebElement e1= driver.findElement(By.name("q"));
	    	           e1.sendKeys("India");
	    	           e1.sendKeys(Keys.ENTER);
	    	           
	    	       
	    	
	    	
	    	
			
		}

}
