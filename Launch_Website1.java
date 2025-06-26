package selenium_code;

import org.openqa.selenium.edge.EdgeDriver;

public class Launch_Website1
{
	  public static void main(String[] args) throws InterruptedException
	  {
		    EdgeDriver driver= new EdgeDriver();

		        driver.get("https://www.google.com/");
		          Thread.sleep(3000);

	               driver.get("https://www.amazon.in/");
	                  Thread.sleep(5000);

	                  driver.get("https://www.flipkart.com/");
	                     Thread.sleep(7000);


	}

}
