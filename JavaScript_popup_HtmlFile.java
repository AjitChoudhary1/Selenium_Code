package selenium_code1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class JavaScript_popup_HtmlFile                               //Java Script pop up
{
	public static void main(String[] args) throws InterruptedException 
	{
		EdgeDriver driver= new EdgeDriver();
	       driver.manage().window().maximize();
	       
	          driver.get("file:///C:/Users/ajitc/OneDrive/Desktop/Java%20Notes/learningHTML1.html");
	           
	                  driver.switchTo().alert().accept();
	
	 WebElement popup=  driver.findElement(By.name("username"));
	        popup.sendKeys("Ajit Choudhary");
		
	       Thread.sleep(3000);  
		       driver.close();
		
	}

}
