package selenium_code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_Click
{
	   public static void main(String[] args)
	   {
		     ChromeDriver driver= new ChromeDriver();
		         driver.manage().window().maximize();

		         driver.get("https://grotechminds.com/automate-me/");

		       WebElement e1=  driver.findElement(By.className("elementor-item"));

		           Actions a1= new Actions(driver);
		              a1.contextClick(e1).perform();




	}

}
