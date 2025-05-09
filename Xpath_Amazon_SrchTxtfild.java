package selenium_code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
                                                                                //with syntax--- Absolute x path
                                                                                // less use this
public class Xpath_Amazon_SrchTxtfild 
{
	   public static void main(String[] args) throws InterruptedException 
	   {
		     ChromeDriver driver= new ChromeDriver();
		        driver.manage().window().maximize();
		        
		        driver.get("https://www.amazon.in/");
		        
		       WebElement e1=   driver.findElement(By.xpath("(//input)[5]"));           
		               e1.sendKeys("Hp Laptops");
		               
		               Thread.sleep(3000);
		       WebElement e2=     driver.findElement(By.xpath("(//input)[6]"));
		               e2.click();
		   
		   
		
	}

}
