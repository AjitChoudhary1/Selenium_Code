package seleniumTestNG_code2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Time_Out_TestCase
{
	       @Test (timeOut=1000)                               //Launch in this time otherwise it will throw an exception
	   public void BrowserLaunch()                                       //ThreadTimeoutException  from testng
	   {
		     ChromeDriver driver= new ChromeDriver();

                    driver.get("https://www.google.com/");

                    driver.quit();
	   }

}
