package selenium_code;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_Autosuggestion 
{
	  public static void main(String[] args) throws InterruptedException 
	  {
		     ChromeDriver driver= new ChromeDriver();
		        driver.manage().window().maximize();
		        
		           driver.get("https://www.flipkart.com/");
		           
		           WebElement srchtxtfld=   driver.findElement(By.name("q"));
		                   srchtxtfld.sendKeys("Iphones");
		                      
		             Thread.sleep(3000);
		             
		           List<WebElement> list=  driver.findElements(By.xpath("//form[@class='_2rslOn header-form-search OpXDaO']/ul/li"));
		               
		               int count=  list.size();
		                   System.out.println(count);
		            Thread.sleep(2000);
		                       list.get(count-4).click();
		            Thread.sleep(2000);
		                       list.get(6);
		            Thread.sleep(2000);   
		                       list.get(count-8);
		
	}

}
