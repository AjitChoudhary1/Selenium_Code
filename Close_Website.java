package selenium_code;

import org.openqa.selenium.edge.EdgeDriver;

public class Close_Website 
{
	   public static void main(String[] args) throws InterruptedException 
	   {
		      EdgeDriver driver= new EdgeDriver();
		         
		          driver.get("https://www.amazon.in/");
		             
		           Thread.sleep(3000);
		           
		              driver.close();
		
		              
	}

}
