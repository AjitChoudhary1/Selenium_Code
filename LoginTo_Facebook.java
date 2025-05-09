package selenium_code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTo_Facebook 
{
	   public static void main(String[] args) 
	   {
		    // EdgeDriver driver= new EdgeDriver();
		         ChromeDriver driver= new ChromeDriver();
		           driver.get("https://www.facebook.com/");
		           
		      WebElement usrname=     driver.findElement(By.id("email"));
		           usrname.sendKeys("ajit@gmail.com");
		      
		      WebElement password=    driver.findElement(By.id("pass"));
		           password.sendKeys("803131");
		      
		      WebElement Login=       driver.findElement(By.name("login"));
		           Login.click();
		      
		      
		      
		      
	}

}
