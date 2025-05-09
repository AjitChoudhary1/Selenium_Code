package selenium_code1;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_AddtoCart_ButtonCLick2Sate                                           //parent child window popup
{
	public static void main(String[] args) throws InterruptedException 
	{
					
					//Step 1: Launch Chrome browser and maximize it
					ChromeDriver driver =new ChromeDriver();
					driver.manage().window().maximize();
					
							
					// Step 2: Launch Amazon India site
					 driver.get("https://www.amazon.in");
					 driver.navigate().refresh();
							
					//Step 3: Locate Search box element using 'id' locator 
					WebElement amazonsearch = driver.findElement(By.id("twotabsearchtextbox"));
							
					//Step 4: Type in search box
					amazonsearch.sendKeys("shoes");
							
					//Step 5: wait for 3 seconds for auto-suggestions to load
					Thread.sleep(3000);
							
					//Step 6: Locate all suggestion elements using Xpath
					List<WebElement> list = driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));
							
					//Step 7: Get number of auto-suggestions and print it
					int count = list.size(); 
					System.out.println(count);
							 
					//Step 8: Click on the 1st suggestion from the autosuggestions list (index 0 because list starts at 0 - 1st suggestion)
					 list.get(0).click();
							 
					 //After clicking on the suggestion, browser will now search based on the clicked suggestion
					 
					//Step 9: wait for 3 seconds to allow search results to load 
					 Thread.sleep(3000);
					 
					//Step 10: Locate the first product from search results using Xpath
					 //Selecting the 1st product to click
			         WebElement e2 = driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]"));
					 e2.click();	
					
					//Step 11: Get all window handles (IDs) and store them in Set
					Set <String> s1 = driver.getWindowHandles();
					System.out.println(s1); //Printing all window IDs (parent and child)
					
					//Step 12: Create an Iterator to move through the Set
					Iterator <String> id = s1.iterator();
					
					//Step 13: Get parent and child windows IDs
					String parentID = id.next();
					String childID = id.next();
					
					//Step 14: Switch control from parent window to child window
					driver.switchTo().window(childID);
					
					//Step 15: wait for 3 seconds for page to load
					 Thread.sleep(3000);
					
					//Step 16: Add the product to the cart on child window
					WebElement addToCartButton = driver.findElement(By.id("add-to-cart-button"));
					addToCartButton.click();
					
					//Step 17: Switching back control to the parent window - Optional step
					driver.switchTo().window(parentID);
					driver.switchTo().window(childID);
					
					 Thread.sleep(8000);
						driver.quit();	
	}

}
