package selenium_code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down_Handle 
{
	   public static void main(String[] args)
	   {
		    ChromeDriver driver= new ChromeDriver();
		       driver.manage().window().maximize();
		       
		       driver.get("https://www.amazon.in/");
		       
		      WebElement e1=  driver.findElement(By.name("url"));
		             Select s1= new Select(e1);
		                   s1.selectByValue("search-alias=baby");
		                   s1.selectByVisibleText("Books");
		                   s1.selectByIndex(15);
		                 
		             
		   
		   
		
	}

}
