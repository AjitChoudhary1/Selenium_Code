package selenium_code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Partial_LinkText_Lctr_FindElmnt
{
	public static void main(String[] args)
	{
		   EdgeDriver driver= new EdgeDriver();

		      driver.get("https://www.google.com/");

		      WebElement e1= driver.findElement(By.partialLinkText("Gma"));

		         e1.click();



	}

}
