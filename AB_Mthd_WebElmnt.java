package selenium_code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AB_Mthd_WebElmnt 
{
	public static void main(String[] args) 
	{
		  ChromeDriver driver= new ChromeDriver();
		      driver.manage().window().maximize();
		      
		      driver.get("file:///C:/Users/ajitc/OneDrive/Desktop/Java%20Notes/learningHTML1.html");
		
		    WebElement e1=  driver.findElement(By.name("name1"));
		          boolean b1=   e1.isSelected();
		             if(b1==false)
		             {
		            	 e1.click();
		            	 System.out.println(e1.isSelected());
		             }
		             
		             
		
		WebElement e2=  driver.findElement(By.id("121"));
		         boolean b2=   e2.isEnabled();
		         if(b2==true)
		         {
		        	 e2.click();
		        	 System.out.println(e2.isEnabled());
		         }
		         
		         
		
		         
		WebElement e3=   driver.findElement(By.id("321"));
		        boolean b3=   e3.isDisplayed();
		          if(b3==true)
		          {
		        	  e3.click();
		        	  System.out.println(e3.isDisplayed());
		          }
		
		
		         
		
		
	}

}
