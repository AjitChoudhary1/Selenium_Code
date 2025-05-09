package selenium_code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class LinkText_Lctr_FindElmnt 
{
	  public static void main(String[] args) 
	  {
		      EdgeDriver driver=new EdgeDriver();
		      
		         driver.get("https://www.google.com");
		         
		       WebElement e1=   driver.findElement(By.linkText("Gmail"));
		       
		       e1.click();
		
	}

}
