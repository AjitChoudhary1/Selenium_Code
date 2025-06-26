package seleniumTestNG_code2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNG_Website_LaunchTC1
{
	       @Test
	   public void BrowserLaunch()
	   {
		     ChromeDriver driver= new ChromeDriver();

                    driver.get("https://www.google.com/");

                    driver.quit();
	   }

}
