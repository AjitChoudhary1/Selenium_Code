package selenium_code;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class ScreenShot_Datecls_GTM                                           //Using Classname mth.getclass Screenshot
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		 ChromeDriver driver= new ChromeDriver();
	     driver.manage().window().maximize();
	     
	       driver.get("https://grotechminds.com/automate-me/");
	       
	       WebElement e1=  driver.findElement(By.id("menu-1-10edec5"));
	       
	           Actions a1= new Actions(driver);
	                 a1.moveToElement(e1).perform();
	                 
	         Thread.sleep(2000);
	         
	         
	         
	         
	         Date d1= new Date();
			   System.out.println(d1.getTime());                   //use epoch cnvrtr to convrt time
			   
			     Date d2= new Date(d1.getTime());
			        System.out.println(d2);
			
			String f1=   d2.toString();
			    //DDMMYYYY
			  String date= f1.substring(8, 10);
			     String month= f1.substring(4, 7);
			       String year=  f1.substring(f1.length()-4);
			       
			          String f3=  date.concat(month).concat(year);
			                 System.out.println(f3);
			          
			    String hour=  f1.substring(11, 13);
			       String min=  f1.substring(14, 16);
			          String sec=  f1.substring(17, 19);
			          
			             String f2=   hour.concat(min).concat(sec);
			                   System.out.println("Time-> " + f2);
	         
	         
	         
	         
	         TakesScreenshot ts= driver;
	            File source=  ts.getScreenshotAs(OutputType.FILE);
	              File destination= new File("C:\\Users\\ajitc\\eclipse-workspace\\Selenium_Programs\\screenshots\\GTMPage"+new ScreenShot_Datecls_GTM().getClass() +f3+".jpg");
	              
	           FileHandler.copy(source, destination);
	           
		
	}

}
