package selenium_code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Searching_Amazon_SrchBar
{
	public static void main(String[] args) throws InterruptedException
	{
		 EdgeDriver driver= new EdgeDriver();
		     driver.manage().window().maximize();

		        driver.get("https://www.amazon.in");

		        WebElement srchbar=   driver.findElement(By.id("twotabsearchtextbox"));
		            srchbar.sendKeys("straight fit jeans");


		            Thread.sleep(5000);
		       driver.close();



	}

}
