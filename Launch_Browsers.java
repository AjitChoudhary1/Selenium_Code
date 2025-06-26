package selenium_code;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Launch_Browsers                              //Launching Browsers
{
	   public static void main(String[] args)
	   {
		       ChromeDriver driver= new ChromeDriver();
		          System.out.println(driver);

		       EdgeDriver ed= new EdgeDriver();
		          System.out.println(ed);

		       FirefoxDriver fd= new FirefoxDriver();
		          System.out.println(fd);

		       SafariDriver sd= new SafariDriver();
		          System.out.println(sd);



	}

}
