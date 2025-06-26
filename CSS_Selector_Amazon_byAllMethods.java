package selenium_code1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selector_Amazon_byAllMethods
{
	public static void main(String[] args) throws InterruptedException
	{
	    ChromeDriver driver= new ChromeDriver();
	        driver.manage().window().maximize();

	          driver.get("https://www.amazon.in");

	                     // 1) ID
	          WebElement  id=  driver.findElement(By.cssSelector("#twotabsearchtextbox"));
	               id.sendKeys("Samsung Ultra");

	                        Thread.sleep(2000);



	                       // 2) Class Name
	           /* WebElement clsname= driver.findElement(By.cssSelector(".nav-input nav-progressive-attribute"));
	                  clsname.sendKeys("Laptop");

	                      Thread.sleep(2000);
	                      */


	                       // 3) Tag Name, Attribute Name and Attribute Value
	            WebElement TNANAV= driver.findElement(By.cssSelector("input[name=field-keywords]"));
	            TNANAV.sendKeys("Shoes");

	                       Thread.sleep(2000);


	                     // 4) Tag name and Class name
	           /* WebElement TNmCN= driver.findElement(By.cssSelector("input.nav-input nav-progressive-attribute"));
	            TNmCN.sendKeys("Jeans");

	                         Thread.sleep(2000);
	                         */

	                    // 5) Tag Name, Class Name, Attribute Name, and Attribute Value
	           /* WebElement TgNCNmANmAvl= driver.findElement(By.cssSelector("input.nav-input nav-progressive-attribute[name=field-keywords]"));
	            TgNCNmANmAvl.sendKeys("Shirt");

	                        Thread.sleep(2000);
	                        */

	                    // 6) Tag Name, Attribute Name, Caret Symbol, and Attribute Value
	            WebElement caretsymbl= driver.findElement(By.cssSelector("input[id^=two]"));
	            caretsymbl.sendKeys("Card");

		                      Thread.sleep(3000);
		                         driver.close();
	}

}
