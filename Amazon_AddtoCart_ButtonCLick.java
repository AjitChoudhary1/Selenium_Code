package selenium_code1;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Amazon_AddtoCart_ButtonCLick                                           //parent child window popup
{
	public static void main(String[] args) throws InterruptedException 
	{
		EdgeDriver driver= new EdgeDriver();
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
                   driver.switchTo().window(childid);
                   
                   Thread.sleep(3000);
         WebElement addtocart=  driver.findElement(By.className("a-declarative"));
               addtocart.click();
               
               Thread.sleep(3000);
               
               WebElement pincode=  driver.findElement(By.id("GLUXZipUpdateInput"));
                   pincode.sendKeys("341301");
                   
                   Thread.sleep(3000);
                   
                   WebElement clickapply=   driver.findElement(By.id("GLUXZipUpdate"));
                          clickapply.click();
                  
             /*     Thread.sleep(3000);
            WebElement usrname= driver.findElement(By.name("email"));
            usrname.sendKeys("9599850867");
            
        WebElement prscontnu=    driver.findElement(By.id("continue"));
            prscontnu.click();
            
            
            WebElement password=    driver.findElement(By.id("ap_password"));
            password.sendKeys("@Aj803131");
            
       WebElement prsSignin=     driver.findElement(By.id("signInSubmit"));
            prsSignin.click();
            
            Thread.sleep(3000);
        */    
            WebElement addtocart1=  driver.findElement(By.xpath("//span[@id='submit.add-to-cart']/span/input"));
            addtocart1.click();

            Thread.sleep(10000);
                  driver.quit(); 
		
	}

}
