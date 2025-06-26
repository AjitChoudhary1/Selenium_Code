package selenium_code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_HtmlFile
{
	   public static void main(String[] args)
	   {
		      ChromeDriver driver= new ChromeDriver();
		          driver.manage().window().maximize();

		          driver.get("file:///C:/Users/ajitc/OneDrive/Desktop/Java%20Notes/learningHTML1.html");

		          WebElement e1=   driver.findElement(By.xpath("(/html/body/input)[1]"));
		                 e1.sendKeys("Ajit Choudhary");

		         // WebElement e2=    driver.findElement(By.xpath("(/html/body/form/input)[2]"));         //Disabled last name
		               //  e2.sendKeys("Jat");

		          WebElement e3=   driver.findElement(By.xpath("((/html/body/form)[2]/input)[2]"));
		               e3.click();

		          WebElement e4=  driver.findElement(By.tagName("a"));
		               e4.click();


	}

}
