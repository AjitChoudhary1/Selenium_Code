package selenium_code;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllThe_Link_FindElements_Amzn
{
	public static void main(String[] args)
	{
		ChromeDriver driver= new ChromeDriver();
	    driver.manage().window().maximize();

	    driver.get("https://www.amazon.in/");

	    List<WebElement> alllink=   driver.findElements(By.tagName("a"));
	              int count=     alllink.size();
	                 System.out.println(count);

	      for(int i=0; i<count; i++)
	      {
	           WebElement e1=     alllink.get(i);                                  //All links with forloop
	                String links=     e1.getDomAttribute("href");
	                      System.out.println(links);
	      }

	}

}
