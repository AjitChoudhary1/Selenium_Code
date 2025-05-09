package selenium_code1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selector_Google_byAllMethods 
{
	public static void main(String[] args) throws InterruptedException 
	{
	    ChromeDriver driver= new ChromeDriver();
	        driver.manage().window().maximize();
	        
	          driver.get("https://www.google.com");
	          
	                     // 1) ID
	          WebElement  id=  driver.findElement(By.cssSelector("#APjFqb"));
	               id.sendKeys("Choudhary");
	          
	                        Thread.sleep(2000);
	                        
	                        
	                        
	                       // 2) Class Name
	            WebElement clsname= driver.findElement(By.cssSelector(".gLFyf"));
	                  clsname.sendKeys("Rajasthan");
	                  
	                      Thread.sleep(2000);
	                      
	                      
	                      
	                       // 3) Tag Name, Attribute Name and Attribute Value
	            WebElement TNANAV= driver.findElement(By.cssSelector("textarea[name=q]"));
	            TNANAV.sendKeys("jaipur");
	                  
	                       Thread.sleep(2000);
	                       
	                       
	                     // 4) Tag name and Class name
	            WebElement TNmCN= driver.findElement(By.cssSelector("textarea.gLFyf"));
	            TNmCN.sendKeys("Jodhpur");
	                  
	                         Thread.sleep(2000);
	                         
	                         
	                    // 5) Tag Name, Class Name, Attribute Name, and Attribute Value
	            WebElement TgNCNmANmAvl= driver.findElement(By.cssSelector("textarea.gLFyf[name=q]"));
	            TgNCNmANmAvl.sendKeys("Marwadi");
	                  
	                        Thread.sleep(2000);
	                        
	                        
	                    // 6) Tag Name, Attribute Name, Caret Symbol, and Attribute Value
	            WebElement caretsymbl= driver.findElement(By.cssSelector("textarea[class^=gL]"));
	            caretsymbl.sendKeys("Marwadi pagadi");
	     
		                      Thread.sleep(3000);
		                         driver.close();
	}

}
