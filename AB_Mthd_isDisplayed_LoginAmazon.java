package selenium_code;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AB_Mthd_isDisplayed_LoginAmazon 
{

		public static void main(String[] args) throws InterruptedException 
		{
		
			ChromeDriver driver =new ChromeDriver();
			driver.get ("https://www.amazon.in/");
			driver.manage().window().maximize();
			Thread.sleep(2000);
			
			//Optional - in case CAPTCHA displayed we want to the page to be refreshed
	        try 
	        {
	            // Find the first image tag on the page
	            WebElement imgElement = driver.findElement(By.tagName("img"));

	            // Check if the image is displayed
	            if (imgElement.isDisplayed()) 
	            {
	                System.out.println("CAPTHA Image is displayed. Refreshing page.");
	                driver.navigate().refresh(); // Refresh the page
	            }
	            else 
	            {
	                System.out.println("CAPTCHA Image is not displayed. Proceeding.");
	            }
	        } 
	        catch (Exception e) 
	        {
	            // If no image is found, print this
	            System.out.println("CAPTCHA Image element not found. Proceeding.");
	        }
			
			// Hover over the "Hello, Sign in" area
			Actions actions = new Actions(driver);
			WebElement signInHover = driver.findElement(By.id("nav-link-accountList"));
			actions.moveToElement(signInHover).perform();

			Thread.sleep(1000); // small wait for the dropdown to appear
					
			// Click on the "Sign in" button in the dropdown
	        WebElement signInButton = driver.findElement(By.className("nav-action-signin-button"));
	        signInButton.click();
			
			
			WebElement login_email= driver.findElement(By.name("email")); 
			login_email.sendKeys("918269201125");
			
			WebElement continuebutton = driver.findElement(By.id("continue")); 
			continuebutton.click();
			
			WebElement login_password = driver.findElement(By.id("ap_password")); 
			login_password.sendKeys("Aj@803");
			
			WebElement signinsubmit = driver.findElement(By.id("signInSubmit"));
			signinsubmit.click();
			
			               
			          // Thread.sleep(13000);
			             //      driver.quit();
			
	}

}
