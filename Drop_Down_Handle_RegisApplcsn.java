package selenium_code;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drop_Down_Handle_RegisApplcsn
{
	   public static void main(String[] args) throws InterruptedException
	   {
		   ChromeDriver driver= new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://grotechminds.com/registration/");
	          Thread.sleep(2000);

	          Actions actions = new Actions(driver);
	          actions.sendKeys(Keys.PAGE_DOWN).perform();
	          Thread.sleep(3000);

	         WebElement dropdown= driver.findElement(By.xpath("(//span[@class='select2-selection select2-selection--single'])[6]"));
	         Thread.sleep(2000);
	         dropdown.click();


	         WebElement option = driver.findElement(By.xpath("//li[text()='Automation Testing']"));
	         Thread.sleep(2000);
	         option.click();


	}

}
