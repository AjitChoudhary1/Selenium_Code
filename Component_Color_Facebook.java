package selenium_code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Component_Color_Facebook 
{
	public static void main(String[] args)
	{
		EdgeDriver driver= new EdgeDriver();
		       driver.manage().window().maximize();
		       
		       driver.get("https://www.facebook.com/");
		       
		       WebElement e1=  driver.findElement(By.xpath("//button"));
		         String bkgrndclr=     e1.getCssValue("background-color");
		                    System.out.println("Background clr-> " + bkgrndclr);
		
		         String wordclr= e1.getCssValue("color");
		                 System.out.println("Login clr-> " + wordclr);
		
		
		                 
		                 WebElement e2=  driver.findElement(By.xpath("//a"));
		    	         String bkgrndclr1=     e2.getCssValue("background-color");
		    	                    System.out.println("Background clr 1-> " + bkgrndclr1);
		    	
		    	         String wordclr2= e2.getCssValue("color");
		    	                 System.out.println("crtnewaccnt clr 2-> " + wordclr2);           
		                 
			         
		                 
		                 
		                 
		
	}

}
