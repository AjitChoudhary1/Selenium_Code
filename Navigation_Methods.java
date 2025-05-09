package selenium_code;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigation_Methods 
{
	  public static void main(String[] args) throws InterruptedException 
	  {
		   ChromeDriver driver= new ChromeDriver();
		       driver.manage().window().maximize();
		       
		       driver.get("https://www.amazon.in/");
		       
		           Thread.sleep(2000);
		       driver.navigate().back();
		       
		           Thread.sleep(2000);
		        driver.navigate().forward();
		  
		            Thread.sleep(2000);
		         driver.navigate().refresh();
		         
		             Thread.sleep(4000);
		          driver.navigate().to("https://grotechminds.com/automate-me/");
		  
		  
		
	}

}
