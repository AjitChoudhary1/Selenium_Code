package selenium_code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Disabled_Component 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver= new ChromeDriver();
		     driver.manage().window().maximize();
		     
		     driver.get("file:///C:/Users/ajitc/OneDrive/Desktop/Java%20Notes/learningHTML1.html");
		     
		     WebElement e1=   driver.findElement(By.id("121"));
		            e1.sendKeys("Jat");
		     
		     // Disabled Component So will get exception ----> // ElementNotInteractableException
		     
		
	}

}
