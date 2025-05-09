package selenium_code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SBI_RightClick_Disable 
{
	public static void main(String[] args) throws InterruptedException
	{
		 ChromeDriver driver= new ChromeDriver();
		      driver.manage().window().maximize();
		      
		      driver.get("https://retail.onlinesbi.sbi/retail/login.htm");
		      
		      WebElement e1=   driver.findElement(By.linkText("CONTINUE TO LOGIN"));
		                e1.click();
		                
		      WebElement usrname=   driver.findElement(By.id("username"));
		           usrname.sendKeys("@jat");
		           
		      WebElement passwd=   driver.findElement(By.id("label2"));
		          passwd.sendKeys("aj@123");
		          
		      WebElement capcha=   driver.findElement(By.name("loginCaptchaValue"));
		          capcha.sendKeys("hyt65D");
		          
		          Thread.sleep(9000);
		     WebElement prslogin= driver.findElement(By.id("Button2"));
		           prslogin.click();
		
		
	}

}
