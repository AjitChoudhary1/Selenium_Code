package selenium_code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Component_Color_Instagram 
{
	public static void main(String[] args) 
	{
		EdgeDriver driver= new EdgeDriver();
	       driver.manage().window().maximize();
	       
	       driver.get("https://www.instagram.com/");
	       
	       WebElement e1=  driver.findElement(By.xpath("//button[@class=' _acan _acap _acas _aj1- _ap30']"));
	         String bkgrndclr=     e1.getCssValue("background-color");
	                    System.out.println("Background clr-> " + bkgrndclr);
	
	         String wordclr= e1.getCssValue("color");
	                 System.out.println("Login clr-> " + wordclr);
	       
	                 
	                
	}

}
