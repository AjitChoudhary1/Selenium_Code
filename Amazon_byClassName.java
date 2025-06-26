package selenium_code1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Amazon_byClassName
{
	public static void main(String[] args) throws InterruptedException
	{
	    EdgeDriver driver= new EdgeDriver();
	        driver.manage().window().maximize();

	          driver.get("https://www.amazon.in");

	            WebElement  srchbar= driver.findElement(By.className("nav-input nav-progressive-attribute"));
	                  srchbar.sendKeys("loosefit jeans");

		                      Thread.sleep(3000);
		                         driver.close();
	}

}
