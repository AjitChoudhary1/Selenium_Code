package selenium_code1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class DDT_Amazon_Login_ExcelSheet 
{
	  public static void main(String[] args) throws EncryptedDocumentException, IOException 
	  {
		  FileInputStream fis=new FileInputStream("C:\\Users\\ajitc\\eclipse-workspace\\Selenium_Programs\\Excel Sheet\\Login Details.xlsx");
		       
		      Workbook wb=   WorkbookFactory.create(fis);
		                                                                                       //use it in real project
		   
		  String username=  wb.getSheet("Login").getRow(1).getCell(0).getStringCellValue();
		  
		                  System.out.println(username);
		                  
		  String password=  wb.getSheet("Login").getRow(1).getCell(1).getStringCellValue();
		  
		                    System.out.println(password);
		      
		  
		                    EdgeDriver driver= new EdgeDriver();
			    	        driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
			    	
			    	       WebElement usrname= driver.findElement(By.name("email"));
			    	           usrname.sendKeys(username);
			    	           
			    	       WebElement prscontnu=    driver.findElement(By.id("continue"));
			    	           prscontnu.click();
			    	           
			    	       WebElement password1=    driver.findElement(By.id("ap_password"));
			    	            password1.sendKeys(password);
			    	            
			    	       WebElement prsSignin=     driver.findElement(By.id("signInSubmit"));
			    	            prsSignin.click();
		  
		  
		
	}

}
