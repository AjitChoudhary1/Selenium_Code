package seleniumTestNG_code2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class To_Fail_Any_Testcase
{
	@Test
	public void login()
	{                                                          //Throw an exception it will do fail
		throw new NullPointerException();
	}

	@Test
	public void regstr() throws InterruptedException
	{                                                       //Pass wrong detail it will do fail
		EdgeDriver driver= new EdgeDriver();
	     driver.manage().window().maximize();

	        driver.get("https://www.amazon.in");

	        WebElement srchbar=   driver.findElement(By.id("choudhary"));      //passed wrong to fail it
	            srchbar.sendKeys("straight fit jeans");


	            Thread.sleep(5000);
	       driver.close();
	}

	@Test
	public void logout()
	{
		System.out.println("Jay baba ramdev ji");
	}

}
