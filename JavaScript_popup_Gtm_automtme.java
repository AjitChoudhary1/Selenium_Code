package selenium_code1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaScript_popup_Gtm_automtme                               //Java Script pop up
{
	public static void main(String[] args) throws InterruptedException 
	{
		EdgeDriver driver= new EdgeDriver();
	       driver.manage().window().maximize();
	       
	          driver.get("https://grotechminds.com/javascript-popup/");
	           
	                // driver.switchTo().alert().accept();
	
	 WebElement rightclick=  driver.findElement(By.xpath("//div[@class='elementor-element elementor-element-1912e56 elementor-widget elementor-widget-shortcode']/div/div"));
	        
	         Actions a1= new Actions(driver);
	            a1.contextClick(rightclick).perform();
		
	       Thread.sleep(3000);  
		       driver.close();
		
	}

}
