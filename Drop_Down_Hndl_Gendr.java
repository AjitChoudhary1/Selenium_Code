package selenium_code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down_Hndl_Gendr
{
	   public static void main(String[] args) throws InterruptedException
	   {
		     ChromeDriver driver= new ChromeDriver();
		         driver.manage().window().maximize();

		         driver.get("https://grotechminds.com/registeration-form/");

		         WebElement e1=  driver.findElement(By.name("gender"));

		              Select s1= new Select(e1);
		                    s1.selectByIndex(2);
		                        Thread.sleep(4000);
		                    s1.selectByValue("Male");
		                        Thread.sleep(4000);
		                    s1.selectByVisibleText("Other");





	}

}
