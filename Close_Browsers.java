package selenium_code;

import org.openqa.selenium.edge.EdgeDriver;

public class Close_Browsers
{
	   public static void main(String[] args) throws InterruptedException
	   {
		      EdgeDriver driver= new EdgeDriver();

		          System.out.println(driver);

		            Thread.sleep(3000);                           //After 3secnd it got close

		              driver.close();



	}

}
