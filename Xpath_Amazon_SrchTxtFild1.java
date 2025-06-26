package selenium_code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
                                                                          //with syntax----- Relative x path
                                                                         // most use this
public class Xpath_Amazon_SrchTxtFild1
{
	  public static void main(String[] args) throws InterruptedException
	  {
		  ChromeDriver driver= new ChromeDriver();
	        driver.manage().window().maximize();

	        driver.get("https://www.amazon.in/");

	       WebElement e1=   driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
	               e1.sendKeys("Hp Laptops");

	               Thread.sleep(3000);
	       WebElement e2=     driver.findElement(By.xpath("//span[@id='nav-search-submit-text']"));
	               e2.click();






	}

}
