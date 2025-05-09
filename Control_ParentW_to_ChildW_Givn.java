package selenium_code1;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Control_ParentW_to_ChildW_Givn                                    //parent child window pop up
{
	  public static void main(String[] args) throws InterruptedException 
	  {
		  ChromeDriver driver= new ChromeDriver();
	        driver.manage().window().maximize();
	        
	           driver.get("https://www.amazon.in/");
	           
	           WebElement srchtxtfld=   driver.findElement(By.id("twotabsearchtextbox"));
	                   srchtxtfld.sendKeys("iphone 16pro max");
	                      
	             Thread.sleep(3000);
	             
	           List<WebElement> list=  driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
	               
	               int count=  list.size();
	                   System.out.println(count);
	                       list.get(count-4).click();
	
	                   Thread.sleep(3000);    
	          WebElement iphoneslct=  driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-fixed-height'])[3]"));
	          
	                        iphoneslct.click();
	                        
	                Set<String> pcid =   driver.getWindowHandles();
	                      System.out.println(pcid);
	                      
	                Iterator<String> i1= pcid.iterator();
	                       String parentid=   i1.next();
	                       String childid=    i1.next();
	                   driver.switchTo().window(parentid);
	                   
	                driver.switchTo().window(childid);                 //Moving control to child window
	                        
	                Thread.sleep(3000);
	                   driver.close();                     // It close that window who have the control
	                        
	                   Thread.sleep(3000);
		                    driver.quit();               // It close all the window 
		
	}

}
