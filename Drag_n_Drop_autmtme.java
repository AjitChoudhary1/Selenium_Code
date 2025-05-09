package selenium_code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_n_Drop_autmtme 
{
	   public static void main(String[] args) throws InterruptedException 
	   {
		      ChromeDriver driver= new ChromeDriver();
		         driver.manage().window().maximize();
		         
		         driver.get("https://grotechminds.com/drag-and-drop/");
		         
		         WebElement e1=   driver.findElement(By.id("container-1"));
		         
		         WebElement e2=   driver.findElement(By.id("div2"));
		         
		             Actions a1= new Actions(driver);
		                a1.dragAndDrop(e1, e2).perform();
		                
		                Thread.sleep(3000);
		                  a1.dragAndDrop(e2, e1).perform();
		                
		         Thread.sleep(3000);
		         WebElement e3= driver.findElement(By.id("container-5"));
		         
		         WebElement e4= driver.findElement(By.id("div2"));
		         
		             Actions a2= new Actions(driver);
		                 a2.dragAndDrop(e3, e4).perform();
		                  
		              Thread.sleep(2000);
		                  a2.dragAndDrop(e4, e3).perform();
		              
		              
		
		
	}

}
