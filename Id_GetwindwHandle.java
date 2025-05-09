package selenium_code;

import org.openqa.selenium.edge.EdgeDriver;

public class Id_GetwindwHandle 
{
	  public static void main(String[] args) throws InterruptedException 
	  {
		    EdgeDriver driver=new EdgeDriver();
		    
		        driver.get("https://www.google.com/");
		        
		          Thread.sleep(4000);
		          
		            System.out.println(driver.getWindowHandle());
		  
		  
		
	}

}
