package selenium_code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fill_RegstForm_Rvrt_NvgsnMthd
{
	  public static void main(String[] args) throws InterruptedException
	  {
		  ChromeDriver driver= new ChromeDriver();
		      driver.manage().window().maximize();

		        driver.get("https://grotechminds.com/registeration-form/");

		     WebElement name=   driver.findElement(By.name("your-name"));
		                name.sendKeys("Ajit Choudhary");

		     WebElement email=  driver.findElement(By.name("your-email"));
		                email.sendKeys("ajit@gmail.com");

		     WebElement mobilenmbr=  driver.findElement(By.name("telephone"));
		                mobilenmbr.sendKeys("9599850867");

		                     Thread.sleep(3000);
		                driver.navigate().refresh();


	}

}
