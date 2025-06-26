package selenium_code1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DDT_ExcelSheet
{
	  public static void main(String[] args) throws EncryptedDocumentException, IOException
	  {
		  FileInputStream fis=new FileInputStream("C:\\Users\\ajitc\\eclipse-workspace\\Selenium_Programs\\Excel Sheet\\Login Details.xlsx");

		      Workbook wb=   WorkbookFactory.create(fis);
		      Sheet s1=   wb.getSheet("Login");
		      Row r1=   s1.getRow(1);                                          //Just learning not use it in real project
		      Cell c1=  r1.getCell(0);

		      String username= c1.getStringCellValue();

		           System.out.println(username);


		         Row r2=     s1.getRow(1);
		         Cell c2=    r2.getCell(1);

		         String password= c2.getStringCellValue();

		           System.out.println(password);






	}

}
