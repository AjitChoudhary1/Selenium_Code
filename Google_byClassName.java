package selenium_code1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google_byClassName
{
	public static void main(String[] args) throws InterruptedException
	{
	    ChromeDriver driver= new ChromeDriver();
	        driver.manage().window().maximize();

	          driver.get("https://www.google.com");

	            WebElement  srchbar= driver.findElement(By.className("gLFyf"));
	                  srchbar.sendKeys("Veer Tejaji");

		                      Thread.sleep(3000);
		                         driver.close();
	}

}
