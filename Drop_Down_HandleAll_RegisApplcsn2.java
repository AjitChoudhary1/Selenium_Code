package selenium_code;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down_HandleAll_RegisApplcsn2
{
	   public static void main(String[] args) throws InterruptedException
	   {
		   ChromeDriver driver= new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("https://grotechminds.com/registration/");
	          Thread.sleep(2000);


	         WebElement frstname= driver.findElement(By.name("First Name"));
	             //Thread.sleep(2000);
	                frstname.sendKeys("Ajit");


	         WebElement lstname = driver.findElement(By.name("Last Name"));
	              //Thread.sleep(2000);
	                lstname.sendKeys("Choudhary");


	         WebElement address=  driver.findElement(By.id("Address"));
	              address.sendKeys("Tatarwi, Nagaur, Rajasthan, India");


	        WebElement email=  driver.findElement(By.name("email"));
	                email.sendKeys("ajitchoudhary0902@gmail.com");


	        WebElement phone=  driver.findElement(By.name("Phone"));
	               phone.sendKeys("8233668067");

	                      Thread.sleep(3000);
	               Actions actions = new Actions(driver);
	               actions.sendKeys(Keys.PAGE_DOWN).perform();


	                       Thread.sleep(4000);
	         driver.findElement(By.xpath("(//input[@name='gender'])[1]")).click();


	                               Thread.sleep(4000);
	         driver.findElement(By.xpath("//input[@name='Cricket']")).click();



	         WebElement language=  driver.findElement(By.name("Languages"));
	                    language.sendKeys("Hindi, English");


	          WebElement skills=  driver.findElement(By.id("Skills"));
	                    Select s1= new Select(skills);
	                         s1.selectByVisibleText("Automation Testing");


	          WebElement cntry=  driver.findElement(By.id("Country"));
	 	                   Select s2= new Select(cntry);
	 	                           s2.selectByValue("India");


	 	      WebElement yearr=  driver.findElement(By.id("DOB"));
		 	                  Select s3= new Select(yearr);
		 	                          s3.selectByContainsVisibleText("1999");


		 	 WebElement mnth=  driver.findElement(By.id("month"));
			 	           Select s4= new Select(mnth);
			 	                   s4.selectByValue("Jan");


			 WebElement day=  driver.findElement(By.id("day"));
				 	       Select s5= new Select(day);
				 	                 s5.selectByValue("20");

	         WebElement pwd = driver.findElement(By.name("password"));
				 	      pwd.sendKeys("Aj@ajit");


			 WebElement cnfpwd=  driver.findElement(By.name("confirm password"));
				 	      cnfpwd.sendKeys("Aj@ajit");


	}

}
