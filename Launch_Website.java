package selenium_code;

import org.openqa.selenium.edge.EdgeDriver;

public class Launch_Website
{
	   public static void main(String[] args)
	   {
		      EdgeDriver driver= new EdgeDriver();

		         driver.get("https://www.google.com/");
		          driver.get("https://www.amazon.in/");
		           driver.get("https://www.flipkart.com/");



	}

}
