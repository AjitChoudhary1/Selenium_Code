package selenium_code1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class RegsForm_FileUpload_popup_gtm                               //file upload pop up
{
	public static void main(String[] args)
	{
		EdgeDriver driver= new EdgeDriver();
	       driver.manage().window().maximize();

	          driver.get("https://grotechminds.com/registeration-form/");

	 WebElement fuplod=  driver.findElement(By.name("profile-upload"));
	        fuplod.sendKeys("C:\\Users\\ajitc\\OneDrive\\Desktop\\Selenium Assignments\\Assignment 151 Buy Now Click Amazon.pdf");

		driver.close();

	}

}
