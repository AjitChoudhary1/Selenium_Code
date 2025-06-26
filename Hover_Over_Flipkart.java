package selenium_code;
                                                            //HoverOver on electronics
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class Hover_Over_Flipkart
{
	  public static void main(String[] args) throws InterruptedException
	  {
		   // ChromeDriver driver= new ChromeDriver();
		  EdgeDriver driver= new EdgeDriver();
		         driver.get("https://www.flipkart.com/");             //Now its not working on the website they did some changes

		         driver.manage().window().maximize();

		         WebElement e1=  driver.findElement(By.xpath("//span[text()='Electronics']"));

		                  Actions a1= new Actions(driver);
		                      a1.moveToElement(e1).perform();

		                   Thread.sleep(3000);
		        WebElement e2=    driver.findElement(By.linkText("Laptop and Desktop"));
		              e2.click();


	}

}
