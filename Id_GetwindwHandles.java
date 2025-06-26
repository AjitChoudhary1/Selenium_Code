package selenium_code;

import org.openqa.selenium.edge.EdgeDriver;

public class Id_GetwindwHandles
{
	   public static void main(String[] args) throws InterruptedException
	   {
		     EdgeDriver driver= new EdgeDriver();

		         driver.get("https://www.amazon.in/");


		     EdgeDriver driver1=new EdgeDriver();

		           driver1.get("https://www.google.com/");

		           Thread.sleep(3000);

		              System.out.println(driver.getWindowHandles());

		           Thread.sleep(3000);
		              System.out.println(driver1.getWindowHandles());

	}

}
