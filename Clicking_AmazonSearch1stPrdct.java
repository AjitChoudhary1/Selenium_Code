package selenium_code;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clicking_AmazonSearch1stPrdct 
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
			amazonsearch.sendKeys("Shoes");
					
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
		
	}

}
