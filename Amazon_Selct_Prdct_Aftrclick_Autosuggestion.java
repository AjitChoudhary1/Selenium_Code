package selenium_code;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_Selct_Prdct_Aftrclick_Autosuggestion
{
	  public static void main(String[] args) throws InterruptedException
	  {
		     ChromeDriver driver= new ChromeDriver();
		        driver.manage().window().maximize();

		           driver.get("https://www.amazon.in/");

		           WebElement srchtxtfld=   driver.findElement(By.id("twotabsearchtextbox"));
		                   srchtxtfld.sendKeys("iphone 16pro max");

		             Thread.sleep(3000);

		           List<WebElement> list=  driver.findElements(By.xpath("//div[@class='two-pane-results-container']/div/div"));

		               int count=  list.size();
		                   System.out.println(count);
		            Thread.sleep(2000);
		                       list.get(count-4).click();
		            Thread.sleep(2000);
		                       list.get(6);
		            Thread.sleep(2000);
		                       list.get(count-8);

		                   Thread.sleep(3000);
		          WebElement iphoneslct=  driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-fixed-height'])[3]"));

		          Actions a1= new Actions(driver);
		                  a1.sendKeys(Keys.ARROW_DOWN).perform();
		                  Thread.sleep(2000);
		                  a1.sendKeys(Keys.ARROW_DOWN).perform();
		                  Thread.sleep(2000);
		                  a1.sendKeys(Keys.ARROW_DOWN).perform();
		          Thread.sleep(5000);
		                        iphoneslct.click();

	}

}
