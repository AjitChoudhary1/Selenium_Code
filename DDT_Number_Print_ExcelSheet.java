package selenium_code1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class DDT_Number_Print_ExcelSheet 
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
		      
		  
		  String username1=    NumberToTextConverter.toText(wb.getSheet("Login").getRow(2).getCell(0).getNumericCellValue());
		      		      
		                   System.out.println(username1);  
		                   
		  String password1=    NumberToTextConverter.toText(wb.getSheet("Login").getRow(2).getCell(1).getNumericCellValue());
		     		      
		                    System.out.println(password1);
		
	}

}
