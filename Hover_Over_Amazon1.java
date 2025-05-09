package selenium_code;
                                                              //for account&list HoverOver, & sign in
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;                                   
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hover_Over_Amazon1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver= new ChromeDriver();
		     driver.manage().window().maximize();
		     
		     driver.get("https://www.amazon.in/");
		     
		     WebElement e1=     driver.findElement(By.xpath("//div[@class='nav-div'][2]"));
		     //driver.navigate().refresh();
		                  Actions a1= new Actions(driver);
		                      a1.moveToElement(e1).perform();
		                      
		          Thread.sleep(2000);
		          
		    WebElement e2=    driver.findElement(By.xpath("//span[@class='nav-action-inner']"));
		           e2.click();       
		
	
		
	}

}
