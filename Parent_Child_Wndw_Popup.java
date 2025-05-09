package selenium_code1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Parent_Child_Wndw_Popup 
{
	public static void main(String[] args) throws InterruptedException 
	{
		
		EdgeDriver driver= new EdgeDriver();
		       driver.manage().window().maximize();
		       
		 driver.get("https://www.naukri.com/registration/createAccount?othersrcp=23531&wExp=N&utm_source=google&utm_medium=cpc&utm_campaign=Brand&gad_source=1&gad_campaignid=19863995494&gbraid=0AAAAADLp3cE2w8uTl7H67HFBOqSIPBb51&gclid=CjwKCAjwiezABhBZEiwAEbTPGI3LcyoZ2L7aDXwUx3Dn0BfKJzH0q3c501FrC5D0oOhEfEhKPLX4NxoCNk0QAvD_BwE&gclsrc=aw.ds");
		
		 WebElement naukri=  driver.findElement(By.xpath("//span[.='Google']"));
		        naukri.click();
		        
		        Set<String>  pcid=  driver.getWindowHandles();
		            System.out.println(pcid);
		            
		            Iterator<String> id=   pcid.iterator();
		               String parentid=   id.next();
		               String childid=    id.next();
		               
		                 driver.switchTo().window(parentid);
		                 driver.switchTo().window(childid);
		                 
		                    Thread.sleep(3000);
		                      driver.close();
		                      
		                       Thread.sleep(3000);
		                        driver.quit();
		
		
		
		
		
	}

}
