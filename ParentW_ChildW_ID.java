package selenium_code1;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentW_ChildW_ID
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
	                       list.get(count-4).click();

	                   Thread.sleep(3000);
	          WebElement iphoneslct=  driver.findElement(By.xpath("(//div[@class='a-section aok-relative s-image-fixed-height'])[3]"));

	                        iphoneslct.click();

	                Set<String> pcid =   driver.getWindowHandles();
	                      System.out.println(pcid);

	                        driver.quit();                       // It close both the window Parent n Child



	}

}
