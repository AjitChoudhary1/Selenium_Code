package selenium_code;

import org.openqa.selenium.chrome.ChromeDriver;

public class Maximize_Minimize_WIndow
{
	    public static void main(String[] args) throws InterruptedException
	    {
	    	  ChromeDriver driver= new ChromeDriver();
	    	    driver.manage().window().maximize();

	    	     driver.get("https://grotechminds.com/");

	    	     //driver.manage().window().maximize();

	    	     Thread.sleep(3000);

	    	     driver .manage().window().minimize();

		}

}
